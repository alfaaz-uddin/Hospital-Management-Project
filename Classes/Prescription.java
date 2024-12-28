package Classes;

public class Prescription {
    private String patientId;
    private String patientName;
    private String diagnosis;
    private String doctorName;
    private String medicineName;
    private String dosage;
    private String usageInstructions;

    // Constructor
    public Prescription(String patientId, String patientName, String diagnosis, String doctorName, String medicineName, String dosage, String usageInstructions) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.diagnosis = diagnosis;
        this.doctorName = doctorName;
        this.medicineName = medicineName;
        this.dosage = dosage;
        this.usageInstructions = usageInstructions;
    }

    // Getters
    public String getPatientId() {
        return patientId;
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

    public String getMedicineName() {
        return medicineName;
    }

    public String getDosage() {
        return dosage;
    }

    public String getUsageInstructions() {
        return usageInstructions;
    }
}