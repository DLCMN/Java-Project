
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;


public class Horrible_Evil_Password_Instument_Of_Doom_And_Despair extends JFrame {

	CardLayout instrument;
    JPanel mainPanel;
    JPanel card1;
    JPanel card2;

	JPanel card5;

    JButton buttonInstSkip = new JButton("Go to Card 2");
    JButton maideButton = new JButton("Go to Card 1");


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
		card5 = new JPanel((new FlowLayout(FlowLayout.CENTER, 65, 20)));
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
							playWithSpeed(chosenInstrument,100);
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
        




        maidenNameField = new JTextField();
        card2.add(maidenNameField).setMinimumSize(new Dimension(200, 50));
			maidenNameField.setMaximumSize(new Dimension(200, 50));
            maidenNameField.setPreferredSize(new Dimension(200, 50));
            maidenNameField.setFont(new Font("Serif", Font.BOLD, 20 ));

            maideButton = new JButton("Enter");

					maideButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)            {
							//Here goes the action (method) you want to execute when clicked
                            maidenName = maidenNameField.getText();

							for (int p = 0; p < maidenName.length(); p++) {
								c = maidenName.charAt(p);
								if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
										JDialog notLetter = new JDialog(Horrible_Evil_Password_Instument_Of_Doom_And_Despair.this,">:[");
									JLabel noLetter = new JLabel("Please only use letters");
									notLetter.add(noLetter);

								   notLetter.setSize(250, 100);
                                    noLetter.setFont(new Font("Serif", Font.BOLD, 15 ));
                                    noLetter.setHorizontalAlignment(JLabel.CENTER);
                                    notLetter.setVisible(true);
                                    notLetter.setLocation(((int)(Math.random() *1200) + 50), ((int)(Math.random() *700) + 20));
							}
						}
                              if (maidenName.length() < 5)  {
								JDialog maidenTooShort = new JDialog(Horrible_Evil_Password_Instument_Of_Doom_And_Despair.this,">:[");
								JLabel maidenShort = new JLabel("Please write atleast 5 letters");

								maidenTooShort.add(maidenShort);
									
									 maidenTooShort.setSize(250, 100);
                                    maidenShort.setFont(new Font("Serif", Font.BOLD, 15 ));
                                    maidenShort.setHorizontalAlignment(JLabel.CENTER);
                                    maidenTooShort.setVisible(true);
                                    maidenTooShort.setLocation(((int)(Math.random() *1200) + 50), ((int)(Math.random() *700) + 20));
							  }
							  else if (maidenName.length() < 5)  {
								JDialog maidenTooLong = new JDialog(Horrible_Evil_Password_Instument_Of_Doom_And_Despair.this,">:[");
								JLabel maidenLong = new JLabel("Please write less than 10 letters");

								maidenTooLong.add(maidenLong);
			
                                    maidenTooLong.setSize(250, 100);
                                    maidenLong.setFont(new Font("Serif", Font.BOLD, 15 ));
                                    maidenLong.setHorizontalAlignment(JLabel.CENTER);
                                    maidenTooLong.setVisible(true);
                                    maidenTooLong.setLocation(((int)(Math.random() *1200) + 50), ((int)(Math.random() *700) + 20));

							  }

							  else
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
							}

                    }
    );
					card2.add(maideButton).setMinimumSize(new Dimension(75, 40));
					maideButton.setMaximumSize(new Dimension(75, 40));
					maideButton.setPreferredSize(new Dimension(75, 40));
                    maideButton.setFont(new Font("Serif", Font.BOLD, 15 ));


		
		mainPanel.add(card1, "card1");
        mainPanel.add(card2, "card2");
		mainPanel.add(card5, "card5");
			//card2.setPreferredSize(getSize());
        



        add(mainPanel);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

//Int songSize = song.length

		//for (int r = 0; r < songSize)
			//PlayMusic(r);
		//wait(tempo);

	}
}

public void main(String[] args) {
	new Horrible_Evil_Password_Instument_Of_Doom_And_Despair();
}
// ai code vvv
	  public static void playWithSpeed(String location, int speedPercent) {
        float speedFactor = speedPercent / 100f;
        File file = new File(location);

        if (!file.exists()) {
            System.out.println("File not found: " + location);
            return;
        }

        try (AudioInputStream sourceStream = AudioSystem.getAudioInputStream(file)) {
            AudioFormat baseFormat = sourceStream.getFormat();

            // Ensure we work with PCM signed format for conversion
            AudioFormat pcmBase = new AudioFormat(
                    AudioFormat.Encoding.PCM_SIGNED,
                    baseFormat.getSampleRate(),
                    (baseFormat.getSampleSizeInBits() == AudioSystem.NOT_SPECIFIED) ? 16 : baseFormat.getSampleSizeInBits(),
                    baseFormat.getChannels(),
                    baseFormat.getChannels() * ((baseFormat.getSampleSizeInBits() == AudioSystem.NOT_SPECIFIED) ? 2 : baseFormat.getSampleSizeInBits() / 8),
                    baseFormat.getSampleRate(),
                    false);

            AudioInputStream pcmStream = AudioSystem.getAudioInputStream(pcmBase, sourceStream);

            // Create a target format with adjusted sample rate (this changes playback speed)
            float newSampleRate = pcmBase.getSampleRate() * speedFactor;
            AudioFormat targetFormat = new AudioFormat(
                    pcmBase.getEncoding(),
                    newSampleRate,
                    pcmBase.getSampleSizeInBits(),
                    pcmBase.getChannels(),
                    pcmBase.getFrameSize(),
                    newSampleRate,
                    pcmBase.isBigEndian());

            AudioInputStream playbackStream = AudioSystem.getAudioInputStream(targetFormat, pcmStream);

            DataLine.Info info = new DataLine.Info(SourceDataLine.class, targetFormat);
            try (SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info)) {
                line.open(targetFormat);
                line.start();

                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = playbackStream.read(buffer, 0, buffer.length)) != -1) {
                    line.write(buffer, 0, bytesRead);
                }

                line.drain();
            }
        } catch (UnsupportedAudioFileException e) {
            System.err.println("Unsupported audio file: " + e.getMessage());
        } catch (LineUnavailableException | IOException e) {
            System.err.println("Playback error: " + e.getMessage());
        }
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
