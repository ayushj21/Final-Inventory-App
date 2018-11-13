package com.example.ayush_l15fue5.inventoryapp_2.Database;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public final class DatabaseContract {

    private DatabaseContract(){}

    /** Name for entire content provider */
    public static final String CONTENT_AUTHORITY = "com.example.android.inventoryappstage2";

    /** Use CONTENT_AUTHORITY to create base of all URIs */
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_INVENTORY = "inventoryapp2";

    public static final class DatabaseEntry implements BaseColumns {

        /** The content URI to access the inventory data in the provider */
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_INVENTORY);

        /** The MIME type of the CONTENT_URI for a list of items */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENTORY;

        /** The MIME type of the CONTENT_URI for a single item */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENTORY;

        /** Name of database table for items */
        public final static String TABLE_NAME = "myInventory";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_INVENTORY_PRODUCT_NAME = "productName";
        public final static String COLUMN_INVENTORY_PRICE = "price";
        public final static String COLUMN_INVENTORY_QUANTITY = "quantity";
        public final static String COLUMN_INVENTORY_SUPPLIER_NAME = "supplierName";
        public final static String COLUMN_INVENTORY_SUPPLIER_PHONE = "supplierPhone";
    }
}
