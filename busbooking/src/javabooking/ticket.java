package javabooking;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
	

class ticket {
	
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/PASSENGERS";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "";
	   
	   Connection conn = null;
	   Statement stmt = null;
	
	JFrame jf;Panel p;Label L;JMenuItem jm;
	JButton j;String set_no;
	Font font = new Font("Times new Roman", Font.BOLD, 14);
	String a,b,c,d,e,x,g;
	ticket(String i){
		this.set_no = i;
		jf = new JFrame();
		ImageIcon icon;
                 icon = new ImageIcon(this.getClass().getResource("/icons/bus.png"));
               
		
		jm = new JMenuItem(null,icon);
		jm.setBackground(Color.white);
		
		JPanel jPanel =new JPanel();
		
		JOptionPane jp = new JOptionPane(6);
		jp.setSize(12,12);
		jp.setName("BBooking");
		jp.setFont(font);
		
		final TextField t1= new TextField(18);
		final TextField t2= new TextField(18);final TextField t3= new TextField(18);
		final TextField t4= new TextField(18);final TextField t5= new TextField(18);final TextField t6= new TextField(18);
		Label name= new Label("Name    ", Label.LEFT);name.setBackground(Color.BLUE);  name.setForeground(Color.WHITE);
		Label Seat= new Label("Seat No ", Label.LEFT);Seat.setBackground(Color.BLUE);Seat.setForeground(Color.WHITE);
		Label from= new Label("From:     ", Label.LEFT);from.setBackground(Color.BLUE);from.setForeground(Color.WHITE);
		Label to= new Label("To:          ", Label.LEFT);to.setBackground(Color.BLUE);to.setForeground(Color.WHITE);
		Label date= new Label("Date:      ", Label.LEFT);date.setBackground(Color.BLUE);date.setForeground(Color.WHITE);
		Label contact= new Label("Contacts", Label.LEFT);contact.setBackground(Color.blue);contact.setForeground(Color.WHITE);
		
		a=t1.getText();b=t2.getText();c=t3.getText();d=t4.getText();x=t5.getText();g=t6.getText();
		
		j = new JButton("Book");
		j.setLocation(10, 10);
		j.setBackground(Color.lightGray);
		
		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				
				   try{
				      Class.forName("com.mysql.jdbc.Driver");
				      //System.out.println("Connecting to database...");
				      conn = DriverManager.getConnection(DB_URL,USER,PASS);
				     // System.out.println("Creating statement...");
				      stmt = conn.createStatement();
				      String sql;
				      
				      sql = "INSERT INTO JOURNEY(Seat, Name, Came, Go, Date, Contacts) VALUES ( \'"+t1.getText()+"\',\'"+t2.getText()+"\',\'"+t3.getText()+"\',\'"+t4.getText()+"\',\'"+t5.getText()+"\',\'"+t6.getText()+"\')";
				      int rs = stmt.executeUpdate(sql);
				      //STEP 6: Clean-up environment
				      //rs.close();
				      stmt.close();
				      conn.close();
				   }catch(SQLException MySQLIntegrityConstraintViolationException){
				      //Handle errors for JDBC
				     JOptionPane.showMessageDialog(null, "Seat Booked Already");
				   }catch(Exception e1){
				      //Handle errors for Class.forName
				      e1.printStackTrace();
				   }finally{
				      //finally block used to close resources
				      try{
				         if(stmt!=null)
				            stmt.close();
				      }catch(SQLException se2){
				      }// nothing we can do
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				   }//end try
			
				JOptionPane.showMessageDialog(jf,  "Name: " + t2.getText()+"\n"+"From: " + t3.getText()+"\n"+"To: " + t4.getText()+"\n"+"Date: " + t5.getText()+"\n"+"Contacts: " +t6.getText());
			 
				try(
					FileWriter fw = new FileWriter("/home/user/Desktop//Booking.txt", true);
					BufferedWriter bw = new BufferedWriter(fw);
					
					PrintWriter out = new PrintWriter(bw);
						)
					{
						out.println("SEAT : "+t1.getText());
						out.print("");
						out.println("NAME : "+t2.getText());
						out.print("");
						out.println("FROM : "+t3.getText());
						out.print("");
						out.println("TO : "+t4.getText());
						out.print("");
						out.println("DATE : "+t5.getText());
						out.print("");
						out.println("CONTACTS : "+t6.getText());
						out.print("***********************************************");
						
						out.println("");
						out.print("");
						out.flush();    
					    out.close();        
					     
					}
					catch (Exception e1) {
						JOptionPane.showMessageDialog(null, e1);
						
						// TODO: handle exception
					}}});
		j.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				jf.setVisible(false);
			}
		});
		
		t1.setText(i);
		p = new Panel();
		p.setBackground(Color.lightGray);
		p.add(jm);
		p.add(Seat);p.add(t1);
		p.add(name);;p.add(t2);
		p.add(from);p.add(t3);
		p.add(to);p.add(t4);
		p.add(date);p.add(t5);
		p.add(contact);p.add(t6);
		p.add(j);
		
		jf.add(p);
		jf.setVisible(true);
		jf.setBounds(400, 20, 245, 355);
		jf.setResizable(false);
		jf.setTitle("BBooking");
		jf.setMaximizedBounds(new Rectangle(30, 20, 245, 355));

		}
	 	
	
		}