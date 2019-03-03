package com.slokam.records.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.slokam.records.GetAll;
import com.slokam.records.pojo.StudentPojo;

public class DBGetAll implements GetAll{

	@Override
	public ArrayList<StudentPojo> getAllStudents() {
        ArrayList<StudentPojo> arrayList =
        		new ArrayList<>();
        
        try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/venkateshhk","root","root");
			PreparedStatement ps = con.prepareStatement("select * from students");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				StudentPojo student= new StudentPojo();
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(4);
				String qual =rs.getString(3);
				student.setAge(age);
				student.setId(id);
				student.setName(name);
				student.setQual(qual);
				arrayList.add(student);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        
		return arrayList;
	}
}
