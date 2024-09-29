package Interfaces;
import Classes.*;

public interface IPList{
	public abstract void addPatient(Patient p);
	public abstract int searchPatient(String name);
	public abstract void deletePatient(Patient p);
	public abstract void updatePatient(String patientToUpdate, Patient updatedPatient);
	
	
}
