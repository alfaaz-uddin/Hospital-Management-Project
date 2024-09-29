import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddDoctor extends JFrame implements MouseListener,ActionListener{
	
	JLabel userLabel,passLabel,genderLabel,programLabel,frame,imgLabel;
	JTextField userTF;
	JPasswordField passTF;
	JButton add, back;
	ButtonGroup bg1;
	JRadioButton r1,r2,r3;
	JComboBox dept;
	Color color1,color2;
	Font font1, font2, font3, font4;
	ImageIcon img;
	JPanel panel;
	
	public AddDoctor(){
		
		super("Doctor Information");
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
		
		
		userLabel = new JLabel("Add Doctor Form ");
		userLabel.setBounds(130,80,400,50);
        userLabel.setFont(font4);		
		panel.add(userLabel);
		
		userLabel = new JLabel("Doctor Name: ");
		userLabel.setBounds(75,120,100,100); 
		panel.add(userLabel);	
		
		userTF = new JTextField();
		userTF.setBounds(170,160,150,20);
		panel.add(userTF);
		
		userLabel = new JLabel("Mobile Number: ");
		userLabel.setBounds(75,150,100,100); 
		panel.add(userLabel);

		userTF = new JTextField();
		userTF.setBounds(170,190,150,20);
		panel.add(userTF);
		
		genderLabel = new JLabel("Gender:");
		genderLabel.setBounds(75,220,115,20);
		panel.add(genderLabel);
		
		r1 = new JRadioButton("Male");
		r1.setBounds(150,220,80,20);
		r1.setBackground(color1);
		panel.add(r1);
		
		r2 = new JRadioButton("Female");
		r2.setBounds(230,220,80,20);
		r2.setBackground(color1);
		panel.add(r2);
		
		r3 = new JRadioButton("Other");
		r3.setBounds(320,220,80,20);
		r3.setBackground(color1);
		panel.add(r3);
		
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
		
		
		programLabel = new JLabel("Department:");
		programLabel.setBounds(75,210,100,100);
		panel.add(programLabel);
		
		String items[] = {"CARDIOLOGY", "NEUROSURGERY", "ONCOLOGIST", "ORTHOPEDICS"};
		dept = new JComboBox(items);
		dept.setBounds(170,250,150,20);
		panel.add(dept);
		
		userLabel = new JLabel("Joining Date: ");
		userLabel.setBounds(75,240,100,100); 
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(170,280,150,20);
		panel.add(userTF);
		
		userLabel = new JLabel("Salary: ");
		userLabel.setBounds(75,270,100,100); 
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(170,310,150,20);
		panel.add(userTF);
		
		userLabel = new JLabel("Room NO: ");
		userLabel.setBounds(75,300,100,100); 
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(170,340,150,20);
		panel.add(userTF);
		
		userLabel = new JLabel("BM&DC REG: ");
		userLabel.setBounds(75,330,100,100); 
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(170,370,150,20);
		panel.add(userTF);
		
		
		add = new JButton("ADD");
		add.setBounds(500,470,100,40);
		add.setBackground(Color.GREEN);
		add.setForeground(Color.WHITE);
		add.setOpaque(true);
		add.addMouseListener(this);
		add.addActionListener(this);
		panel.add(add);
		
		back = new JButton("BACK");
		back.setBounds(620,470,100,40);
		back.setBackground(Color.RED);
		back.setForeground(Color.WHITE);
		back.setOpaque(true);
		back.addMouseListener(this);
		back.addActionListener(this);
		panel.add(back);
		
		img = new ImageIcon("images/emp-info.png");
		
		imgLabel = new JLabel(img);
		imgLabel.setBounds(485,100,300,300);
		
		panel.add(imgLabel);

		panel.setBackground(color1);
		this.add(panel);
	}
		
	public void mouseClicked(MouseEvent me){}
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
				
					JOptionPane.showMessageDialog(this, "Added doctor successfully");
					 DrMenu dm = new DrMenu();
					dm.setVisible(true);
					this.setVisible(false);
				}	
					
	}
	
	
}