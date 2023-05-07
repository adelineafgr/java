/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author admin
 */
public class GanjilGenap {
    public static void main(String[] args) {
        for (int a=1;a<1000;a++) {
            if(a%2==1) {
                System.out.println(a+" merupakan bilangan ganjil");
            } else if (a%2==0) {
                System.out.println(a+" merupakan bilangan genap");
            }
        }
    }
}
