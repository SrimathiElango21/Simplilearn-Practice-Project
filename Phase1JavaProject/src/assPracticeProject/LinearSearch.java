package assPracticeProject;

import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		 int i,length, key, array[];
		 
	      Scanner input = new Scanner(System.in); 
			System.out.println("Enter Array length:");
 
			  length = input.nextInt(); 
 
			  array = new int[length]; 
 
			  System.out.println("Enter " + length + " elements");
 
			  for (i = 0; i < length; i++)
			  {
			    array[i] = input.nextInt();
			  }
			  System.out.println("Enter the search key value:");
			  
			  key = input.nextInt();
			  
			  for (i = 0; i < length; i++)
			  {
			     if (array[i]== key) 
			     {
			       System.out.println(key+" is present at location "+(i+1));
			        break;
			     }
			  }
			  if (i == length)
			    System.out.println(key + " doesn't exist in array.");
			 
			  input.close();
		

	}

}
