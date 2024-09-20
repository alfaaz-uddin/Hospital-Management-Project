import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddPatient extends JFrame implements MouseListener, ActionListener{
	JLabel  hosLabel, pafLabel, pnLabel, mbLabel, genLabel, ageLabel, addLabel, refLabel, appLabel, roomLabel, disLabel, depLabel, imgLabel;
	JTextField pnTF, mbTF, addTF, refTF, ageTF, disTF, depTF;
	JRadioButton a1, a2, a3;
	JButton addBtn, bckBtn;
	ButtonGroup gBtn;
	JComboBox b1, b2;
	Color c1,c2,c3;
	ImageIcon img;
	Font f1, f2;
	JPanel panel;
		
	public AddPatient(){
		super("AB Hospital");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		c1 = new Color(143,207,225);
		c2 = new Color(4,196,95);
		f1 = new Font("Georgia", Font.BOLD, 30);
		f2 = new Font("Georgia", Font.BOLD, 18);
			
		panel = new JPanel();
		panel.setLayout(null);
		
			
			
			
		hosLabel = new JLabel("AB Hospital");
		hosLabel.setBounds(300,30,600,50);
		hosLabel.setFont(f1);
		panel.add(hosLabel);
			
			
		pafLabel = new JLabel("Patient Admission Form");
		pafLabel.setBounds(125,60,400,50);
		pafLabel.setFont(f2);
		panel.add(pafLabel);
			 
		pnLabel = new JLabel("Patient Name :");
		pnLabel.setBounds(75,120,90,20);
			panel.add(pnLabel);
			
		pnTF = new JTextField();
		pnTF.setBounds(170,121,200,20);
		panel.add(pnTF);
			
		mbLabel = new JLabel("Mobile Number :");
		mbLabel.setBounds(75,160,110,20);
		panel.add(mbLabel);
			
		mbTF = new JTextField();
		mbTF.setBounds(170,160,200,20);
		panel.add(mbTF);
			
		genLabel = new JLabel("Gender :");
		genLabel.setBounds(75,190,80,20);
		panel.add(genLabel);
			
		a1 = new JRadioButton("Male");
		a1.setBounds(165,192,60,20);
		a1.setBackground(c1);
		panel.add(a1);
			
		a2 = new JRadioButton("Female");
		a2.setBounds(235,192,80,20);
		a2.setBackground(c1);
		panel.add(a2);
			
		a3 = new JRadioButton("Other");
		a3.setBounds(310,192,80,20);
		a3.setBackground(c1);
		panel.add(a3);
			
		gBtn = new ButtonGroup();
		gBtn.add(a1);
		gBtn.add(a2);
		gBtn.add(a3);
			
		ageLabel = new JLabel("Age :");
		ageLabel.setBounds(75,220,90,20);
		panel.add(ageLabel);
			
		ageTF = new JTextField();
		ageTF.setBounds(172,220,93,20);
		panel.add(ageTF);
			
		addLabel = new JLabel("Address :");
		addLabel.setBounds(75,250,90,20);
		panel.add(addLabel);
			
		addTF = new JTextField();
		addTF.setBounds(172,250,200,20);
		panel.add(addTF);
			
			
		
			
		appLabel = new JLabel("Appointed Dr. :");
		appLabel.setBounds(75,280,90,20);
		panel.add(appLabel);
			
		String dr[] = {"Choose a Doctor", "Dr.Shamim.", "Dr.Alfaz", "Dr.Kazi" };
		 b1 = new JComboBox(dr);
		 b1.setBounds(175,280,90,20);
		panel.add(b1);
			
			
		roomLabel = new JLabel("Allocated Room:");
		roomLabel.setBounds(75,310,100,20);
		panel.add(roomLabel);
			
		String rm[] = {"101", "102", "103", "104", "105",};
		 b2 = new JComboBox(rm);
		 b2.setBounds(175,310,90,20);
		panel.add(b2);
			
		disLabel = new JLabel("Diagnosis :");
		disLabel.setBounds(75,360,90,20);
		panel.add(disLabel);
			
		disTF = new JTextField();
		disTF.setBounds(172,360,200,20);
		panel.add(disTF);
			
		depLabel = new JLabel("Deposite :");
		depLabel.setBounds(75,390,90,20);
		panel.add(depLabel);
			
		depTF = new JTextField();
		depTF.setBounds(172,390,200,20);
		panel.add(depTF);
			
		addBtn = new JButton("ADD");
		addBtn.setBounds(530,450,90,40);
		addBtn.setBackground(Color.BLACK);
		addBtn.setForeground(Color.WHITE);
		addBtn.addMouseListener(this);
		addBtn.addActionListener(this);
		panel.add(addBtn);
			
		bckBtn = new JButton("BACK");
		bckBtn.setBounds(635,450,90,40);
		bckBtn.setBackground(Color.BLACK);
		bckBtn.setForeground(Color.WHITE);
		bckBtn.addMouseListener(this);
		bckBtn.addActionListener(this);
		panel.add(bckBtn);
			
		img = new ImageIcon("images/patient.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(450,100,300,300);
		panel.add(imgLabel);
			
			
		
		panel.setBackground(c1);
		this.add(panel);
	} 
		
		
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource () == addBtn){
			addBtn.setBackground(Color.RED);
			addBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource () == bckBtn){
			bckBtn.setBackground(Color.GREEN);
			bckBtn.setForeground(Color.BLACK);
		}
	    
		if(me.getSource () == addBtn){
			addBtn.setBackground(c2);
			addBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource () == bckBtn){
			bckBtn.setBackground(Color.RED);
			bckBtn.setForeground(Color.WHITE);
		}
		 
	}
	 
	public void mouseExited(MouseEvent me){
		if(me.getSource () == addBtn){
			addBtn.setBackground(Color.RED);
			addBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource () == bckBtn){
			bckBtn.setBackground(Color.GREEN);
			bckBtn.setForeground(Color.BLACK);
		}
	    
	 
		if(me.getSource () == addBtn){
			addBtn.setBackground(Color.BLACK);
			addBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource () == bckBtn){
			bckBtn.setBackground(Color.BLACK);
			bckBtn.setForeground(Color.WHITE);
		}
		
		
	}
	
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		    if (ae.getSource() == addBtn) {
					JOptionPane.showMessageDialog(this, "Patient added succeassful");
					Menu menu = new Menu();
					menu.setVisible(true);
					this.setVisible(false);
            }
		
			else if (ae.getSource() == bckBtn){
				//JOptionPane.showMessageDialog(this, "Menu");
					Menu pin = new Menu();
					pin.setVisible(true);
					this.setVisible(false);		
			}

		
		
		
		
		
	}
}