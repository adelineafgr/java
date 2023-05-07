/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author admin
 */
public class LuasTrapesium {
    public static void main(String[] args) throws IOException {
        int sisi1;
        int sisi2;
        int t;
        double l;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
        System.out.println("=====Menghitung Luas Trapesium===--");
        System.out.print("Masukkan nilai sisi 1 trapesium : ");
        sisi1 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan nilai sisi 2 trapesium : ");
        sisi2 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan nilai tinggi trapesium : ");
        t = Integer.parseInt(br.readLine());
        
        l =  (0.5 * t * (sisi1+sisi2));
        System.out.print("Luas trapesium dengan sisi 1 adalah "+sisi1+" cm, sisi 2 adalah "+sisi2+" cm, dan tinggi adalah "+t+" adalah "+l);
    }
}
