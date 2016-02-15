import java.awt.*;
import javax.swing.*;




public class Frame extends JFrame {

	private Container c;
	
	public Frame(){
		super("Display");
		c = this.getContentPane();
	}
	public void addPanel(JPanel thePanel){
		c.add(thePanel);	
	}
	public void showFrame(){
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		
	}

