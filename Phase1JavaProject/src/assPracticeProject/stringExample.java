package assPracticeProject;

import java.util.Scanner;

public class stringExample {

	public static void main(String[] args) {
		System.out.print("String Operations");
		String str;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		str=sc.nextLine();
		System.out.println("Enter 2nd string : ");
		String str1=sc.nextLine();
		System.out.println("Enter 3rd string : ");
		String str2=sc.nextLine();
		
		System.out.println("The length of the txt string is: " + str.length());//String length
		
		System.out.println(str.toUpperCase());  //String upper 
		System.out.println(str.toLowerCase()); //String lower
		
		System.out.println(str1.compareTo(str));//String compare
		System.out.println(str2.compareTo(str1));
		
		System.out.println(str1.isEmpty()); //String isEmpty()

		System.out.println(str1.substring(2,4));//String Substring
		System.out.println(str2.substring(2));  
		sc.close();
		
		// String Builder
		
		StringBuilder sb=new StringBuilder("Hello, How are you");  //append()
		sb.append("Java");
		System.out.println(sb);
				
		sb.replace(1,3,"Java");  //replace
		System.out.println(sb);
		
		sb.insert(1,"Java"); //insert() 
		System.out.println(sb);
		
		sb.delete(1,3);  //delete
		System.out.println(sb);

		sb.reverse();  //reverse
		System.out.println(sb);
		
		//String Buffer
		StringBuffer sf=new StringBuffer("Java Practice project");
		System.out.print(sf);
		System.out.println(sf.delete(1, 3));
		System.out.println(sf.reverse());
		System.out.println(sf.insert(1," python"));
	}

}
