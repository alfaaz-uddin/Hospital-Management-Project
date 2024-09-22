import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class UpPatient extends JFrame implements MouseListener, ActionListener{
	JLabel  hosLabel, upLabel, pnLabel, mbLabel, genLabel, ageLabel, addLabel, refLabel, appLabel, roomLabel, disLabel, depLabel, imgLabel;
	JTextField pnTF, mbTF, addTF, refTF, ageTF, disTF, depTF;
	JRadioButton a1, a2, a3;
	JButton upBtn, bckBtn;
	ButtonGroup gBtn;
	JComboBox b1, b2;
	Color c1,c2,c3;
	ImageIcon img;
	Font f1, f2;
	JPanel panel;
		
	public UpPatient(){
		super("HealthMate");
		this.setSize(900,600);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		c1 = new Color(143,207,225);
		c2 = new Color(118,235,65);
			
		f1 = new Font("Georgia", Font.BOLD, 30);
		f2 = new Font("Georgia", Font.BOLD, 16);
			
		panel = new JPanel();
		panel.setLayout(null);
			
			
			
			
		hosLabel = new JLabel("HealthMate");
		hosLabel.setBounds(380,30,600,50);
		hosLabel.setFont(f1);
		panel.add(hosLabel);
			
			
		upLabel = new JLabel("Update Patient Information ");
		upLabel.setBounds(155,70,400,50);
		upLabel.setFont(f2);
		panel.add(upLabel);
			 
		pnLabel = new JLabel("Patient Name :");
		pnLabel.setBounds(75,140,90,20);
		panel.add(pnLabel);
			
		pnTF = new JTextField();
		pnTF.setBounds(170,141,200,20);
		panel.add(pnTF);
			
		mbLabel = new JLabel("Mobile Number :");
		mbLabel.setBounds(75,180,110,20);
		panel.add(mbLabel);
			
		mbTF = new JTextField();
		mbTF.setBounds(170,180,200,20);
		panel.add(mbTF);
		
		genLabel = new JLabel("Gender :");
		genLabel.setBounds(75,210,80,20);
		panel.add(genLabel);
		
		a1 = new JRadioButton("Male");
		a1.setBounds(165,212,60,20);
		a1.setBackground(c1);
		panel.add(a1);
			
		a2 = new JRadioButton("Female");
		a2.setBounds(235,212,80,20);
		a2.setBackground(c1);
		panel.add(a2);
			
		a3 = new JRadioButton("Other");
		a3.setBounds(310,212,80,20);
		a3.setBackground(c1);
		panel.add(a3);
			
		gBtn = new ButtonGroup();
		gBtn.add(a1);
		gBtn.add(a2);
		gBtn.add(a3);
			
		ageLabel = new JLabel("Age :");
		ageLabel.setBounds(75,240,90,20);
		panel.add(ageLabel);
			
		ageTF = new JTextField();
		ageTF.setBounds(172,240,93,20);
		panel.add(ageTF);
			
		addLabel = new JLabel("Address :");
		addLabel.setBounds(75,270,90,20);
		panel.add(addLabel);
			
		addTF = new JTextField();
		addTF.setBounds(172,270,200,20);
		panel.add(addTF);
			
			
		refLabel = new JLabel("Refd.by :");
		refLabel.setBounds(75,300,90,20);
		panel.add(refLabel);
			
		refTF = new JTextField();
		refTF.setBounds(172,300,200,20);
		panel.add(refTF);
			
		appLabel = new JLabel("Appointed Dr. :");
		appLabel.setBounds(75,330,90,20);
		panel.add(appLabel);
			
		String dr[] = {"Dr.Shamim.", "Dr.Alfaz", "Dr.Kazi" };
		b1 = new JComboBox(dr);
		b1.setBounds(175,330,90,20);
		panel.add(b1);
			
			
		roomLabel = new JLabel("Allocated Room:");
		roomLabel.setBounds(75,380,100,20);
		panel.add(roomLabel);
			
		String rm[] = {"101", "102", "103", "104", "105",};
		b2 = new JComboBox(rm);
		b2.setBounds(175,380,90,20);
		panel.add(b2);
			
		disLabel = new JLabel("Diagnosis :");
		disLabel.setBounds(75,410,90,20);
		panel.add(disLabel);
			
		disTF = new JTextField();
		disTF.setBounds(172,410,200,20);
		panel.add(disTF);
			
		depLabel = new JLabel("Deposite :");
		depLabel.setBounds(75,440,90,20);
		panel.add(depLabel);
			
		depTF = new JTextField();
		depTF.setBounds(172,440,200,20);
		panel.add(depTF);
			
		upBtn = new JButton("UPDATE");
		upBtn.setBounds(530,470,88,40);
		upBtn.setBackground(Color.BLACK);
		upBtn.setForeground(Color.WHITE);
		upBtn.addMouseListener(this);
		upBtn.addActionListener(this);
		panel.add(upBtn);
			
		bckBtn = new JButton("BACK");
		bckBtn.setBounds(650,470,88,40);
		bckBtn.setBackground(Color.BLACK);
		bckBtn.setForeground(Color.WHITE);
		bckBtn.addMouseListener(this);
		bckBtn.addActionListener(this);
		panel.add(bckBtn);
			
		img = new ImageIcon("images/UpPatient.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(510,100,300,300);
		panel.add(imgLabel);
			
			
			
			
			
		panel.setBackground(c1);
			
			
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource () == upBtn){
			upBtn.setBackground(Color.RED);
			upBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource () == bckBtn){
			bckBtn.setBackground(Color.GREEN);
			bckBtn.setForeground(Color.BLACK);
		}
	    
	 
		if(me.getSource () == upBtn){
			upBtn.setBackground(c2);
			upBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource () == bckBtn){
			bckBtn.setBackground(Color.RED);
			bckBtn.setForeground(Color.BLACK);
		}
		 
	}
	 
	public void mouseExited(MouseEvent me){
		if(me.getSource () == upBtn){
			upBtn.setBackground(Color.RED);
			upBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource () == bckBtn){
			bckBtn.setBackground(Color.GREEN);
			bckBtn.setForeground(Color.BLACK);
		}
	    
	 
		if(me.getSource () == upBtn){
			upBtn.setBackground(Color.BLACK);
			upBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource () == bckBtn){
			bckBtn.setBackground(Color.BLACK);
			bckBtn.setForeground(Color.WHITE);
		}
		
		
	}
		
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if(upBtn.getText().equals(command));{
			Menu pi = new Menu();
			pi.setVisible(true);
			this.setVisible(false);
			
		}	
		 if (ae.getSource() == bckBtn){
			//JOptionPane.showMessageDialog(this, "Menu");
			Menu add = new Menu();
			add.setVisible(true);
			this.setVisible(false);	
				
			}
		
	}
		
		
}