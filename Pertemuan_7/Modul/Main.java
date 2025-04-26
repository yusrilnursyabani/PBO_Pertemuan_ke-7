/*  Nama File   : Main.java 
    Nama        : Moh Yusril Nur Syabani - 24060123140181
    Deskripsi   : Main class untuk menampilkan data pegawai
    Tanggal     : 25 April 2025
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emp = new ArrayList<>();
        emp.add(pegawai1);
        emp.add(pegawai2);
        emp.add(pegawai3);

        for (Pegawai empData : emp) {
            empData.tampilData();
            System.out.println();
        }
    }
}
