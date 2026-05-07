
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class FirstJFrame implements ActionListener {
 
    //Creating objects
    JFrame f;
    JButton openSecondFrame;
    JLabel worstSound;
    JPanel WSPanel;
    JPanel card1;
    JButton buttonInst1;
    JButton buttonInst2;
    JButton buttonInst3;
    JButton buttonInst4;
    JButton button1;
    String guitar = "GuitarStrum.wav";
	String harmonica = "Harmonica.wav";
	String meow = "Meow.wav";
	String moo = "Moo.wav";

	ImageIcon cat = new ImageIcon("happyCat.png");
	ImageIcon CowBell = new ImageIcon("CowBell.png");
	ImageIcon Guitar = new ImageIcon("SpongebobGuitar.png");
	ImageIcon Harmonica = new ImageIcon("harmonicaSquirrel.png");

    public static Boolean Instchose = false;
	public static String chosenInstrument = "";
    



    //Creating constructor
    FirstJFrame(){
 
        //Setting properties of JFrame
        f = new JFrame("Hi Alan T Ryan! :3");
        f.setLocation(300, 88);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			try {
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (Exception e) {
        	    System.out.println("Look and Feel not set: " + e.getMessage());
			}
      


         card1 = new JPanel();
			WSPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 35, 20));


				    worstSound = new JLabel("Which is the worst sound?");
					worstSound.setFont(new Font("Serif", Font.BOLD, 30 ));
					worstSound.setHorizontalAlignment(JLabel.CENTER);
					WSPanel.add(worstSound);


				    buttonInst1 = new JButton(cat);

					buttonInst1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)            {
						//Here goes the action (method) you want to execute when clicked
							chosenInstrument = meow;
							System.out.print("meow");
							Instchose = true;
							}
				
					});

					buttonInst1.setBounds(0, 0, 80, 80);
					WSPanel.add(buttonInst1).setMinimumSize(new Dimension(125, 100));
					buttonInst1.setMaximumSize(new Dimension(125, 100));
							buttonInst1.setPreferredSize(new Dimension(125, 100));

						
				    buttonInst2 = new JButton(Harmonica);
					buttonInst2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)            {
							//Here goes the action (method) you want to execute when clicked
							chosenInstrument = harmonica;
							System.out.print("harmonica");
							Instchose = true;

    					}
			
					});
					WSPanel.add(buttonInst2).setMinimumSize(new Dimension(125, 100));
					buttonInst2.setMaximumSize(new Dimension(125, 100));
					buttonInst2.setPreferredSize(new Dimension(125, 100));
					
				    buttonInst3 = new JButton(Guitar);

					buttonInst3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)            {
							//Here goes the action (method) you want to execute when clicked
							chosenInstrument = guitar;
							System.out.print("strum");
							Instchose = true;
						}
								
						});

					WSPanel.add(buttonInst3).setMinimumSize(new Dimension(125, 100));
					buttonInst3.setMaximumSize(new Dimension(125, 100));
					buttonInst3.setPreferredSize(new Dimension(125, 100));
						
				    buttonInst4 = new JButton(CowBell);

					buttonInst4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)            {
							//Here goes the action (method) you want to execute when clicked
							chosenInstrument = moo;
							System.out.print("moo");
							Instchose = true;
							}
				
					});
					WSPanel.add(buttonInst4).setMinimumSize(new Dimension(125, 100));
					buttonInst4.setMaximumSize(new Dimension(125, 100));
					buttonInst4.setPreferredSize(new Dimension(125, 100));


			
				    button1 = new JButton("Next");

					button1.addActionListener(new ActionListener() {
                        @Override
						public void actionPerformed(ActionEvent e)            {
							System.out.println("hello");
							if (chosenInstrument.isEmpty()) {
								JDialog noInstrument = new JDialog(f, ">:[");
								JLabel noInstrum = new JLabel("Please pick one!!!");
                                JDialog noInstrument1 = new JDialog(f, ">:[");
                                JLabel noInstrum1 = new JLabel("Please pick one!!!");
                                JDialog noInstrument2 = new JDialog(f, ">:[");
                                JLabel noInstrum2 = new JLabel("Please pick one!!!");

									
                                    noInstrument.add(noInstrum);
                                    noInstrument.setSize(250, 100);
                                    noInstrum.setFont(new Font("Serif", Font.BOLD, 20 ));
                                    noInstrum.setHorizontalAlignment(JLabel.CENTER);
                                    noInstrument.setVisible(true);
                                    noInstrument.setLocation(((int)(Math.random() *800) + 50), ((int)(Math.random() *500) + 20));
                                    
                                    noInstrument1.add(noInstrum1);
                                    noInstrument1.setSize(250, 100);
                                    noInstrum1.setFont(new Font("Serif", Font.BOLD, 20 ));
                                    noInstrum1.setHorizontalAlignment(JLabel.CENTER);
                                    noInstrument1.setVisible(true);
                                    noInstrument1.setLocation(((int)(Math.random() *1200) + 50), ((int)(Math.random() *700) + 20));

                                     noInstrument2.add(noInstrum2);
                                    noInstrument2.setSize(250, 100);
                                    noInstrum2.setFont(new Font("Serif", Font.BOLD, 20 ));
                                    noInstrum2.setHorizontalAlignment(JLabel.CENTER);
                                    noInstrument2.setVisible(true);
                                    noInstrument2.setLocation(((int)(Math.random() *800) + 50), ((int)(Math.random() *500) + 20));
								//add error sound
                                
                            }

							else {
								SecondJFrame secondJFrame =new SecondJFrame();//Opening the second JFrame
        						f.dispose();//Disposing the First JFrame
							}
				
						}
						
					});
					button1.setAlignmentX(FlowLayout.CENTER);
				WSPanel.add(button1);

			f.add(WSPanel);
            f.setSize(400, 400);	
            f.setResizable(false);
		    f.setVisible(true);
 
    }
    
    //Creating main method
    public static void main(String[] args){
 
        //Creating object of the class FirstJFrame
        FirstJFrame InstruFrame =new FirstJFrame();
    }
 
    //Overriding actionPerformed() abstract method
    @Override
    public void actionPerformed(ActionEvent e) {
        
        SecondJFrame secondJFrame =new SecondJFrame();//Opening the second JFrame
        f.dispose();//Disposing the First JFrame
 
    }
}
 


//Creating Second Class for the Second JFrame and implementing ActionListener interface

class SecondJFrame implements ActionListener{
    
    //Creating objects
    JFrame frame;
    JButton maideButton;
    JButton openFirstFrame;
    JTextField maidenNameField;
    JPanel maidenPanel;

    static double a;
    static double b;
    static double c;
    static int randomTempo;
    static double tempo;

    public static String maidenName = "";
 
    //Creating constructor of the class 
    SecondJFrame(){
        
        //Setting properties of JFrame
        frame=new JFrame("Second JFrame");

        frame.setLocation(900, 300);
 
        
         maidenPanel = new JPanel();
			maidenPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));
 
        //Setting properties of JButton

        maidenNameField = new JTextField();
        maidenPanel.add(maidenNameField).setMinimumSize(new Dimension(200, 50));
			maidenNameField.setMaximumSize(new Dimension(200, 50));
            maidenNameField.setPreferredSize(new Dimension(200, 50));
            maidenNameField.setFont(new Font("Serif", Font.BOLD, 20 ));

            maideButton = new JButton("Enter");

					maideButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)            {
							//Here goes the action (method) you want to execute when clicked
                            maidenName = maidenNameField.getText();
                                JOptionPane.showMessageDialog(null, maidenName, "PlaceHolder", JOptionPane.INFORMATION_MESSAGE);
                                maidenName = maidenName.toUpperCase();
                                a = ((maidenName.charAt(0) - 64)/10.0) + ((maidenName.charAt(0) - 64)%10);
                                b = ((maidenName.charAt(1) - 64)/10.0) + ((maidenName.charAt(1) - 64)%10);
                                c = ((maidenName.charAt(2) - 64)/10.0) + ((maidenName.charAt(2) - 64)%10);

                                if (a > 1) {
                                    while(a > 1) {
                                        a = a/2;
                                    }
                                }
                                else
                                    return;
                                    if (b > 1) {
                                    while(b > 1) {
                                        b = b/2;
                                    }
                                }
                                   else
                                    return;
                                   if (c > 2) {
                                    while(c > 2) {
                                        c = c/2;
                                    }
                                }
                                   else
                                    return;
                                
                                tempo = (a+b+c)/2;
                                if (tempo > 2.8) {
                                    tempo = tempo / 2;
                                }

                                else if (tempo < 0.2) {
                                    tempo = tempo * 2.5;
                                }


                                randomTempo = (maidenName.charAt(3)-64) + (maidenName.charAt(4)-64);
                                  if (randomTempo > 5) {
                                    while(randomTempo > 5) {
                                        randomTempo = randomTempo/2;
                                    }
                                }



                            System.out.println(tempo);
                            System.out.println(randomTempo);
							}

                    }
    );
					maidenPanel.add(maideButton).setMinimumSize(new Dimension(75, 40));
					maideButton.setMaximumSize(new Dimension(75, 40));
					maideButton.setPreferredSize(new Dimension(75, 40));
                    maideButton.setFont(new Font("Serif", Font.BOLD, 15 ));
 
        //Adding components to JFrame
   
		frame.add(maidenPanel);
        frame.setSize(400, 150);	
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    //Overriding the actionPerformed() abstract method
    @Override
    public void actionPerformed(ActionEvent e) {
        FirstJFrame firstJFrame=new FirstJFrame();//Opening the First JFrame
        frame.dispose();//Disposing the Second JFrame
 
    }

    public static void PlayMusic(String location) {
		try
		{
			File musicPath = new File(location);
			if (musicPath.exists()) 
			{
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
			}
			else
			{
				System.out.println("No file");
			}
		}
		catch(Exception e) {
				System.out.println(e);
		}
	}
}