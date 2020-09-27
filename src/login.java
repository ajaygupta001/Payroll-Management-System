import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class login extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l1,l2,l3;
	JTextField t1,pp1;
	JButton b1,b2;
	
	
	login(){
		super("Login");
		setLayout(new BorderLayout());
		l1 = new JLabel(new ImageIcon(ClassLoader.getSystemResource("icons/defaultpic.png")));
		b1 = new JButton("SUBMIT",new ImageIcon(ClassLoader.getSystemResource("icons/login.png")));
		b2 = new JButton("CANCEL",new ImageIcon(ClassLoader.getSystemResource("icons/cancel.png")));
		t1 = new JTextField(10);
		pp1 = new JPasswordField(10);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		 
		JPanel p2,p4;
		p2 = new JPanel();
		p4 = new JPanel();
		
		
		
		
		add(l1,BorderLayout.WEST);
		    p2.add(new JLabel("User Name"));
	        p2.add(t1);
            p2.add(new JLabel("Password"));
            p2.add(pp1);
	        add(p2,BorderLayout.CENTER);
		p4.add(b1);
		p4.add(b2);
		add(p4,BorderLayout.SOUTH);
		
		
		
		
		
		
		setLocation(400,400);
		setSize(350,250);
		setVisible(true);
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			
		try {
			String a = t1.getText();
			String c = pp1.getText();
			Connect d = new Connect();
			 String q="select * from login where username= '"+a+"' and password= '"+c+"'";
			ResultSet rs = d.s.executeQuery(q);
			
			if(rs.next()) {
				
				JOptionPane.showMessageDialog(null, "Valid Login");
				new Project().setVisible(true);
				setVisible(false);
			              }
			else {
				JOptionPane.showMessageDialog(null, "Invalid Login");
				setVisible(false);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	else if(ae.getSource()==b2){
		System.exit(0);
	}}
	
	
	public static void main(String[] args) {
		
			new login();
		
	}

}
