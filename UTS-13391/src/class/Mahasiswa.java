/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package openai;

/**
 *
 * @author SUKMA
 */
import java.util.Arrays;

public class Mahasiswa {

    public static String nim;
    public static String nama;
    public static int semester;
    public static int usia;
    public static String[] krs;
    
    public static void main(String[] args) {
        nim = "A11";
        nama = "Aldi";
        semester = 2;
        usia = 20;
        //krs = ["bindo"," mtk"," bing"];
    }
    
    public Mahasiswa(String nim, String nama, int semester, int usia, String[] krs) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getSemester() {
        return semester;
    }
    
    public int getUsia() {
        return usia;
    }
    
    public String[] getKrs() {
        return krs;
    }
    
    public float hitungRataNilai(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return (float) total / nilai.length;
    }
    
    public void infoMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Semester: " + semester);
        System.out.println("Usia: " + usia);
        System.out.println("KRS: " + Arrays.toString(krs));
    }
    
    public void infoKrsMahasiswa() {
        System.out.println("KRS: " + Arrays.toString(krs));
    }
}





