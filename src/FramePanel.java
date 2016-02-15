import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;




public class FramePanel extends JFrame {
	public void makeTheFrame() {
		JFrame theFrame = new JFrame("TheFrame");
		JPanel thePanel = new JPanel(new BorderLayout());
		theFrame.setVisible(true);
		theFrame.setSize(700,500);
		
	}
	public void makeTheTypingSpot() {
		JTextArea chGetter = new JTextArea(0,0);
		add(chGetter);
		
		
	}
	
}
