package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;

public class Update extends JFrame implements MouseListener, ActionListener{
	JLabel  hosLabel, pafLabel,pIdLabel, pnLabel, mbLabel, genLabel, ageLabel, addLabel, refLabel, appLabel, roomLabel, disLabel, depLabel, imgLabel;
	JTextField pIdTF, pnTF, mbTF, addTF, refTF, ageTF, disTF, depTF;
	JRadioButton a1, a2, a3;
	JButton upBtn, bckBtn;
	ButtonGroup gBtn;
	JComboBox b1, b2;
	Color c1,c2,c3;
	ImageIcon img, icon;
	Font f1, f2;
	JPanel panel;
	Patient p;
	PList pl;
	
		
	public Update(Patient p, PList pl){
		super("HealthMate");
		this.setSize(900,600);
		icon = new ImageIcon("images/icon.png");
		this.setIconImage(icon.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pl = pl;
		this.p = p;
		
		c1 = new Color(143,207,225);
		c2 = new Color(4,196,95);
		f1 = new Font("Georgia", Font.BOLD, 30);
		f2 = new Font("Georgia", Font.BOLD, 18);
			
		panel = new JPanel();
		panel.setLayout(null);
		
			
			
			
		hosLabel = new JLabel("HealthMate");
		hosLabel.setBounds(300,30,600,50);
		hosLabel.setFont(f1);
		panel.add(hosLabel);
			
			
		pafLabel = new JLabel("Update Patient Information ");
		pafLabel.setBounds(125,60,400,50);
		pafLabel.setFont(f2);
		panel.add(pafLabel);
		
		
		pIdLabel = new JLabel("Patient ID :");
		pIdLabel.setBounds(75,120,90,20);
		panel.add(pIdLabel);
			
		pIdTF = new JTextField(p.getId());
		pIdTF.setBounds(170,121,200,20);
		panel.add(pIdTF);
			 
		pnLabel = new JLabel("Patient Name :");
		pnLabel.setBounds(75,150,90,20);
		panel.add(pnLabel);
			
		pnTF = new JTextField(p.getName());
		pnTF.setBounds(170,151,200,20);
		panel.add(pnTF);
			
		mbLabel = new JLabel("Mobile Number :");
		mbLabel.setBounds(75,190,110,20);
		panel.add(mbLabel);
			
		mbTF = new JTextField(p.getMobileNo());
		mbTF.setBounds(170,190,200,20);
		panel.add(mbTF);
			
		genLabel = new JLabel("Gender :");
		genLabel.setBounds(75,220,80,20);
		panel.add(genLabel);
			
		a1 = new JRadioButton("Male");
		a1.setBounds(165,222,60,20);
		a1.setBackground(c1);
		panel.add(a1);
			
		a2 = new JRadioButton("Female");
		a2.setBounds(235,222,80,20);
		a2.setBackground(c1);
		panel.add(a2);
			
		a3 = new JRadioButton("Other");
		a3.setBounds(310,222,80,20);
		a3.setBackground(c1);
		panel.add(a3);
			
		gBtn = new ButtonGroup();
		gBtn.add(a1);
		gBtn.add(a2);
		gBtn.add(a3);
			
		ageLabel = new JLabel("Age :");
		ageLabel.setBounds(75,250,90,20);
		panel.add(ageLabel);
			
		ageTF = new JTextField(p.getAge());
		ageTF.setBounds(172,250,93,20);
		panel.add(ageTF);
			
		addLabel = new JLabel("Address :");
		addLabel.setBounds(75,280,90,20);
		panel.add(addLabel);
			
		addTF = new JTextField(p.getAddress());
		addTF.setBounds(172,280,200,20);
		panel.add(addTF);
			
			
		
			
		appLabel = new JLabel("Appointed Dr. :");
		appLabel.setBounds(75,310,90,20);
		panel.add(appLabel);
			
		RegDoctorList rdl = new RegDoctorList();		
		String DrL[] = rdl.getDoctorNames();
		 b1 = new JComboBox(DrL);
		 b1.setBounds(175,310,200,20);
		panel.add(b1);
			
			
		roomLabel = new JLabel("Allocated Room:");
		roomLabel.setBounds(75,340,100,20);
		panel.add(roomLabel);
			
		String rm[] = {" ", "G-301", "G-302", "G-303", "G-304", "G-305","ICU-401", "ICU-402", "CCU-403", "CCU-404", "ICCU-501", "ICCU-502", "HDU-503","HDU-504"};
		 b2 = new JComboBox(rm);
		 b2.setBounds(175,340,90,20);
		panel.add(b2);
			
		disLabel = new JLabel("Diagnosis :");
		disLabel.setBounds(75,390,90,20);
		panel.add(disLabel);
			
		disTF = new JTextField(p.getDiagnosis());
		disTF.setBounds(172,390,200,20);
		panel.add(disTF);
			
		depLabel = new JLabel("Deposit :");
		depLabel.setBounds(75,420,90,20);
		panel.add(depLabel);
			
		depTF = new JTextField(p.getDeposit());
		depTF.setBounds(172,420,200,20);
		panel.add(depTF);
			
		upBtn = new JButton("UPDATE");
		upBtn.setBounds(530,450,90,40);
		upBtn.setBackground(Color.BLACK);
		upBtn.setForeground(Color.WHITE);
		upBtn.addMouseListener(this);
		upBtn.addActionListener(this);
		panel.add(upBtn);
			
		bckBtn = new JButton("BACK");
		bckBtn.setBounds(635,450,90,40);
		bckBtn.setBackground(Color.BLACK);
		bckBtn.setForeground(Color.WHITE);
		bckBtn.addMouseListener(this);
		bckBtn.addActionListener(this);
		panel.add(bckBtn);
			
		img = new ImageIcon("images/UpPatient.png");
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
			bckBtn.setForeground(Color.WHITE);
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
		 if (ae.getSource() == bckBtn){
					Menu me = new Menu();
					me.setVisible(true);
					this.setVisible(false);
			}
		  else if(upBtn.getText().equals(command));{
			String pId = pIdTF.getText();
			String PName = pnTF.getText();
			String Mobile = mbTF.getText();
			String age = ageTF.getText();
			String address = addTF.getText();
			String Diagnosis = disTF.getText();
			String deposit =  depTF.getText();
			
		
			String gender = "", room = "", appDoctor = "";
			if(a1.isSelected()){ gender = "Male"; }
			else if(a2.isSelected()){ gender = "Female"; }
			else if(a3.isSelected()){ gender = "Other"; }
			
			
			appDoctor = b1.getSelectedItem().toString();
			room = b2.getSelectedItem().toString();
			if(!pId.isEmpty() && !PName.isEmpty() && !Mobile.isEmpty() && !gender.isEmpty() && !age.isEmpty() 
			   && !address.isEmpty() && !appDoctor.isEmpty() && !room.isEmpty() && !Diagnosis.isEmpty() && !deposit.isEmpty()){
				int dialog = JOptionPane.YES_NO_OPTION;
				int result = JOptionPane.showConfirmDialog(this, "Are you sure to update patient informations?", "Patient update?", dialog);
				if(result == 0){
	
					String patientToUpdate = p.getId() + "\n" +
											 p.getName() + "\n" + 
										     p.getMobileNo() + "\n"+
										     p.getGender() + "\n" +
										     p.getAge() + "\n"+ 
										     p.getAddress() + "\n" + 
										     p.getAppointedDoctor() + "\n" +
										     p.getRoom() + "\n" + 
										     p.getDiagnosis() + "\n" + 
										     p.getDeposit() + "\n" ;
										 
					//p.setId(pId);
					System.out.println(PName + Mobile + age + gender + address + appDoctor+ room+Diagnosis + deposit);
					p.setName(PName);
					p.setMobileNo(Mobile);
					p.setAge(age);
					p.setGender(gender);
					p.setAddress(address);
					p.setAppointedDoctor(appDoctor);
					p.setRoom(room);
					p.setDiagnosis(Diagnosis);
					p.setDeposit(deposit);
					
					
					System.out.println("Patient to update: \n"+patientToUpdate+"\n");
					pl.updatePatient(patientToUpdate, p);
					
					System.out.println ("ck");

					result = JOptionPane.showConfirmDialog(this, "Information updated. Do you want to stay on this page?", "Stay on this page?", dialog);
					if(result == 0){
						//do nothing
					}else{
						Menu mu = new Menu();
						mu.setVisible(true);
						this.setVisible(false);
					}
				}else{
					//do nothing
				}
			}
			
		}/*else{
				JOptionPane.showMessageDialog(this, "Not all inptuts are given");
			}*/
		
		
	}
}