package com.pojo.student;

import com.utility.variables.Utility_Variables;

public class HSC {

	public static void main(String[] args) {
		
		Utility_Variables variables = new Utility_Variables();
		
		int value = variables.getAge();
		
		System.out.println(value);
		
		variables.setAge(17);
		
		int after_Set_Age = variables.getAge();
		
		System.out.println(after_Set_Age);
	}
}
