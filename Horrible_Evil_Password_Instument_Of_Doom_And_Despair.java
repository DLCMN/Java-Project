
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Dimension;

public class Horrible_Evil_Password_Instument_Of_Doom_And_Despair{

	

	public static void main(String[] args){

		String ChosenInstrument = "";
		JFrame f = new JFrame("Hi Alan T Ryan :33");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
            System.out.println("Look and Feel not set: " + e.getMessage());
		}


		




	
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 35, 20));


			JLabel label = new JLabel("Which is the worst sound?");
		label.setFont(new Font("Serif", Font.BOLD, 30 ));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label);


		JButton buttonInst1 = new JButton("Cat mow" );
		buttonInst1.setBounds(0, 0, 80, 80);
		panel.add(buttonInst1).setMinimumSize(new Dimension(125, 100));
		buttonInst1.setMaximumSize(new Dimension(125, 100));
		buttonInst1.setPreferredSize(new Dimension(125, 100));

	
			JButton buttonInst2 = new JButton("Harmonica");
		panel.add(buttonInst2).setMinimumSize(new Dimension(125, 100));
		buttonInst2.setMaximumSize(new Dimension(125, 100));
		buttonInst2.setPreferredSize(new Dimension(125, 100));
		
			JButton buttonInst3 = new JButton("Gootar");
		panel.add(buttonInst3).setMinimumSize(new Dimension(125, 100));
		buttonInst3.setMaximumSize(new Dimension(125, 100));
		buttonInst3.setPreferredSize(new Dimension(125, 100));
		
			JButton buttonInst4 = new JButton("Cowbell?");
		panel.add(buttonInst4).setMinimumSize(new Dimension(125, 100));
		buttonInst4.setMaximumSize(new Dimension(125, 100));
		buttonInst4.setPreferredSize(new Dimension(125, 100));


		
			JButton button1 = new JButton("Next");
			button1.setAlignmentX(FlowLayout.CENTER);
		panel.add(button1);

		f.add(panel);
		

		
		
		f.setSize(400, 400);	
		f.setVisible(true);
	}
} 