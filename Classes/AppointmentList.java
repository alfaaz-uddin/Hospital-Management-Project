package Classes;

import Interfaces.*;
import java.io.*;
import java.util.Scanner;

public class AppointmentList {
    public Appointment[] appointmentList = new Appointment[100];
    public static int appCount = 0;

    public AppointmentList() {
        try {
            File file = new File("Files/AppointmentList.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String line1 = sc.nextLine();  // appID
                String line2 = sc.nextLine();  // patientName
                String line3 = sc.nextLine();  // diagnosis
                String line4 = sc.nextLine();  // doctorName
                String line5 = sc.nextLine();  // appDate
                String line6 = sc.nextLine();  // appTime
                if (sc.hasNextLine()) sc.nextLine();  // Skip empty line

                Appointment app = new Appointment(line1, line2, line3, line4, line5, line6);
                appointmentList[appCount] = app;
                appCount++;
            }
            sc.close();
        } catch (Exception ex) {
            System.out.println("File not found.");
            return;
        }
    }

    public void addAppointment(Appointment app) {
        try {
            appointmentList[appCount] = app;
            appCount++;
        } catch (Exception ex) {
            System.out.println("Array full");
        }

        String appointmentDetails = app.getAppId() + "\n" +
                                    app.getPatientName() + "\n" +
                                    app.getDiagnosis() + "\n" +
                                    app.getDoctorName() + "\n" +
                                    app.getAppDate() + "\n" +
                                    app.getAppTime() + "\n" + "\n";

        try {
            FileWriter fw = new FileWriter("Files/AppointmentList.txt", true);
            fw.write(appointmentDetails);
            fw.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public int searchAppointment(String appId) {
        int index = -1;
        for (int i = 0; i < appCount; i++) {
            if (appointmentList[i] != null && appointmentList[i].getAppId().equals(appId)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Appointment getAppointment(int index) {
        return appointmentList[index];
    }

    public void deleteAppointment(Appointment app) {
        for (int i = 0; i < appCount; i++) {
            if (appointmentList[i] == app) {
                for (int j = i; j < appCount - 1; j++) {
                    appointmentList[j] = appointmentList[j + 1];
                }
                appCount--;
                appointmentList[appCount] = null;
                break;
            }
        }

        String appointmentToDelete = app.getAppId() + "\n" +
                                     app.getPatientName() + "\n" +
                                     app.getDiagnosis() + "\n" +
                                     app.getDoctorName() + "\n" +
                                     app.getAppDate() + "\n" +
                                     app.getAppTime() + "\n";

        try {
            String filepath = "Files/AppointmentList.txt";
            File originalFile = new File(filepath);

            String newDetails = "";
            Scanner sc = new Scanner(originalFile);
            while (sc.hasNext()) {
                String readUser = sc.nextLine() + "\n";
                readUser += sc.nextLine() + "\n";
                readUser += sc.nextLine() + "\n";
                readUser += sc.nextLine() + "\n";
                readUser += sc.nextLine() + "\n";
                readUser += sc.nextLine();
                if (sc.hasNextLine()) readUser += "\n";

                if (readUser.equals(appointmentToDelete)) {
                    continue;
                }
                newDetails += readUser + "\n";
            }
            sc.close();
            FileWriter fw = new FileWriter(filepath);
            fw.write(newDetails);
            fw.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void updateAppointment(String appointmentToUpdate, Appointment updatedAppointment) {
        String updatedDetails = updatedAppointment.getAppId() + "\n" +
                                updatedAppointment.getPatientName() + "\n" +
                                updatedAppointment.getDiagnosis() + "\n" +
                                updatedAppointment.getDoctorName() + "\n" +
                                updatedAppointment.getAppDate() + "\n" +
                                updatedAppointment.getAppTime() + "\n";

        // Update in file
        try {
            String filepath = "Files/AppointmentList.txt";
            File originalFile = new File(filepath);

            String newDetails = "";
            Scanner sc = new Scanner(originalFile);
            while (sc.hasNext()) {
                String readUser = sc.nextLine() + "\n";
                readUser += sc.nextLine() + "\n";
                readUser += sc.nextLine() + "\n";
                readUser += sc.nextLine() + "\n";
                readUser += sc.nextLine() + "\n";
                readUser += sc.nextLine();
                if (sc.hasNextLine()) readUser += "\n";

                if (readUser.equals(appointmentToUpdate)) {
                    newDetails += updatedDetails + "\n";
                } else {
                    newDetails += readUser + "\n";
                }
            }
            sc.close();
            FileWriter fw = new FileWriter(filepath);
            fw.write(newDetails);
            fw.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}