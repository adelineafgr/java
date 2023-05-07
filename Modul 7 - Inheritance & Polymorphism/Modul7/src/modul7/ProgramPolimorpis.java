/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author admin
 */
public class ProgramPolimorpis {
    public static void main(String[] args) {
        BentukWajah objBentuk = new BentukWajah();
        Senyum objSenyum = new Senyum();
        Tertawa objTertawa = new Tertawa();
        Marah objMarah = new Marah();
        Sedih objSedih = new Sedih();
        
        BentukWajah[] Bentuk = new BentukWajah[5];
        Bentuk[0] = objBentuk;
        Bentuk[1] = objSenyum;
        Bentuk[2] = objTertawa;
        Bentuk[3] = objMarah;
        Bentuk[4] = objSedih;
        
        System.out.println("Bentuk[0] :"+Bentuk[0].respons());
        System.out.println("Bentuk[1] :"+Bentuk[1].respons());
        System.out.println("Bentuk[2] :"+Bentuk[2].respons());
        System.out.println("Bentuk[3] :"+Bentuk[3].respons());
        System.out.println("Bentuk[4] :"+Bentuk[4].respons());
    }
}

class BentukWajah {
    public String respons() {
        return ("Perhatikan reaksi wajah saya");
    }
}

class Senyum extends BentukWajah {
    public String respons() {
        return("Senyum karena senang");
    }
}

class Tertawa extends BentukWajah {
    public String respons() {
        return("Tertawa karena gembira");
    }
}

class Marah extends BentukWajah {
    public String respons() {
        return("Kemarahan disebabkan bertengkar");
    }
}

class Sedih extends BentukWajah {
    public String respons() {
        return("Kesedihan disebabkan cemburu");
    }
}