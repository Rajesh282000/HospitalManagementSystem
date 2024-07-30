package com.jdbc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.model.StudentJdbc;

public class StudentControllerJdbc {

	public void saveStudentJdbc(StudentJdbc student, Connection connection) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into student values(?,?,?,?)");
			pstmt.setInt(1, student.getId());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getEmail());
			pstmt.setString(4, student.getPwd());
			int rowEffected = pstmt.executeUpdate();
			System.out.println(rowEffected+" row effected");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	
	public void updateStudentJdbc(int stuIdUp, Scanner scanner, Connection connection) {
		 System.out.println("Enter new student name:");
         scanner.nextLine(); 
         String name = scanner.nextLine();

         System.out.println("Enter new student email:");
         String email = scanner.nextLine();

         System.out.println("Enter new student password:");
         String pwd = scanner.nextLine();
         
         try {
			PreparedStatement pstmt = connection.prepareStatement("update student set name=?, email=?, pwd=? where id =?");
			
			pstmt.setString(1,name);
			pstmt.setString(2, email);
			pstmt.setString(3, pwd);
			pstmt.setInt(4, stuIdUp);
			int rowEffected = pstmt.executeUpdate();
			System.out.println(rowEffected+" row effected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
		
	}
	
	
	

	public void findId(int stuId, Connection connection) {
		
		try {
			PreparedStatement  pstmt = connection.prepareStatement("select * from student where id =?");
			pstmt.setInt(1, stuId);
			ResultSet resultSet= pstmt.executeQuery();
			
			while (resultSet.next()) {				
				
					int id = resultSet.getInt(1);
					String name = resultSet.getString(2);
					String email = resultSet.getString(3);
					String password = resultSet.getString(4);
					System.out.println(id+" "+name+" "+email+" "+password);
					
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	

	public void deleteStudentJdbc(int stuDel, Connection connection) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("delete from student where id = ?");
			pstmt.setInt(1, stuDel);
			
			int rowEffected = pstmt.executeUpdate();
			System.out.println(rowEffected+" row effected");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	
	public void findAll(Connection connection) {
		try {
			PreparedStatement  pstmt = connection.prepareStatement("select * from student ");
			
			ResultSet resultSet= pstmt.executeQuery();
			
			while (resultSet.next()) {				
				
					int id = resultSet.getInt(1);
					String name = resultSet.getString(2);
					String email = resultSet.getString(3);
					String password = resultSet.getString(4);
					System.out.println(id+" "+name+" "+email+" "+password);
					
				}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		
	}
	

}
