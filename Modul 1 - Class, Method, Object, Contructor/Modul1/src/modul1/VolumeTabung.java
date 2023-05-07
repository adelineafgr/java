package modul1;
import java.util.Scanner;

public class VolumeTabung {
    private static final double PI = 3.14;
    private double jari_jari;
    private double tinggi;

    public VolumeTabung(double jari_jari, double tinggi) {
        this.jari_jari = jari_jari;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        double volume;
        volume = PI * jari_jari * jari_jari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jari_jari, tinggi, volume;

        System.out.print("Masukkan jari-jari tabung: ");
        jari_jari = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        tinggi = input.nextDouble();

        VolumeTabung tabung = new VolumeTabung(jari_jari, tinggi);
        volume = tabung.hitungVolume();

        System.out.printf("Volume tabung adalah %.2f", volume);
    }
}
