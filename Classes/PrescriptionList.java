package Classes;

import java.io.*;
import java.util.Scanner;

public class PrescriptionList {
    public Prescription[] prescriptionList = new Prescription[100];
    public static int pCount = 0;

    public PrescriptionList() {
        try {
            File file = new File("Files/prescriptions.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String patientId = sc.nextLine().split(": ")[1];  // Patient ID
                String patientName = sc.nextLine().split(": ")[1];  // Patient Name
                String diagnosis = sc.nextLine().split(": ")[1];  // Diagnosis
                String doctorName = sc.nextLine().split(": ")[1];  // Doctor's Name
                String medicineName = sc.nextLine().split(": ")[1];  // Medicine Name
                String dosage = sc.nextLine().split(": ")[1];  // Dosage
                String usageInstructions = sc.nextLine().split(": ")[1];  // Usage Instructions
                if (sc.hasNextLine()) sc.nextLine();  // Skip 

                Prescription p = new Prescription(patientId, patientName, diagnosis, doctorName, medicineName, dosage, usageInstructions);
                prescriptionList[pCount] = p;
                pCount++;
            }
            sc.close();
        } catch (Exception ex) {
            System.out.println("File not found or error reading file.");
        }
    }

    public void addPrescription(Prescription p) {
        try {
            prescriptionList[pCount] = p;
            pCount++;
        } catch (Exception ex) {
            System.out.println("Array full");
        }

        String prescriptionDetails = "Patient ID: " + p.getPatientId() + "\n" +
                                     "Patient Name: " + p.getPatientName() + "\n" +
                                     "Diagnosis: " + p.getDiagnosis() + "\n" +
                                     "Doctor's Name: " + p.getDoctorName() + "\n" +
                                     "Medicine Name: " + p.getMedicineName() + "\n" +
                                     "Dosage: " + p.getDosage() + "\n" +
                                     "Usage Instructions: " + p.getUsageInstructions() + "\n\n";

        try {
            FileWriter fw = new FileWriter("Files/prescriptions.txt", true);
            fw.write(prescriptionDetails);
            fw.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public int searchPrescription(String patientId) {
        int index = -1;
        for (int i = 0; i < pCount; i++) {
            if (prescriptionList[i] != null && prescriptionList[i].getPatientId().equalsIgnoreCase(patientId)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Prescription getPrescription(int index) {
        return prescriptionList[index];
    }
}