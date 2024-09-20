import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PInfo extends JFrame implements MouseListener, ActionListener{
	JLabel  hosLabel, pinfoLabel, pnLabel, mbLabel, genLabel, ageLabel, addLabel, refLabel, appLabel, roomLabel, disLabel, depLabel, imgLabel;
	JRadioButton a1, a2, a3;
	JButton serBtn, bckBtn;
	ButtonGroup gBtn;
	JComboBox b1, b2;
	Color c1,c2,c3;
	ImageIcon img;
	Font f1, f2;
	JPanel panel;
		
	public PInfo(){
		super("AB Hospital Limited");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
			
		c1 = new Color(143,207,225);
		c2 = new Color(4,196,95);
		f1 = new Font("Georgia", Font.BOLD, 30);
		f2 = new Font("Georgia", Font.BOLD, 16);
			
		panel = new JPanel();
		panel.setLayout(null);
			
			
			
			
		hosLabel = new JLabel(" Hospital");
		hosLabel.setBounds(380,30,600,50);
		hosLabel.setFont(f1);
		panel.add(hosLabel);
			
			
		pinfoLabel = new JLabel("Patient Information ");
		pinfoLabel.setBounds(155,70,400,50);
		pinfoLabel.setFont(f2);
		panel.add(pinfoLabel);
			 
		pnLabel = new JLabel("Patient Name :");
		pnLabel.setBounds(75,140,90,20);
		panel.add(pnLabel);
			
	
			
		mbLabel = new JLabel("Mobile Number :");
		mbLabel.setBounds(75,180,110,20);
		panel.add(mbLabel);
			
		
			
		genLabel = new JLabel("Gender :");
		genLabel.setBounds(75,210,80,20);
		panel.add(genLabel);
				
		ageLabel = new JLabel("Age :");
		ageLabel.setBounds(75,240,90,20);
		panel.add(ageLabel);
			
		
			
		addLabel = new JLabel("Address :");
		addLabel.setBounds(75,270,90,20);
		panel.add(addLabel);
			
	
			
			
		refLabel = new JLabel("Refd.by :");
		refLabel.setBounds(75,300,90,20);
		panel.add(refLabel);
			
			
			
		appLabel = new JLabel("Appointed Dr. :");
		appLabel.setBounds(75,330,90,20);
		panel.add(appLabel);
			
		
			
			
		roomLabel = new JLabel("Allocated Room:");
		roomLabel.setBounds(75,380,100,20);
		panel.add(roomLabel);
			
			
			
		disLabel = new JLabel("Diagnosis :");
		disLabel.setBounds(75,410,90,20);
		panel.add(disLabel);
			
			
			
		depLabel = new JLabel("Deposite :");
		depLabel.setBounds(75,440,90,20);
		panel.add(depLabel);
			
			
			
		/*serBtn = new JButton("SEARCH");
		serBtn.setBounds(530,470,88,40);
		serBtn.setBackground(Color.BLACK);
		serBtn.setForeground(Color.WHITE);
		panel.add(serBtn);*/
			
		bckBtn = new JButton("BACK");
		bckBtn.setBounds(650,470,88,40);
		bckBtn.setBackground(Color.BLACK);
		bckBtn.setForeground(Color.WHITE);
		bckBtn.addMouseListener(this);
		bckBtn.addActionListener(this);
		panel.add(bckBtn);
			
		img = new ImageIcon("a.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(510,100,350,350);
		panel.add(imgLabel);
			
		panel.setBackground(c1);
			
			
		this.add(panel);
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		
		if(me.getSource () == bckBtn){
			bckBtn.setBackground(Color.GREEN);
			bckBtn.setForeground(Color.BLACK);
		}
	    
		if(me.getSource () == bckBtn){
			bckBtn.setBackground(Color.RED);
			bckBtn.setForeground(Color.BLACK);
		}
	}
	 
	public void mouseExited(MouseEvent me){
		
		if(me.getSource () == bckBtn){
			bckBtn.setBackground(Color.GREEN);
			bckBtn.setForeground(Color.BLACK);
		}
		
		if(me.getSource () == bckBtn){
			bckBtn.setBackground(Color.BLACK);
			bckBtn.setForeground(Color.WHITE);
		}
		
		
	}
		
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if((ae.getSource() == bckBtn));{
			Menu me = new Menu();
			me.setVisible(true);
			this.setVisible(false);
		}
			
		
	}
		
	
}
