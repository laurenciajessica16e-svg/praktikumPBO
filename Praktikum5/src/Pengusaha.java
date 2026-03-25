/*
Nama File  : Pengusaha.java
Deskripsi  : Class Pengusaha
Pembuat    : Jessica Laurencia Panjaitan
Tanggal    : 16 Maret 2026
*/

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, int tahunMulai, double pendapatan, String npwp){
        super(nama, tahunMulai, pendapatan, "");
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    public int hitungMasaKerja(){
        int sekarang = 2026;
        return (sekarang - tahunMulai) + 8;
    }

    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}