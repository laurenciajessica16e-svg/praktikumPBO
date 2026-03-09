/* 
Nama File : BangunDatar.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat atribut dan method untuk class Bangun Datar
Tanggal : 9 Maret 2026
*/

public class BangunDatar {
   /*ATRIBUT */
   protected int jmlSisi;
   protected String warna;
   protected String border;

   public BangunDatar(){
   }

   public BangunDatar(int jmlSisi, String warna, String border){
    this.jmlSisi = jmlSisi;
    this.warna = warna;
    this.border = border;
   }

   /*KONSTRUKTOR */
   public int getJmlSisi(){
    return jmlSisi;
   }

   public void setJmlSisi(int jmlSisi){
    this.jmlSisi = jmlSisi;
   }

   public String getWarna(){
    return warna;
   }

   public void setWarna(String warna){
    this.warna = warna;
   }

   public String getBorder(){
    return border;
   }

   public void setBorder(String border){
    this.border = border;
   }

   public void printInfo(){
    System.out.println("Jumlah sisi" + jmlSisi);
    System.out.println("Warna" + warna);
    System.out.println("Border" + border);
   }
}
