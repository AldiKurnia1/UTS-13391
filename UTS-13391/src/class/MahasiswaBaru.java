/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openai;

/**
 *
 * @author SUKMA
 */
public class MahasiswaBaru extends Mahasiswa {
    private String asalSekolah;
    
    public MahasiswaBaru(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah) {
        super(nim, nama, semester, usia, krs);
        this.asalSekolah = asalSekolah;
    }
    
    public String getAsalSekolah() {
        return asalSekolah;
    }
    
    public boolean ikutOspek() {
        return true;
    }
    
    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Sekolah: " + asalSekolah);
    }
}