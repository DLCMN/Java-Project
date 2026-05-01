
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.*;


public class Section3_4{

	

	public static void main(String[] args){
		int schoolArray[] = new int[]{};
		
		JFrame f = new JFrame("Hi Alan T Ryan :33");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
            System.out.println("Look and Feel not set: " + e.getMessage());
		}
		
		JPanel pane2 = new JPanel();
		pane2.setLayout(new FlowLayout(FlowLayout.CENTER, 35, 20));


		JLabel label = new JLabel("Which is the worst sound?");
		label.setFont(new Font("Serif", Font.BOLD, 30 ));
		label.setHorizontalAlignment(JLabel.CENTER);
		pane2.add(label);

		JTextField primarySchooField = new JTextField("Enter Here", 16);
		pane2.add(primarySchooField);//.setMinimumSize(new Dimension(125, 100));
		//primarySchooField.setMaximumSize(new Dimension(125, 100));
		//primarySchooField.setPreferredSize(new Dimension(125, 100));

		JButton button1 = new JButton("Next");
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String schoolVar = primarySchooField.getText();
				schoolVar = schoolVar.toUpperCase();
				Integer j = schoolVar.length();
				Boolean errorPop = false;
				Boolean stop = false;

				for (int i = 0 ; i < 16 ; i++){
					char ch = schoolVar.charAt(i);
                    	switch (ch) {
                            case 'A':
                           	 errorPop = true;
                            break;
                        	case 'E':
                        		errorPop = true;
                            	break;
                        	case 'I':
                                errorPop = true;
                                break;
                            case 'O':
                                errorPop = true;
                                break;
                            case 'U':
                                errorPop = true;
                                break;
                            case 'Y':
                            	errorPop = true;
                                break;
                            default:
                                break;
						}

					if (errorPop == true){
					JOptionPane.showMessageDialog(null, "Primary School may not contain a vowel (a, e, i, o, u, or y)", "User Error", 
                                           JOptionPane.INFORMATION_MESSAGE);
					stop = true;
					i = 16;
					}
					if (stop = false){
						for (int x = 0 ; x < 16 ; x++){
						schoolArray[x] = (schoolVar.charAt(0) - 64);
						} 
					}
				}
			}
		});
		button1.setAlignmentX(FlowLayout.CENTER);
		pane2.add(button1);

		f.add(pane2);
		

		
		
		f.setSize(400, 400);	
		f.setVisible(true);
	}
} 