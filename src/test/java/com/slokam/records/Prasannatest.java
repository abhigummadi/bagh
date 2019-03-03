package com.slokam.records;

import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.slokam.records.file.FileGetAll;
import com.slokam.records.pojo.StudentPojo;



public class Prasannatest {
	
	@Test
	public void testData() {
		GetAll getall = null;
		getall = new FileGetAll();
	List<StudentPojo> stdlist = getall.getAllStudents();
	Assert.assertNotNull(stdlist);
	Assert.assertEquals(5, stdlist.size());
	
	for(StudentPojo student:stdlist) {
		System.out.println(student.getName()+"::"+student.getAge()+"::"+student.getQual());
		
			
				}
		
	}

}
