package com.automation.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "getDataMap")
	public void test(Map<String, String> map) {

		System.out.println(map.get("username"));

	}

	@DataProvider
	public Object[] getDataMap() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\data\\AutomationData.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("TestData");

		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();

		Object[] data = new Object[rowCount];
		HashMap<String, String> map;

		for (int r = 1; r <= rowCount; r++) {
			map = new HashMap<String, String>();
			for (int c = 0; c < colCount; c++) {

				String key = sheet.getRow(0).getCell(c).getStringCellValue();
				String value = sheet.getRow(r).getCell(c).getStringCellValue();
				map.put(key, value);
				data[r - 1] = map;
			}
		}
		return data;
	}

	@DataProvider
	public Object[][] getData() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\data\\AutomationData.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("TestData");

		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rowCount][colCount];

		for (int r = 1; r <= rowCount; r++) {
			for (int c = 1; c <= colCount; c++) {
				data[r - 1][c] = sheet.getRow(r).getCell(c).getStringCellValue();
			}
		}
		return data;

	}

}
