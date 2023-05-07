/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1;

/**
 *
 * @author admin
 */

class variabel {
        int panjang;
        int lebar;
        
        void hitung() {
        int luas;
        
        variabel p = new variabel();
        p.panjang = 20;
        p.lebar = 10;
        
        luas = p.panjang * p.lebar;
        
        System.out.println("Luas Persegi Panjang dengan panjang "+p.panjang+" dan lebar "+p.lebar+" adalah "+luas+" cm");
        }
    }

public class LuasPersegiPanjang {
    public static void main(String[] args) {
       variabel cetak;
       
       cetak = new variabel();
       cetak.hitung();
    }
}
