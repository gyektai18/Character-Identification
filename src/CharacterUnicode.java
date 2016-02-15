import java.util.Scanner;

/*
 * This is a different class because this is neat code.
 * This gets the Unicode value of the single character input,
 * but if more than one character is input then this code doesn't work.
 */
public class CharacterUnicode {
	public String getHex(char ch) {
		//Returns the Unicode value of the character
		return
		 ( "\\u" + Integer.toHexString(ch | 0x10000).substring(1) );
		
	}
}
