/*  Nama File   : Anjing.java 
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas Anjing yang merupakan subclass dari kelas Anabul
    Tanggal     : 25 April 2025
*/

class Anjing extends Anabul {
    @Override
    public void suara() {
        System.out.println("Odie: Guk-guk!");
    }
    
    @Override
    public void gerak() {
        System.out.println("Odie bergerak dengan cepat.");
    }
}