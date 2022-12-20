package com.datadrivern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static Logger log = Logger.getLogger(Write_Data.class);

	public static void write_Data(String sheetName) throws IOException {
		
		File f = new File("E:\\Suriya sir\\Excel\\Sample_Sheet_For_Write.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		//Creating Sheet 
		
		wb.createSheet(sheetName).createRow(0).createCell(0).setCellValue("Student Name"); //Column 1 - Student Name
		wb.getSheet(sheetName).getRow(0).createCell(1).setCellValue("Student RegNo"); // Column 2 - Student RegNo
		wb.getSheet(sheetName).createRow(1).createCell(0).setCellValue("Prenise");
		wb.getSheet(sheetName).getRow(1).createCell(1).setCellValue("S001");
		wb.getSheet(sheetName).createRow(2).createCell(0).setCellValue("Yudhveer");
		wb.getSheet(sheetName).getRow(2).createCell(1).setCellValue("S002");
		wb.getSheet(sheetName).createRow(3).createCell(0).setCellValue("Yadhav");
		wb.getSheet(sheetName).getRow(3).createCell(1).setCellValue("S003");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		log.info("Data written in file");
		
		wb.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		BasicConfigurator.configure();
		
		write_Data("WrittenData1");
		
	}
}


