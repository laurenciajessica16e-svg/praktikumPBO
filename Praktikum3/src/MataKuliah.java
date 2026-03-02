/* 
Nama File : MataKuliah.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat atribut dan method untuk class MataKuliah
Tanggal : 2 Maret 2026
*/

public class MataKuliah {

    /*  ATRIBUT  */
    private String idMatkul;
    private String nama;
    private int sks;

    /*  KONSTRUKTOR  */
    //Konstruktor tanpa parameter 
    public MataKuliah() {
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    //Konstruktor dengan parameter
    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //Selektor untuk masing-masing atribut
    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }
    
    public int getSks(){
        return sks;
    }

    //Muktator untuk masing-masing atribut
    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
}

