package com.slokam.records;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.slokam.records.file.FileGetAll;
import com.slokam.records.pojo.StudentPojo;




public class LakshmiTest {

    @Test 
   public void dataTest()
      {
    	  GetAll getAll=null;
    	  getAll=new  FileGetAll();
    	  ArrayList<StudentPojo> stdList=getAll.getAllStudents();
    	  
    	 Assert.assertNotNull(stdList);
    	 Assert.assertEquals(3, stdList.size());
    	  
    	  for(StudentPojo std:stdList)
    	  {
    		  System.out.println(std.getId()+"::"+std.getName()+"::"+std.getAge()+"::"+std.getQual());
    	  }
      }
}
