/*
Nama File  : PNS.java
Deskripsi  : Class PNS
Pembuat    : Jessica Laurencia Panjaitan
Tanggal    : 16 Maret 2026
*/

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, int tahunMulai, double pendapatan, String nip){
        super(nama, tahunMulai, pendapatan, "");
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    public int hitungMasaKerja(){
        int sekarang = 2026;
        return (sekarang - tahunMulai) + 4;
    }

    public double hitungPajak(){
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}
