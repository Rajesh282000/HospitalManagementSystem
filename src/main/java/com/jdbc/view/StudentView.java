package com.jdbc.view;

import java.util.Scanner;

import com.jdbc.controller.StudentController;
import com.jdbc.model.Student;

public class StudentView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentController controller = new StudentController();
        System.out.println("Welcome to Student Management System");
        System.out.println("---------------------------------------------");

        while (true) {
            System.out.println();
            System.out.println("ENTER YOUR CHOICE:-");
            System.out.println("1. Save student");
            System.out.println("2. Find Student By Id");
            System.out.println("3. Update Student by id");
            System.out.println("4. Delete Student by id");
            System.out.println("5. FindAll");
            System.out.println("6.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Student student1 = getStudentObject(scanner);
                    controller.saveStudent(student1);
                    break;
                case 2:
                    System.out.println("Enter your student id that you want to find:");
                    int stuId = scanner.nextInt();
                    controller.findId(stuId);
                    break;
                case 3:
                    System.out.println("Enter your id:");
                    int stuIdUp = scanner.nextInt();
                    controller.updateStudent(stuIdUp, scanner);
                    break;
                case 4:
                    System.out.println("Enter your student id that you want to delete:");
                    int stuDel = scanner.nextInt();
                    controller.deleteStudent(stuDel);
                    break;
                case 5:
                    controller.findAll();
                    break;
                case 6:
                    System.out.println("Thank You");
                    return;
                default:
                    System.out.println("Invalid choice....");
                    break;
            }
        }
    }

    public static Student getStudentObject(Scanner scanner) {
       
        System.out.println("Enter student id:");
        int id = scanner.nextInt();
        scanner.nextLine(); //dummy line breaker, it will use after integer input taken

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student email:");
        String email = scanner.nextLine();

        System.out.println("Enter student password:");
        String pwd = scanner.nextLine();

        System.out.println("Enter student DOB:");
        String dob = scanner.nextLine();

        System.out.println("Enter student address:");
        String address = scanner.nextLine();

        System.out.println("Enter student gender:");
        String gender = scanner.nextLine();
        
        Student student = new Student();

       
        student.setId(id);
        student.setName(name);
        student.setEmail(email);
        student.setPwd(pwd);
        student.setDob(dob);
        student.setAddress(address);
        student.setGender(gender);
       
        return student;
    }
}
