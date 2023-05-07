/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class LuasPrismaSegitiga {
 public static void main(String[] args) {
     int alas, tinggi;
     String input_alas, input_tinggi;
     double sisimiring, luas_prisma, luas_alas, keliling_alas;
     
     input_alas = JOptionPane.showInputDialog("Masukkan nilai alas prisma");
     alas = Integer.parseInt(input_alas);
     input_tinggi = JOptionPane.showInputDialog("Masukkan nilai tinggi prisma");
     tinggi = Integer.parseInt(input_tinggi);
     
     
     sisimiring = Math.sqrt(alas*tinggi);
     
     keliling_alas = sisimiring + sisimiring + alas;
     luas_alas = 0.5 * alas * tinggi;
     luas_prisma = (2 * luas_alas) + (keliling_alas * tinggi);
     
     String msg = "Luas Prisma Segitiga adalah "+luas_prisma+" cm";
     
     JOptionPane.showMessageDialog(null, msg);
 }   
}
