package com.reader;

import java.io.IOException;

public class File_Reader_Manager_Fb {
	
	private File_Reader_Manager_Fb() {
		
	}
	
	public static File_Reader_Manager_Fb getFRM_FB()
	{
		File_Reader_Manager_Fb reader = new File_Reader_Manager_Fb();
		return reader;
	}
	
	public TestData_Reader_Fb getTD_FB() throws IOException
	{
		TestData_Reader_Fb td = new TestData_Reader_Fb();
		return td;
	}
}
