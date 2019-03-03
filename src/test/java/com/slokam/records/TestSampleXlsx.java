package com.slokam.records;

import org.junit.Assert;
import org.junit.Test;

import com.slokam.records.pojo.XlsxPojo;
import com.slokam.records.xls.SampleSXLS;

public class TestSampleXlsx {
	@Test
	public void test() {
		SampleSXLS sampleSXLS = new SampleSXLS();
		java.util.List<XlsxPojo> list = sampleSXLS.getAllStudents();
		Assert.assertNotNull(list);
		Assert.assertNotEquals(10, list.size());

	}

}
