/* 
Nama File : MAnabul.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : 
Tanggal : 27 April 2026
*/

class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println(nama + " bergerak");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara");
    }
}

class Kucing extends Anabul {
    private double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}

class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }
}

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi cuit");
    }
}

class Datum<T> {
    private T isi;

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}

class OperatorGenerik {

    public static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static void TukarInteger(Datum<Integer> a, Datum<Integer> b) {
        Integer temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static double Bobot2(Kucing k1, Kucing k2) {
        return k1.getBobot() + k2.getBobot();
    }
}

class Data<T> {
    private static Datum<?>[] ruang = new Datum[100];
    private static int size = 0;

    public void setIsi(int index, T nilai) {
        ruang[index] = new Datum<T>(nilai);
        size++;
    }

    //public T getIsi(int index) {
    //   return (T) ruang[index].getIsi();
    //}

    public int getSize() {
        return size;
    }
}

public class MAnabul {
    public static void main(String[] args) {

        Anabul[] daftarAnabul = new Anabul[3];

        daftarAnabul[0] = new Kucing("Axy", 4.5);
        daftarAnabul[1] = new Anjing("Cory");
        daftarAnabul[2] = new Burung("Riz");

        for (Anabul a : daftarAnabul) {
            System.out.println("Nama: " + a.nama);
            a.gerak();
            a.bersuara();
        }

        Datum<String> d1 = new Datum<>("Kucing");
        Datum<String> d2 = new Datum<>("Anjing");

        System.out.println("Sebelum tukar:");
        System.out.println(d1.getIsi());
        System.out.println(d2.getIsi());

        OperatorGenerik.Tukar(d1, d2);

        System.out.println("Sesudah tukar:");
        System.out.println(d1.getIsi());
        System.out.println(d2.getIsi());

        Kucing k1 = new Kucing("Mimi", 4.5);
        Kucing k2 = new Kucing("Luna", 3.0);

        System.out.println("Total bobot: " + OperatorGenerik.Bobot2(k1, k2) + " kg");

        Data<Anabul> data = new Data<>();

        data.setIsi(0, new Anjing("Doggy"));
        data.setIsi(1, new Burung("Rio"));
        data.setIsi(2, new Kucing("Kitty", 2.5));

        System.out.println("Isi Data:");
        for (int i = 0; i < data.getSize(); i++) {
           // data.getIsi(i).bersuara();
        }
    }
}