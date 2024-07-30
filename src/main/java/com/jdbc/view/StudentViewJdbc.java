package com.jdbc.view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.controller.StudentControllerJdbc;
import com.jdbc.model.StudentJdbc;




public class StudentViewJdbc {
	
	
	    public static void main(String[] args)  {
	    	  
	              try {
					Class.forName("org.postgresql.Driver");
					Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JdbcTest", "postgres", "root");
			    	System.out.println(connection);  	
			        Scanner scanner = new Scanner(System.in);
			        StudentControllerJdbc controller = new StudentControllerJdbc();
			        System.out.println("Welcome to StudentJdbc Management System");
			        System.out.println("---------------------------------------------");

			        while (true) {
			            System.out.println();
			            System.out.println("ENTER YOUR CHOICE:-");
			            System.out.println("1. Save Student");
			            System.out.println("2. Find Student By Id");
			            System.out.println("3. Update Student by id");
			            System.out.println("4. Delete Student by id");
			            System.out.println("5. FindAll");
			            System.out.println("6.Exit");
			            int choice = scanner.nextInt();

			            switch (choice) {
			                case 1:
			                    StudentJdbc studentJdbc1 = getStudentJdbcObject(scanner);
			                    controller.saveStudentJdbc(studentJdbc1,connection);
			                    break;
			                case 2:
			                    System.out.println("Enter your Student id that you want to find:");
			                    int stuId = scanner.nextInt();
			                    controller.findId(stuId, connection);
			                    break;
			                case 3:
			                    System.out.println("Enter your id:");
			                    int stuIdUp = scanner.nextInt();
			                    controller.updateStudentJdbc(stuIdUp, scanner, connection);
			                    break;
			                case 4:
			                    System.out.println("Enter your Student id that you want to delete:");
			                    int stuDel = scanner.nextInt();
			                    controller.deleteStudentJdbc(stuDel, connection);
			                    break;
			                case 5:
			                    controller.findAll(connection);
			                    break;
			                case 6:
			                    System.out.println("Thank You");
			                    return;
			                default:
			                    System.out.println("Invalid choice....");
			                    break;
			            }
			        }
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}   

	    	  	    	
	    	
	    }

	    public static StudentJdbc getStudentJdbcObject(Scanner scanner) {
	       
	        System.out.println("Enter Student id:");
	        int id = scanner.nextInt();
	        scanner.nextLine(); //dummy line breaker, it will use after integer input taken

	        System.out.println("Enter Student name:");
	        String name = scanner.nextLine();

	        System.out.println("Enter Student email:");
	        String email = scanner.nextLine();

	        System.out.println("Enter Student password:");
	        String pwd = scanner.nextLine();



	        StudentJdbc studentJdbc = new StudentJdbc();

	       
	        studentJdbc.setId(id);
	        studentJdbc.setName(name);
	        studentJdbc.setEmail(email);
	        studentJdbc.setPwd(pwd);
	       
	       
	        return studentJdbc;
	    }
	


}
