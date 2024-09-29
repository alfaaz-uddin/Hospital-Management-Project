import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DoctorList extends JFrame{
	
	JLabel userLabel, passLabel, imgLabel;
	//JTextField userTF;
	//JPasswordField passTF;
	JButton back;
	Color color1;
	Font font1, font4;
	ImageIcon img;
	JPanel panel;
	
	public DoctorList(){
		super("Doctor List");
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
		
		userLabel = new JLabel("HealthMate ");
		userLabel.setBounds(350,10,400,100); 
		userLabel.setFont(font1);
		panel.add(userLabel);
		
		userLabel = new JLabel("Doctor List ");
		userLabel.setBounds(130,80,400,50);
        userLabel.setFont(font4);		
		panel.add(userLabel);
		
		back = new JButton("BACK");
		back.setBounds(620,470,100,40);
		back.setBackground(Color.RED);
		back.setForeground(Color.WHITE);
		back.setOpaque(true);
		//back.addMouseListener(this);
		//back.addActionListener(this);
		panel.add(back);
		
		img = new ImageIcon("images/emp-info.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(485,100,300,300);
		panel.add(imgLabel);
		
		panel.setBackground(color1);
		this.add(panel);
	}
	
}
