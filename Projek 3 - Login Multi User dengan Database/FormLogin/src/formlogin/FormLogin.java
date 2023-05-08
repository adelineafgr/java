/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formlogin;

/**
 *
 * @author admin
 */
public class FormLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        koneksi k = new koneksi();
        k.Koneksi();
        login l = new login();
        l.setVisible(true);
    }
    
}
