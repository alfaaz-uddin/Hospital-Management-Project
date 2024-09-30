package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;


public class PtDischarge extends JFrame  implements  ActionListener  {
	
	JLabel nameLabel,pdLabel,ptnLabel,roomLabel,adLabel,billLabel,imgLabel, srchLabel;
	JTextField ptnTF, roomTF,addTF,billTF,srchTF,ptTF;
	
	JButton disBtn, bckBtn,  srchBtn;
	JComboBox ptns;
	Font font1,font2,font3,font4,font5;
	Color color1;
	ImageIcon img,icon;
	JPanel panel;
	/*Patient p;
	PList  pl;*/
	public PtDischarge(){
		super("HealthMate");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		icon = new ImageIcon("images/icon.png");
		this.setIconImage(icon.getImage());
		/*this.pl = pl;
		this.pl = pl;*/
		
	
		font1 = new Font("Biome",Font.BOLD, 30);
		font2 = new Font("Biome",Font.BOLD, 18);
		font3 = new Font("Biome",Font.BOLD, 14);
		font4 = new Font("Bookman Old Style", Font.BOLD, 15);
		font5 = new Font("ADLaM Display",Font.ITALIC, 16);

		color1= new Color(143,207,225);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		nameLabel = new JLabel("HealthMate");
		nameLabel.setBounds(350,30,250,40);
		nameLabel.setFont(font1);
		panel.add(nameLabel);
		
		pdLabel = new JLabel("Patient Discharge");
		pdLabel.setBounds(186,100,180,30);
		pdLabel.setFont(font2);
		panel.add(pdLabel);
		
		
		
		srchLabel = new JLabel("Search by Name: ");
		srchLabel.setBounds(100,170,170,20);
		srchLabel.setFont(font4);
		panel.add(srchLabel);
		
		srchBtn = new JButton (icon);
		
		srchTF = new JTextField();
		srchTF.setBounds(233,172,145,20);
		panel.add(srchTF); 
		
		
		
		ptnLabel = new JLabel("Patient Name : ");
		ptnLabel.setBounds(100,225,120,20);
		ptnLabel.setFont(font3);
		panel.add(ptnLabel);
		
		//String name[] = {"Jitu", "Alfaz", "Shamim","Riyad" };
		
		ptTF = new JTextField();
		ptTF.setBounds(225,226,150,20);
		panel.add(ptTF);
		
		roomLabel = new JLabel("Room Number : ");
		roomLabel.setBounds(100,260,120,20);
		roomLabel.setFont(font3);
		panel.add(roomLabel);
		
		
		roomTF = new JTextField();
		roomTF.setBounds(225,260,150,20);
		panel.add(roomTF);
		
		adLabel = new JLabel("Released by : ");
		adLabel.setBounds(100,295,120,20);
		adLabel.setFont(font3);
		panel.add(adLabel);
		
		
		addTF = new JTextField();
		addTF.setBounds(225,295,150,20);
		panel.add(addTF); 
		
		
		billLabel = new JLabel("Bill : ");
		billLabel.setBounds(100,330,120,20);
		billLabel.setFont(font3);
		panel.add(billLabel);
		
		
		billTF = new JTextField();
		billTF.setBounds(225,330,150,20);
		panel.add(billTF);
		
		
		srchBtn = new JButton("Search");
		srchBtn.setBounds(400,170,60,20);
		srchBtn.setFont(font5);
		srchBtn.setBorder(null);
		srchBtn.setBackground(color1);
		srchBtn.setForeground(Color.RED);
		srchBtn.addActionListener(this);
		panel.add(srchBtn);
		
		
		disBtn = new JButton(" ");
		disBtn.setBounds(140,400,100,30);
		disBtn.setBackground(Color.BLACK);
		disBtn.setForeground(Color.WHITE);
		disBtn.addActionListener(this);
		panel.add(disBtn);
		
		
		bckBtn = new JButton("Back");
		bckBtn.setBounds(260,400,100,30);
		bckBtn.setBackground(Color.BLACK);
		bckBtn.setForeground(Color.WHITE);
		bckBtn.addActionListener(this);
		panel.add(bckBtn);
		
		
		
		
		img = new ImageIcon("images/dis.png");
		
		
		imgLabel = new JLabel(img);
		imgLabel.setBounds(450,75,400,400);
		//imgLabel.setBounds(500,150,256,256);
		panel.add(imgLabel);
		
		
		panel.setBackground(color1);
		this.add(panel);
		
		
	}
	
	
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		
		if (ae.getSource() == bckBtn){
			Menu me = new Menu();
			me.setVisible(true);
			this.setVisible(false);	
				
		} 
			else if(srchBtn.getText().equals(command)){
			String name = srchTF.getText ();
			PList pl = new PList();
			if(!name.isEmpty()){
				int index = pl.searchPatient(name);
			if(index == -1){
				JOptionPane.showMessageDialog(this , "Patient does not exist !");
			}else {
				Patient p = pl.getPatient(index);
				//JOptionPane.showMessageDialog(this,"Patient Discharged Successfully");
				Discharge ptd = new Discharge(p, pl);
				ptd.setVisible(true);
				this.setVisible(false);
			   }
			}
			
		}
		if(disBtn.getText().equals(command));{
			
		
		} 
	
   }
}