class Garis {

    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    // Konstruktor tanpa parameter 
    Garis() {
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    Garis(Titik awal, Titik akhir) {
        titikAwal = awal;
        titikAkhir = akhir;
        counterGaris++;
    }

    Titik getTitikAwal() {
        return titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    // Panjang garis
    double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Gradien
    double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Titik tengah
    Titik getTitikTengah() {
        double xt = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yt = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xt, yt);
    }

    // Cek sejajar
    boolean isSejajar(Garis G) {
        return getGradien() == G.getGradien();
    }

    // Cek tegak lurus
    boolean isTegakLurus(Garis G) {
        return getGradien() * G.getGradien() == -1;
    }

    // Print garis
    void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // Persamaan garis
    String getPersamaanGaris() {
        double m = getGradien();
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double c = y1 - m * x1;

        return "y = " + m + "x + " + c;
    }
}