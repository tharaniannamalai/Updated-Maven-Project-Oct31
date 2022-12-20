package com.datadrivern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.chainsaw.Main;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.utilityFiles.Utility_Files;

public class Read_Particular_CData extends Utility_Files{
	
	public static void particular_Column_Data() throws IOException {
	
		File f = new File("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Sample_Sheet_For_Read.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		
		System.out.println("Print Particular Cell Details");
		
		for(int i=0; i<s.getPhysicalNumberOfRows(); i++)
		{
			
			Cell c = s.getRow(i).getCell(0);
			
			CellType cType = c.getCellType();
			
			if(cType.equals(CellType.STRING))
			{
				String value = c.getStringCellValue();
				
				System.out.println(value);
			}
			
			else if(cType.equals(CellType.NUMERIC))
			{
				double d = c.getNumericCellValue();
				
				int a = (int)d;
				
				String value = String.valueOf(a);
				
				System.out.println(value);
			}
		}
		wb.close();
	}
	
	public static void main(String[] args) throws IOException {
	
		particular_Column_Data();
	}
}
