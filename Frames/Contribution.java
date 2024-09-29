package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;

public class Contribution extends JFrame implements ActionListener{
	
	JLabel userLabel, passLabel, imgLabel;
	JButton bckBtn;
	Color color1;
	Font font1, font4;
	JPanel panel;
	ImageIcon img;
	
	public Contribution(){
		super("Contribution");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		color1= new Color(143,207,225);
		//color2= new Color(39,83,23);
		
	    font1 = new Font("Biome",Font.BOLD, 30);
		//font2 = new Font("Cascadia Code SemiBold",Font.PLAIN, 20);
        //font3 = new Font("Cascadia Mono SemiBold",Font.PLAIN, 15);
		font4 = new Font("Biome",Font.BOLD, 18);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		img = new ImageIcon("images/cont.png");
		
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,900,600);
		//imgLabel.setBounds(500,150,256,256);
		panel.add(imgLabel);
		
		bckBtn = new JButton("Back");
		bckBtn.setBounds(400,520,80,20);
		//lgtBtn.addMouseListener(this);
		bckBtn.addActionListener(this);
		panel.add(bckBtn);
		
		panel.setBackground(color1);
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if (ae.getSource() == bckBtn) {
			Menu me = new Menu();
			me.setVisible(true);
			this.setVisible(false);
        }
	}
	
}
