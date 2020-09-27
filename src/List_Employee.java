import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class List_Employee extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String c[] = {"EmpNo","Name","Gender","Address","State","City","Email","Phone"};
	 String e[][]=new String[20][8];  
	    int i=0,j=0;
	JButton b;
	JTable l;
	
	
	List_Employee() {
		super("View Employes List");
		
		
		
		
		
		try {
			Connect d = new Connect();
			String q = "Select * from employee";
			ResultSet rs = d.s.executeQuery(q);
			while(rs.next())
			{
				e[i][j++] = rs.getString("id");
				e[i][j++] = rs.getString("name");
				e[i][j++] = rs.getString("gender");
				e[i][j++] = rs.getString("address");
				e[i][j++] = rs.getString("state");
				e[i][j++] = rs.getString("city");
				e[i][j++] = rs.getString("Email");
				e[i][j++] = rs.getString("phone");
				i++;
				j = 0;
			}
			l = new JTable(e,c);
			add(l);
		}catch(Exception ee) {ee.printStackTrace();}
		
		b = new JButton("Print");
		b.setForeground(Color.BLACK);
		b.setBackground(Color.WHITE);
		add(b,"South");
		
	JScrollPane k = new JScrollPane(l);
	add(k);

		b.addActionListener(this);
		
		setLocation(300,100);
		 setSize(1000,400);
		setVisible(true);	
			
			
			
		
				
				
				
				
			}
			
		
		
		
		
		
		
	
	public void actionPerformed(ActionEvent ae) {
		try {
			l.print();
		}catch(Exception m) {m.printStackTrace();}
	}

	public static void main(String[] args) {
		new List_Employee();

	}

}
