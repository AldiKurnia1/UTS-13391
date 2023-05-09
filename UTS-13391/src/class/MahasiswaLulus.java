/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openai;

/**
 *
 * @author SUKMA
 */
public class MahasiswaLulus extends Mahasiswa {
    public int tahunWisuda;
    public float ipk;
    
    public MahasiswaLulus(String nim, String nama, int semester, int usia, String[] krs, int tahunWisuda, float ipk) {
        super(nim, nama, semester, usia, krs);
        this.tahunWisuda = tahunWisuda;
        this.ipk = ipk;
    }
    
    public int getTahunWisuda() {
        return tahunWisuda;
    }
    
    public float getIpk() {
        return ipk;
    }
    
    public boolean ikutWisuda() {
        return true;
    }
    
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda: " + tahunWisuda);
        System.out.println("IPK: " + ipk);
    }
}
