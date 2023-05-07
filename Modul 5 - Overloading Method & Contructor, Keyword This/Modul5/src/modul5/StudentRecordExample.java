/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul5;

/**
 *
 * @author admin
 */
public class StudentRecordExample {
    public static void main(String[] args) {
        //Membuat 3 objek student record
        StudentRecord annaRecord = new StudentRecord();
        StudentRecord beahRecord = new StudentRecord();
        StudentRecord crisRecord = new StudentRecord();
        
        //Memberi nama siswa
        annaRecord.setName("Anna");
        beahRecord.setName("Beah");
        crisRecord.setName("Cris");
        
        //Menampilkan nama siswa
        System.out.println(annaRecord.getName());
        
        //Menampilkan jumlah siswa
        System.out.println("Count="+StudentRecord.getStudentCount());
    }
}
