package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Insertjdbc {
		public static void main(String[] args) {
			try {
				//register driver step no 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection step no 2
			Connection conn=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/akshaya_db", "Akshaya","Ak@80933");
			//create statement step no 3
			Statement stmt=conn.createStatement();
			stmt.executeUpdate("insert into emp1 values (7,'Akshaya',9145,'manager',23)");
			System.out.println("inserted successfully");
			conn.close();//step 5
			}
			catch(Exception e) {
				System.out.println(e);
			}
}}