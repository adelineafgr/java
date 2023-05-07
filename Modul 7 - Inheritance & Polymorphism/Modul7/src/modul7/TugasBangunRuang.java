package modul7;

class BangunRuang {
    double volume;

    public void hitungVolume() {
        // implementasi di kelas turunan
    }
}

class Kubus extends BangunRuang {
    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public void hitungVolume() {
        volume = sisi * sisi * sisi;
        System.out.println("Volume kubus: " + volume);
    }
}

class Balok extends BangunRuang {
    double panjang;
    double lebar;
    double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void hitungVolume() {
        volume = panjang * lebar * tinggi;
        System.out.println("Volume balok: " + volume);
    }
}

class Tabung extends BangunRuang {
    double jariJari;
    double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public void hitungVolume() {
        volume = Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume tabung: " + volume);
    }
}

class Kerucut extends BangunRuang {
    double jariJari;
    double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public void hitungVolume() {
        volume = (Math.PI * jariJari * jariJari * tinggi) / 3;
        System.out.println("Volume kerucut: " + volume);
    }
}

class Limas extends BangunRuang {
    double luasAlas;
    double tinggi;

    public Limas(double luasAlas, double tinggi) {
        this.luasAlas = luasAlas;
        this.tinggi = tinggi;
    }

    public void hitungVolume() {
        volume = (luasAlas * tinggi) / 3;
        System.out.println("Volume limas: " + volume);
    }
}

class Prisma extends BangunRuang {
    double luasAlas;
    double tinggi;

    public Prisma(double luasAlas, double tinggi) {
        this.luasAlas = luasAlas;
        this.tinggi = tinggi;
    }

    public void hitungVolume() {
        volume = luasAlas * tinggi;
        System.out.println("Volume prisma: " + volume);
    }
}

class Bola extends BangunRuang {
    double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public void hitungVolume() {
        volume = (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
        System.out.println("Volume bola: " + volume);
    }
}

public class TugasBangunRuang {
    public static void main(String[] args) {
        // inisialisasi objek untuk kelas turunan Tabung, Kerucut, Limas, Prisma, dan Bola
        BangunRuang kubus = new Kubus(5);
        BangunRuang balok = new Balok(10, 5, 3);
        BangunRuang tabung = new Tabung(5, 10);
        BangunRuang kerucut = new Kerucut(5, 10);
        BangunRuang limas = new Limas(7, 15);
        BangunRuang prisma = new Prisma(7, 15);
        BangunRuang bola = new Bola(20);
        
        // panggil method hitungVolume untuk setiap objek
        kubus.hitungVolume();
        balok.hitungVolume();
        tabung.hitungVolume();
        kerucut.hitungVolume();
        limas.hitungVolume();
        prisma.hitungVolume();
        bola.hitungVolume();
        
    }
}
