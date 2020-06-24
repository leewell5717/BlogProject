package com.test.contentprovider.basic.use

import android.annotation.SuppressLint
import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.net.Uri

class MyContentProvider : ContentProvider() {

    private lateinit var mDb: SQLiteDatabase
    private lateinit var myDbOpenHelper: MyDbOpenHelper

    override fun onCreate(): Boolean {
        println("MyContentProvider ---> onCreate")
        return true
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        println("MyContentProvider ---> insert")
        myDbOpenHelper = MyDbOpenHelper(MyApp.instance())
        mDb = myDbOpenHelper.writableDatabase
        mDb.insert(MyDbOpenHelper.DB_TABLE_BOOK, null, values)
        context?.contentResolver?.notifyChange(uri, null)
        return uri
    }

    @SuppressLint("Recycle")
    override fun query(uri: Uri, projection: Array<String>?, selection: String?, selectionArgs: Array<String>?, sortOrder: String?): Cursor? {
        println("MyContentProvider ---> query")
        myDbOpenHelper = MyDbOpenHelper(MyApp.instance())
        mDb = myDbOpenHelper.readableDatabase
        val cursor : Cursor? = mDb.query(MyDbOpenHelper.DB_TABLE_BOOK, projection, selection, selectionArgs, null, null, sortOrder)
        if(cursor == null){
            println("cursor == null")
        }
        return cursor
    }

    override fun update(uri: Uri, values: ContentValues?, selection: String?, selectionArgs: Array<String>?): Int {
        println("MyContentProvider ---> update")
        mDb = myDbOpenHelper.writableDatabase
        val row = mDb.update(MyDbOpenHelper.DB_TABLE_BOOK, values, selection, selectionArgs)
        if (row > 0) {
            context?.contentResolver?.notifyChange(uri, null)
        }
        return row
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int {
        println("MyContentProvider ---> delete")
        mDb = myDbOpenHelper.writableDatabase
        val count = mDb.delete(MyDbOpenHelper.DB_TABLE_BOOK, selection, selectionArgs)
        if (count > 0) {
            context?.contentResolver?.notifyChange(uri, null)
        }
        return count
    }

    override fun getType(uri: Uri): String? {
        println("MyContentProvider ---> getType")
        return null
    }
}