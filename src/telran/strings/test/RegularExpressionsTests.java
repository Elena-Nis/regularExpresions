package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.strings.RegularExpresions;

class RegularExpressionsTests {

	@Test
	void javaVariableTrueTest() {
		
		String regex = RegularExpresions.javaVariable();
		assertTrue("abs".matches(regex));
		assertTrue("a".matches(regex));
		assertTrue("$".matches(regex));
		assertTrue("$123".matches(regex));
		assertTrue("$1_23".matches(regex));
		assertTrue("abs_".matches(regex));
		assertTrue("__".matches(regex));
		assertTrue("Abs_".matches(regex));
	}
	@Test
	void javaVariableFalseTest() {
		String regex = RegularExpresions.javaVariable();
		assertFalse("1abc".matches(regex));
		assertFalse("_".matches(regex));
		assertFalse("a-2".matches(regex));
		assertFalse("a 2".matches(regex));
		assertFalse("a?2".matches(regex));
		assertFalse("i*nt".matches(regex));
		
	}
	@Test
	void zero_300TrueTest() {
		String regex = RegularExpresions.zero_300();
		assertTrue("0".matches(regex));
		assertTrue("1".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("198".matches(regex));
		assertTrue("299".matches(regex));
		assertTrue("30".matches(regex));
		assertTrue("33".matches(regex));
		assertTrue("300".matches(regex));
		
		
	}
	@Test
	void zero_300FalseTest() {
		String regex = RegularExpresions.zero_300();
		assertFalse("00".matches(regex));
		assertFalse("01".matches(regex));
		assertFalse("19s".matches(regex));
		assertFalse("398".matches(regex));
		assertFalse("2990".matches(regex));
		assertFalse("-30".matches(regex));
		assertFalse("330".matches(regex));
		assertFalse("301".matches(regex));
		
		
	}
	@Test
	void ipOctetTest() {
		String regex = RegularExpresions.ipOctet();
		assertTrue("0".matches(regex));
		assertTrue("00".matches(regex));
		assertTrue("000".matches(regex));
		assertTrue("10".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("199".matches(regex));
		assertTrue("009".matches(regex));
		assertTrue("255".matches(regex));
		assertTrue("250".matches(regex));
		assertTrue("249".matches(regex));
		assertFalse("-0".matches(regex));
		assertFalse("00 ".matches(regex));
		assertFalse("0000".matches(regex));
		assertFalse("10?".matches(regex));
		assertFalse("1900".matches(regex));
		assertFalse("299".matches(regex));
		assertFalse("00a".matches(regex));
		assertFalse("256".matches(regex));
		assertFalse("260".matches(regex));
		assertFalse("300".matches(regex));
		
	}
	@Test
	void mobileIsraelPhoneTest() {
		String regex = RegularExpresions.mobileIsraelPhone();
		assertTrue("+972-50-721-74-50".matches(regex));
		assertTrue("+972-50-000-00-00".matches(regex));
		assertTrue("+972-79-390-17-18".matches(regex));
		assertTrue("079-390-17-18".matches(regex));
		
		assertFalse("579-390-17-18".matches(regex));
		assertFalse("-0-390-17-18".matches(regex));
		assertFalse("a5-390-17-18".matches(regex));
		assertFalse("0a-390-17-18".matches(regex));
		assertFalse("34-390-17-18".matches(regex));
		
		assertFalse("+972-7-390-17-18".matches(regex));
		assertFalse("+972-795-390-17-18".matches(regex));
		 		
		assertFalse("+972-79-3-17-18".matches(regex));
		assertFalse("+972-79-39-17-18".matches(regex));
		 		
		assertFalse("+972-79-390-1-18".matches(regex));
		assertFalse("+972-79-390-170-18".matches(regex));
	 
		assertFalse("+972-79-390-17-1".matches(regex));
		assertFalse("+972-79-390-17-180".matches(regex));
		
		assertFalse(" 972-79-390-17-18".matches(regex));
		assertFalse("-972-79-390-17-18".matches(regex));
		assertFalse("972-79-390-17-18".matches(regex));
		assertFalse("0972-79-390-17-18".matches(regex));
		assertFalse("a972-79-390-17-18".matches(regex));
			
		assertFalse("+972579-390-17-18".matches(regex));
		assertFalse("+97279-390-17-18".matches(regex));
		assertFalse("+972_79-390-17-18".matches(regex));
		assertFalse("+972a79-390-17-18".matches(regex));
		
		assertFalse("+972-60".matches(regex));
		assertFalse("+972-?".matches(regex));
		assertFalse("+972-00".matches(regex));
		assertFalse("+972-40".matches(regex));
		assertFalse("+972-a0".matches(regex));
		assertFalse("+972-5a".matches(regex));
		
		assertFalse("+972-57 390-17-18".matches(regex));
		assertFalse("+972-57+390-17-18".matches(regex));
		assertFalse("+972-57a390-17-18".matches(regex));
		assertFalse("+972-570390-17-18".matches(regex));
		
		assertFalse("+972-57-390 17-18".matches(regex));
		assertFalse("+972-57-390?17-18".matches(regex));
		assertFalse("+972-57-390a17-18".matches(regex));
		assertFalse("+972-57-390717-18".matches(regex));
		
		assertFalse("+972-57-390-17 18".matches(regex));
		assertFalse("+972-57-390-17?18".matches(regex));
		assertFalse("+972-57-390-17a18".matches(regex));
		assertFalse("+972-57-390-17518".matches(regex));
		
			
	}	
	

}
