/* 
Nama File : MSeminar.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat class Seminar
Tanggal : 20 April 2026
*/

class CivitasAkademika{
    protected String nama;

    public CivitasAkademika(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public String getNomor(){
        return "0";
    }
}

class Dosen extends CivitasAkademika{
    private String nip;

    public Dosen(String nama, String nip){
        super(nama);
        this.nip = nip;
    }

    @Override
    public String getNomor(){
        return nip;
    }

    public String getNip(){
        return nip;
    }
}

class Mahasiswa extends CivitasAkademika{
    private String nim;
    
    private Dosen dosenWali;

    public Mahasiswa(String nama, String nim, Dosen dosenWali){
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }

    @Override
    public String getNomor(){
        return nim;
    }

    //4i
    public void setWali(Dosen dosen){
        this.dosenWali = dosen;
    }

    //4j
    public void Tampil(){
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        if (dosenWali != null) {
            System.out.println("Dosen Wali : " + dosenWali.getNama());
        }
        else{
            System.out.println("Dosen Wali = - ");
        }
    }
}

//4b
class Seminar{
    private CivitasAkademika[] pesertax;
    private int bykpeserta;

    public Seminar(){
        pesertax = new CivitasAkademika[100];
        bykpeserta = 0;
    }
    //4d
    public void registrasi(CivitasAkademika peserta){
        if(bykpeserta < 100){
            pesertax[bykpeserta] = peserta;
            bykpeserta = bykpeserta + 1;
        }
        else{
            System.out.println("Seminar penuh");
        }
}

    //4c
    public int countPeserta(){
        return bykpeserta;
    }

    //4g
    public void Tampil(){
        System.out.println("Daftar Peserta");
        for(int i=0 ; i<bykpeserta; i++){
            System.out.println((i+1) + " Nomor: " + pesertax[i].getNomor() + ", Nama: " + pesertax[i].getNama());
        }
    }

    //4h
    public int countMahasiswa(){
        int jumlah = 0;
        for(int i = 0; i < bykpeserta; i++){
            if(pesertax[i] instanceof Mahasiswa){
                jumlah = jumlah + 1;
            }
        }
        return jumlah;
    }
}


public class MSeminar {
    public static void main(String[] args) {
        Seminar seminar = new Seminar();

        //4e
        Dosen d1 = new Dosen("Yanto", "34237429");
        Dosen d2 = new Dosen("Yanti", "78739046");

        Mahasiswa m1 = new Mahasiswa("A", "230001", d1);
        Mahasiswa m2 = new Mahasiswa("B", "230002", d1);
        Mahasiswa m3 = new Mahasiswa("C", "230003", d2);
        Mahasiswa m4 = new Mahasiswa("D", "230004", d2);
        Mahasiswa m5 = new Mahasiswa("E", "230005", d1);

        //4f 
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        //4c, jumlah peserta
        System.out.println("Total peserta = " + seminar.countPeserta());

        //4g, daftar peserta
        seminar.Tampil();

        //4h, jumlah mahasiswa
        System.out.println("Total Mahasiswa = " + seminar.countMahasiswa());

        //4i
        m5.setWali(d2);

        //4j
        m1.Tampil();
        m2.Tampil();
        m3.Tampil();
        m4.Tampil();
        m5.Tampil();

    }
}
