/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Membuat Objek
package modul1;

class variabel {
    int lebar;
    int panjang;
}
public class NewClass2 {
    public static void main(String[] args) {
        double luas;
        variabel p = new variabel();
        p.panjang = 20;
        p.lebar = 10;
        luas = p.panjang * p.lebar;
        System.out.println("Luas Persegi : "+luas);
    }
}
