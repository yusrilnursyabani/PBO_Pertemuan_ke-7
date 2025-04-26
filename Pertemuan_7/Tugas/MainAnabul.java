/*  Nama File   : MainAnabul.java 
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas Main untuk menguji kelas Anabul dan subclass-nya
    Tanggal     : 25 April 2025
*/

public class MainAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing();
        Anabul anjing = new Anjing();
        Anabul burung = new Burung();
        
        // Simulasi semua suara dan gerakan
        kucing.suara();
        kucing.gerak();
        
        anjing.suara();
        anjing.gerak();
        
        burung.suara();
        burung.gerak();
    }
}
