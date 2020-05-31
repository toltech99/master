package temps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sun.applet.Main;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Calculadora_Temps_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField1m;
	private JTextField textField2m;
	private JTextField textFieldAns;
	private JTextField txtIntroduirTemps;
	private JTextField txtIntroduirTemps_1;
	private JTextField txtResultat;
	private JTextField textField1h;
	private JTextField textField2h;
	private JTextField textField1y;
	private JTextField textField2y;
	private JTextField textField2d;
	private JTextField textField1d;
	private JTextField textField1M;
	private JTextField textField2M;
	private JTextField textFieldAnsm;
	private JTextField textFieldAnsh;
	private JTextField textFieldAnsy;
	private JTextField textFieldAnsd;
	private JTextField textFieldAnsM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_Temps_GUI frame = new Calculadora_Temps_GUI();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	/*
	 * public static synchronized void playSound(final String url) {
	 
		  new Thread(new Runnable() {
		  // The wrapper thread is unnecessary, unless it blocks on the
		  // Clip finishing; see comments.
		    public void run() {
		      try {
		        Clip clip = AudioSystem.getClip();
		        AudioInputStream inputStream = AudioSystem.getAudioInputStream(
		          Main.class.getResourceAsStream( "src\\temps\\enter.wav"));
		        clip.open(inputStream);
		        clip.start(); 
		      } catch (Exception e) {
		        System.err.println(e.getMessage());
		      }
		    }
		  }).start();
		}

	/**
	 * Create the frame.
	 */
	public Calculadora_Temps_GUI() {
		try {

		    // open the sound file as a Java input stream
		    String gongFile = "src\\temps\\enter.wav";
		    InputStream in = new FileInputStream(gongFile);

		    // create an audiostream from the inputstream
		    AudioStream audioStream = new AudioStream(in);

		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
		} catch(Exception e2) {
			System.out.println( "Sound File not Found");
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1290, 790);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField1m = new JTextField();
		textField1m.setHorizontalAlignment(SwingConstants.TRAILING);
		textField1m.setFont(new Font("Monospaced", Font.BOLD, 80));
		textField1m.setForeground(Color.RED);
		textField1m.setBackground(Color.BLACK);
		textField1m.setBounds(1035, 87, 139, 100);
		contentPane.add(textField1m);
		textField1m.setColumns(10);

		textField2m = new JTextField();
		textField2m.setHorizontalAlignment(SwingConstants.TRAILING);
		textField2m.setFont(new Font("Monospaced", Font.BOLD, 80));
		textField2m.setForeground(Color.GREEN);
		textField2m.setBackground(Color.BLACK);
		textField2m.setColumns(10);
		textField2m.setBounds(1035, 337, 131, 91);
		contentPane.add(textField2m);

		JButton tglbtnNewButton = new JButton("+");
		tglbtnNewButton.setForeground(Color.WHITE);
		tglbtnNewButton.setBackground(new Color(102, 0, 0));
		tglbtnNewButton.setFont(new Font("Monospaced", Font.BOLD, 40));
		tglbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				int hora1;
				int hora2;
				int min1;
				int min2;
				int dia1;
				int dia2;
				int mes1;
				int mes2;
				int year1;
				int year2;
				Temps temps1;
				Temps temps2;

				try {

					try {

					    // open the sound file as a Java input stream
					    String gongFile = "src\\temps\\enter.wav";
					    InputStream in = new FileInputStream(gongFile);

					    // create an audiostream from the inputstream
					    AudioStream audioStream = new AudioStream(in);

					    // play the audio clip with the audioplayer class
					    AudioPlayer.player.start(audioStream);
					} catch(Exception e2) {
						System.out.println( "Enter valid number");
					}
					
					if (!textField1m.getText().isEmpty()) {
						min1 = Integer.parseInt(textField1m.getText());
					} else {
						min1 = 0;
					}
					textFieldAns.setText("MIN1 OK");

					if (!textField2m.getText().isEmpty()) {
						min2 = Integer.parseInt(textField2m.getText());
					} else {
						min2 = 0;
					}
					textFieldAns.setText("MIN2 OK");

					if (!textField1h.getText().isEmpty()) {
						hora1 = Integer.parseInt(textField1h.getText());
						textFieldAns.setText("HORA1 OK");
					} else {
						hora1 = 0;
					}

					if (!textField2h.getText().isEmpty()) {
						hora2 = Integer.parseInt(textField2h.getText());
						textFieldAns.setText("HORA2 OK4");
					}

					else {
						hora2 = 0;
					}
					if (!textField1d.getText().isEmpty()) {
						dia1 = Integer.parseInt(textField1d.getText());
						textFieldAns.setText("DIA1 OK");

					}

					else {
						dia1 = 0;
					}
					if (!textField2d.getText().isEmpty()) {
						dia2 = Integer.parseInt(textField2d.getText());
						textFieldAns.setText("DIA2 OK");

					}

					else {
						dia2 = 0;
					}
					if (!textField1M.getText().isEmpty()) {
						mes1 = Integer.parseInt(textField1M.getText());
						textFieldAns.setText("MES1 OK");

					}

					else {
						mes1 = 0;
					}
					if (!textField2M.getText().isEmpty()) {
						mes2 = Integer.parseInt(textField2M.getText());
						textFieldAns.setText("MES2 OK");

					}

					else {
						mes2 = 0;
					}
					if (!textField1y.getText().isEmpty()) {
						year1 = Integer.parseInt(textField1y.getText());
						textFieldAns.setText("YEAR1 OK");

					}

					else {
						year1 = 0;
					}
					if (!textField2y.getText().isEmpty()) {
						year2 = Integer.parseInt(textField2y.getText());
						textFieldAns.setText("YEAR2 OK");

					}

					else {
						year2 = 0;
					}

					temps1 = new Temps(year1, mes1, dia1, hora1, min1, 0);
					temps2 = new Temps(year2, mes2, dia2, hora2, min2, 0);

					Temps ans = temps1.suma(temps2);

					System.out.println(ans.toString());

					/* JOptionPane.showMessageDialog(null, ans.toString()); */
					textFieldAns.setText(ans.toString());
					textFieldAnsm.setText(String.valueOf(ans.getMinut()));
					textFieldAnsh.setText(String.valueOf(ans.getHora()));
					textFieldAnsd.setText(String.valueOf(ans.getDies()));
					textFieldAnsM.setText(String.valueOf(ans.getMesos()));
					textFieldAnsy.setText(String.valueOf(ans.getAnys()));

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter valid number");

				}

			}
		});
		tglbtnNewButton.setBounds(862, 439, 150, 70);
		contentPane.add(tglbtnNewButton);

		JButton Button = new JButton("-");
		Button.setForeground(Color.WHITE);
		Button.setBackground(new Color(102, 0, 0));
		Button.setFont(new Font("Monospaced", Font.BOLD, 40));
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hora1;
				int hora2;
				int min1;
				int min2;
				int dia1;
				int dia2;
				int mes1;
				int mes2;
				int year1;
				int year2;
				Temps temps1;
				Temps temps2;
				try {

				    // open the sound file as a Java input stream
				    String gongFile = "src\\temps\\enter.wav";
				    InputStream in = new FileInputStream(gongFile);

				    // create an audiostream from the inputstream
				    AudioStream audioStream = new AudioStream(in);

				    // play the audio clip with the audioplayer class
				    AudioPlayer.player.start(audioStream);
				} catch(Exception e2) {
					System.out.println( "Sound File not Found");
				}
				try {

					textFieldAns.setText("PROCESSING...");

					if (!textField1m.getText().isEmpty()) {
						min1 = Integer.parseInt(textField1m.getText());
					} else {
						min1 = 0;
					}
					textFieldAns.setText("MIN1 OK");

					if (!textField2m.getText().isEmpty()) {
						min2 = Integer.parseInt(textField2m.getText());
					} else {
						min2 = 0;
					}
					textFieldAns.setText("MIN2 OK");

					if (!textField1h.getText().isEmpty()) {
						hora1 = Integer.parseInt(textField1h.getText());
						textFieldAns.setText("HORA1 OK");
					} else {
						hora1 = 0;
					}

					if (!textField2h.getText().isEmpty()) {
						hora2 = Integer.parseInt(textField2h.getText());
						textFieldAns.setText("HORA2 OK4");
					}

					else {
						hora2 = 0;
					}
					if (!textField1d.getText().isEmpty()) {
						dia1 = Integer.parseInt(textField1d.getText());
						textFieldAns.setText("DIA1 OK");

					}

					else {
						dia1 = 0;
					}
					if (!textField2d.getText().isEmpty()) {
						dia2 = Integer.parseInt(textField2d.getText());
						textFieldAns.setText("DIA2 OK");

					}

					else {
						dia2 = 0;
					}
					if (!textField1M.getText().isEmpty()) {
						mes1 = Integer.parseInt(textField1M.getText());
						textFieldAns.setText("MES1 OK");

					}

					else {
						mes1 = 0;
					}
					if (!textField2M.getText().isEmpty()) {
						mes2 = Integer.parseInt(textField2M.getText());
						textFieldAns.setText("MES2 OK");

					}

					else {
						mes2 = 0;
					}
					if (!textField1y.getText().isEmpty()) {
						year1 = Integer.parseInt(textField1y.getText());
						textFieldAns.setText("YEAR1 OK");

					}

					else {
						year1 = 0;
					}
					if (!textField2y.getText().isEmpty()) {
						year2 = Integer.parseInt(textField2y.getText());
						textFieldAns.setText("YEAR2 OK");

					}

					else {
						year2 = 0;
					}

					temps1 = new Temps(year1, mes1, dia1, hora1, min1, 0);
					temps2 = new Temps(year2, mes2, dia2, hora2, min2, 0);

					Temps ans = temps1.resta(temps2);

					System.out.println(ans.toString());

					/* JOptionPane.showMessageDialog(null, ans.toString()); */
					textFieldAns.setText(ans.toString());
					textFieldAnsm.setText(String.valueOf(ans.getMinut()));
					textFieldAnsh.setText(String.valueOf(ans.getHora()));
					textFieldAnsd.setText(String.valueOf(ans.getDies()));
					textFieldAnsM.setText(String.valueOf(ans.getMesos()));
					textFieldAnsy.setText(String.valueOf(ans.getAnys()));

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter valid number");

				}

			}
		});
		Button.setBounds(1020, 439, 150, 70);
		contentPane.add(Button);

		JButton tglbtnRst = new JButton("RST");
		tglbtnRst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

				    // open the sound file as a Java input stream
				    String gongFile = "src\\temps\\enter.wav";
				    InputStream in = new FileInputStream(gongFile);

				    // create an audiostream from the inputstream
				    AudioStream audioStream = new AudioStream(in);

				    // play the audio clip with the audioplayer class
				    AudioPlayer.player.start(audioStream);
				} catch(Exception e2) {
					System.out.println( "Sound File not Found");
				}
				textFieldAns.setText("");
				textField1m.setText("0");
				textField2m.setText("0");
				textField1h.setText("0");
				textField2h.setText("0");
				textField1d.setText("0");
				textField2d.setText("0");
				textField1M.setText("0");
				textField2M.setText("0");
				textField1y.setText("0");
				textField2y.setText("0");
				textFieldAnsm.setText("");
				textFieldAnsh.setText("");
				textFieldAnsd.setText("");
				textFieldAnsM.setText("");
				textFieldAnsy.setText("");

			}
		});
		tglbtnRst.setForeground(Color.WHITE);
		tglbtnRst.setBackground(new Color(102, 0, 0));
		tglbtnRst.setFont(new Font("Monospaced", Font.BOLD, 18));
		tglbtnRst.setBounds(142, 447, 150, 70);
		contentPane.add(tglbtnRst);

		txtIntroduirTemps = new JTextField();
		txtIntroduirTemps.setEditable(false);
		txtIntroduirTemps.setText("1- INTRODUIR TEMPS");
		txtIntroduirTemps.setHorizontalAlignment(SwingConstants.CENTER);
		txtIntroduirTemps.setForeground(SystemColor.textInactiveText);
		txtIntroduirTemps.setFont(new Font("Rubik", Font.BOLD, 30));
		txtIntroduirTemps.setColumns(10);
		txtIntroduirTemps.setBackground(Color.BLACK);
		txtIntroduirTemps.setBounds(310, 198, 542, 41);
		contentPane.add(txtIntroduirTemps);

		txtIntroduirTemps_1 = new JTextField();
		txtIntroduirTemps_1.setEditable(false);
		txtIntroduirTemps_1.setText("2- SELECCIONAR OPERACIÓ");
		txtIntroduirTemps_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtIntroduirTemps_1.setForeground(SystemColor.textInactiveText);
		txtIntroduirTemps_1.setFont(new Font("Rubik", Font.BOLD, 30));
		txtIntroduirTemps_1.setColumns(10);
		txtIntroduirTemps_1.setBackground(Color.BLACK);
		txtIntroduirTemps_1.setBounds(310, 440, 542, 41);
		contentPane.add(txtIntroduirTemps_1);

		txtResultat = new JTextField();
		txtResultat.setEditable(false);
		txtResultat.setText("RESULTAT");
		txtResultat.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultat.setForeground(SystemColor.textInactiveText);
		txtResultat.setFont(new Font("Rubik", Font.BOLD, 30));
		txtResultat.setColumns(10);
		txtResultat.setBackground(Color.BLACK);
		txtResultat.setBounds(392, 686, 478, 41);
		contentPane.add(txtResultat);

		textField1h = new JTextField();
		textField1h.setHorizontalAlignment(SwingConstants.TRAILING);
		textField1h.setForeground(Color.RED);
		textField1h.setFont(new Font("Monospaced", Font.BOLD, 80));
		textField1h.setColumns(10);
		textField1h.setBackground(Color.BLACK);
		textField1h.setBounds(879, 87, 117, 100);
		contentPane.add(textField1h);

		textField2h = new JTextField();
		textField2h.setHorizontalAlignment(SwingConstants.TRAILING);
		textField2h.setForeground(Color.GREEN);
		textField2h.setFont(new Font("Monospaced", Font.BOLD, 80));
		textField2h.setColumns(10);
		textField2h.setBackground(Color.BLACK);
		textField2h.setBounds(867, 335, 131, 93);
		contentPane.add(textField2h);

		textField1y = new JTextField();
		textField1y.setHorizontalAlignment(SwingConstants.TRAILING);
		textField1y.setForeground(Color.RED);
		textField1y.setFont(new Font("Monospaced", Font.BOLD, 80));
		textField1y.setColumns(10);
		textField1y.setBackground(Color.BLACK);
		textField1y.setBounds(552, 93, 252, 94);
		contentPane.add(textField1y);

		textField2y = new JTextField();
		textField2y.setHorizontalAlignment(SwingConstants.TRAILING);
		textField2y.setForeground(Color.GREEN);
		textField2y.setFont(new Font("Monospaced", Font.BOLD, 80));
		textField2y.setColumns(10);
		textField2y.setBackground(Color.BLACK);
		textField2y.setBounds(540, 336, 252, 93);
		contentPane.add(textField2y);

		textField2d = new JTextField();
		textField2d.setHorizontalAlignment(SwingConstants.TRAILING);
		textField2d.setForeground(Color.GREEN);
		textField2d.setFont(new Font("Monospaced", Font.BOLD, 80));
		textField2d.setColumns(10);
		textField2d.setBackground(Color.BLACK);
		textField2d.setBounds(363, 336, 131, 91);
		contentPane.add(textField2d);

		textField1d = new JTextField();
		textField1d.setHorizontalAlignment(SwingConstants.TRAILING);
		textField1d.setForeground(Color.RED);
		textField1d.setFont(new Font("Monospaced", Font.BOLD, 80));
		textField1d.setColumns(10);
		textField1d.setBackground(Color.BLACK);
		textField1d.setBounds(382, 93, 122, 94);
		contentPane.add(textField1d);

		textField1M = new JTextField();
		textField1M.setHorizontalAlignment(SwingConstants.TRAILING);
		textField1M.setForeground(Color.RED);
		textField1M.setFont(new Font("Monospaced", Font.BOLD, 80));
		textField1M.setColumns(10);
		textField1M.setBackground(Color.BLACK);
		textField1M.setBounds(142, 100, 195, 91);
		contentPane.add(textField1M);

		textField2M = new JTextField();
		textField2M.setHorizontalAlignment(SwingConstants.TRAILING);
		textField2M.setForeground(Color.GREEN);
		textField2M.setFont(new Font("Monospaced", Font.BOLD, 80));
		textField2M.setColumns(10);
		textField2M.setBackground(Color.BLACK);
		textField2M.setBounds(124, 340, 207, 86);
		contentPane.add(textField2M);
		
		textFieldAnsm = new JTextField();
		textFieldAnsm.setHorizontalAlignment(SwingConstants.TRAILING);
		textFieldAnsm.setForeground(Color.ORANGE);
		textFieldAnsm.setFont(new Font("Monospaced", Font.BOLD, 80));
		textFieldAnsm.setColumns(10);
		textFieldAnsm.setBackground(Color.BLACK);
		textFieldAnsm.setBounds(1025, 580, 131, 91);
		contentPane.add(textFieldAnsm);
		
		textFieldAnsh = new JTextField();
		textFieldAnsh.setHorizontalAlignment(SwingConstants.TRAILING);
		textFieldAnsh.setForeground(Color.ORANGE);
		textFieldAnsh.setFont(new Font("Monospaced", Font.BOLD, 80));
		textFieldAnsh.setColumns(10);
		textFieldAnsh.setBackground(Color.BLACK);
		textFieldAnsh.setBounds(862, 575, 131, 91);
		contentPane.add(textFieldAnsh);
		
		textFieldAnsy = new JTextField();
		textFieldAnsy.setHorizontalAlignment(SwingConstants.TRAILING);
		textFieldAnsy.setForeground(Color.ORANGE);
		textFieldAnsy.setFont(new Font("Monospaced", Font.BOLD, 80));
		textFieldAnsy.setColumns(10);
		textFieldAnsy.setBackground(Color.BLACK);
		textFieldAnsy.setBounds(529, 580, 252, 91);
		contentPane.add(textFieldAnsy);
		
		textFieldAnsd = new JTextField();
		textFieldAnsd.setHorizontalAlignment(SwingConstants.TRAILING);
		textFieldAnsd.setForeground(Color.ORANGE);
		textFieldAnsd.setFont(new Font("Monospaced", Font.BOLD, 80));
		textFieldAnsd.setColumns(10);
		textFieldAnsd.setBackground(Color.BLACK);
		textFieldAnsd.setBounds(358, 580, 122, 91);
		contentPane.add(textFieldAnsd);
		
		textFieldAnsM = new JTextField();
		textFieldAnsM.setHorizontalAlignment(SwingConstants.TRAILING);
		textFieldAnsM.setForeground(Color.ORANGE);
		textFieldAnsM.setFont(new Font("Monospaced", Font.BOLD, 80));
		textFieldAnsM.setColumns(10);
		textFieldAnsM.setBackground(Color.BLACK);
		textFieldAnsM.setBounds(113, 580, 200, 91);
		contentPane.add(textFieldAnsM);
		
				JLabel lblNewLabel = new JLabel("TEMPS 1");
				lblNewLabel.setFont(new Font("Rubik", Font.BOLD, 20));
				lblNewLabel.setIcon(new ImageIcon(Calculadora_Temps_GUI.class.getResource("/TimeCircuitPanel.jpg")));
				lblNewLabel.setBounds(10, 11, 1273, 720);
				contentPane.add(lblNewLabel);
				
						textFieldAns = new JTextField();
						textFieldAns.setEnabled(false);
						textFieldAns.setEditable(false);
						textFieldAns.setHorizontalAlignment(SwingConstants.TRAILING);
						textFieldAns.setFont(new Font("Monospaced", Font.BOLD, 80));
						textFieldAns.setForeground(Color.GREEN);
						textFieldAns.setBackground(Color.BLACK);
						textFieldAns.setColumns(10);
						textFieldAns.setBounds(84, 788, 1053, 100);
						contentPane.add(textFieldAns);
	}
}
