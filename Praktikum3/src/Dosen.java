/* Nama File  : Dosen.java
 * Deskripsi  : berisi atribut dan method dalam class Dosen
 * Pembuat    : Jessica Laurencia Panjaitan
 * Tanggal    : 02 Maret 2026
 */

public class Dosen{

    /*  ATRIBUT  */
    private String nip;
    private String nama;
    private String prodi;

    /*  KONSTRUKTOR  */
    //Konstruktor tanpa parameter 
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    //Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Selektor untuk masing-masing atribut
    public String getNama(){
        return nama;
    }

    public String getNIP(){
        return nip;
    }

    public String getProdi(){
        return prodi;
    }

    //Muktator untuk masing-masing atribut
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIP(String nip){
        this.nip = nip;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}










































