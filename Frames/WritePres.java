package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import Classes.*;

public class WritePres extends JFrame implements ActionListener {

    JLabel nameLabel, ddLabel, srchLabel, ptNameLabel, diagLabel, drNameLabel, medNameLabel, doseLabel, usageLabel;
    JTextField srchTF, ptNameTF, diagTF, drNameTF, medNameTF, doseTF, usageTF;
    JButton searchBtn, saveBtn, backBtn;
    Font font1, font2, font3, font4, font5;
    Color color1;
    ImageIcon img, icon;
    JPanel panel;

    public WritePres() {
        super("HealthMate - Doctor Dashboard");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        icon = new ImageIcon("images/emp-info.png");
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

        ddLabel = new JLabel("Patient Prescription");
        ddLabel.setBounds(186, 100, 200, 30);
        ddLabel.setFont(font2);
        panel.add(ddLabel);

        srchLabel = new JLabel("Search by PID: ");
        srchLabel.setBounds(100, 140, 170, 20);
        srchLabel.setFont(font4);
        panel.add(srchLabel);

        srchTF = new JTextField();
        srchTF.setBounds(230, 142, 75, 20);
        panel.add(srchTF);

        searchBtn = new JButton("Search");
        searchBtn.setBounds(325, 140, 80, 20);
        searchBtn.setFont(font5);
        searchBtn.setBorder(null);
        searchBtn.setBackground(color1);
        searchBtn.setForeground(Color.RED);
        searchBtn.addActionListener(this);
        panel.add(searchBtn);

        ptNameLabel = new JLabel("Patient Name: ");
        ptNameLabel.setBounds(100, 180, 150, 20);
        ptNameLabel.setFont(font3);
        panel.add(ptNameLabel);

        ptNameTF = new JTextField();
        ptNameTF.setBounds(225, 180, 150, 20);
        panel.add(ptNameTF);

        diagLabel = new JLabel("Diagnosis: ");
        diagLabel.setBounds(100, 220, 150, 20);
        diagLabel.setFont(font3);
        panel.add(diagLabel);

        diagTF = new JTextField();
        diagTF.setBounds(225, 220, 150, 20);
        panel.add(diagTF);

        drNameLabel = new JLabel("Doctor's Name: ");
        drNameLabel.setBounds(100, 260, 150, 20);
        drNameLabel.setFont(font3);
        panel.add(drNameLabel);

        drNameTF = new JTextField();
        drNameTF.setBounds(225, 260, 150, 20);
        panel.add(drNameTF);

        medNameLabel = new JLabel("Medicine Name: ");
        medNameLabel.setBounds(100, 300, 150, 20);
        medNameLabel.setFont(font3);
        panel.add(medNameLabel);

        medNameTF = new JTextField();
        medNameTF.setBounds(225, 300, 150, 20);
        panel.add(medNameTF);

        doseLabel = new JLabel("Dosage: ");
        doseLabel.setBounds(100, 340, 150, 20);
        doseLabel.setFont(font3);
        panel.add(doseLabel);

        doseTF = new JTextField();
        doseTF.setBounds(225, 340, 150, 20);
        panel.add(doseTF);

        usageLabel = new JLabel("Usage Instruc.: ");
        usageLabel.setBounds(100, 380, 150, 20);
        usageLabel.setFont(font3);
        panel.add(usageLabel);

        usageTF = new JTextField();
        usageTF.setBounds(225, 380, 150, 20);
        panel.add(usageTF);

        saveBtn = new JButton("Save");
        saveBtn.setBounds(140, 430, 100, 30);
        saveBtn.setBackground(Color.BLACK);
        saveBtn.setForeground(Color.WHITE);
        saveBtn.addActionListener(this);
        panel.add(saveBtn);

        backBtn = new JButton("Exit");
        backBtn.setBounds(260, 430, 100, 30);
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

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();

        if (command.equals("Search")) {
            searchPatient();
        } else if (command.equals("Save")) {
            savePrescription();
        } else if (command.equals("Exit")) {
            goBack();
        }
    }

    private void searchPatient() {
        String id = srchTF.getText();
        PList pl = new PList();
        if (!id.isEmpty()) {
            int index = pl.searchPatient(id);
            if (index == -1) {
                JOptionPane.showMessageDialog(this, "Patient does not exist!");
            } else {
                Patient p = pl.getPatient(index);
                ptNameTF.setText(p.getName());
                diagTF.setText(p.getDiagnosis());
                drNameTF.setText(p.getAppointedDoctor());
                // Optionally set other fields if needed:
                // medNameTF.setText("Paracetamol");
                // doseTF.setText("500 mg");
                // usageTF.setText("Twice a day");
            }
        }
    }

    private void savePrescription() {
        String patientID = srchTF.getText(); // Get the patient ID from the search field
        String patientName = ptNameTF.getText();
        String diagnosis = diagTF.getText();
        String doctorName = drNameTF.getText();
        String medicineName = medNameTF.getText();
        String dosage = doseTF.getText();
        String usageInstructions = usageTF.getText();

        String prescription = String.format("Patient ID: %s\nPatient Name: %s\nDiagnosis: %s\nDoctor's Name: %s\nMedicine Name: %s\nDosage: %s\nUsage Instructions: %s\n",
                                             patientID, patientName, diagnosis, doctorName, medicineName, dosage, usageInstructions);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Files/prescriptions.txt", true))) {
            bw.write(prescription);
            bw.newLine();
            JOptionPane.showMessageDialog(this, "Prescription saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving prescription.");
        }
    }

    private void goBack() {
        Login menu = new Login();
        menu.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        WritePres frame = new WritePres();
        frame.setVisible(true);
    }
}