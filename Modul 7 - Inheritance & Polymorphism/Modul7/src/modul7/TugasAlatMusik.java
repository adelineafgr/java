/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author admin
 */
public class TugasAlatMusik {
    public static void main(String[] args) {
        AlatMusik objAlat = new AlatMusik();
        Piano objPiano = new Piano();
        Biola objBiola = new Biola();
        Gitar objGitar = new Gitar();
        Drum objDrum = new Drum();
        Saxophone objSaxophone = new Saxophone();
        Terompet objTerompet = new Terompet();
        
        AlatMusik[] Alat = new AlatMusik[7];
        Alat[0] = objAlat;
        Alat[1] = objPiano;
        Alat[2] = objBiola;
        Alat[3] = objGitar;
        Alat[4] = objDrum;
        Alat[5] = objSaxophone;
        Alat[6] = objTerompet;
        
        System.out.println(Alat[0].respons());
        System.out.println("Alat Musik 1 :"+Alat[1].respons());
        System.out.println("Alat Musik 2 :"+Alat[2].respons());
        System.out.println("Alat Musik 3 :"+Alat[3].respons());
        System.out.println("Alat Musik 4 :"+Alat[4].respons());
        System.out.println("Alat Musik 5 :"+Alat[5].respons());
        System.out.println("Alat Musik 6 :"+Alat[6].respons());
    }
}

class AlatMusik {
    public String respons() {
        return ("===== Berikut beberapa alat musik populer =====\n");
    }
}

class Piano extends AlatMusik {
    public String respons() {
        return("Piano");
    }
}

class Biola extends AlatMusik {
    public String respons() {
        return("Biola");
    }
}

class Gitar extends AlatMusik {
    public String respons() {
        return("Gitar");
    }
}

class Drum extends AlatMusik {
    public String respons() {
        return("Drum");
    }
}

class Saxophone extends AlatMusik {
    public String respons() {
        return("Saxophone");
    }
}

class Terompet extends AlatMusik {
    public String respons() {
        return("Terompet");
    }
}