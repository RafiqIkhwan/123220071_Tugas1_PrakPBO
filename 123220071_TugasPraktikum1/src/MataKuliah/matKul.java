/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MataKuliah;

import kampus.Dosen;

/**
 *
 * @author HP
 */
public class matKul {

    public String namaMatkul;
    public Dosen dosen;

    public matKul(String namaMatkul, Dosen dosen) {
        this.namaMatkul = namaMatkul;
        this.dosen = dosen;
    }

    public void pratinjau() {
        System.out.println("Mata Kuliah\t: " + namaMatkul);
        dosen.pratinjau();
    }
}
