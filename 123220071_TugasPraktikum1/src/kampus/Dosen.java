/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kampus;

/**
 *
 * @author HP
 */
public class Dosen {

    public String nama;
    public String keahlian;

    public Dosen(String nama, String keahlian) {
        this.nama = nama;
        this.keahlian = keahlian;
    }

    public void pratinjau() {
        System.out.println("\nData Dosen");
        System.out.println("Nama Dosen\t: " + nama);
        System.out.println("Matkul Yanh Diampu: " + keahlian);
    }
}
