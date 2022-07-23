package assPracticeProject;

import java.util.regex.*;
public class regularExpressions {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));

	}

}
