import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




public class FramePanel extends JFrame {
	
	public void makeTheFrame() {
		
		//Create a Frame, Panel, Button, and a Text Field respectively
		JFrame theFrame = new JFrame("TheFrame");
		JPanel thePanel = new JPanel();
		JButton getCharacter = new JButton("Choose This Character");
		JTextField chGetter = new JTextField("ChooseYourCharacter");
		//Set the size of the Frame
		theFrame.setSize(700,500);
		//Add the Text Field and the Button to the Panel
		thePanel.add(chGetter);
		thePanel.add(getCharacter);
		//Add the Panel to the Frame
		theFrame.add(thePanel);
		//Set the layout, but I don't know what this does
		theFrame.setLayout(new FlowLayout());
		thePanel.setLayout(new BorderLayout());
	    //This line makes the Text Field appear
	    theFrame.getContentPane().add(BorderLayout.EAST, chGetter);
	    theFrame.setVisible(true);
	    //Adds an ActionListener to the button
	    getCharacter.addActionListener(null);
	}
	
	    static class Action implements ActionListener{
	    	public void actionPerformed (ActionEvent e){
	    		//Get the String from the Text Field, then make it a char
	    		//HELP ME ON THIS WHY CAN'T I GET IT? AND WHY WON'T THE BUTTON APPEAR
	    		String character = chGetter.getText();
	    		char ch= character.charAt(0); 
	    		//Print it
	    		System.out.println(ch);
	    	
	    }
	   
	}
	
}
