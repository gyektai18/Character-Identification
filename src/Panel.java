import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Panel extends JPanel implements ActionListener {

	JButton getCharacter = new JButton("Choose This Character");
	JTextField chGetter = new JTextField("ChooseYourCharacter");
	JPanel thePanel = new JPanel();
	JTextField hex = new JTextField("Hex");
	JTextField unicode = new JTextField("Unicode");
	JTextField largeFont = new JTextField("Large Font");
	JTextField description = new JTextField("Description");
	JTextField decimal = new JTextField("Decimal");
	
	
		public Panel(){
			setPreferredSize(new Dimension (700,300));
			this.add(chGetter);
			chGetter.setPreferredSize( new Dimension( 300, 24 ) );
			this.add(getCharacter);
			getCharacter.setPreferredSize( new Dimension( 300, 24 ) );
			this.add(hex);
			hex.setPreferredSize( new Dimension( 100, 24 ) );
			this.add(decimal);
			decimal.setPreferredSize( new Dimension( 100, 24 ) );
			this.add(unicode);
			unicode.setPreferredSize( new Dimension( 100, 24 ) );
			this.add(largeFont);
			largeFont.setPreferredSize( new Dimension( 100, 24 ) );
			this.add(description);
			description.setPreferredSize( new Dimension( 200, 24 ) );
			getCharacter.addActionListener(this);
			

		}
		
		public void actionPerformed (ActionEvent e){
			CharacterUnicode IWantChar = new CharacterUnicode();
			//Get the String from the Text Field, then make it a char
			String character = chGetter.getText();
			char ch= character.charAt(0); 
			String hexFormat = IWantChar.getHex(ch);
			/*
			String decimalFormat = IWantChar.getDecimal(ch);
			String unicodeFormat = IWantChar.getUnicode(ch);
			String description = IWantChar.getDescription(ch);
			*/
			hex.setText(hexFormat);
			
			
		}
		

}
