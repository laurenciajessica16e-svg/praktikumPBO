/* 
Nama : Jessica Laurencia Panjaitan
NIM : 24060124130084
Nama file : MTeman.java
Tanggal : 4 Mei 2026
*/

import java.util.*;

class Teman{
    // ATRIBUT
    private int nbelm;
    private List<String> Lnama;

    //KONSTRUKTOR
    Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    //OPERATOR

    // a. getNbelm()
    // mengembalikan jumlah elemen yang ada dalam list Lnama
    public int getNbelm(){
        return nbelm;
    }

    // b. getNama(indeks)
    // mengembalikan nama pada indeks tertentu dalam list Lnama
    public String getNama(int indeks){
        return Lnama.get(indeks);
    }

    // c. setNama(indeks, nama)
    // mengubah nama pada indeks tertentu menjadi nama baru
    public void setNama(int indeks, String nama){
        Lnama.set(indeks, nama);
    }

    // d. addNama(nama)
    // menambahkan nama baru ke akhir list Lnama
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }

    // e. delNama(nama)
    // menghapus nama tertentu dari list Lnama (jika ada)
    public void delNama(String nama){
        Lnama.remove(nama);
        nbelm--;
    }

    // f. isMember(nama)
    // mengecek apakah nama tertentu terdapat dalam list Lnama
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    // g. gantiNama(nama, namabaru)
    // mengganti nama lama dengan nama baru jika ditemukan dalam list
    public void gantiNama(String nama, String namabaru){
        int index = Lnama.indexOf(nama);
        if (index != -1) {
            Lnama.set(index, namabaru);
        }
    }

    // h. countNama(nama)
    // menghitung berapa kali nama tertentu muncul dalam list Lnama
    public int countNama(String nama){
        int count = 0;
        for (String x : Lnama){
            if (x.equals(nama)) {   
                count++;
            }
        }
        return count;
    }

    // i. showTeman()
    // menampilkan semua nama teman yang ada dalam list Lnama
    public void showTeman(){
        for(String x : Lnama){
            System.out.println(x);
        }
    }
}

public class MTeman{
    public static void main(String[] args) {
        // Membuat objek Teman untuk menyimpan list nama teman
        Teman t = new Teman();

        // Menambah data teman menggunakan addNama()
        t.addNama("Jess");
        t.addNama("Ica");

        // Menampilkan seluruh isi list menggunakan showTeman()
        System.out.println("Daftar teman:");
        t.showTeman();

        // Menampilkan jumlah elemen dalam list menggunakan getNbelm()
        System.out.println("Jumlah elemen : " + t.getNbelm());

        // Mengambil nama pada indeks tertentu menggunakan getNama()
        System.out.println("Orang pertama : " + t.getNama(0));

        // Menghapus nama tertentu menggunakan delNama()
        t.delNama("Ica");
        t.showTeman();

        // Mengganti nama lama menjadi nama baru menggunakan gantiNama()
        t.gantiNama("Jess","Jesi");
        t.showTeman();

        // Mengubah nama berdasarkan indeks menggunakan setNama()
        t.setNama(0, "Jessica");
        t.showTeman();

        // Menghitung jumlah kemunculan nama menggunakan countNama()
        System.out.println("Jumlah nama Jessica : " + t.countNama("Jessica"));

        // Mengecek apakah nama tertentu ada di list menggunakan isMember()
        System.out.println("IsMember Ica : " + t.isMember("Ica"));

        // Menambah nama lagi
        t.addNama("Pan");
        t.showTeman();
    }   
}