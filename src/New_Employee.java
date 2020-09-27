import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class New_Employee extends JFrame implements ActionListener {
	    JLabel l1,l2,l3,l4,l5,l6,l7;
	    JTextField t1,t2,t3,t4,t5,t6,t7;
	    JButton b1,b2;
	    Choice c1;
	  
	New_Employee(){
		super("New Employee");
		JPanel p1 = new JPanel();
		p1.setBackground(Color.WHITE);
		p1.setLayout(new GridLayout(8,2,10,40));
		
		 l1 = new JLabel("Name");
	        t1 = new JTextField(15);
	        p1.add(l1);
	        p1.add(t1);
	       
	        c1 = new Choice();
	        c1.add("Male");
	        c1.add("Female");
	       
	        l2 = new JLabel("Gender");
	        p1.add(l2);
	        p1.add(c1);
	        l3 = new JLabel("Address");
	        t3 = new JTextField(15);
	        p1.add(l3);
	        p1.add(t3);
	        l4 = new JLabel("State");
	        t4 = new JTextField(15);
	        p1.add(l4);
	        p1.add(t4); 
	        l5 = new JLabel("City");
	        t5 = new JTextField(15);
	        p1.add(l5);
	        p1.add(t5);
	        l6 = new JLabel("Email");
	        t6 = new JTextField(15);
	        p1.add(l6);
	        p1.add(t6);
	        l7 = new JLabel("Phone");
	        t7= new JTextField(15);
	        p1.add(l7);
	        p1.add(t7);
	        b1 =new JButton("Submit");
	        b1.setBackground(Color.BLACK);
	        b1.setForeground(Color.WHITE);
	        b2 = new JButton("Cancel");
	        b2.setBackground(Color.BLACK);
	        b2.setForeground(Color.WHITE);
	        p1.add(b1);
	        p1.add(b2);
	        add(p1);
		
		
		setLayout(new BorderLayout());
	//	p1.add(new JLabel(new ImageIcon(ClassLoader.getSystemResource("icons/emps.png"))),"WEST");
		JPanel pw = new JPanel();
		pw.setBackground(Color.WHITE);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/new_employee.png"));
		Image i2 = i1.getImage().getScaledInstance(80, 90,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel k = new JLabel(i3);
		pw.add(k);
		add(pw,BorderLayout.WEST);
		add(p1,BorderLayout.CENTER);
		add(p1,"Center");
	        b1.addActionListener(this);
	        b2.addActionListener(this);
		
		
		
		
		
		setLocation(300,100);
		setSize(400,500);
		setVisible(true);
		
		
		
		
	}
	
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void actionPerformed(ActionEvent ae) {
		String a = t1.getText();
		String b = c1.getSelectedItem();
		String c = t3.getText();
		String d = t4.getText();
		String e = t5.getText();
		String f = t6.getText();
		String g = t7.getText();
		
		 String qry = "insert into employee values(null,'"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"')";
		 
		 try {
			Connect x = new Connect();
			 x.s.executeUpdate(qry);
	            JOptionPane.showMessageDialog(null,"Employee Created");
	            this.setVisible(false); 
			
		 }catch(Exception ee)
		 {
			 ee.printStackTrace();
		 }
	}

	public static void main(String[] args) {
		new New_Employee().setVisible(true);

	}

	

}
