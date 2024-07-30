package com.jdbc.controller;

import java.util.ArrayList;

import java.util.Scanner;

import com.jdbc.model.Student;

public class StudentController {
    ArrayList<Student> studentList = new ArrayList<Student>();
    

    public void saveStudent(Student s) {
        studentList.add(s);
        System.out.println("Your data is saved");
    }
    
    

    public void findId(int stuId) {
        for (Student student : studentList) {
            if (student.getId() == stuId) {
                System.out.println("Student id is present");
                System.out.println(student);
                return;
            }
        }
        System.out.println("ID not found");
        
    }

    public void deleteStudent(int stuDel) {
        if (studentList.isEmpty()) {
            System.out.println("No data is present");
            return;
        }

        for (Student student : studentList) {
			if(student.getId()==stuDel) {
				studentList.remove(student);
				System.out.println("Student data was deleted successfully");
				
				return;
			}
			
		}
		
		System.out.println("ID not found, so we can't perform any task");
    }

    public void findAll() {
        if (studentList.isEmpty()) {
            System.out.println("No data is present");
            return;
        }
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void updateStudent(int stuIdUp, Scanner scanner) {
        if (studentList.isEmpty()) {
            System.out.println("No data is present");
            return;
        }

        for (Student student : studentList) {
            if (student.getId() == stuIdUp) {
                System.out.println("Enter new student name:");
                scanner.nextLine(); 
                String name = scanner.nextLine();

                System.out.println("Enter new student email:");
                String email = scanner.nextLine();

                System.out.println("Enter new student password:");
                String pwd = scanner.nextLine();

                System.out.println("Enter new student DOB:");
                String dob = scanner.nextLine();

                System.out.println("Enter new student address:");
                String address = scanner.nextLine();

                System.out.println("Enter new student gender:");
                String gender = scanner.nextLine();

                System.out.println("Enter new student phone number:");
                long phoneNumber = scanner.nextLong();

                student.setName(name);
                student.setEmail(email);
                student.setPwd(pwd);
                student.setDob(dob);
                student.setAddress(address);
                student.setGender(gender);
                student.setPhoneNumber(phoneNumber);

                System.out.println("Student data updated successfully");
                return;
            }
        }
        System.out.println("ID not found, so we can't perform any task");
    }
}
