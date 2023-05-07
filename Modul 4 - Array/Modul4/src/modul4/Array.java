/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul4;

/**
 *
 * @author admin
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int java[];
        java = new int[5];
        
        int i ;
        
        java[0] = 2;
        java[1] = 1;
        java[2] = 4;
        java[3] = 10;
        java[4] = 3;
        
        for(i=0;i<java.length;i++) {
            System.out.println("java["+i+"]="+java[i]);
        }
    }
    
}
