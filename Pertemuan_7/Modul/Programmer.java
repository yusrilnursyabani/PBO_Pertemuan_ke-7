/*  Nama File   : Programmer.java 
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas Programmer yang merupakan subclass dari Pegawai
    Tanggal     : 25 April 2025
*/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
