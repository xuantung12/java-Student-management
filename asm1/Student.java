/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asm1;

/**
 *
 * @author PC-ACER
 */
public class Student {
    private String id;           // Mã số học sinh
    private String fullName;     // Tên học sinh
    private double grade;        // Điểm học sinh

    // Constructor
    public Student(String id, String fullName, double grade) {
        this.id = id;
        this.fullName = fullName;
        this.grade = grade;
    }

    // Getter cho id
    public String getId() { 
        return id; 
    }

    // Getter cho fullName
    public String getFullName() { 
        return fullName; 
    }

    // Setter cho fullName
    public void setFullName(String fullName) { 
        this.fullName = fullName; 
    }

    // Getter cho grade
    public double getGrade() { 
        return grade; 
    }

    // Setter cho grade
    public void setGrade(double grade) { 
        this.grade = grade; 
    }

    // Phương thức để tính xếp hạng
    public String getRank() {
        if (grade < 5.0) {
            return "Không đạt";
        } else if (grade < 6.5) {
            return "Trung bình";
        } else if (grade < 7.5) {
            return "Tốt";
        } else if (grade < 9.0) {
            return "Rất tốt";
        } else {
            return "Xuất sắc";
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Họ tên: " + fullName + ", Điểm: " + grade + ", Xếp hạng: " + getRank();
    }
}


