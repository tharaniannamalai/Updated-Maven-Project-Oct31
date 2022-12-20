package com.interview.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day2_IQ_Str_Indx_Rev {

	public static void main(String[] args) {
		
		String s1="Welcome To Maven Build";
		String[] strarray = s1.split(" ");
		
		List<String> l1  = new ArrayList<String>();
	
		String firstWordRev = "";
		String thirdWordRev = "";
		String allwordRev="";
		
		for(String s2: strarray)
		{
		l1.add(s2); //Convert from String array to List
		}
		
		String firstWord =l1.get(0); // Storing 1st word in a string 
		String thirdWord = l1.get(2); // Storing 2nd word in a string 
		
		for(int i=firstWord.length()-1; i>=0 ;i--) // reverse the 1st String
		{
			char c1 = firstWord.charAt(i);
			firstWordRev = firstWordRev+ String.valueOf(c1);
		}
		
		for(int j=thirdWord.length()-1; j>=0; j--) // reverse the 3rd String
		{
			char c2 = thirdWord.charAt(j);
			thirdWordRev = thirdWordRev+String.valueOf(c2);
		}
		
		l1.set(0, thirdWordRev); //Setting the reversed 3stword in 0th index
		l1.set(2, firstWordRev); //setting the reversed 1stword in 2nd index
		
		for(String output :l1) // Converting list to String
		{
		System.out.print(output+" "); 
		}
	}
}