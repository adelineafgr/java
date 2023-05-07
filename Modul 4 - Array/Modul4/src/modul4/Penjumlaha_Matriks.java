/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Penjumlaha_Matriks {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];
        
        System.out.println("Masukkan Nilai Matriks X");
        System.out.println("=========================");
        for(int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                System.out.print("["+(i+1)+"]["+(j+1)+"]:");
                A[i][j]=input.nextInt();
            }
        }
        System.out.println("Masukkan Nilai Matriks Y");
        System.out.println("=========================");
        for(int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                System.out.print("["+(i+1)+"]["+(j+1)+"]:");
                B[i][j]=input.nextInt();
                    }
                }
        for (int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                C[i][j] = A[i][j]+B[i][j];
            }
        }
        System.out.println("\nHasil penjumlahan matriks");
        System.out.println("==============================");
        for (int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                System.out.print(+(C[i][j])+" ");
            }
        }
        System.out.println(" ");
    }
}
