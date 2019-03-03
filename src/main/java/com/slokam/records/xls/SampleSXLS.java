package com.slokam.records.xls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.slokam.records.pojo.XlsxPojo;

public class SampleSXLS {

	public ArrayList<XlsxPojo> getAllStudents() {
		ArrayList<XlsxPojo> list = new ArrayList<>();
		File file = new File("./src/main/resources/f21.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook book = new XSSFWorkbook(fis);
			XSSFSheet sheet = book.getSheet("Sheet1");
			Iterator<Row> iterator = sheet.rowIterator();
			while (iterator.hasNext()) {
				Row row = iterator.next();
				XlsxPojo pojo = new XlsxPojo();
				pojo.setName(row.getCell(0).getStringCellValue());
				pojo.setMailId(row.getCell(1).getStringCellValue());
				pojo.setMacId(row.getCell(2).getStringCellValue());
				list.add(pojo);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

}
