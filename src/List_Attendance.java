import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class List_Attendance extends JFrame implements ActionListener{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTable j1;
	    JButton b;
	    String h[]={"Emp id","Date Time","First Half","Second Half"};
	    String d[][]=new String[15][4];  
	    int i=0,j=0;
	    
	    List_Attendance(){
	        super("List Attendance");
	  
	        
	       
	        try{
	            String q="select * from attendance";
	            Connect c1=new Connect();
	            ResultSet rs=c1.s.executeQuery(q);
	            while(rs.next()){
	                d[i][j++]=rs.getString("id");
	                d[i][j++]=rs.getString("date_tm");
	                d[i][j++]=rs.getString("f_half");
	                d[i][j++]=rs.getString("s_half");
	                i++;
	                j=0;
	            }
	        
	            j1=new JTable(d,h);
	            add(j1);

	        }catch(Exception e){}
	        
	    	b = new JButton("Print");
			b.setForeground(Color.BLACK);
			b.setBackground(Color.WHITE);
			add(b,"South");
			
		JScrollPane k = new JScrollPane(j1);
		add(k);

			b.addActionListener(this);
			
			setLocation(300,100);
			 setSize(1000,400);
			setVisible(true);	
	    
	    }
	    public void actionPerformed(ActionEvent ae){
	        try{
	            j1.print();
	        }catch(Exception e){}
	    }
	    
	    public static void main(String[] args){
	        new List_Attendance();
	    }
	}
