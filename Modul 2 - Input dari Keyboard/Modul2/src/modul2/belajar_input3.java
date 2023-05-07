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
public class belajar_input3 {
    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("Masukkan nama");
        String msg = "Selamat Belajar"+nama;
        JOptionPane.showMessageDialog(null, msg);
    }
}
