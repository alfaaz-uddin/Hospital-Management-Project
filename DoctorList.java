import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DoctorList extends JFrame{
	
	JLabel userLabel, passLabel;
	//JTextField userTF;
	//JPasswordField passTF;
	//JButton lgnBtn;
	Color color1;
	Font font1, font4;
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
		
		userLabel = new JLabel("AB Hospital ");
		userLabel.setBounds(350,10,400,100); //x,y,width,length
		userLabel.setFont(font1);
		panel.add(userLabel);
		
		userLabel = new JLabel("Doctor List ");
		userLabel.setBounds(130,80,400,50);
        userLabel.setFont(font4);		//x,y,width,length
		panel.add(userLabel);
		
		
		panel.setBackground(color1);
		this.add(panel);
	}
	
}
