package Frames;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import Classes.*;

public class DoctorList extends JFrame implements ActionListener {

    JLabel userLabel, passLabel, imgLabel;
    JButton back;
    Color color1, color2;
    Font font1, font4;
    ImageIcon img;
    JPanel panel;
    JTable table;
    DefaultTableModel model;

    public DoctorList() {
        super("Doctor List");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        color1 = new Color(143, 207, 225);
		color2 = new Color(182, 224, 232);

        font1 = new Font("Biome", Font.BOLD, 30);
        font4 = new Font("Biome", Font.BOLD, 18);

        panel = new JPanel();
        panel.setLayout(null);

        userLabel = new JLabel("HealthMate ");
        userLabel.setBounds(350, 10, 400, 100);
        userLabel.setFont(font1);
        panel.add(userLabel);

        userLabel = new JLabel("Doctor List ");
        userLabel.setBounds(377, 70, 400, 50);
        userLabel.setFont(font4);
        panel.add(userLabel);

		model = new DefaultTableModel();
        table = new JTable(model);
		table.setBackground(color2);
		//table.setSelectionBackground(new Color(255, 153, 255));
		table.setFont(new Font("Times New Roman", Font.BOLD, 16));
		//table.setBackground(new Color(182, 224, 232));
		
       
		model.addColumn("Doctor ID");
        model.addColumn("Name");
        model.addColumn("Department");

        RegDoctorList regDoctorList = new RegDoctorList();
		//String title = new String ("Dr. ");
		String title = "Dr. ";
        for(int i = 0; i < regDoctorList.doctorList.length; i++){
			Doctor doctor = regDoctorList.doctorList[i]; {
            if (doctor != null) {
                model.addRow(new Object[]{doctor.getId(), title + doctor.getName(), doctor.getDepartment()});
            }
        }
        }

        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(70, 150, 750, 270);
        panel.add(scrollPane);

        back = new JButton("BACK");
        back.setBounds(620, 470, 100, 40);
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.setOpaque(true);
        back.addActionListener(this);
        panel.add(back);

        panel.setBackground(color1);
        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            Menu me = new Menu();
            me.setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        DoctorList doctorList = new DoctorList();
        doctorList.setVisible(true);
    }
}