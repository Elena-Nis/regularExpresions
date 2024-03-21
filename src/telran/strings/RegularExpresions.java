package telran.strings;

public class RegularExpresions {
	
public static String javaVariable() {
	String regex ="([A-Za-z$][\\w$]*|_[\\w$]+)";
	return regex;
}

public static String zero_300() {
	String regex = "([1-9]\\d?|[1-2]\\d\\d|300|0)"; 
	return regex;
}

public static String ipOctet() {
	String regex="(\\d\\d?|[0-1]\\d{2}|2([0-4]\\d|5[0-5]))";
	return regex;
}

public static String mobileIsraelPhone() {
	String regex="(\\+972-|0)[57]\\d\\-\\d{3}\\-\\d{2}\\-\\d{2}";
	return regex;
}

public static String ipV4Adress () {
	String ipOctetExpr=ipOctet();
	return String.format("%1$s(\\.%1$s){3}", ipOctetExpr);
}
public static String simpleArithmeticExpressions () {
 	String operand = integerNumberExp();
	String operation = operationExp();
	return String.format("%1$s(%2$s%1$s)*", operand, operation);
	
}
private static String operationExp() {
	return "[-+*/]";
}

private static String integerNumberExp() {
	return "(\\s*\\d+\\s*)";
}

public static String arithmeticExpression() {
	String operandBrackets = operandBrackets();
	String operation = operationExp();
	return String.format("%1$s(%2$s%1$s)*", operandBrackets, operation);
}

private static String operandBrackets() {
	String var1=bracketOpen();
	String var2=javaVariable();
	String var3=NumberExp();
	String var4=bracketClose();
	String rez="(" + var1 + "(" + var2 + "|" + var3 + ")" + var4 + ")";
	return rez;
}

private static String bracketOpen() {
	return  "(\\s*\\(*\\s*)";
}

private static String bracketClose() {
	return  "(\\s*\\)*\\s*)";
}

private static String NumberExp() {
	return "(\\s*\\d+(\\.\\d+)?\\s*)";
}


}