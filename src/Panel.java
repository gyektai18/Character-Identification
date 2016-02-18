import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Panel extends JPanel implements ActionListener {

	JButton getCharacter = new JButton("Character 1");
	JButton getCharacter2 = new JButton("Character 2");
	JButton getCharacter3 = new JButton("Character 3");
	JTextField chGetter = new JTextField("ChooseYourCharacter");
	JPanel thePanel = new JPanel();
	JTextField hex = new JTextField("Hex");
	JTextField unicode = new JTextField("Unicode");
	JTextField largeFont = new JTextField("Large Font");
	JTextField description = new JTextField("Description");
	JTextField decimal = new JTextField("Decimal");
	JTextField decimalEntity = new JTextField("Decimal Entity");
	JTextField hexEntity = new JTextField("Hex Entity");
	JTextField java = new JTextField("Java Code");
	JTextField UTF8 = new JTextField("UTF8");
	JTextField alphaEntity = new JTextField("Alpha");
	
	
	
		public Panel(){
			setPreferredSize(new Dimension (700,300));
			this.add(chGetter);
			chGetter.setPreferredSize( new Dimension( 200, 24 ) );
			this.add(getCharacter);
			getCharacter.setPreferredSize( new Dimension( 150, 24 ) );
			this.add(getCharacter2);
			getCharacter2.setPreferredSize( new Dimension( 150, 24 ) );
			this.add(getCharacter3);
			getCharacter3.setPreferredSize( new Dimension( 150, 24 ) );
			this.add(hex);
			hex.setPreferredSize( new Dimension( 100, 24 ) );
			this.add(decimal);
			decimal.setPreferredSize( new Dimension( 120, 24 ) );
			this.add(unicode);
			unicode.setPreferredSize( new Dimension( 120, 24 ) );
			this.add(description);
			description.setPreferredSize( new Dimension( 200, 24 ) );
			this.add(decimalEntity);
			decimalEntity.setPreferredSize( new Dimension( 200, 24 ) );
			this.add(hexEntity);
			hexEntity.setPreferredSize( new Dimension( 200, 24 ) );
			this.add(java);
			java.setPreferredSize( new Dimension( 100, 24 ) );
			this.add(UTF8);
			UTF8.setPreferredSize( new Dimension( 100, 24 ) );
			this.add(alphaEntity);
			alphaEntity.setPreferredSize(new Dimension( 200, 24) );
			this.add(largeFont);
			largeFont.setPreferredSize( new Dimension( 200, 48 ) );
			
			
			getCharacter.addActionListener(this);
			getCharacter2.addActionListener(this);
			getCharacter3.addActionListener(this);
			

		}
		
		public void actionPerformed (ActionEvent e){
			char ch = 0;
			String character = null;
			if (e.getSource() == getCharacter) {
				character = chGetter.getText();
				ch= character.charAt(0); 
			}
			if (e.getSource() == getCharacter2) {
				character = chGetter.getText();
				ch= character.charAt(1); 
			}
			if (e.getSource() == getCharacter3) {
				character = chGetter.getText();
				ch= character.charAt(2); 
			}
			CharacterUnicode IWantChar = new CharacterUnicode();
			//Get the String from the Text Field, then make it a char
			String hexFormat = IWantChar.getHex(ch);
			
			String decimalFormat = IWantChar.getDecimal(ch);
			String unicodeFormat = IWantChar.getUnicode(ch);
			String utfFormat = IWantChar.getUTF8(ch);
			String hexEntFormat = IWantChar.getHexEntity(ch);
			String decEntFormat = IWantChar.getDecimalEntity(ch);
			String javaFormat = IWantChar.getJava(ch);
			//String description = IWantChar.getDescription(ch);
			
			
			Font font1 = new Font("SansSerif", Font.BOLD, 40);
			largeFont.setFont(font1);
			largeFont.setHorizontalAlignment(JTextField.CENTER);
			String whichCharacter = String.valueOf(ch);
			largeFont.setText(whichCharacter);
			hex.setText("Hex: " + hexFormat);
			decimal.setText("Decimal: " + decimalFormat);
			unicode.setText("Unicode: " + unicodeFormat);
			java.setText(javaFormat);
			UTF8.setText(utfFormat);
			hexEntity.setText(hexEntFormat);
			decimalEntity.setText(decEntFormat);
			
			CSVReaderFunction stuff = new CSVReaderFunction();
			String[] entity = stuff.run(hexFormat);
			String descriptions = entity[4];
			String alphaEntities = entity[3];
			alphaEntity.setText("Alpha: " + alphaEntities);
			description.setText(descriptions);
			
			
			
			
		}
		

}
