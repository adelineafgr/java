/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author admin
 */
abstract class Balok {
    abstract public void method2();
    int p,l,t,v;
    
    public void method1() {
        System.out.println("=====Menghitung Volume Balok=====");
       
        p = 12;
        l = 10;
        t = 5;
    }
}
class hitungBalok extends Balok {
    public void method2() {
        v = p*l*t;
        
        System.out.println("Volume Balok dengan panjang "+p+" m, lebar "+l+" m, dan tinggi "+t+" m adalah "+v+" m3");
    }
}
class AbstraksiBalok {
    public static void main(String[] args) {
        hitungBalok object = new hitungBalok();
        object.method1();
        object.method2();
    }
}
