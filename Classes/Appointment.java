package Classes;

public class Appointment {
    private String appID;
    private String patientName;
    private String diagnosis;
    private String doctorName;
    private String appDate;
    private String appTime;

    public Appointment(String appID, String patientName, String diagnosis, String doctorName, String appDate, String appTime) {
        this.appID = appID;
        this.patientName = patientName;
        this.diagnosis = diagnosis;
        this.doctorName = doctorName;
        this.appDate = appDate;
        this.appTime = appTime;
    }

    public String getAppId() {
        return appID;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getAppDate() {
        return appDate;
    }

    public String getAppTime() {
        return appTime;
    }
}