import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PtDischarge extends JFrame implements ActionListener {
	
	JLabel nameLabel,pdLabel,ptnLabel,roomLabel,adLabel,billLabel,imgLabel;
	JTextField ptnTF, roomTF,addTF,billTF;
	
	JButton disBtn, exitBtn;
	JComboBox ptns;
	Font font1,font2,font3,font4;
	Color color1;
	ImageIcon img;
	JPanel panel;
	
	public PtDischarge(){
		super("HealthMate");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		font1 = new Font("Biome",Font.BOLD, 30);
		font2 = new Font("Biome",Font.BOLD, 18);
		font3 = new Font("Biome",Font.PLAIN, 13);
		
		font4 = new Font("Biome",Font.PLAIN, 13);

		color1= new Color(143,207,225);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		nameLabel = new JLabel("HealthMate");
		nameLabel.setBounds(380,30,250,40);
		nameLabel.setFont(font1);
		panel.add(nameLabel);
		
		pdLabel = new JLabel("Patient Discharge");
		pdLabel.setBounds(186,125,180,30);
		pdLabel.setFont(font2);
		panel.add(pdLabel);
		
		
		ptnLabel = new JLabel("Patient Name: ");
		ptnLabel.setBounds(100,175,150,20);
		ptnLabel.setFont(font4);
		panel.add(ptnLabel);
		
		String name[] = {"Jitu", "Alfaz", "Shamim","Riyad" };
		
		ptns = new JComboBox(name);
		ptns.setBounds(225,176,150,20);
		panel.add(ptns);
		
		roomLabel = new JLabel("Room Number: ");
		roomLabel.setBounds(100,210,120,20);
		roomLabel.setFont(font4);
		panel.add(roomLabel);
		
		
		roomTF = new JTextField();
		roomTF.setBounds(225,210,150,20);
		panel.add(roomTF);
		
		adLabel = new JLabel("Admission Date: ");
		adLabel.setBounds(100,245,150,20);
		roomLabel.setFont(font3);
		panel.add(adLabel);
		
		
		addTF = new JTextField();
		addTF.setBounds(225,245,150,20);
		panel.add(addTF); 
		
		
		billLabel = new JLabel("Bill: ");
		billLabel.setBounds(100,280,150,20);
		roomLabel.setFont(font3);
		panel.add(billLabel);
		
		
		roomTF = new JTextField();
		roomTF.setBounds(225,280,150,20);
		panel.add(roomTF);
		
		
		disBtn = new JButton("Discharge");
		disBtn.setBounds(140,350,100,30);
		disBtn.setBackground(Color.BLACK);
		disBtn.setForeground(Color.WHITE);
		//disBtn.addMouseListener(this);
		disBtn.addActionListener(this);
		panel.add(disBtn);
		
		
		exitBtn = new JButton("Back");
		exitBtn.setBounds(260,350,100,30);
		exitBtn.setBackground(Color.BLACK);
		exitBtn.setForeground(Color.WHITE);
		//exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		
		
		
		img = new ImageIcon("dis.png");
		
		imgLabel = new JLabel(img);
		imgLabel.setBounds(450,75,400,400);
		//imgLabel.setBounds(500,150,256,256);
		panel.add(imgLabel);
		
		
		panel.setBackground(color1);
		this.add(panel);
		
		
	}
	
	
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if(disBtn.getText().equals(command));{
			Menu menu = new Menu();
			menu.setVisible(true);
			this.setVisible(false);
			
		}	
		if (ae.getSource() == exitBtn){
			//JOptionPane.showMessageDialog(this, "The Patient has been discharged successfully");
			Menu menu = new Menu();
			menu.setVisible(true);
			this.setVisible(false);	
				
		}
	}
}