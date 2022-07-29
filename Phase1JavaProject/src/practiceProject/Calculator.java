package practiceProject;

import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in); 
			
			System.out.println("Enter a first number : ");
			double a=sc.nextDouble();
			float b=(float)a+11.1f; //Type Casting
			System.out.println("Choose an Operation (+,-,*,/) : ");
			char ch = sc.next().charAt(0);
			
			operation(a,b,ch);
		sc.close();
		
	}
	public static double operation(double a,float b,char ch) {
		double ans = 0;
        // addition
        if (ch == '+') {
            ans = a + b;
        }
     // subtraction
        else if (ch == '-') {
            ans = a - b;
        }
     // multiplication
        else if (ch == '*') {
            ans = a * b;
        }
      // Division
        else if (ch == '/') {
            ans = a / b;
        }

        System.out.println("Your answer is - " + ans);
        return ans;
	}

}
