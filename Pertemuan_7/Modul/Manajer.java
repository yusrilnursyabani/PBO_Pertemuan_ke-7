/*  Nama File   : Manajer.java 
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas Manajer yang merupakan subclass dari Pegawai
    Tanggal     : 25 April 2025
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
