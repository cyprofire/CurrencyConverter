import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CurrConv {

	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JLabel label;
	
	public CurrConv() {	//constructor
	
		//creating instances for objects
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("Click Me:");
		label = new JLabel("Hello Boi!!");
		
		//setting panel layout
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(0, 1));

		
		//adding elements to panel
		panel.add(button);
		panel.add(label);
		
		//adding elements to frame
		frame.setSize(500, 500);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("CurrConv");
		frame.pack();
		frame.setVisible(true);

	}
	
	
	public static void main(String[] args) {
		
		new CurrConv();

	}

}
