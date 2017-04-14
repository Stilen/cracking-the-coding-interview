package tests;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import chapter1.*;

public class TestChapter1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testQ1() {
		assertTrue(Q1.hasAllUniqueChars("abcdef"));
		assertTrue(Q1.hasAllUniqueChars("%"));
		assertTrue(Q1.hasAllUniqueChars(""));
		assertFalse(Q1.hasAllUniqueChars("abcdea"));
		assertFalse(Q1.hasAllUniqueChars("ab%def.,#%"));
		assertFalse(Q1.hasAllUniqueChars("aaaaaaa"));
	}
	
	@Test
	public void testQ2() {
		assertTrue(Q2.isPermutation("hello", "hello"));
		assertTrue(Q2.isPermutation("hello", "lolhe"));
		assertTrue(Q2.isPermutation("h", "h"));
		assertFalse(Q2.isPermutation("h", "he"));
		assertFalse(Q2.isPermutation("eeh", "he"));
		assertFalse(Q2.isPermutation("h", "abidel"));
	}
	
	@Test
	public void testQ3() {
		assertEquals("Mr%20John%20Smith", Q3.replaceSpaces("Mr John Smith    "));
		assertEquals("Mr", Q3.replaceSpaces("Mr"));
		assertEquals("", Q3.replaceSpaces(""));
		assertEquals("%20", Q3.replaceSpaces("   "));
		assertEquals("%20%20", Q3.replaceSpaces("      "));
		assertEquals("Mr%20%20Smith", Q3.replaceSpaces("Mr  Smith    "));
	}
	
	@Test
	public void testQ4() {
		assertTrue(Q4.isPermutationOfPalindrome("oov"));
		assertTrue(Q4.isPermutationOfPalindrome("TactCoa"));
		assertTrue(Q4.isPermutationOfPalindrome("Portugaltugalrop"));
		assertFalse(Q4.isPermutationOfPalindrome("cracking"));
		assertFalse(Q4.isPermutationOfPalindrome("coding"));
		assertFalse(Q4.isPermutationOfPalindrome("interview"));
	}
}
