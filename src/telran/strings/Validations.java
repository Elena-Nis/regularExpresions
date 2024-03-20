package telran.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
 public static boolean isArithmeticExpression(String expression)  {
	 //1. Checking against the regular expression
	//2. Checking brackets pairness For each '(' there should be ')'
	//consider introducing counter that increased for '(' and decreased
	//if during passing over the string expression counter <0 return false
	//if after passing whole string counter !=0 return false
	
	boolean stage2  = false;
	String regex = RegularExpresions.arithmeticExpression();
 	boolean stage1=isSimpleArithmeticExpressions (regex, expression);
  	if (stage1) {stage2 = twoness(expression);}
    return stage2;
 	 
}

 private static  boolean isSimpleArithmeticExpressions 
 (String regex, String expression) {
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(expression); 
	return matcher.find();
	}
  
	 private static boolean twoness(String expression) {
		int openCount=0;
		int closeCount=0;
		String expressionWork = String.copyValueOf(expression.toCharArray());
		char[] charArrayExpression = expressionWork.toCharArray();
		
				 for(int i=0;i<charArrayExpression.length;i++)
				 {
				 if(charArrayExpression[i]=='('&&charArrayExpression[i+1]!=')') {openCount++;}
				 if(charArrayExpression[i]==')') {closeCount++;}
				 }
		return (openCount==closeCount) ? true : false;
	}

}
