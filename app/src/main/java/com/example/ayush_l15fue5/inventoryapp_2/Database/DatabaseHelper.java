package com.example.ayush_l15fue5.inventoryapp_2.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.ayush_l15fue5.inventoryapp_2.Database.DatabaseContract.DatabaseEntry;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Inventory.db";
    public static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_INVENTORY_TABLE = "CREATE TABLE " + DatabaseEntry.TABLE_NAME + " ( "
                + DatabaseEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + DatabaseEntry.COLUMN_INVENTORY_PRODUCT_NAME + " TEXT NOT NULL, "
                + DatabaseEntry.COLUMN_INVENTORY_PRICE + " INTEGER NOT NULL, "
                + DatabaseEntry.COLUMN_INVENTORY_QUANTITY + " INTEGER NOT NULL, "
                + DatabaseEntry.COLUMN_INVENTORY_SUPPLIER_NAME + " TEXT NOT NULL, "
                + DatabaseEntry.COLUMN_INVENTORY_SUPPLIER_PHONE + " TEXT NOT NULL);";

        db.execSQL(SQL_CREATE_INVENTORY_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
