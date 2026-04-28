import javax.swing.JFrame;
import javax.swing.JLabel;

public class Horrible_Evil_Password_Instument_Of_Doom_And_Despair{

	public static void main(String[] args){
		JFrame frame = new JFrame("Happy Coding");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Hello world!");
		frame.add(label);
		
		frame.setSize(300, 300);	
		frame.setVisible(true);
	}
}