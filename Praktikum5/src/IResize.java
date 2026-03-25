/*
Nama File  : IResize.java
Deskripsi  : Interface untuk objek yang bisa di-resize
Pembuat    : Jessica Laurencia Panjaitan
Tanggal    : 16 Maret 2026
*/

public interface IResize {
    //menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    //mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //menskalakan ukuran sesuai dengan input persen yang diberikan
    public void zoom(int percent);

}
