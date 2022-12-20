package com.interview.programs;

public class First_Letter_Capital {

	public static void main(String[] args)
	{
	String  s1 = "captain america winter solider";
	
	System.out.println("Given String: " + s1 +"\n");
	
    String[] s2 = s1.split(" ");
    
    String str = "";
    
    for(String s3:s2)
    {
    	char c = s3.charAt(0); //First letter 
    	
        c= Character.toUpperCase(c); // first letter to capital letter
        
        str = str +String.valueOf(c); // Store it in a String
        
       for(int i=1; i<s3.length(); i++) // Start a loop from 2nd letter 
       {
    	char c2 = s3.charAt(i); // Get everyletter and store it in a string
    	
        str =str+String.valueOf(c2); 
       }
       
       str = str +" "; // Append every word with space
     }
    
    System.out.println(str);
    
    }
  }

