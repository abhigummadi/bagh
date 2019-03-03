package com.slokam.records;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.slokam.records.file.FileGetAll;
import com.slokam.records.pojo.StudentPojo;

public class JvarunKumar {

	@Test
	public void testCase()
	{
		GetAll getall=null;
		getall = new FileGetAll();
		ArrayList<StudentPojo> ars=getall.getAllStudents();
		System.out.println(ars.size());
		Assert.assertNotNull(ars);
		Assert.assertEquals(6, ars.size());
		System.out.println("This is my first Push");
	}
}
