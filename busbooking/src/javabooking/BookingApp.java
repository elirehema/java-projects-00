package javabooking;

import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;	


public class BookingApp {
	private JFrame f;Panel p;Label L;JMenuItem jm;
        private ImageIcon icon;
	private JButton A1,A2,A3,A4,B1,B2,B3,B4,C1,C2,C3,C4,D1,D2,D3,D4,E1,E2,E3,E4;
		
	BookingApp(){
		f = new JFrame();
                
                icon = new ImageIcon(this.getClass().getResource("/icons/bus.png"));
		//= new ImageIcon("/icons/bus.png");
		A1 = new JButton("A1");A2 = new JButton("A2");A3 = new JButton("A3");A4 = new JButton("A4");
		B1 = new JButton("B1");B2 = new JButton("B2");B3 = new JButton("B3");B4 = new JButton("B4");
		C1 = new JButton("C1");C2 = new JButton("C2");C3 = new JButton("C3");C4 = new JButton("C4");
		D1 = new JButton("D1");D2 = new JButton("D2");D3 = new JButton("D3");D4 = new JButton("D4");
		E1 = new JButton("E1");E2 = new JButton("E2");E3 = new JButton("E3");E4 = new JButton("E4");
		
		A1.setBackground(Color.yellow);A2.setBackground(Color.CYAN);A3.setBackground(Color.MAGENTA);A4.setBackground(Color.blue);
		B1.setBackground(Color.yellow);B2.setBackground(Color.CYAN);B3.setBackground(Color.MAGENTA);B4.setBackground(Color.blue);
		C1.setBackground(Color.yellow);C2.setBackground(Color.CYAN);C3.setBackground(Color.MAGENTA);C4.setBackground(Color.BLUE);
		D1.setBackground(Color.yellow);D2.setBackground(Color.CYAN);D3.setBackground(Color.MAGENTA);D4.setBackground(Color.blue);
		E1.setBackground(Color.yellow);E2.setBackground(Color.CYAN);E3.setBackground(Color.MAGENTA);E4.setBackground(Color.blue);
		
		jm = new JMenuItem(null,icon);
		jm.setBackground(Color.lightGray);
		try{
	A1.addActionListener((ActionEvent arg0) -> {
            ticket ticket = new ticket("A1");
            String song = "gen.mp3";
            
A1.setEnabled(false);
        });
	A2.addActionListener((ActionEvent arg0) -> {
            ticket ticket = new ticket("A2");
A2.setEnabled(false);
        });				
	A3.addActionListener((ActionEvent arg0) -> {
            ticket ticket = new ticket("A3");
A3.setEnabled(false);
        });							
	A4.addActionListener((ActionEvent arg0) -> {
            ticket ticket = new ticket("A4");
A4.setEnabled(false);
        });
	B1.addActionListener((ActionEvent arg0) -> {
            ticket ticket = new ticket("B1");
B1.setEnabled(false);
        });							
	B2.addActionListener((ActionEvent arg0) -> {
            ticket ticket = new ticket("B2");
B2.setEnabled(false);
        });				
	B3.addActionListener((ActionEvent arg0) -> {
            ticket ticket = new ticket("B3");
B3.setEnabled(false);
        });							
	B4.addActionListener((ActionEvent arg0) -> {
            new ticket("B4");B4.setEnabled(false);
        });
	C1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {new ticket("C1");C1.setEnabled(false);}});							
	C2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {new ticket("C2");C2.setEnabled(false);}});				
	C3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {new ticket("C3");C3.setEnabled(false);}});							
	C4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {new ticket("C4");C4.setEnabled(false);}});
	D1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {new ticket("D1");D1.setEnabled(false);}});							
	D2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {new ticket("D2");D2.setEnabled(false);}});				
	D3.addActionListener((ActionEvent arg0) -> {
            ticket ticket = new ticket("D3");
D3.setEnabled(false);
        });							
	D4.addActionListener((ActionEvent arg0) -> {
            ticket ticket = new ticket("D4");
D4.setEnabled(false);
        });
	E1.addActionListener((ActionEvent arg0) -> {
            ticket ticket = new ticket("E1");
            E1.setEnabled(false);
        });							
	E2.addActionListener((ActionEvent arg0) -> {
            ticket ticket = new ticket("E2");
E2.setEnabled(false);
        });				
	E3.addActionListener((ActionEvent arg0) -> {
            ticket ticket = new ticket("E3");
E3.setEnabled(false);
        });							
	E4.addActionListener((ActionEvent arg0) -> {
            ticket ticket = new ticket("E4");
E4.setEnabled(false);
        });
		}catch (Exception e) {
			System.exit(0);
		}
		p = new Panel();
		p.setBackground(Color.lightGray);
		p.add(jm);
		p.setLayout(new FlowLayout());
		p.add(A1);p.add(A2);p.add(A3);p.add(A4);
		p.add(B1);p.add(B2);p.add(B3);p.add(B4);
		p.add(B1);p.add(B2);p.add(B3);p.add(B4);
		p.add(C1);p.add(C2);p.add(C3);p.add(C4);
		p.add(D1);p.add(D2);p.add(D3);p.add(D4);
		p.add(E1);p.add(E2);p.add(E3);p.add(E4);
		
		
		f.add(p);
		f.setVisible(true);
		f.setBounds(88, 20, 245, 355);
		f.setTitle("BBooking");
		f.setResizable(false);
		f.setMaximizedBounds(new Rectangle(30, 20, 240, 355));
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(1);
			}
		});
		}
	public static void main(String[]args) {
		new BookingApp();
		
		
	}
        /*public static synchronized void playSound() {
    new Thread(new Runnable() { // the wrapper thread is unnecessary, unless it blocks on the Clip finishing, see comments
      public void run() {
        try {
          Clip clip = AudioSystem.getClip();
          AudioInputStream inputStream = AudioSystem.getAudioInputStream(Main.class.getResourceAsStream("/sounds/gen.mp3"));
          clip.open(inputStream);
          clip.start(); 
        } catch (Exception e) {
          System.err.println(e.getMessage());
        }
      }
    }).start();
  }*/
}