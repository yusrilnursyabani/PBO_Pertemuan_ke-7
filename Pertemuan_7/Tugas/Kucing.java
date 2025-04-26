/*  Nama File   : Kucing.java 
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas Kucing yang merupakan subclass dari kelas Anabul
    Tanggal     : 25 April 2025
*/

class Kucing extends Anabul {
    @Override
    public void suara() {
        System.out.println("Tom: Meong!");
    }
    
    @Override
    public void gerak() {
        System.out.println("Tom bergerak mengerjar jerry.");
    }
}