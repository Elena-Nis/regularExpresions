package telran.strings;

public class RegularExpresions {
public static String javaVariable() {
	// The String class represents character strings. 
	//All string literals in Java programs, such as "abc", 
	//are implemented as instances of this class.
	//Литерал в java - константа, которая напрямую указана в коде. Литерал
	//может иметь различные типы данных. Используются либо для инициализации, 
	//либо для передачи значений в методы.
    //Примеры: int number=45; float e=2.17; char sym='A'; 
	//String str1 = "Hello, world!";
	//Как следует из документации, стринговые литералы в java реализуются
    //как instances of this class (экземпляры класса String
	//Strings are constant; their values cannot be changed after they are created.
	//Т.е. строки в java иммутабельны
	String regex ="[A-Za-z$][\\w$]*|_[\\w$]+";
	return regex;
}
public static String zero_300() {
	//TODO
	//string contains number from 0 - 300; leading zeros are disallowed
	String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0"; 
	//1й \ - для экранирования специального символа, т.е. для исключения 
	//следующего 2го символа \ из строки. Т.е. для обеспечения правильной 
	//интерпретации последующих символов
	//\d - цифровой символ. 
	//? указывает, что предыдущий символ является необязательным, 
	//то есть он встречается НОЛЬ или ОДИН раз: ab?с 
	//это aс,abс
	//* - предыдущий символ может встречаться НОЛЬ или БОЛЕЕ раз: ab*c 
	//это ac,abc,abbc, abbbbc
	//* - предыдущий символ может встречаться НОЛЬ или БОЛЕЕ раз: ab*c 
	//+ - ОДИН или БОЛЕЕ раз: ab+c. Т.е. как минимум ОДИН раз
	//Это abc,abbbbc
	//{n} - n раз
	 return regex;
}
public static String ipOctet() {
	String regex="\\d\\d?|[0-1]\\d\\d|2[0-4]\\d|2[0-5][0-5]";
 	return regex;
}
public static String mobileIsraelPhone() {
	String regex="((\\+972-)|0)[57]\\d\\-\\d{3}\\-\\d{2}\\-\\d{2}";
	return regex;
}
}