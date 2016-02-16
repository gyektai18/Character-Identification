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
		("Hex Decimal: 0x" + Integer.toHexString(ch | 0x10000).substring(1) );
		
	}
	
	public String getUnicode(char ch){
		int code = (int) ch;
		String unicode = "" + code;
		return
		unicode;
	}
	
	public String getDecimal(char ch){
		int code = (int) ch;
		String decimal = "" + code;
		return
		decimal;
	}
	public String getJava(char ch){
		return
		( "Java code: \\u" + Integer.toHexString(ch | 0x10000).substring(1) );
	}
	public String getUTF8(char ch){
		return
		("UTF-8: " + Integer.toHexString(ch | 0x10000).substring(1) );
	}
	public String getHexEntity(char ch){
		return
		("Hex Entity: &#x" + Integer.toHexString(ch | 0x10000).substring(1) );
	}
	public String getDecimalEntity(char ch){
		int code = (int) ch;
		return
		("Decimal Entity: &#"+ code);
	}
	/*
	public String getDecimal() {
		
	}
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
		}*/
}
