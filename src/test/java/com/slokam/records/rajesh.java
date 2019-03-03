package com.slokam.records;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.slokam.records.file.FileGetAll;
import com.slokam.records.pojo.StudentPojo;

public class rajesh 
{

	@Test
	 public void test()
	 {
			GetAll getAll = null;
			getAll = new FileGetAll();
			ArrayList<StudentPojo> stdList = getAll.getAllStudents();

			Assert.assertNotNull(stdList);
	 }
}
