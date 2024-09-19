import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class EmpMenu extends JFrame{
	JLabel nameLabel, imgLabel, menuLabel;
	JButton menuBtn, addBtn, showBtn, delBtn, backBtn;
	Color color1, color2;
	ImageIcon img;
	Font font1, font2, font3;
	JPanel panel;
	public EmpMenu(){
		super("AB Hospital");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		color1= new Color(143,207,225);
		color2= new Color(39,83,23);
		
		
		font1 = new Font("Biome",Font.BOLD, 30);
		font2 = new Font("Cascadia Code SemiBold",Font.PLAIN, 20);
		font3 = new Font("Cascadia Mono SemiBold",Font.PLAIN, 15);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		nameLabel = new JLabel("AB Hospital");
		nameLabel.setBounds(350,50,250,50);
		nameLabel.setForeground(Color.BLACK);
		nameLabel.setFont(font1);
		panel.add(nameLabel);
		
		menuLabel = new JLabel("EMPLOYEE SECTION");
		menuLabel.setBounds(113,140,175,40);
		menuLabel.setBackground(Color.RED);
		menuLabel.setForeground(Color.BLACK); 
		menuLabel.setFont(font3);
		panel.add(menuLabel);
		
		addBtn = new JButton("ADD NEW EMPLOYEE");
		addBtn.setBounds(100,210,175,40);
		addBtn.setBackground(Color.BLACK); 
		addBtn.setForeground(Color.WHITE);
		panel.add(addBtn);
		
		showBtn = new JButton("SHOW EMPLOYEE INFO");
		showBtn.setBounds(100,270,175,40);
		showBtn.setBackground(Color.BLACK);
		showBtn.setForeground(Color.WHITE);
		panel.add(showBtn);
		
		delBtn = new JButton("REMOVE EMPLOYEE");
		delBtn.setBounds(100,330,175,40);
		delBtn.setBackground(Color.BLACK);
		delBtn.setForeground(Color.WHITE);
		panel.add(delBtn);
		
		backBtn = new JButton("BACK");
		backBtn.setBounds(570,450,120,40);
		backBtn.setBackground(Color.BLACK);
		backBtn.setForeground(Color.WHITE);
		panel.add(backBtn);
		
		
		img = new ImageIcon("empmenu.png");
		
		imgLabel = new JLabel(img);
		imgLabel.setBounds(485,120,300,300);
		panel.add(imgLabel);
		
		panel.setBackground(color1);
		this.add(panel);
	}
}