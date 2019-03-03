package com.slokam.records.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.slokam.records.GetAll;
import com.slokam.records.pojo.StudentPojo;

public class FileGetAll implements GetAll {
	@Override
	public ArrayList<StudentPojo> getAllStudents() {
		ArrayList<StudentPojo> list = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("./src/main/resources/studentdata.txt"));
			String str = br.readLine();
			while (str != null) {
				String values[] = str.split(",");
				StudentPojo student = new StudentPojo();
				student.setId(Integer.parseInt(values[0]));
				student.setName(values[1]);
				student.setAge(Integer.parseInt(values[2]));
				student.setQual(values[3]);
				list.add(student);
				str = br.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return list;
	}
}
