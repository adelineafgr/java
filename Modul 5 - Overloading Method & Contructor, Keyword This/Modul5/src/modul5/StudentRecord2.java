/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author admin
 */
public class StudentRecord2 {
    private String name, address;
    private int age;
    private double mathGrade, englishGrade, scienceGrade, average;
    
    public void setName(String temp) {
        name = temp;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAddress(String temp) {
        address = temp;
    }
    
    public void setAge(int temp) {
        age = temp;
    }
    
    public void setMathGrade(double temp) {
        mathGrade = temp;
    }
    
    public double getMathGrade() {
        return mathGrade;
    }
    
    public void setEnglishGrade (double temp) {
        englishGrade = temp;
    }
    
    public double getEnglishGrade() {
        return englishGrade;
    }
    
    public void setScienceGrade (double temp) {
        scienceGrade = temp;
    }
    
    public double getScienceGrade() {
        return scienceGrade;
    }
    
    public double getAverage() {
        double result = 0;
        result = (mathGrade+englishGrade+scienceGrade)/3;
        return result;
    }
    
    public void print (String temp) {
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
    }
    
    public void print (double eGrade, double mGrade, double sGrade) {
        System.out.println("Name: "+name);
        System.out.println("Math Grade: "+mGrade);
        System.out.println("English Grade; "+englishGrade);
        System.out.println("Science Grade: "+scienceGrade);
    }
    
}
