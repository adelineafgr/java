/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author admin
 */
class StudentData {
    private int stuID;
    private String stuName;
    private int stuAge;
    
    StudentData() {
        //Default constructor
        stuID = 100;
        stuName = "New Student";
        stuAge = 18;
    }
    StudentData (int num1, String str, int num2) {
        //Parameterized constructor
        stuID = num1;
        stuName = str;
        stuAge = num2;
    }
    //Getter and setter methods
    public int getStuID() {
        return stuID;
    }
    public void setStuID(int stuID)
    {
        this.stuID = stuID;
    }  
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public int getStuAge() {
        return stuAge;
    }
    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }
    
    public static void main (String[] args) {
        //This object creation would call the default constructor
        StudentData data1 = new StudentData();
        System.out.println("Student Name is: "+data1.getStuName());
        System.out.println("Student Age is: "+data1.getStuAge());
        System.out.println("Student ID is: "+data1.getStuID());
        
        /*This object creation would call the parameterized
        * constructor StudentData (int, String, int
        */
        StudentData data2 = new StudentData (555, "Chaitanya", 25);
        System.out.println("Student Name is: "+data2.getStuName());
        System.out.println("Student Age is: "+data2.getStuAge());
        System.out.println("Student ID is: "+data2.getStuID());
    }
}
