
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;



public class Horrible_Evil_Password_Instument_Of_Doom_And_Despair{

	
	static Boolean Instchose = false;
	static String chosenInstrument = "";

	
	public static void main(String[] args){

		String guitar = "GuitarStrum.wav";
		String harmonica = "Harmonica.wav";
		String meow = "Meow.wav";
		String moo = "Moo.wav";

		int schoolArray[] = new int[]{};
		int passwordArray[] = new int[]{};

		ImageIcon cat = new ImageIcon("happyCat.png");
		ImageIcon CowBell = new ImageIcon("CowBell.png");
		ImageIcon Guitar = new ImageIcon("SpongebobGuitar.png");
		ImageIcon Harmonica = new ImageIcon("harmonicaSquirrel.png");



		JFrame f = new JFrame("Hi Alan T Ryan :33");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			try {
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (Exception e) {
        	    System.out.println("Look and Feel not set: " + e.getMessage());
			}
		
			JPanel WSPanel = new JPanel();
				WSPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 35, 20));


				JLabel worstSound = new JLabel("Which is the worst sound?");
					worstSound.setFont(new Font("Serif", Font.BOLD, 30 ));
					worstSound.setHorizontalAlignment(JLabel.CENTER);
					WSPanel.add(worstSound);


				JButton buttonInst1 = new JButton(cat);

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

						
				JButton buttonInst2 = new JButton(Harmonica);
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
					
				JButton buttonInst3 = new JButton(Guitar);

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
						
				JButton buttonInst4 = new JButton(CowBell);

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


			
				JButton button1 = new JButton("Next");

					button1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)            {
							System.out.println("hello");
							playWithSpeed(chosenInstrument, 400);
							if (chosenInstrument == "") {
								JDialog noInstrument = new JDialog(f, ">:[");
								JLabel noInstrum = new JLabel("Please pick one!!!");
									

								noInstrument.add(noInstrum);
								noInstrument.setSize(250, 100);
								noInstrum.setFont(new Font("Serif", Font.BOLD, 20 ));
								noInstrum.setHorizontalAlignment(JLabel.CENTER);
								noInstrument.setVisible(true);
								//add error sound
							}
							else {
								//
								
							}
						}
						
					});
					button1.setAlignmentX(FlowLayout.CENTER);
				WSPanel.add(button1);

			f.add(WSPanel);
					

					
		
		f.setSize(400, 400);	
		f.setVisible(true);
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
} 