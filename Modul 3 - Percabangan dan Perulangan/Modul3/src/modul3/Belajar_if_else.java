/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3;

/**
 *
 * @author admin
 */
public class Belajar_if_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kategori ="";
        int nilai_UAS_PBO =  79;
        
        if (nilai_UAS_PBO > 85) {
            kategori = "Anda lulus";
        } else {
            kategori = "Anda tidak lulus";
        }
        System.out.println(kategori);
    }
    
}
