/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kampus;

/**
 *
 * @author HP
 */
public class Mahasiswa {

    public String nama = "";
    public int nim;
    public String prodi = "";

    public Mahasiswa(String nama, int nim, String prodi) {
        this.nama += nama;
        this.nim += nim;
        this.prodi += prodi;

    }

    public void pratinjau() {
        System.out.println("\nData Mahasiswa");
        System.out.println("Nama Mahasiswa\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Prodi\t\t: " + prodi);
    }
}
