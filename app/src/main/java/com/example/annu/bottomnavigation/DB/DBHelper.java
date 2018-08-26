package com.example.annu.bottomnavigation.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.annu.bottomnavigation.Person;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper{

    private static final String DB_NAME = "person.sqlite";  //made constant
    private static final int DB_VERSION = 1;
    private static final String TABLE = "person";
    private static final String ID = "id";
   // private static final String IMAGE= "image";
    private static final String NAME = "name";
    private static final String ADDRESS = "address";
    private static final String PHONE = "phone";

    // Database creation
    public DBHelper(Context context) {
        super( context, DB_NAME, null, DB_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = " create table " + TABLE
                +  "  ( " + ID + " integer primary key autoincrement , "
                //+ IMAGE + " text ,  "
                + NAME + " text ,  " + ADDRESS  + " text , " + PHONE + " text  )";
        Log.e( " DBQuery " , "==========" + query );
        sqLiteDatabase.execSQL( query );

    }
    // Add Employee
    public boolean addPerson(Person person) {//database get
        SQLiteDatabase db = getWritableDatabase( );
        ContentValues values = new ContentValues( );
       // values.put( IMAGE, person.get( ) );
        values.put( NAME, person.getName( ) );
        values.put( ADDRESS, person.getAddress( ) );
        values.put( PHONE, person.getPhone( ) );
        long no = db.insert( TABLE, null, values );
        if (no == 0) {
            return false;
        } else {
            return true;
        }
    }
    public List<Person> getAllPerson() {
        List<Person> persons = new ArrayList<>( );
        SQLiteDatabase db = getReadableDatabase( );

        String query = "select * from " + TABLE;
        Cursor cursor = db.rawQuery( query, null );
        while (cursor.moveToNext( )) {
            int id = cursor.getInt( cursor.getColumnIndex( ID ) );
            //String image=cursor.getString( cursor.getColumnIndex( IMAGE ) );
            String name = cursor.getString( cursor.getColumnIndex( NAME ) );
            String address = cursor.getString( cursor.getColumnIndex( ADDRESS ) );
            String phone = cursor.getString( cursor.getColumnIndex( PHONE ) );

            Person person = new Person( name,address,phone );
          person.setId( id );
            persons.add( person);
        }
        if (cursor != null && !cursor.isClosed( )) {
            cursor.close( );
        }
        db.close();
        return persons;
    }

    public boolean deleatePerson(int id) {
        SQLiteDatabase db= getWritableDatabase();
        long row = db.delete( TABLE, ID + " = "+id, null );
        if (row > 0) {
            return true;
        } else {
            return false;
        }

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int id, int i1) {
    }

}
