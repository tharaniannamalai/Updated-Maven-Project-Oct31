package com.pojo.student;

import com.utility.variables.Utility_Subject;
import com.utility.variables.Utility_Topics;

public class Mark_Details {
	
	public static Utility_Subject subj = new Utility_Subject();
	public static Utility_Topics topics = new Utility_Topics();
	
	
	public static void main(String[] args) {
		System.out.println("Lab Details");
		
		System.out.println(subj.getChemistry_Lab());
		System.out.println(subj.getPhysics_Lab());
		
		System.out.println("Mark Details");
		
		System.out.println(topics.getPhysics());
		System.out.println(topics.getChemistry());
	}

}
