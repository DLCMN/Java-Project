
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



public class Horrible_Evil_Password_Instument_Of_Doom_And_Despair extends JFrame {

	CardLayout instrument;
    JPanel mainPanel;
    JPanel card1;
    JPanel card2;

    JButton buttonInstSkip = new JButton("Go to Card 2");
    JButton buutun = new JButton("Go to Card 1");


// section 1 variables
    JButton openSecondFrame;
    JLabel worstSound;
    JPanel WSPanel;
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

//section 2 variables

    JButton maideButton;
    JButton openFirstFrame;
    JTextField maidenNameField;
    JPanel maidenPanel;

    static double a;
    static double b;
    static double c;
    static int randomTempo;
    static double tempo;
    static String maidenName = "";
    static Boolean Instchose = false;
	static String chosenInstrument = "";

    Horrible_Evil_Password_Instument_Of_Doom_And_Despair() {


		card1 = new JPanel((new FlowLayout(FlowLayout.CENTER, 65,30)));
		card2 = new JPanel((new FlowLayout(FlowLayout.CENTER, 65, 20)));
		mainPanel = new JPanel();
		instrument = new CardLayout(40, 20);
		mainPanel.setLayout(instrument);






				    worstSound = new JLabel("Which is the worst sound?");
					worstSound.setFont(new Font("Serif", Font.BOLD, 30 ));
					worstSound.setHorizontalAlignment(JLabel.CENTER);
					card1.add(worstSound);


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
					card1.add(buttonInst1).setMinimumSize(new Dimension(125, 100));
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
					card1.add(buttonInst2).setMinimumSize(new Dimension(125, 100));
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

					card1.add(buttonInst3).setMinimumSize(new Dimension(125, 100));
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
					card1.add(buttonInst4).setMinimumSize(new Dimension(125, 100));
					buttonInst4.setMaximumSize(new Dimension(125, 100));
					buttonInst4.setPreferredSize(new Dimension(125, 100));


			
				    button1 = new JButton("Next");

					button1.addActionListener(new ActionListener() {
                        @Override
						public void actionPerformed(ActionEvent e)            {
							System.out.println("hello");
							if (chosenInstrument.isEmpty() || chosenInstrument == null) {
								JDialog noInstrument = new JDialog(Horrible_Evil_Password_Instument_Of_Doom_And_Despair.this,">:[");
								JLabel noInstrum = new JLabel("Please pick one!!!");
                                JDialog noInstrument1 = new JDialog(Horrible_Evil_Password_Instument_Of_Doom_And_Despair.this, ">:[");
                                JLabel noInstrum1 = new JLabel("Please pick one!!!");
                                JDialog noInstrument2 = new JDialog(Horrible_Evil_Password_Instument_Of_Doom_And_Despair.this, ">:[");
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
								 instrument.show(mainPanel, "card2");
        					
							}
				
						}
						
					});
					button1.setAlignmentX(FlowLayout.CENTER);
				
        card1.add(button1);
        
		
		mainPanel.add(card1, "card1");
        mainPanel.add(card2, "card2");
			//card2.setPreferredSize(getSize());
        


         buutun.addActionListener((e) -> {
            instrument.show(mainPanel, "card1");
        }
    );

		card2.add(buutun);


        add(mainPanel);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }




    public static void main(String[] args) {
        new Horrible_Evil_Password_Instument_Of_Doom_And_Despair();
        
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