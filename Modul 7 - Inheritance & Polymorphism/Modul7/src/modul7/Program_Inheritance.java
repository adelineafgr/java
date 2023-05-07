/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Program_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kelasA superClass = new kelasA();
        kelasB subClass = new kelasB();
        Scanner input = new Scanner(System.in);
        
        System.out.println("SuperClass adalah kelas A");
        superClass.x = 100;
        superClass.y = 125;
        superClass.tampilannilaixy();
        
        System.out.println("\nSubClass adalah kelas B");
        subClass.x = 13;
        subClass.y = 20;
        subClass.tampilannilaixy();
        
        System.out.print("\nMasukkan nilai z : ");
        subClass.z = input.nextInt();
        subClass.tampilkanjumlah();
    } 
}

class kelasA {
    int x, y;
    
    void tampilannilaixy() {
        System.out.println("Nilai x : "+x+" Nilai y : "+y);
    }
}

class kelasB extends kelasA {
    int z;
    
    void tampilkanjumlah() {
        System.out.println("\nJumlah nilai x + y + z = "+(x+y+z));
    }
}
