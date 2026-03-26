/* 
Nama File : Asersil.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat class Asersil
Tanggal : 26 Maret 2026
*/


public class Asersil {
    public static void main(String[] args) {
        int x=0;
        if(x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x<0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
