/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1;

/**
 *
 * @author admin
 */

class var_tabung {
        int r;
        int t;
        
        void hitung() {
        double luas;
        
        var_tabung p = new var_tabung();
        p.t = 20;
        p.r = 10;
        
        luas = 2 * 3.14 * p.r * (p.r + p.t);
        
        System.out.println("Luas Persegi Panjang dengan panjang "+p.r+" dan lebar "+p.t+" adalah "+luas+" cm");
        }
    }

public class LuasTabung {
    public static void main(String[] args) {
       var_tabung cetak;
       
       cetak = new var_tabung();
       cetak.hitung();
    }
}
