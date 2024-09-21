import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrMenu extends JFrame implements MouseListener,ActionListener{
	JLabel nameLabel, imgLabel, menuLabel;
	JButton addBtn, showBtn, delBtn, backBtn;
	Color color1, color2;
	ImageIcon img;
	Font font1, font2, font3;
	JPanel panel;
	public DrMenu(){
		super("AB Hospital");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		color1= new Color(143,207,225);
		color2= new Color(65,119,100);
		
		
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
		
		menuLabel = new JLabel("DOCTOR SECTION");
		menuLabel.setBounds(115,140,175,40);
		menuLabel.setBackground(Color.RED);
		menuLabel.setForeground(Color.BLACK); 
		menuLabel.setFont(font3);
		panel.add(menuLabel);
		
		addBtn = new JButton("ADD NEW DOCTOR");
		addBtn.setBounds(100,210,175,40);
		addBtn.setBackground(Color.BLACK); 
		addBtn.setForeground(Color.WHITE);
		addBtn.addMouseListener(this);
		addBtn.addActionListener(this);
		panel.add(addBtn);
		
		delBtn = new JButton("REMOVE DOCTOR");
		delBtn.setBounds(100,270,175,40);
		delBtn.setBackground(Color.BLACK);
		delBtn.setForeground(Color.WHITE);
		delBtn.addMouseListener(this);
		delBtn.addActionListener(this);
		panel.add(delBtn);
		
		showBtn = new JButton("SHOW DOCTOR INFO");
		showBtn.setBounds(100,330,175,40);
		showBtn.setBackground(Color.BLACK);
		showBtn.setForeground(Color.WHITE);
		showBtn.addMouseListener(this);
		showBtn.addActionListener(this);
		panel.add(showBtn);
		
		backBtn = new JButton("BACK");
		backBtn.setBounds(575,450,120,40);
		backBtn.setBackground(Color.BLACK);
		backBtn.setForeground(Color.WHITE);
		backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		
		img = new ImageIcon("images/empmenu.png");
		
		imgLabel = new JLabel(img);
		imgLabel.setBounds(485,120,300,300);
		panel.add(imgLabel);
		
		panel.setBackground(color1);
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == addBtn){
			addBtn.setBackground(color2);
			addBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == delBtn){
			delBtn.setBackground(color2);
			delBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == showBtn){
			showBtn.setBackground(color2);
			showBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == backBtn){
			backBtn.setBackground(Color.RED);
			backBtn.setForeground(Color.WHITE);
		}
	}
	
	public void mouseExited(MouseEvent me){
		if(me.getSource() == addBtn){
			addBtn.setBackground(Color.BLACK);
			addBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == delBtn){
			delBtn.setBackground(Color.BLACK);
			delBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == showBtn){
			showBtn.setBackground(Color.BLACK);
			showBtn.setForeground(Color.WHITE);
		}  else if(me.getSource() == delBtn){
			delBtn.setBackground(Color.BLACK);
			delBtn.setForeground(Color.WHITE);
		} else if(me.getSource() == backBtn){
			backBtn.setBackground(Color.BLACK);
			backBtn.setForeground(Color.WHITE);
		}
	}
	
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if (ae.getSource() == addBtn) {
			AddDoctor ad = new AddDoctor();
			ad.setVisible(true);
			this.setVisible(false);
        } else if (ae.getSource() == delBtn) {
			DoctorInfo di = new DoctorInfo();
			di.setVisible(true);
			this.setVisible(false);
        } else if (ae.getSource() == showBtn) {
			DoctorList dl = new DoctorList();
			dl.setVisible(true);
			this.setVisible(false);
		}else if (ae.getSource() == backBtn) {
			
			Menu me = new Menu();
			me.setVisible(true);
			this.setVisible(false);
		}
	
	}
}