package com.slokam.records;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import com.slokam.records.database.DBGetAll;
import com.slokam.records.file.FileGetAll;
import com.slokam.records.pojo.StudentPojo;

public class VenkateshhTest {

@Ignore
@Test
public void PolymorphismTest()
{
	Scanner sca = new Scanner(System.in);
	System.out.println("Enter your option to get all students..");
	System.out.println("1.FILE");
	System.out.println("2.DB");
	
	int option = sca.nextInt();
	
	GetAll getAll = null;
	switch(option){
		case 1: getAll = new FileGetAll();
		      break;
		case 2: getAll = new DBGetAll();
		      break;
	}
	
	ArrayList<StudentPojo> stdList = getAll.getAllStudents();
	Assert.assertNotNull(stdList);
if(option==1)
{
	//No of records in File

	Assert.assertEquals(3 ,stdList.size());

}else
{
	//No of records in database
	Assert.assertEquals(6, stdList.size());

}
	for(int i=0;i<stdList.size();i++){
		StudentPojo std = stdList.get(i);
		System.out.println(std.getId()+":"+std.getName()+":"+std.getAge()+":"+std.getQual());
	}
	
}
		
		
		
	}


