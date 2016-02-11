import java.util.Scanner;


public class CharacterUnicode {
	public void getCharacter() {
		System.out.println("What Character do you need to get?");
		Scanner characterFinder = new Scanner(System.in);
		String character = characterFinder.nextLine();
		char ch= character.charAt(0); 
		System.out.println( "\\u" + Integer.toHexString(ch | 0x10000).substring(1) );
		
	}
}
