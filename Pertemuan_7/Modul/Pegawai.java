/*  Nama File   : Pegawai.java 
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Kelas abstrak Pegawai
    Tanggal     : 25 April 2025
*/

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
