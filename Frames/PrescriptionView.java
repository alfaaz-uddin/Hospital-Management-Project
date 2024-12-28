package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Classes.*;

public class PrescriptionView extends JFrame implements ActionListener {

    JLabel nameLabel, pfLabel, srchLabel, ptNameLabel, diagLabel, drNameLabel, medNameLabel, doseLabel, usageLabel;
    JLabel ptNameValue, diagValue, drNameValue, medNameValue, doseValue, usageValue;
    JTextField srchTF;
    JButton searchBtn, backBtn;
    Font font1, font2, font3, font4, font5;
    Color color1;
    ImageIcon img, icon;
    JPanel panel;

    public PrescriptionView() {
        super("HealthMate - Prescription View");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        icon = new ImageIcon("images/icon.png");
		this.setIconImage(icon.getImage());

        font1 = new Font("Biome", Font.BOLD, 30);
        font2 = new Font("Biome", Font.BOLD, 18);
        font3 = new Font("Biome", Font.BOLD, 14);
        font4 = new Font("Bookman Old Style", Font.BOLD, 15);
        font5 = new Font("ADLaM Display", Font.ITALIC, 16);

        color1 = new Color(143, 207, 225);

        panel = new JPanel();
        panel.setLayout(null);

        nameLabel = new JLabel("HealthMate");
        nameLabel.setBounds(350, 30, 250, 40);
        nameLabel.setFont(font1);
        panel.add(nameLabel);

        pfLabel = new JLabel("Prescription View");
        pfLabel.setBounds(186, 100, 180, 30);
        pfLabel.setFont(font2);
        panel.add(pfLabel);

        srchLabel = new JLabel("Search by PID: ");
        srchLabel.setBounds(100, 170, 170, 20);
        srchLabel.setFont(font4);
        panel.add(srchLabel);

        srchTF = new JTextField();
        srchTF.setBounds(270, 172, 150, 20);
        panel.add(srchTF);

        searchBtn = new JButton("Search");
        searchBtn.setBounds(430, 170, 80, 20);
        searchBtn.setFont(font5);
        searchBtn.setBorder(null);
        searchBtn.setBackground(color1);
        searchBtn.setForeground(Color.RED);
        searchBtn.addActionListener(this);
        panel.add(searchBtn);

        ptNameLabel = new JLabel("Patient Name: ");
        ptNameLabel.setBounds(100, 220, 150, 20);
        ptNameLabel.setFont(font3);
        panel.add(ptNameLabel);

        ptNameValue = new JLabel();
        ptNameValue.setBounds(225, 220, 150, 20);
        panel.add(ptNameValue);

        diagLabel = new JLabel("Diagnosis: ");
        diagLabel.setBounds(100, 260, 150, 20);
        diagLabel.setFont(font3);
        panel.add(diagLabel);

        diagValue = new JLabel();
        diagValue.setBounds(225, 260, 150, 20);
        panel.add(diagValue);

        drNameLabel = new JLabel("Doctor's Name: ");
        drNameLabel.setBounds(100, 300, 150, 20);
        drNameLabel.setFont(font3);
        panel.add(drNameLabel);

        drNameValue = new JLabel();
        drNameValue.setBounds(225, 300, 150, 20);
        panel.add(drNameValue);

        medNameLabel = new JLabel("Medicine Name: ");
        medNameLabel.setBounds(100, 340, 150, 20);
        medNameLabel.setFont(font3);
        panel.add(medNameLabel);

        medNameValue = new JLabel();
        medNameValue.setBounds(225, 340, 150, 20);
        panel.add(medNameValue);

        doseLabel = new JLabel("Dosage: ");
        doseLabel.setBounds(100, 380, 150, 20);
        doseLabel.setFont(font3);
        panel.add(doseLabel);

        doseValue = new JLabel();
        doseValue.setBounds(225, 380, 150, 20);
        panel.add(doseValue);

        usageLabel = new JLabel("Usage Instruc.: ");
        usageLabel.setBounds(100, 420, 150, 20);
        usageLabel.setFont(font3);
        panel.add(usageLabel);

        usageValue = new JLabel();
        usageValue.setBounds(225, 420, 150, 20);
        panel.add(usageValue);

        backBtn = new JButton("Back");
        backBtn.setBounds(260, 470, 100, 30);
        backBtn.setBackground(Color.BLACK);
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener(this);  
        panel.add(backBtn);

        img = new ImageIcon("images/dis.png");
        JLabel imgLabel = new JLabel(img);
        imgLabel.setBounds(450, 75, 400, 400);
        panel.add(imgLabel);

        panel.setBackground(color1);
        this.add(panel);
    }

   // @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == searchBtn) {
            searchPrescription();
        } else if (e.getSource() == backBtn) {
            goBack();
        }
    }

    private void searchPrescription() {
        String patientId = srchTF.getText();
        PrescriptionList pl = new PrescriptionList();
        if (!patientId.isEmpty()) {
            int index = pl.searchPrescription(patientId);
            if (index == -1) {
                JOptionPane.showMessageDialog(this, "Prescription does not exist!");
            } else {
                Prescription p = pl.getPrescription(index);
                ptNameValue.setText(p.getPatientName());
                diagValue.setText(p.getDiagnosis());
                drNameValue.setText(p.getDoctorName());
                medNameValue.setText(p.getMedicineName());
                doseValue.setText(p.getDosage());
                usageValue.setText(p.getUsageInstructions());
            }
        }
    }

    private void goBack() {
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        PrescriptionView frame = new PrescriptionView();
        frame.setVisible(true);
    }
}