package com.slokam.records;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.slokam.records.pojo.StudentPojo;

public class ReadXcell implements GetAll {
	ArrayList<StudentPojo> list = new ArrayList();

	@Override
	public ArrayList<StudentPojo> getAllStudents() {
	
	    XSSFWorkbook workbook;
		  try {
			workbook = new XSSFWorkbook("src/main/resources/slokam3.xlsx");
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row>  rows =    sheet.rowIterator();
			
	    while(rows.hasNext()) {
				Row row = rows.next();
				
				StudentPojo student = new StudentPojo();
				student.setId((int)row.getCell(0).getNumericCellValue());
				student.setName(row.getCell(1).getStringCellValue());
				student.setAge((int)row.getCell(2).getNumericCellValue());
				student.setQual(row.getCell(3).getStringCellValue());
				list.add(student);
				
						}	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
		
		
	}

}
