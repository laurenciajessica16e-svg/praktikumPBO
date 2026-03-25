/*
Nama File  : Manusia.java
Deskripsi  : Class Manusia
Pembuat    : Jessica Laurencia Panjaitan
Tanggal    : 16 Maret 2026
*/

public abstract class Manusia {
    protected String nama;
    protected int tahunMulai;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, int tahunMulai, double pendapatan, String alamat){
        this.nama = nama;
        this.tahunMulai = tahunMulai;
        this.pendapatan = pendapatan;
        this.alamat = alamat;
        counterMns++;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    public abstract int hitungMasaKerja();
}
