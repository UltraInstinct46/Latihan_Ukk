package com.example.latihan_ukk.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.latihan_ukk.Data.PPDB;

public class DataBaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "PPDB";

    //table ppdb
    private static final String TABLE_PPDB = "t_ppdb";
    private static final String KEY_ID_PPDB = "key_id_ppdb";
    private static final String KEY_NIS_PPDB = "key_nis_ppdb";
    private static final String KEY_NAMA_PPDB = "key_nama_ppdb";
    private static final String KEY_JK_PPDB = "key_jk_ppdb";
    private static final String KEY_TGL_PPDB = "key_tgl_ppdb";
    private static final String KEY_ALAMAT_PPDB = "key_alamat_ppdb";
    private static final String KEY_SEKOLAH_PPDB = "key_sekolah_ppdb";
    private static final String KEY_KELAS_PPDB = "key_kelas_ppdb";
    private static final String KEY_JURUSAN_PPDB = "key_jurusan_ppdb";

    public DataBaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //table pdpb
        String CREATE_TABLE_PPDB = "CREATE TABLE " + TABLE_PPDB + "("
                + KEY_ID_PPDB + " INTEGER PRIMARY KEY,"
                + KEY_NIS_PPDB + " TEXT NOT NULL UNIQUE,"
                + KEY_NAMA_PPDB + "TEXT,"
                + KEY_JK_PPDB + " TEXT,"
                + KEY_TGL_PPDB + " TEXT,"
                + KEY_ALAMAT_PPDB + " TEXT,"
                + KEY_SEKOLAH_PPDB + " TEXT,"
                + KEY_KELAS_PPDB + " TEXT,"
                + KEY_JURUSAN_PPDB + " TEXT" + ")";
        db.execSQL(CREATE_TABLE_PPDB);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PPDB);
    }

    public void savePPDB(PPDB ppdb){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NIS_PPDB, ppdb.getNis());
        values.put(KEY_NAMA_PPDB, ppdb.getNama());
        values.put(KEY_JK_PPDB, ppdb.getJk());
        values.put(KEY_TGL_PPDB,ppdb.getTgl());
        values.put(KEY_ALAMAT_PPDB,ppdb.getAlamat());
        values.put(KEY_SEKOLAH_PPDB,ppdb.getSekolah());
        values.put(KEY_KELAS_PPDB,ppdb.getKelas());
        values.put(KEY_JURUSAN_PPDB,ppdb.getJurusan());
        db.insert(TABLE_PPDB,null,values);
        db.close();
    }

    public void updatePPDB(PPDB ppdb){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NIS_PPDB, ppdb.getNis());
        values.put(KEY_NAMA_PPDB, ppdb.getNama());
        values.put(KEY_JK_PPDB, ppdb.getJk());
        values.put(KEY_TGL_PPDB,ppdb.getTgl());
        values.put(KEY_ALAMAT_PPDB,ppdb.getAlamat());
        values.put(KEY_SEKOLAH_PPDB,ppdb.getSekolah());
        values.put(KEY_KELAS_PPDB,ppdb.getKelas());
        values.put(KEY_JURUSAN_PPDB,ppdb.getJurusan());
        db.update(TABLE_PPDB,values,KEY_ID_PPDB+"=?", new String[]{String.valueOf(ppdb.getId())});
        db.close();
    }

    public void deletePPDB(PPDB ppdb){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_PPDB,KEY_ID_PPDB+"=?", new String[]{String.valueOf(ppdb.getId())});
        db.close();
    }
    public PPDB findOnePPDB(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_PPDB,new String[]{KEY_ID_PPDB,KEY_NIS_PPDB,KEY_NAMA_PPDB,KEY_JK_PPDB,KEY_TGL_PPDB,KEY_ALAMAT_PPDB,KEY_SEKOLAH_PPDB,KEY_KELAS_PPDB,KEY_JURUSAN_PPDB},
                KEY_ID_PPDB+"=?", new String[]{String.valueOf(id)},null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        return new PPDB(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1),
                cursor.getString(2),
                cursor.getString(3),
                cursor.getString(4),
                cursor.getString(5),
                cursor.getString(6),
                cursor.getString(7),
                cursor.getString(8));
    }
}
