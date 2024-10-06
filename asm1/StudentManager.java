/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asm1;

/**
 *
 * @author PC-ACER
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Thêm học sinh
    public void addStudent() {
        System.out.print("Nhập mã số học sinh: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.print("Nhập điểm học sinh: ");
        double grade = scanner.nextDouble();
        scanner.nextLine(); // Dọn dẹp bộ đệm
        
        students.add(new Student(id, name, grade));
        System.out.println("Đã thêm học sinh thành công.");
        
        // Hiển thị danh sách học sinh
        displayStudents();
    }

    // Sửa học sinh
    public void editStudent() {
        System.out.print("Nhập mã số học sinh cần sửa: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.print("Nhập tên mới: ");
                student.setFullName(scanner.nextLine());
                System.out.print("Nhập điểm mới: ");
                student.setGrade(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Đã sửa thông tin học sinh.");
                
                // Hiển thị danh sách học sinh
                displayStudents();
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh.");
    }

    // Xóa học sinh
    public void deleteStudent() {
        System.out.print("Nhập mã số học sinh cần xóa: ");
        String id = scanner.nextLine();
        students.removeIf(student -> student.getId().equals(id));
        System.out.println("Đã xóa học sinh thành công.");
        
        // Hiển thị danh sách học sinh
        displayStudents();
    }

    // Tìm kiếm học sinh theo mã số
    public void searchStudent() {
        System.out.print("Nhập mã số học sinh cần tìm: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh.");
    }

    // Sắp xếp học sinh theo điểm
    public void sortStudentsByGrade() {
        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());
        System.out.println("Danh sách học sinh sau khi sắp xếp:");
        displayStudents();
    }

    // Hiển thị danh sách học sinh
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách học sinh trống.");
        } else {
            System.out.println("Danh sách học sinh hiện tại:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}


