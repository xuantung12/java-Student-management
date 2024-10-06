/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asm1;

/**
 *
 * @author PC-ACER
 */
import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. them sinh vien");
            System.out.println("2. sua sinh vien");
            System.out.println("3. xoa sinh vien");
            System.out.println("4. Tim kiem sinh vien");
            System.out.println("5. Sap xep hoc sinh theo diem");
            System.out.println("6. hien thi danh sach hoc sinh");
            System.out.println("7. thoat");
            System.out.print("Chon chuc nang: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Dọn dẹp bộ đệm
            
            switch (choice) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.editStudent();
                    break;
                case 3:
                    manager.deleteStudent();
                    break;
                case 4:
                    manager.searchStudent();
                    break;
                case 5:
                    manager.sortStudentsByGrade();
                    break;
                case 6:
                    manager.displayStudents();
                    break;
                case 7:
                    running = false;
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }

        scanner.close();
    }
}
