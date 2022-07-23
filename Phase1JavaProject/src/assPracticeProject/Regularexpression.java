package assPracticeProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regularexpression {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("Java practice program", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("visit online website");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	    
	    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "raj32")); 
	    System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Smith32"));
	    
	    System.out.println("?");
	    System.out.println(Pattern.matches("[xyz?]","x"));
	    System.out.println("+");
	    System.out.println(Pattern.matches("[xyz]","x"));
	    System.out.println(Pattern.matches("[xyz]+","xxx"));
        System.out.println("*");
	    System.out.println(Pattern.matches("[xyz]*","xyyzzzx"));


	    
	
	}

}
