package com.derniercri.service.util.accountmanagement;

import java.security.SecureRandom;

public class RandomCodeGenerator {
	private final static String[] randomChars = { "a","x", "n", "y", "i", "&", "c", "u",  "q", "f", "$", "g", "h", "s","l", "m", "o", "p", "r", "b"
			,"j", "k", "z",  "@", "e", "#", "t", "w",  "d", "v", "0", "7", "2", "4", "5",
			"9", "6", "1", "8", "3" };

	private final static String[] randomNumbers = { "0","8", "3","7", "2", "9", "6", "1",  "4", "5", };
	
	public static String generateRandomAlhpaNumericWithSpecialCharsToken(int len) {
		SecureRandom securerandom=null;
		StringBuffer buffer=null;
		int index=0;
		securerandom=new SecureRandom();
		buffer=new StringBuffer();
		for(int i=0;i<len;i++) {
		index=securerandom.nextInt(39);
		buffer.append(randomChars[index]);
		}
		return buffer.toString();
	}

	public static String generateRandomNumericToken(int len) {
		SecureRandom securerandom=null;
		StringBuffer buffer=null;
		int index=0;
		securerandom=new SecureRandom();
		buffer=new StringBuffer();
		for(int i=0;i<len;i++) {
		index=securerandom.nextInt(10);
		buffer.append(randomNumbers[index]);
		}
		return buffer.toString();
	}

}
