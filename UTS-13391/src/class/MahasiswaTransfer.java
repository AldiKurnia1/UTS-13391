/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openai;

/**
 *
 * @author SUKMA
 */
public class MahasiswaTransfer extends MahasiswaBaru {
    public String asalUniv;

    public MahasiswaTransfer(String nim, String nama, int semester, int usia, String[] krs, String asalUniv) {
        super(nim, nama, semester, usia, krs, asalUniv);
        this.asalUniv = asalUniv;
    }

    public boolean infoOspek() {
        return true;
    }

    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Univ: " + asalUniv);
    }
}
