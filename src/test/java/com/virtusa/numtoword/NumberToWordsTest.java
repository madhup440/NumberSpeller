package com.virtusa.numtoword;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.virtusa.numtoword.exceptions.NumberExceedLimitException;
import com.virtusa.numtoword.exceptions.ParseException;

public class NumberToWordsTest {

	@Test
	public void testconvert() {
		String num = "10";
		String results = NumberToWordsConverter.convert(num);
		assertNotNull(results);
	}

	@Test
	public void testNumtoWords_forunitsPosition() {
		String num = "9";
		assertEquals("Nine", NumberToWordsConverter.convert(num));
	}

	@Test
	public void testNumtoWords_forTenthPosition() {
		String num = "21";
		assertEquals("Twenty One", NumberToWordsConverter.convert(num));
	}

	@Test
	public void testNumtoWords_forhunderedPosition() {
		String num = "221";
		assertEquals("Two Hundred Twenty One", NumberToWordsConverter.convert(num));
	}

	@Test
	public void testNumtoWords_forThousandsPosition() {
		String num = "9010";
		assertEquals("Nine Thousand Ten", NumberToWordsConverter.convert(num));
	}

	@Test
	public void testNumtoWords_forLakhsPosition() {
		String num = "999999";
		assertEquals("Nine Lakh Ninety Nine Thousand Nine Hundred Ninety Nine", NumberToWordsConverter.convert(num));
	}

	@Test(expected = NumberExceedLimitException.class)
	public void testNumtoWords_ExceptionWhenExceedLimit() {
		String num = "10000000";
		NumberToWordsConverter.convert(num);
	}

	@Test(expected = ParseException.class)
	public void testNumtoWords_ExceptionWhenParseing() {
		String num = "abc";
		NumberToWordsConverter.convert(num);
	}
}
