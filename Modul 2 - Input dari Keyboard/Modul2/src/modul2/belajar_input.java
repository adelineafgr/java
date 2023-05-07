/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class belajar_input {

    //Input dengan Scanner
    public static void main(String[] args) {
        String nama, jurusan, fakultas, universitas;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Nama : ");
        nama = input.nextLine();
        
        System.out.print("Jurusan : ");
        jurusan = input.nextLine();
        
        System.out.print("Fakultas : ");
        fakultas = input.nextLine();
        
        System.out.print("Universitas : ");
        universitas = input.nextLine();
    }
    
}
