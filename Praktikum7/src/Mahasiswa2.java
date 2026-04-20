/* 
Nama File : Mahasiswa2.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat class Mahasiswa
Tanggal : 20 April 2026
*/

class Mahasiswa2 {
    private int NIM;
    private String Nama;
    private String ProgramStudi;

    //2c
    public Mahasiswa2() {
        this.NIM = -999;
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    //2d
    public Mahasiswa2(int NIM, String Nama, String ProgramStudi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    //2e
    public Mahasiswa2(Mahasiswa2 m){
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.ProgramStudi = m.ProgramStudi;
    }
    
    //getter
    public int getNIM(){
        return NIM;
    }

    public String getNama(){
        return Nama;
    }

    public String getProgramStudi(){
        return ProgramStudi;
    }

    //setter
    public void setNIM(int NIM){
        this.NIM = NIM;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    //overloading method
    public void setProgramStudi(){
        this.ProgramStudi = "kosong";
    }
    
    public void setProgramStudi(String prodi){
        this.ProgramStudi = prodi;
    }

    public void setProgramStudi(Mahasiswa2 m){
        this.ProgramStudi = m.ProgramStudi;
    }

    // method tampilin data mahasiswa
    public void Tampil(){
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("Program Studi : " + ProgramStudi);
    }
}