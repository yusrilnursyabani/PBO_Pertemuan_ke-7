/*  Nama File   : Burung.java 
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas Burung yang merupakan subclass dari kelas Anabul
    Tanggal     : 25 April 2025
*/

class Burung extends Anabul {
    @Override
    public void suara() {
        System.out.println("Burung: Cukurukuk!");
    }
    
    @Override
    public void gerak() {
        System.out.println("Burung terbang melintasi awan.");
    }
}