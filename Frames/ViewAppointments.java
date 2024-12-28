package Frames;

import java.lang.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.io.*;
import Classes.*;

public class ViewAppointments extends JFrame implements ActionListener {
    
    JLabel titleLabel, appListLabel;
    JButton backBtn;
    Color color1, color2;
    Font font1, font4;
    ImageIcon img;
    JPanel panel;
    JTable table;
    DefaultTableModel model;
    AppointmentList al;

    public ViewAppointments(AppointmentList al) {
        super("HealthMate - View Appointments");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        img = new ImageIcon("images/emp-info.png");
        this.setIconImage(img.getImage());
        this.al = al;

        color1 = new Color(143, 207, 225);
        color2 = new Color(182, 224, 232);

        font1 = new Font("Biome", Font.BOLD, 30);
        font4 = new Font("Biome", Font.BOLD, 18);

        panel = new JPanel();
        panel.setLayout(null);

        titleLabel = new JLabel("HealthMate");
        titleLabel.setBounds(350, 5, 400, 100);
        titleLabel.setFont(font1);
        panel.add(titleLabel);

        appListLabel = new JLabel("Appointment List");
        appListLabel.setBounds(350, 55, 400, 50);
        appListLabel.setFont(font4);        
        panel.add(appListLabel);

        model = new DefaultTableModel();
        table = new JTable(model);
        table.setBackground(color2);
        table.setFont(new Font("Times New Roman", Font.BOLD, 16));

        model.addColumn("Appointment ID");
        model.addColumn("Patient Name");
        model.addColumn("Diagnosis");
        model.addColumn("Doctor Name");
        model.addColumn("Appointment Date");
        model.addColumn("Appointment Time");

        for (int i = 0; i < al.appointmentList.length; i++) {
            Appointment appointment = al.appointmentList[i];
            if (appointment != null) {
                model.addRow(new Object[]{
                    appointment.getAppId(), 
                    appointment.getPatientName(), 
                    appointment.getDiagnosis(), 
                    appointment.getDoctorName(), 
                    appointment.getAppDate(), 
                    appointment.getAppTime()
                });
            }
        }

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(70, 150, 750, 270);
        panel.add(scrollPane);

        backBtn = new JButton("BACK");
        backBtn.setBounds(400, 450, 100, 40);
        backBtn.setBackground(Color.RED);
        backBtn.setForeground(Color.WHITE);
        backBtn.setOpaque(true);
        backBtn.addActionListener(this);
        panel.add(backBtn);

        panel.setBackground(color1);
        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backBtn) {
            Menu menu = new Menu();
            menu.setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        AppointmentList al = new AppointmentList();
        ViewAppointments frame = new ViewAppointments(al);
        frame.setVisible(true);
    }
}