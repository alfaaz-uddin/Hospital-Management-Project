package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;

public class UpPatient extends JFrame implements MouseListener, ActionListener{
	JLabel hosLabel, upLabel, imgLabel, srchLabel;
	JTextField srchTF;
	JButton upBtn, bckBtn, srchBtn;
	Color c1,c2,c3;
	ImageIcon img, icon;
	Font f1, f2, f3, f4;
	JPanel panel;
		
	public UpPatient(){
		super("HealthMate");
		this.setSize(900,600);	
		icon = new ImageIcon("images/icon.png");
		this.setIconImage(icon.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		
		c1 = new Color(143,207,225);
		c2 = new Color(118,235,65);
			
		f1 = new Font("Georgia", Font.BOLD, 30);
		f2 = new Font("Georgia", Font.BOLD, 16);
		f3 = new Font("Times New Roman", Font.BOLD, 20);
		f4 = new Font("Times New Roman", Font.BOLD, 18);
			
		panel = new JPanel();
		panel.setLayout(null);
		
		hosLabel = new JLabel("HealthMate");
		hosLabel.setBounds(360,30,600,50);
		hosLabel.setFont(f1);
		panel.add(hosLabel);
		
		upLabel = new JLabel("Update Patient Information ");
		upLabel.setBounds(335,70,400,50);
		upLabel.setFont(f2);
		panel.add(upLabel);
			 
		
		srchLabel = new JLabel("Search by Name: ");
		srchLabel.setBounds(70,200,150,20);
		srchLabel.setFont(f3);
		panel.add(srchLabel);
		
		srchTF = new JTextField();
		srchTF.setBounds(240,200,150,20);
		panel.add(srchTF);
		
		srchBtn = new JButton("Search");
		srchBtn.setBounds(320,230,80,20);
		//srchBtn.setFont(font5);
		srchBtn.setBorder(null);
		srchBtn.setBackground(c1);
		srchBtn.setForeground(Color.RED);
		srchBtn.setFont(f4);
		srchBtn.addActionListener(this);
		panel.add(srchBtn);
			
		upBtn = new JButton(" ");
		upBtn.setBounds(180,470,88,40);
		upBtn.setBackground(Color.BLACK);
		upBtn.setForeground(Color.WHITE);
		upBtn.addMouseListener(this);
		upBtn.addActionListener(this);
		panel.add(upBtn);
			
		bckBtn = new JButton("BACK");
		bckBtn.setBounds(300,470,88,40);
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
		if(bckBtn.getText().equals(command)){
			Menu me = new Menu();
			me.setVisible(true);
			this.setVisible(false);

		}else if(srchBtn.getText().equals(command)){
			String name = srchTF.getText ();
			PList pl = new PList();
			if(!name.isEmpty()){
				int index = pl.searchPatient(name);
			if(index == -1){
				JOptionPane.showMessageDialog(this , "Patient does not exist !");
			}else {
				Patient p = pl.getPatient(index);
				Update ptd = new Update(p, pl);
				ptd.setVisible(true);
				this.setVisible(false);
			   }
			}
		}
	}
					
}	
			

		
