import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CurrConv {

	//declaration of the private data members and objects
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JLabel label;	
	
	//make the default constructor public
	public CurrConv(){
		
		//declaration of the objects and memory allocation to them
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		label =  new JLabel();
	}
	
	
	public static void main(String[] args) {
		
		//creating and calling the default object of the class(which also calls the constructor
		new CurrConv();

	}

}
