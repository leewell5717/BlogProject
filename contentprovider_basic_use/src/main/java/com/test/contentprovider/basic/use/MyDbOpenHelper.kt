package com.test.contentprovider.basic.use

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * 数据库辅助类
 */
class MyDbOpenHelper(context: Context):SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION){

    companion object {
        private const val DB_NAME = "my_book.db"
        private const val DB_VERSION = 1
        const val DB_TABLE_BOOK = "book"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE IF NOT EXISTS $DB_TABLE_BOOK ( id integer primary key autoincrement,name varchar(30),price double ) ")
        println("创建表成功")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        println("更新数据库成功")
    }
}