/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import kampus.Mahasiswa;
import kampus.Dosen;
import MataKuliah.matKul;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("rafiq", 123220071, "Informatika");
        mahasiswa.pratinjau();

        Dosen dosen = new Dosen("Rochmad Husaini,S.Kom.,M.Kom.", "Pemrograman Berorientasi Objek");
        matKul matkul = new matKul("Praktkum Pemrograman Berorientasi Objek", dosen);
        matkul.pratinjau();
    }
    
}
