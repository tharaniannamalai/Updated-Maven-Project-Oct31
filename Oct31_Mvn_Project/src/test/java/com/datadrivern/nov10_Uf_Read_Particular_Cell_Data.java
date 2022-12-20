package com.datadrivern;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.utilityFiles.Utility_Files;

public class nov10_Uf_Read_Particular_Cell_Data extends Utility_Files {
	
	//static Logger log = Logger.getLogger(nov10_Uf_Read_Particular_Cell_Data.class);
	
	public static void particular_Cell_Data() throws IOException
	{
		//log.info("Reading is in process");
		
		String particular_Cell_Data = read_Particular_Cell_Data("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Sample_Sheet_For_Read.xlsx", 0, 1, 0);
		
		System.out.println(particular_Cell_Data);
		//log.info("Data read successfully");
	}
	
	public static void main(String[] args) throws IOException
	{
		//BasicConfigurator.configure();
		
		particular_Cell_Data();
	}
}
