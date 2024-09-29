package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;

public class Login extends JFrame implements MouseListener, ActionListener{
	
	JLabel nameLabel,lgnLabel,userLabel,passLabel,imgLabel,signUpLabel;
	JTextField userTF;
	JPasswordField passTF;
	JButton lgnBtn, exitBtn,signUpBtn,signInBtn,forgotBtn;
	JPanel panel;
	Font font1,font2,font3;
	Color color1, color2,color3;
	ImageIcon img,icon;
	
	
	public Login(){
		super("HealthMate - Admin Login");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		icon = new ImageIcon("images/icon.png");
		this.setIconImage(icon.getImage());
		
		font1 = new Font("Biome",Font.BOLD, 23);
		font2 = new Font("Biome",Font.BOLD, 20);
		font3 = new Font("Biome",Font.PLAIN, 14);
		
		color1= new Color(143,207,225);
		color2 = new Color(118,235,65);
		color3 = new Color(242,242,242);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		nameLabel = new JLabel("HealthMate");
		nameLabel.setBounds(390,180,250,40);
		nameLabel.setFont(font1);
		panel.add(nameLabel);
		
		lgnLabel = new JLabel("User Login");
		lgnLabel.setBounds(399,255,120,30);
		lgnLabel.setFont(font2);
		panel.add(lgnLabel);
		
		
		userLabel = new JLabel("Username: ");
		userLabel.setBounds(307,319,90,20);
		userLabel.setFont(font3);
		panel.add(userLabel);
		
		
		passLabel = new JLabel("Password: ");
		passLabel.setBounds(307,351,90,20);
		passLabel.setFont(font3);
		panel.add(passLabel);
		
		
		userTF = new JTextField();
		userTF.setBounds(388,319,150,20);
		
		panel.add(userTF);
		
		
		passTF = new JPasswordField();
		passTF.setBounds(388,351,150,20);
		
		panel.add(passTF);
		
		
		lgnBtn = new JButton("Login");
		lgnBtn.setBounds(345,399,70,30);
		lgnBtn.setBackground(Color.BLACK);
		lgnBtn.setForeground(Color.WHITE);
		lgnBtn.setForeground(Color.WHITE);
		lgnBtn.addMouseListener(this);
		lgnBtn.addActionListener(this);
		panel.add(lgnBtn);
		
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(465,399,70,30);
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
		
		
	
		signInBtn = new JButton("Log in as Doctor 🔓️");
		signInBtn.setBounds(384,439,130,30);
		signInBtn.setBackground(color3);
		signInBtn.setForeground(Color.BLACK);
		
		//signUpBtn.addMouseListener(this);
		signInBtn.addActionListener(this);
		signInBtn.setBorder(null);
		panel.add(signInBtn);
		
		
		signUpBtn = new JButton("Register as a Doctor");
		signUpBtn.setBounds(378,459,130,30);
		signUpBtn.setBackground(color3);
		signUpBtn.setForeground(Color.BLACK);
		
		signUpBtn.addMouseListener(this);
		signUpBtn.addActionListener(this);
		signUpBtn.setBorder(null);
		panel.add(signUpBtn);
		
		
		
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
		if(lgnBtn.getText().equals(command));{
			/*PtDischarge menu = new PtDischarge();
			menu.setVisible(true);
			this.setVisible(false);*/
			if(lgnBtn.getText().equals(command)){
			String name = userTF.getText();
			String pass = passTF.getText();
			if(name.isEmpty() || pass.isEmpty()){
				JOptionPane.showMessageDialog(this, "Username/password required!");
			}else{
				if((name.equals("admin") && pass.equals("admin")) || (name.equals("admin-1") && pass.equals("admin-1"))){
					//JOptionPane.showMessageDialog(this, "Login Successful!");
					Menu me = new Menu();
					me.setVisible(true);
					this.setVisible(false);
				}else{
					JOptionPane.showMessageDialog(this, "Username/password doesn't match!");
				  }
			    }
			
		      }
		    }
				if(ae.getSource() == signUpBtn) {
					RegDoctorList rdl = new RegDoctorList();
					AddDoctor ad = new AddDoctor(rdl);
					ad.setVisible(true);
					this.setVisible(false);
				}
   		else if(ae.getSource() == signInBtn) {
					RegDoctorList rdl = new RegDoctorList();
					DrLogin dln = new DrLogin(rdl);
					dln.setVisible(true);
					this.setVisible(false);
			    }
				else if(ae.getSource() == exitBtn){
				System.exit(0);
				}
		}
}