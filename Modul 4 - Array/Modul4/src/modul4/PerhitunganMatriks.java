package modul4;
import java.util.Scanner;

public class PerhitunganMatriks {
    public static void main(String[] args) {
        int[][] matriksX = new int[2][2];
        int[][] matriksY = new int[2][2];
        int[][] hasil = new int[2][2];
        int pilihan;
        
        Scanner input = new Scanner(System.in);
        
        // input elemen matriks X
        System.out.println("Masukkan elemen matriks X:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriksX[i][j] = input.nextInt();
            }
        }
        
        // input elemen matriks Y
        System.out.println("Masukkan elemen matriks Y:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriksY[i][j] = input.nextInt();
            }
        }
        
        // menu operasi matriks
        System.out.println("Pilih operasi matriks:");
        System.out.println("1. Perkalian");
        System.out.println("2. Pengurangan");
        System.out.print("Pilihan: ");
        pilihan = input.nextInt();
        
        // operasi perkalian atau pengurangan matriks
        switch (pilihan) {
            case 1:
                // perkalian matriks
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        hasil[i][j] = matriksX[i][0] * matriksY[0][j] + matriksX[i][1] * matriksY[1][j];
                    }
                }
                break;
            case 2:
                // pengurangan matriks
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        hasil[i][j] = matriksX[i][j] - matriksY[i][j];
                    }
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
                return;
        }
        
        // tampilkan hasil
        System.out.println("Hasil:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
