package telran.strings;

public class Validations {
	
 public static boolean isArithmeticExpression(String expression)  {
	boolean stage2  = false;
	String regex = RegularExpresions.arithmeticExpression();
 	boolean stage1=expression.matches(regex);
  	if (stage1) {stage2 = twoness(expression);}
    return stage2;
 	 
}
 private static boolean twoness(String expression) {
		int count=0;
		int i=0;
		while(i<expression.length()&& count>-1) {
			if(expression.charAt(i)=='(')  count++; 
			if(expression.charAt(i)==')')  count--;
			i++;
		}
				 
		return count==0;
	}

}
