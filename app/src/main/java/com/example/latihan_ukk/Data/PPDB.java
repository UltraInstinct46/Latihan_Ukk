package com.example.latihan_ukk.Data;

public class PPDB {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String nis;
    private String nama;
    private String jk;
    private String temp;
    private String tgl;
    private String alamat;
    private String sekolah;
    private String kelas;
    private String jurusan;


    public PPDB(){}
    public PPDB(String nis, String nama, String jk, String temp, String tgl, String alamat, String sekolah, String kelas, String jurusan){
        this.nis = nis;
        this.nama = nama;
        this.jk = jk;
        this.temp = temp;
        this.tgl = tgl;
        this.alamat = alamat;
        this.sekolah = sekolah;
        this.kelas = kelas;
        this.jurusan = jurusan;
    }
    public PPDB(int id, String nis, String nama, String jk, String temp, String tgl, String alamat, String sekolah, String kelas){
        this.id = id;
        this.nis = nis;
        this.nama = nama;
        this.jk = jk;
        this.temp = temp;
        this.tgl = tgl;
        this.alamat = alamat;
        this.sekolah = sekolah;
        this.kelas = kelas;
        this.jurusan = jurusan;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getSekolah() {
        return sekolah;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
