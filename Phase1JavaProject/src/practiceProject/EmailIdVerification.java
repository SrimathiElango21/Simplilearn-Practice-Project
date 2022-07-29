package practiceProject;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailIdVerification {

    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("abcd.efghi@gyt.com");
        emailID.add("liengre.inku@omx.com");
        emailID.add("lea.chiu@gmx.com");
        emailID.add("axm.ueman@opx.com");
        emailID.add("kbrtim.mnnbgfrr@mnb.com");
   
        
         String searchEmail = null;
         System.out.println("Enter the email to search");
         
          Scanner sc = new Scanner(System.in) ;  
			System.out.println("Enter email Id : ");
          searchEmail = sc.nextLine(); 
	
             if(emailID.contains(searchEmail)){
          System.out.println("email ID " + searchEmail + " found");
      }
      else{
          System.out.println( "email ID " + searchEmail + " not found");
      }
             sc.close();
        
    }

}
