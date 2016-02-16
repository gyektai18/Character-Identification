import java.util.Scanner;

/*
 * This is a different class because this is neat code.
 * This gets the Unicode value of the single character input,
 * but if more than one character is input then this code doesn't work.
 */
public class CharacterUnicode {
	public void getCharacter() {
		System.out.println("What Character do you need to get?");
		//Create a scanner so the user can input a character
		Scanner characterFinder = new Scanner(System.in);
		//Gets the character from the scanner
		String character = characterFinder.nextLine();
		//Changes the string to the char
		char ch= character.charAt(0); 
		int code = (int) ch;
		//Prints the Unicode value of the character
		System.out.println( "Java code: \\u" + Integer.toHexString(ch | 0x10000).substring(1) );
		System.out.println("UTF-8:" + Integer.toHexString(ch | 0x10000).substring(1) );
		System.out.println("Hex Decimal: 0x" + Integer.toHexString(ch | 0x10000).substring(1) );
		System.out.println("Unicode:"+ code);
		System.out.println("Hex Entity: &#x" + Integer.toHexString(ch | 0x10000).substring(1) );
		System.out.println("Decimal:"+ code);
		System.out.println("Decimal Entity: &#"+ code);
	}
}
