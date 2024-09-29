package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;

public class DrLogin extends JFrame implements MouseListener, ActionListener{
	
	JLabel nameLabel,lgnLabel,userLabel,passLabel,imgLabel;
	JTextField userTF;
	JPasswordField passTF;
	JButton lgnBtn, exitBtn;
	JPanel panel;
	Font font1,font2,font3;
	Color color1, color2;
	ImageIcon img, icon;
	RegDoctorList rdl;
	
	
	public DrLogin(RegDoctorList rdl){
		super("HealthMate - Doctor Login");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		icon = new ImageIcon("emp-info.png");
		this.setIconImage(icon.getImage());
		this.rdl = rdl;
		
		font1 = new Font("Biome",Font.BOLD, 23);
		font2 = new Font("Biome",Font.BOLD, 20);
		font3 = new Font("Biome",Font.PLAIN, 14);
		
		color1= new Color(143,207,225);
		color2 = new Color(118,235,65);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		nameLabel = new JLabel("HealthMate");
		nameLabel.setBounds(388,180,250,40);
		nameLabel.setFont(font1);
		panel.add(nameLabel);
		
		lgnLabel = new JLabel("Doctor Login");
		lgnLabel.setBounds(388,255,160,30);
		lgnLabel.setFont(font2);
		panel.add(lgnLabel);
		
		
		userLabel = new JLabel("Username: ");
		userLabel.setBounds(312,325,90,20);
		userLabel.setFont(font3);
		panel.add(userLabel);
		
		
		passLabel = new JLabel("Password: ");
		passLabel.setBounds(312,360,90,20);
		passLabel.setFont(font3);
		panel.add(passLabel);
		
		
		userTF = new JTextField();
		userTF.setBounds(388,326,150,20);
		
		panel.add(userTF);
		
		
		passTF = new JPasswordField();
		passTF.setBounds(388,360,150,20);
		
		panel.add(passTF);
		
		
		lgnBtn = new JButton("Login");
		lgnBtn.setBounds(343,415,70,30);
		lgnBtn.setBackground(Color.BLACK);
		lgnBtn.setForeground(Color.WHITE);
		lgnBtn.addMouseListener(this);
		lgnBtn.addActionListener(this);
		panel.add(lgnBtn);
		
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(448,415,70,30);
		exitBtn.setBackground(Color.BLACK);
		exitBtn.setForeground(Color.WHITE);
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		img = new ImageIcon("images/x.jpg");
		
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,900,600);
		//imgLabel.setBounds(500,150,256,256);
		panel.add(imgLabel);
		
		
		
		panel.setBackground(color1);
		this.add(panel);
		
		
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource () == lgnBtn){
			lgnBtn.setBackground(Color.RED);
			lgnBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource () == exitBtn){
			exitBtn.setBackground(Color.GREEN);
			exitBtn.setForeground(Color.BLACK);
		}
	    
	 
		if(me.getSource () == lgnBtn){
			lgnBtn.setBackground(color2);
			lgnBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource () == exitBtn){
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
		}
		 
	}
	 
	public void mouseExited(MouseEvent me){
		if(me.getSource () == lgnBtn){
			lgnBtn.setBackground(Color.RED);
			lgnBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource () == exitBtn){
			exitBtn.setBackground(Color.GREEN);
			exitBtn.setForeground(Color.BLACK);
		}
	    
	 
		if(me.getSource () == lgnBtn){
			lgnBtn.setBackground(Color.BLACK);
			lgnBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource () == exitBtn){
			exitBtn.setBackground(Color.BLACK);
			exitBtn.setForeground(Color.WHITE);
		}
		
		
	}
		
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
			
			if(ae.getSource() == exitBtn){
			System.exit(0);
			}
			else if(lgnBtn.getText().equals(command));{
			String name = userTF.getText();
			String pass = passTF.getText();
			
			if(!name.isEmpty() && !pass.isEmpty()){
				
				int index = rdl.doctorExists(name);
				if(index == -1){
					JOptionPane.showMessageDialog(this, "There is no doctor in this name!");
				}else{
					Doctor d = rdl.checkPassword(index, pass);
					if( d == null){
						JOptionPane.showMessageDialog(this, "The password is not correct!");
					}else{
						DrDashboard me = new DrDashboard(d, rdl);
						me.setVisible(true);
						this.setVisible(false);
					}
				}
				
			} else{
				JOptionPane.showMessageDialog(this, "You can not leave username/password field empty!");
			}
			
		}	
		
		
	}
	
}