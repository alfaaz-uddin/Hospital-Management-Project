package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;

public class Menu extends JFrame implements MouseListener,ActionListener{
	JLabel nameLabel, titleLabel, imgLabel, userLabel, sumLabel, tAddLabel, tDisLabel, tDrLabel;
	JButton npBtn, dpBtn, pInfoBtn, pUpBtn, drInfoBtn, lgtBtn, contBtn;
	Color color1, color2;
	ImageIcon img, icon;
	Font font1, font2, font3;
	JPanel panel;
	
	public Menu(){
		super("HealthMate");
		this.setSize(900,600);
		icon = new ImageIcon("images/icon.png");
		this.setIconImage(icon.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); 
		
		color1= new Color(143,207,225);
		color2 = new Color(65,119,100);//(4,196,95);
		/*this.setBackground(color1);*/
		
		font1 = new Font("Biome",Font.BOLD, 30);
		font2 = new Font("Cascadia Code SemiBold",Font.PLAIN, 20);
		font3 = new Font("Times New Roman",Font.PLAIN, 15);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		nameLabel = new JLabel("HealthMate");
		nameLabel.setBounds(380,25,250,50);
		nameLabel.setFont(font1);
		panel.add(nameLabel);
		
		npBtn = new JButton("ADD NEW PATIENT");
		npBtn.setBounds(100,120,175,40);
		npBtn.setBackground(Color.BLACK);
		npBtn.setForeground(Color.WHITE);
		npBtn.addMouseListener(this);
		npBtn.addActionListener(this);
		panel.add(npBtn);
		
		dpBtn = new JButton("DISCHARGE PATIENT");
		dpBtn.setBounds(100,170,175,40);
		dpBtn.setBackground(Color.BLACK);
		dpBtn.setForeground(Color.WHITE);
		dpBtn.addMouseListener(this);
		dpBtn.addActionListener(this);
		panel.add(dpBtn);
		
		pInfoBtn = new JButton("ALL PATIENT INFO");
		pInfoBtn.setBounds(100,220,175,40);
		pInfoBtn.setBackground(Color.BLACK);
		pInfoBtn.setForeground(Color.WHITE);
		pInfoBtn.addMouseListener(this);
		pInfoBtn.addActionListener(this);
		panel.add(pInfoBtn);
		
		pUpBtn = new JButton("UPDATE PATIENT");
		pUpBtn.setBounds(100,270,175,40);
		pUpBtn.setBackground(Color.BLACK);
		pUpBtn.setForeground(Color.WHITE);
		pUpBtn.addMouseListener(this);
		pUpBtn.addActionListener(this);
		panel.add(pUpBtn);
		
		drInfoBtn = new JButton("DOCTOR INFO");
		drInfoBtn.setBounds(100,320,175,40);
		drInfoBtn.setBackground(Color.BLACK);
		drInfoBtn.setForeground(Color.WHITE);
		drInfoBtn.addMouseListener(this);
		drInfoBtn.addActionListener(this);
		panel.add(drInfoBtn);
		
		lgtBtn = new JButton("LOGOUT");
		lgtBtn.setBounds(100,380,175,40);
		lgtBtn.setBackground(Color.BLACK);
		lgtBtn.setForeground(Color.WHITE);
		lgtBtn.addMouseListener(this);
		lgtBtn.addActionListener(this);
		panel.add(lgtBtn);
		
		contBtn = new JButton("Contribution");
		contBtn.setBounds(750,500,100,20);
		contBtn.setBackground(color1);
		contBtn.setBorder(null);
		contBtn.addMouseListener(this);
		contBtn.addActionListener(this);
		panel.add(contBtn);
		
		img = new ImageIcon("images/menu.png");
		
		imgLabel = new JLabel(img);
		//imgLabel.setBounds(500,150,256,256);
		imgLabel.setBounds(500,150,256,256);
		panel.add(imgLabel);
		
		titleLabel = new JLabel("“Health is not valued till sickness comes”");
		titleLabel.setBounds(270,460,400,40);
		titleLabel.setFont(font2);
		panel.add(titleLabel);
		panel.add(titleLabel);
		
		userLabel = new JLabel("Welcome back, admin");
		userLabel.setBounds(700,90,130,40);
		panel.add(userLabel);
		
		
		
		panel.setBackground(color1);
		this.add(panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == npBtn){
			npBtn.setBackground(color2);
			npBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == lgtBtn){
			lgtBtn.setBackground(Color.RED);
			lgtBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == dpBtn){
			dpBtn.setBackground(color2);
			dpBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == pInfoBtn){
			pInfoBtn.setBackground(color2);
			pInfoBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == pUpBtn){
			pUpBtn.setBackground(color2);
			pUpBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == drInfoBtn){
			drInfoBtn.setBackground(color2);
			drInfoBtn.setForeground(Color.WHITE);
		} 
	}
	
	public void mouseExited(MouseEvent me){
		if(me.getSource() == npBtn){
			npBtn.setBackground(Color.BLACK);
			npBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == lgtBtn){
			lgtBtn.setBackground(Color.BLACK);
			lgtBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == dpBtn){
			dpBtn.setBackground(Color.BLACK);
			dpBtn.setForeground(Color.WHITE);
		}  else if(me.getSource() == pInfoBtn){
			pInfoBtn.setBackground(Color.BLACK);
			pInfoBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == pUpBtn){
			pUpBtn.setBackground(Color.BLACK);
			pUpBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == drInfoBtn){
			drInfoBtn.setBackground(Color.BLACK);
			drInfoBtn.setForeground(Color.WHITE);
		}
	}
	
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if (ae.getSource() == npBtn) {
			PList pl = new PList();
			AddPatient ap = new AddPatient(pl);
			ap.setVisible(true);
			this.setVisible(false);
        } else if (ae.getSource() == dpBtn) {
			PtDischarge pd = new PtDischarge();
			pd.setVisible(true);
			this.setVisible(false);
        } else if (ae.getSource() == pUpBtn) {
			UpPatient up = new UpPatient();
			up.setVisible(true);
			this.setVisible(false);
		}else if (ae.getSource() == pInfoBtn) {
			PInfo pi = new PInfo();
			pi.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == drInfoBtn) {
			DoctorList dl = new DoctorList();
			dl.setVisible(true);
			this.setVisible(false);
		} else if (ae.getSource() == contBtn) {
			Contribution co = new Contribution();
			co.setVisible(true);
			this.setVisible(false);
		} else if (ae.getSource() == lgtBtn) {
			int dialog = JOptionPane.YES_NO_OPTION;
			int result = JOptionPane.showConfirmDialog(this, "Are you sure to Logout?", "Logout", dialog);
			if(result == 0){
				JOptionPane.showMessageDialog(this, "Logout Successful!");
				Login li = new Login();
				li.setVisible(true);
				this.setVisible(false);
			} else{
				//kicu hbe na
			}
					
		}
	}
		
} 