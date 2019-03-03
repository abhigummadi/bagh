package com.slokam.records;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.slokam.records.file.FileGetAll;
import com.slokam.records.pojo.StudentPojo;

public class Srinu {
	@Test
	public void validDataTest() {
		GetAll getAll = null;
		getAll = new FileGetAll();
		ArrayList<StudentPojo> stdList = getAll.getAllStudents();

		Assert.assertNotNull(stdList);
		Assert.assertEquals(5, stdList.size());
		
		for (int i = 0; i < stdList.size(); i++) {
			StudentPojo std = stdList.get(i);
			System.out.println(std.getId() + ":" + std.getName() + ":" + std.getAge() + ":" + std.getQual());
		}
	}
}
