import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DoctorInfo extends JFrame implements MouseListener,ActionListener{
	
	JLabel userLabel,passLabel,genderLabel,programLabel,frame,imgLabel;
	JTextField userTF;
	JPasswordField passTF;
	JButton add, back;
	JRadioButton r1,r2,r3;
	JComboBox dept;
	Color color1,color2;
	Font font1, font2, font3,font4;
	ImageIcon img;
	JPanel panel;
	
	public DoctorInfo(){
		
		super("Updated Doctor List");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
	
		color1= new Color(143,207,225);
		color2= new Color(39,83,23);
		
		font1 = new Font("Biome",Font.BOLD, 30);
		font2 = new Font("Cascadia Code SemiBold",Font.PLAIN, 20);
		font3 = new Font("Cascadia Mono SemiBold",Font.PLAIN, 15);
		font4 = new Font("Biome",Font.BOLD, 18);
	
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userLabel = new JLabel("HealthMate ");
		userLabel.setBounds(300,10,400,100);
		userLabel.setFont(font1);
		panel.add(userLabel);
		
		userLabel = new JLabel("Doctor Information ");
		userLabel.setBounds(150,80,400,50); 
		userLabel.setFont(font4);
		panel.add(userLabel);
		
		userLabel = new JLabel("Doctor Name: ");
		userLabel.setBounds(75,120,100,100); 
		panel.add(userLabel);	
		
	
		
		userLabel = new JLabel("Mobile Number: ");
		userLabel.setBounds(75,150,100,100); 
		panel.add(userLabel);

		
		genderLabel = new JLabel("Gender:");
		genderLabel.setBounds(75,220,115,20);
		panel.add(genderLabel);
		
		
		programLabel = new JLabel("Department:");
		programLabel.setBounds(75,210,100,100);
		panel.add(programLabel);
		
		
		userLabel = new JLabel("Joining Date: ");
		userLabel.setBounds(75,240,100,100); 
		panel.add(userLabel);
		
		
		userLabel = new JLabel("Salary: ");
		userLabel.setBounds(75,270,100,100); //x,y,width,length
		panel.add(userLabel);
		
		
		userLabel = new JLabel("Room NO: ");
		userLabel.setBounds(75,300,100,100); 
		panel.add(userLabel);
		
	
		userLabel = new JLabel("BM&DC REG: ");
		userLabel.setBounds(75,330,100,100); 
		panel.add(userLabel);
		
		userLabel = new JLabel("Search with BM&DC REG: ");
		userLabel.setBounds(450,370,200,100); 
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(600,410,150,20);
		panel.add(userTF);

		
		add = new JButton("SEARCH");
		add.setBounds(500,470,90,40);
		add.setBackground(Color.GREEN);
		add.setForeground(Color.WHITE);
		add.setOpaque(true);
		add.addMouseListener(this);
		add.addActionListener(this);
		panel.add(add);
		
		back = new JButton("BACK");
		back.setBounds(620,470,90,40);
		back.setBackground(Color.RED);
		back.setForeground(Color.WHITE);
		back.setOpaque(true);
		back.addMouseListener(this);
		back.addActionListener(this);
		panel.add(back);
		
		img = new ImageIcon("images/emp-add1.png");
		
		imgLabel = new JLabel(img);
		imgLabel.setBounds(485,100,300,300);
		panel.add(imgLabel);

		panel.setBackground(color1);
		this.add(panel);
	}
		
	public	 void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == add){
		
			add.setBackground(Color.RED);
			add.setForeground(Color.WHITE);
		}else if(me.getSource() == back){
			back.setBackground(Color.GREEN);
			back.setForeground(Color.BLACK);
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource() == add){
			add.setBackground(Color.GREEN);
			add.setForeground(Color.BLACK);
		}else if(me.getSource() == back){
		back.setBackground(Color.RED);
			back.setForeground(Color.WHITE);
		}
	}
	
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if(add.getText().equals(command));{
			DoctorList dl = new DoctorList();
			dl.setVisible(true);
			this.setVisible(false);
			
		}	
		
		//public void actionPerformed(ActionEvent ae){
		//String command = ae.getActionCommand();
		    if(ae.getSource() == back) {
				
					JOptionPane.showMessageDialog(this, "Doctor info search successfully completed");
					 DrMenu dm = new DrMenu();
					dm.setVisible(true);
					this.setVisible(false);
				}	
					
					
           	}
	
}

