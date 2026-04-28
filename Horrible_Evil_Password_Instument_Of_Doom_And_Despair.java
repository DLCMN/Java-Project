
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Font;

public class Horrible_Evil_Password_Instument_Of_Doom_And_Despair{

	public static void main(String[] args){
		JFrame frame = new JFrame("Happy Coding");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
            System.out.println("Look and Feel not set: " + e.getMessage());
		}

		JPanel panel = new JPanel();

		JLabel label = new JLabel("Hello world!");
		label.setFont(new Font("Serif", Font.BOLD, 36));
		panel.add(label);
		
			JButton buttonInst1 = new JButton("Cat mow");
		panel.add(buttonInst1);
		
			JButton buttonInst2 = new JButton("Harmonica");
		panel.add(buttonInst2);
		
			JButton buttonInst3 = new JButton("Gootar");
		panel.add(buttonInst3);
		
			JButton buttonInst4 = new JButton("Cowbell?");
		panel.add(buttonInst4);
		
			JButton button1 = new JButton("Next");
		panel.add(button1);

		frame.add(panel);
		
		frame.setSize(400, 400);	
		frame.setVisible(true);
	}
}