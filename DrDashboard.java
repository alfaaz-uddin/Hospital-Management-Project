import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrDashboard extends JFrame implements ActionListener{
	
	JLabel userLabel, drLabel, dptLabel, imgLabel, ptListLabel;
	//JTextField userTF;
	//JPasswordField passTF;
	JButton exitBtn;
	Color color1;
	Font font1, font4;
	ImageIcon img;
	JPanel panel;
	
	public DrDashboard(Doctor d, RegDoctorList rdl){
		super("HealthMate");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		img = new ImageIcon("emp-info.png");
		this.setIconImage(img.getImage());
		
		
		color1= new Color(143,207,225);
		//color2= new Color(39,83,23);
		
	    font1 = new Font("Biome",Font.BOLD, 30);
		//font2 = new Font("Cascadia Code SemiBold",Font.PLAIN, 20);
        //font3 = new Font("Cascadia Mono SemiBold",Font.PLAIN, 15);
		font4 = new Font("Biome",Font.BOLD, 18);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userLabel = new JLabel("HealthMate");
		userLabel.setBounds(350,5,400,100); 
		userLabel.setFont(font1);
		panel.add(userLabel);
		
		userLabel = new JLabel("Doctor Dashboard");
		userLabel.setBounds(350,55,400,50);
        userLabel.setFont(font4);		
		panel.add(userLabel);
		
		ptListLabel = new JLabel("Your patient list: ");
		ptListLabel.setBounds(50,100,300,40);
		ptListLabel.setFont(font4);
		panel.add(ptListLabel);
		
		drLabel = new JLabel("Welcome back, Dr. "+d.getName());
		drLabel.setBounds(670,90,150,40);
		panel.add(drLabel);
		
		dptLabel = new JLabel("Department of  "+d.getDepartment());
		dptLabel.setBounds(670,110,180,40);
		panel.add(dptLabel);
		
		exitBtn = new JButton("LOGOUT");
		exitBtn.setBounds(620,470,100,40);
		exitBtn.setBackground(Color.RED);
		exitBtn.setForeground(Color.WHITE);
		exitBtn.setOpaque(true);
		//exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		/*img = new ImageIcon("emp-info.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(485,100,300,300);
		panel.add(imgLabel);*/
		
		panel.setBackground(color1);
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae){
			if(ae.getSource() == exitBtn){
					Login lg = new Login();
					lg.setVisible(true);
					this.setVisible(false);
			}
			
		}
	/*public static void main(String []args){
		DrDashboard lg =  new DrDashboard(d, rdl);
		lg.setVisible(true);
	}*/
} 
