/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author admin
 */
abstract class P {
    abstract public void method2();
    int x,y,z;
    
    public void method1() {
        System.out.println("Method nyata dari class P");
        System.out.println("Nilai x, y ditentukan dalam class P");
        x = 12;
        y = 10;
    }
}
class Q extends P {
    public void method2() {
        System.out.println("Method abstract yang sudah menjadi nyata dalam class P");
        z = x + y;
        
        System.out.println("Hasil perhitungan = "+z);
        System.out.println("");
    }
}
class Abstraksi_sederhana {
    public static void main(String[] args) {
        Q object = new Q();
        object.method1();
        object.method2();
    }
}
