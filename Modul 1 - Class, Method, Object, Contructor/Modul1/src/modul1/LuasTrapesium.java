/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1;

/**
 *
 * @author admin
 */

class var_trapes {
        double sisi1;
        double sisi2;
        double t;
        
        void hitung() {
        double luas;
        
        var_trapes t = new var_trapes();
        t.sisi2 = 20;
        t.sisi1 = 10;
        t.t = 7;
        
        luas = 0.5 * t.t * (t.sisi1 + t.sisi2);
        
        System.out.println("Luas Trapesium dengan sisi 1 "+t.sisi1+" cm, sisi 2 "+t.sisi2+" cm, dan tinggi "+t.t+" adalah "+luas+" cm");
        }
    }

public class LuasTrapesium {
    public static void main(String[] args) {
       var_trapes cetak;
       
       cetak = new var_trapes();
       cetak.hitung();
    }
}
