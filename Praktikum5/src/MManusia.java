/*
Nama File  : MManusia.java
Deskripsi  : Untuk main run method manusia
Pembuat    : Jessica Laurencia Panjaitan
Tanggal    : 16 Maret 2026
*/

public class MManusia {
    public static void main(String[] args) {

        PNS p1 = new PNS("Satrio", 2006, 1500000, "19830230206041002");
        Pengusaha pe1 = new Pengusaha("Adhy", 2000, 5500000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", 1977, 500000, "Wonogiri");
        PNS p2 = new PNS("Panji", 2010, 1000000, "198004212010041002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}