package atbashcipher;

import exceptions.NotImplementedException;

public class Atbash
{
	private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private static final String reverseAlphabet = "zyxwvutsrqponmlkjihgfedcba";

	/**
	 * Decodes a string encoded by an atbash cippher.
	 * Remove all spaces from the input.
	 * There should be no spaces in the output.
	 * @param cipherText
	 * @return
	 */
	public static String decode(String cipherText) {
		throw new NotImplementedException();
	}
	
	/**
	 * Encodes a string by atbash cipher.
	 * Spaces should be removed from the input.
	 * When building the output, the output should be groups of five letters, separated by a spaces.
	 * @param plainText
	 * @return
	 */
	public static String encode(String plainText) {
		throw new NotImplementedException();
	}
	
	/**
	 * Given a encoded letter, get the correct decoded letter.
	 * @param letter
	 * @return
	 */
	private static Character getDecodedLetter(Character letter ) {
		throw new NotImplementedException();
	}
	
	/**
	 * Given a letter, give the correct decoded letter;
	 * @param letter
	 * @return
	 */
	private static Character getEncodedLetter(Character letter) {
		throw new NotImplementedException();
	}
	
	private static String sanitize(String input) {
		throw new NotImplementedException();
	}
}
