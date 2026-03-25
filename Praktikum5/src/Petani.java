/*
Nama File  : Petani.java
Deskripsi  : Class Petani
Pembuat    : Jessica Laurencia Panjaitan
Tanggal    : 16 Maret 2026
*/

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, int tahunMulai, double pendapatan, String asal_kota){
        super(nama, tahunMulai, pendapatan, "");
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    public int hitungMasaKerja(){
        int sekarang = 2026;
        return (sekarang - tahunMulai) + 0;
    }

    public double hitungPajak(){
        return 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}
