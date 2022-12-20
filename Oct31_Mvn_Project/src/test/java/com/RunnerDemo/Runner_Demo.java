package com.RunnerDemo;

import com.baseDemo.Base_Demo;

public class Runner_Demo extends Base_Demo {
	
	public static void main(String[] args) {
		
		int id = student_Id(15);
		
		String a = student_Name("Srihari");
		
		System.out.println(a);
		
		boolean contains_Check = contains_Check("Srihari", "a");
		
		System.out.println("contains check: " +contains_Check);
		
	}

}
