/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author admin
 */
public class PrestasiSiswa {
    private double IP, IPK;
    private String nim, nama, jurusan, fakultas, prestasi, beasiswa;
    
    
    PrestasiSiswa() {
        //Default constructor
        nim = "00000";
        nama = "New Student";
        jurusan = "Jurusan";
        fakultas = "fakultas";
        prestasi = "-";
        beasiswa = "-";
    }
    PrestasiSiswa (double IP, double IPK, String nim, String nama, String jurusan, String prestasi, String beasiswa) {
        //Parameterized constructor
        this.IP = IP;
        this.IPK = IPK;
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.prestasi = prestasi;
        this.beasiswa = beasiswa;
    }
    //Getter and setter methods
    public String getNama() {
        return nama;
    }
    public void setNama(String nama)
    {
        this.nama = nama;
    }  
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getJurusan() {
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public String getPrestasi() {
        return prestasi;
    }
    public void setPrestasi(String prestasi) {
        this.prestasi = prestasi;
    }
    public double getIP() {
        return IP;
    }
    public void setIP(double IP) {
        this.IP = IP;
    }
    public double getIPK() {
        return IPK;
    }
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    public String getBeasiswa() {
        return beasiswa;
    }
    public void setBeasiswa(String beasiswa) {
        this.beasiswa = beasiswa;
    }
    
    public static void main (String[] args) {
        //This object creation would call the default constructor
        PrestasiSiswa ps = new PrestasiSiswa(3.56, 3.40, "999876", "Budi", "RPL", "LKS", "KJP");
        System.out.println("=====Identitas Mahasiswa=====");
        System.out.println("Nama\t\t: "+ps.nama);
        System.out.println("NIM\t\t: "+ps.nim);
        System.out.println("Jurusan\t\t: "+ps.jurusan);
        System.out.println("Fakultas\t: "+ps.fakultas);
        System.out.println("Jurusan\t\t: "+ps.jurusan);
        System.out.println("\n=====Prestasi Akademik=====");
        System.out.println("Nama Prestasi\t: "+ps.prestasi);
        System.out.println("IP Semester\t: "+ps.IP);
        System.out.println("IP Kumulatif\t: "+ps.IPK);
        System.out.println("Riwayat Beasiswa: "+ps.beasiswa);
    }
}
