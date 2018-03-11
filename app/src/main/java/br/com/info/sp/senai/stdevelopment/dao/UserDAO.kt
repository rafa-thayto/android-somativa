package br.com.info.sp.senai.stdevelopment.dao

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
import br.com.info.sp.senai.stdevelopment.model.User

/**
 * Created by Rafael on 10/03/2018.
 */

val DATABASE_NAME = "STDevelopment"
val TABLE_NAME = "User"
val COL_ID = "id"
val COL_NAME = "name"
val COL_EMAIL = "email"
val COL_PASSWORD = "password"

class UserDAO(val context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE $TABLE_NAME ( " +
                                            "$COL_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                            "$COL_NAME VARCHAR(120) NOT NULL, " +
                                            "$COL_EMAIL VARCHAR(60) NOT NULL, " +
                                            "$COL_PASSWORD VARCHAR(60) NOT NULL )"
        db?.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun insert (user: User) {
        val db = this.writableDatabase
        var cv = getContentValues(user)
        var result = db.insert(TABLE_NAME, null, cv)
        if (result == (-1).toLong())
            Toast.makeText(context, "Erro no cadastro", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(context, "Usuario cadastrado", Toast.LENGTH_SHORT).show()
    }

    private fun getContentValues(user: User): ContentValues {
        var cv = ContentValues().apply {
            put(COL_NAME, user.name)
            put(COL_EMAIL, user.email)
            put(COL_PASSWORD, user.password)
        }
        return cv
    }


}