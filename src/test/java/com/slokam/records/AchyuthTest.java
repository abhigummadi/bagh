package com.slokam.records;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.slokam.records.file.FileGetAll;
import com.slokam.records.pojo.StudentPojo;

public class AchyuthTest {
	
	@Test
	public void achyuthtestFile() {
		GetAll getAll = null;
		getAll = new FileGetAll();
		ArrayList<StudentPojo> stdList = getAll.getAllStudents();

		Assert.assertNotNull(stdList);
		Assert.assertEquals(5, stdList.size());
	}
	
	//This is a comment dev1


	// THis is abc
	// THis is xyz

}
