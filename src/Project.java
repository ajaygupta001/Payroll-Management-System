import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Project extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar m;
	JMenu m1,m2,m3,m4,m5;
	
	Project(){
		super("PayRoll System");
		ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/payroll.jpg"));
		Image i1 = i.getImage().getScaledInstance(1100, 800, Image.SCALE_AREA_AVERAGING);
		ImageIcon i2 = new ImageIcon(i1);
		JLabel l = new JLabel(i2);
		add(l);
		add(l,BorderLayout.CENTER);
		
		m = new JMenuBar();
		setJMenuBar(m);
		
		
		m1 = new JMenu("Master");
		m1.setForeground(Color.BLUE);
		
		m2 = new JMenu("Update");
		m2.setForeground(Color.RED);
		
		m3 = new JMenu("Reports");
		m3.setForeground(Color.BLUE);
		
		m4 = new JMenu("Utilities");
		m4.setForeground(Color.RED);
		
		m5 = new JMenu("Exits");
		m5.setForeground(Color.BLUE);
		
		
		
		JMenuItem p = new JMenuItem("New_Employee");
		p.setFont(new Font("monospaced",Font.PLAIN,12));
		p.setForeground(Color.BLUE);
		p.setMnemonic('N');
	    p.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
	    m1.add(p);
	    
	                   JMenuItem p1 = new JMenuItem("Salary");
	    	           p1.setFont(new Font("monospaced",Font.PLAIN,12));
	    		       p1.setForeground(Color.BLUE);
	    		       p1.setMnemonic('S');
	    	           p1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
	    	           m1.add(p1);
		
	    	            JMenuItem p2 = new JMenuItem("List_Employee");
	    	    		p2.setFont(new Font("monospaced",Font.PLAIN,12));
	    	    		p2.setForeground(Color.BLUE);
	    	    		p2.setMnemonic('L');
	    	    	    p2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
	    	    	    m1.add(p2);
	    	    	  
	    	    	    m.add(m1);
	    	    	    p.addActionListener(this);
	    	    	    p1.addActionListener(this);
	    	    	    p2.addActionListener(this);
	    	    	    
	    	    	    
	    	 
	    	 
	    	    	            JMenuItem p3 = new JMenuItem("Update_Salary");
	    	    	    		p3.setFont(new Font("monospaced",Font.PLAIN,12));
	    	    	    		p3.setForeground(Color.BLUE);
	    	    	    		p3.setMnemonic('U');
	    	    	    	    p3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
	    	    	    	    m2.add(p3);
	    	    		    	 
	    	    	            JMenuItem p4 = new JMenuItem("Update_Employee");
	    	    	    		p4.setFont(new Font("monospaced",Font.PLAIN,12));
	    	    	    		p4.setForeground(Color.BLUE);
	    	    	    		p4.setMnemonic('E');
	    	    	    	    p4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
	    	    	    	    m2.add(p4);
	    	    		    	 
	    	    	            JMenuItem p5 = new JMenuItem("Take_Attendance");
	    	    	    		p5.setFont(new Font("monospaced",Font.PLAIN,12));
	    	    	    		p5.setForeground(Color.BLUE);
	    	    	    		p5.setMnemonic('A');
	    	    	    	    p5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
	    	    	    	    m2.add(p5);
		          
		            m.add(m2);
		            
		            
		            p3.addActionListener(this);
    	    	    p4.addActionListener(this);
    	    	    p5.addActionListener(this);
    	    	    
		                     
					            JMenuItem p6 = new JMenuItem("Generate_Payslip");
			    	    		p6.setFont(new Font("monospaced",Font.PLAIN,12));
			    	    		p6.setForeground(Color.BLUE);
			    	    		p6.setMnemonic('G');
			    	    	    p6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
			    	    	    m3.add(p6);
			    		    	 
			    	            JMenuItem p7 = new JMenuItem("List_Attendance");
			    	    		p7.setFont(new Font("monospaced",Font.PLAIN,12));
			    	    		p7.setForeground(Color.BLUE);
			    	    		p7.setMnemonic('L');
			    	    	    p7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
			    	    	    m3.add(p7);
								 m.add(m3);
			    	
					
					 
					 
					    p6.addActionListener(this);
	    	    	    p7.addActionListener(this);
	    	    	   
		            
					    JMenuItem p8 = new JMenuItem("Notepad");
	    	    		p8.setFont(new Font("monospaced",Font.PLAIN,12));
	    	    		p8.setForeground(Color.BLUE);
	    	    		p8.setMnemonic('N');
	    	    	    p8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
	    	    	    
	    		    	 
	    	            JMenuItem p9 = new JMenuItem("Calculator");
	    	    		p9.setFont(new Font("monospaced",Font.PLAIN,12));
	    	    		p9.setForeground(Color.BLUE);
	    	    		p9.setMnemonic('C');
	    	    	    p9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
	    	    	    
	    		    	 
	    	            JMenuItem p10 = new JMenuItem("WebBrowser");
	    	    		p10.setFont(new Font("monospaced",Font.PLAIN,12));
	    	    		p10.setForeground(Color.BLUE);
	    	    		p10.setMnemonic('W');
	    	    	    p10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		            
		            
	    	            m4.add(p8);
			            m4.add(p9);
			            m4.add(p10);
			            m.add(m4);
			            
			            
			            p8.addActionListener(this);
	    	    	    p9.addActionListener(this);
	    	    	    p10.addActionListener(this);
			            
			            
			            JMenuItem p11 = new JMenuItem("Exits");
	    	    		p11.setFont(new Font("monospaced",Font.PLAIN,12));
	    	    		p11.setForeground(Color.BLUE);
	    	    		p11.setMnemonic('E');
	    	    	    p11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		            
			            m5.add(p11);
			            m.add(m5);
			            add(m);
			            
			            p11.addActionListener(this);
	    	    	   
			            
			            
			   setLayout(new BorderLayout());  
			   
		
	    getContentPane().setBackground(Color.WHITE);
		setLocation(300,100);
		setSize(800,600);
		setVisible(true);
	}
		
		
	
	
	
	 public void actionPerformed(ActionEvent ae){
		
		 String msg= ae.getActionCommand();
		 
		 if(msg.equals("New_Employee")) 
	            new New_Employee().setVisible(true);
			 
		 else if(msg.equals("Salary"))
	            new Salary().setVisible(true);
		 
		 else if(msg.equals("List_Employee"))
	            new List_Employee().setVisible(true);
		 
		 else if(msg.equals("Update_Salary"))
	            new Update_Salary().setVisible(true);
		 
		 else if(msg.equals("Update_Employee"))
	            new Update_Employee().setVisible(true);
		 
		 else if(msg.equals("Take_Attendance"))
	            new Take_Attendance().setVisible(true);
		 
//		 else if(msg.equals("Generate Payslip")
//	            new Generate Payslip().setVisible(true);
		 
		 else if(msg.equals("List Attendance"))
	            new List_Attendance().setVisible(true);
		 
		  else if(msg.equals("Notepad")){
	            try{
	               Runtime.getRuntime().exec("C:\\Program Files\\Notepad++");
	            }catch(Exception e){ }
	        }
	        else if(msg.equals("Calculator")){
	            try{
	               Runtime.getRuntime().exec("calc.exe");
	            }catch(Exception e){ }
	        }
	        else if(msg.equals("Web Browser")){
	            try{
	               Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application");
	            }catch(Exception e){e.printStackTrace();}} 
	        
	      
	        else if(msg.equals("Exits"))
	        	dispose();
		 
	            }
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		new Project();
		}

}
	
	
		
	


	
	
		
     
     
     
	
