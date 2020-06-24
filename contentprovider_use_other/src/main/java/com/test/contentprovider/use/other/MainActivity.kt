package com.test.contentprovider.use.other

import android.Manifest
import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(),View.OnClickListener {

    private var insertBtn: Button? = null
    private var queryBtn: Button? = null
    private var modifyBtn: Button? = null
    private var deleteBtn: Button? = null
    private var bookNameEt: EditText? = null
    private var bookPriceEt: EditText? = null

    private val MY_PERMISSIONS_REQUEST = 1

    private val myUri: Uri = Uri.parse("content://com.test.contentprovider.basic.use.MyContentProvider/book")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bookNameEt = findViewById(R.id.book_name_et)
        bookPriceEt = findViewById(R.id.book_price_et)
        insertBtn = findViewById(R.id.insert_btn)
        queryBtn = findViewById(R.id.query_btn)
        modifyBtn = findViewById(R.id.modify_btn)
        deleteBtn = findViewById(R.id.delete_btn)
        insertBtn?.setOnClickListener(this)
        queryBtn?.setOnClickListener(this)
        modifyBtn?.setOnClickListener(this)
        deleteBtn?.setOnClickListener(this)

        requestPermission()
    }

    private fun requestPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE),
                        MY_PERMISSIONS_REQUEST)
            } else {
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE),
                        MY_PERMISSIONS_REQUEST)
            }
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (requestCode == MY_PERMISSIONS_REQUEST) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                println("已授权")
            } else {
                showToast("未授予相关权限，无法使用本应用")
                Handler().postDelayed({
                    finish()
                }, 1000)
            }
        }
    }

    @SuppressLint("Recycle")
    override fun onClick(v: View?) {
        val nameInput = bookNameEt?.text.toString()
        val priceInput = bookPriceEt?.text.toString()
        when (v) {
            insertBtn -> {
                if (TextUtils.isEmpty(nameInput)) {
                    showToast("请输入名称")
                    return
                }
                if (TextUtils.isEmpty(priceInput)) {
                    showToast("请输入价格")
                    return
                }

                val cursor: Cursor? = contentResolver.query(myUri, null, "name = ?", arrayOf(nameInput), null)
                cursor?.let {
                    if (it.moveToNext()) {
                        showToast("已经包含了该书，请重新输入")
                        return
                    }
                }
                val contentValue1 = ContentValues()
                contentValue1.put("name", nameInput)
                contentValue1.put("price", priceInput.toDouble())
                contentResolver.insert(myUri, contentValue1)
                println("插入数据成功")

                cursor?.close()
            }
            queryBtn -> {
                val queryCursor: Cursor? = if (TextUtils.isEmpty(nameInput) && TextUtils.isEmpty(priceInput)) {
                    //查询全部数据
                    contentResolver.query(myUri, null, null, null, null)
                } else {
                    //根据书名查询
                    if (TextUtils.isEmpty(nameInput)) {
                        showToast("请输入名称")
                        return
                    }
                    contentResolver.query(myUri, null, "name = ?", arrayOf(nameInput), null)
                }
                if(queryCursor == null){
                    toShow("没有查询到相关数据")
                }else{
                    if(queryCursor.count > 0){
                        while (queryCursor.moveToNext()) {
                            val id = queryCursor.getInt(0)
                            val name = queryCursor.getString(1)
                            val price = queryCursor.getDouble(2)
                            println("id：$id    name：$name    price：$price")
                        }
                    }else{
                        toShow("没有查询到相关数据")
                    }
                }
            }
            modifyBtn -> {
                if (TextUtils.isEmpty(nameInput)) {
                    showToast("请输入名称")
                    return
                }
                if (TextUtils.isEmpty(priceInput)) {
                    showToast("请输入价格")
                    return
                }
                val cursor: Cursor? = contentResolver.query(myUri, arrayOf("name"), "name = ?", arrayOf(nameInput), null)
                if (cursor == null) {
                    toShow("没有查询的需要修改的书名")
                } else {
                    if(cursor.count > 0){
                        val contentValues = ContentValues()
                        contentValues.put("name", nameInput)
                        contentValues.put("price", priceInput.toDouble())
                        val updateCount = contentResolver.update(myUri, contentValues, "name = ?", arrayOf(nameInput))
                        if (updateCount > 0) {
                            toShow("数据更新成功")
                        } else {
                            toShow("数据更新失败")
                        }
                    }else{
                        toShow("没有查询的需要修改的书名")
                    }
                }
            }
            deleteBtn -> {
                val deleteCount: Int
                val deleteMsg = if (TextUtils.isEmpty(nameInput) && TextUtils.isEmpty(priceInput)) {
                    deleteCount = contentResolver.delete(myUri, null, null)
                    if (deleteCount > 0) {
                        "删除全部数据成功"
                    } else {
                        "删除全部数据失败"
                    }
                } else {
                    deleteCount = contentResolver.delete(myUri, "name = ?", arrayOf(nameInput))
                    if (deleteCount > 0) {
                        "删除指定书名数据成功"
                    } else {
                        "删除指定书名数据失败"
                    }
                }
                toShow(deleteMsg)
            }
        }
    }

    private fun toShow(msg: String){
        showToast(msg)
        println(msg)
    }

    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
