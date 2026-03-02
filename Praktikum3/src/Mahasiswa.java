/* 
Nama File : Mahasiswa.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat atribut dan method untuk class Mahasiswa
Tanggal : 2 Maret 2026
*/

import java.util.ArrayList;

public class Mahasiswa {

    /*  ATRIBUT  */
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*  KONSTRUKTOR  */

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = null;
        this.kendaraan = null;
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    /* SELEKTOR (GETTER) */

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    /* MUTATOR (SETTER) */

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Menambahkan mata kuliah
    public void addMatkul(MataKuliah mk) {
        listMatkul.add(mk);
    }

    // Menghitung total SKS
    public int getJumlahSKS() {
        int total = 0;
        for (MataKuliah mk : listMatkul) {
            total = total + mk.getSks();
        }
        return total;
    }

    // Menghitung jumlah mata kuliah
    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    // Menampilkan data mahasiswa
    public void printMhs() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    // Menampilkan detail mahasiswa
    public void printDetailMhs() {
        printMhs();

        System.out.println("Jumlah Mata Kuliah : " + getJumlahMatkul());
        System.out.println("Jumlah SKS         : " + getJumlahSKS());

        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah mk : listMatkul) {
            System.out.println("- " + mk.getNama());
        }

        if (dosenWali != null) {
            System.out.println("Dosen Wali : " + dosenWali.getNama());
        }

        if (kendaraan != null) {
            System.out.println("Kendaraan  : " + kendaraan.getJenis());
        }
    }
}
