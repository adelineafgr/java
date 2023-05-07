/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class KelilingLingkaran {
    public static void main(String[] args) {
        double phi = 3.14;
        int d;
        double k;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Keliling Lingkaran");
        System.out.print("Masukkan diameter lingkaran : ");
        d = input.nextInt();
        
        k = phi*d;
        
        System.out.println("Keliling Lingkaran dengan diameter "+d+" cm adalah "+k);
    }
}
