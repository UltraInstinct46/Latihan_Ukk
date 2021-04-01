package com.example.latihan_ukk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

import com.example.latihan_ukk.Data.PPDB;
import com.example.latihan_ukk.Database.DataBaseHandler;

public class PPDBView extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    private DataBaseHandler ppdbViewHelper;
    private EditText nisPPDBEdt, namaPPDBEdt, jkPPDBEdt, tempPPDBEdt, tglPPDBEdt, alamatPPDBEdt, sekolahPPDBEdt, kelasPPDBEdt, jurusanPPDBEdt;
    private Button updateBtn, deleteBtn;
    public static final String EXTRA_ID_PPDB_VIEW = "extra_id_ppdb_view";
    private PPDB ppdb;
    private String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppdb_view);
        ppdbViewHelper = new DataBaseHandler(this);
        nisPPDBEdt = findViewById(R.id.nis_view_edt);
        namaPPDBEdt = findViewById(R.id.nama_view_edt);
        jkPPDBEdt = findViewById(R.id.jk_view_edt);
        tempPPDBEdt = findViewById(R.id.temp_view_edt);
        tglPPDBEdt = findViewById(R.id.tgl_view_edt);
        alamatPPDBEdt = findViewById(R.id.alamat_view_edt);
        sekolahPPDBEdt = findViewById(R.id.sekolah_view_edt);
        kelasPPDBEdt = findViewById(R.id.kelas_view_edt);
        jurusanPPDBEdt = findViewById(R.id.jurusan_view_edt);
        updateBtn = findViewById(R.id.update_ppdb);
        deleteBtn = findViewById(R.id.delete_ppdb);
    }

    void findId(){
        int id = getIntent().getIntExtra(EXTRA_ID_PPDB_VIEW,0);
        String nisPPDB,namaPPDB,jkPPDB,tempPPDB,tglPPDB,alamatPPDB,sekolahPPDB,kelasPPDB,jurusanPPDB;
        ppdb = ppdbViewHelper.findOnePPDB(id);
    }
}