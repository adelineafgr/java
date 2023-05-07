/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author admin
 */
abstract class Bola {
    abstract public void method2();
    double r, v;
    
    public void method1() {
        System.out.println("=====Menghitung Volume Bola=====");
       
        r = 20;
    }
}
class hitungBola extends Bola {
    public void method2() {
        v = (1.3 * 3.14 * r)/100;
        
        System.out.println("Volume Bola dengan jari-jari "+r+" cm adalah "+v+" m3");
    }
}
class AbstraksiBola {
    public static void main(String[] args) {
        hitungBola object = new hitungBola();
        object.method1();
        object.method2();
    }
}
