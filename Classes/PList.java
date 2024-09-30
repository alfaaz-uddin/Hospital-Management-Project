package Classes;
import Interfaces.*;

import java.io.*;
import java.util.Scanner;

public class PList implements IPList {
	public Patient patientList[] = new Patient[100];
	public static int pCount = 0;
	
	public PList(){
		try{
		File file = new File("Files/PatientList.txt");
		Scanner sc = new Scanner(file);
			while(sc.hasNext()){
				String line1 = sc.nextLine();  //pid
				String line2 = sc.nextLine();  //name
				String line3 = sc.nextLine();  //mobile
				String line4 = sc.nextLine();  //gender
				String line5 = sc.nextLine();  //age
				String line6 = sc.nextLine();   //address
				String line7 = sc.nextLine();  //appDoctor
				String line8 = sc.nextLine();  //room
				String line9 = sc.nextLine();  //diagnosic
				String line10 = sc.nextLine();  //deposit
				String line11= sc.nextLine();  
				
				
				Patient p = new Patient (line1, line2, line3, line4, line5, line6, line7, line8, line9, line10);
				patientList[pCount] = p;
				pCount++;	
			}
		sc.close();		
		
		}catch(Exception ex){
			System.out.println("File not found.");
			return;
			
		}
	}
	
	public void addPatient(Patient p){

		try{
			patientList[pCount] = p;
			pCount++;
		}catch (Exception ex){
				System.out.println("Array full");	
		}
			
		String patientDatiels = p.getId() + "\n" + p.getName() + "\n" +
								p.getMobileNo() + "\n" + p.getGender() + "\n" +
								p.getAge() + "\n" + p.getAddress() + "\n" +
								p.getAppointedDoctor() + "\n" + p.getRoom() + "\n" +
								p.getDiagnosis() + "\n" + p.getDeposit() + "\n" +"\n";
			
		try{
			FileWriter fw = new FileWriter("Files/PatientList.txt",true);
			fw.write(patientDatiels);
			fw.close();
		}catch(Exception ex){
				System.out.println(ex);
		}
			
			
			
	}
	
	public int searchPatient(String name){
		int index = -1;
		for(int i = 0; i<pCount; i++){
			if(patientList[i]!= null && patientList[i].getName().equals(name)){
			   index = i;
			   break;
			}
		}
		return index;
	}
	
	public Patient getPatient(int index){
		return patientList[index];
	}
	
	public void deletePatient(Patient p){

		for( int i = 0; i<pCount; i++){
			if(patientList[i] == p){
				for(int j = i; j<pCount-1; j++){
					patientList[j] = patientList[j+1];
				}
				pCount--;
				patientList[pCount] = null;
				break;
			}
		}
		

		String patientToDelete = p.getId() + "\n" + p.getName() + "\n" +
								 p.getMobileNo() + "\n" + p.getGender() + "\n" +
								 p.getAge() + "\n" + p.getAddress() + "\n" +
								 p.getAppointedDoctor() + "\n" + p.getRoom() + "\n" +
								 p.getDiagnosis() + "\n" + p.getDeposit() + "\n" ;
		
		try{
			String filepath = "Files/PatientList.txt";
			File originalFile = new File(filepath);
			
			String newDetails = "";
			Scanner sc = new Scanner(originalFile);
			while(sc.hasNext()){
				String readUser = sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine();
					   
				System.out.println(readUser);
				System.out.println(patientToDelete);
				
				if(readUser.equals(patientToDelete)){
					System.out.println("Equal, so deleting");
					continue; 
				}
				System.out.println("Writing");
				newDetails += readUser + "\n";
				
			} sc.close();
			FileWriter fw = new FileWriter(filepath);
			fw.write(newDetails);
			fw.close();
			
		} catch (Exception ex){
			System.out.println(ex);
		}
		
	}
	
	public void updatePatient(String patientToUpdate, Patient updatedPatient){
		
		String updatedDetails = updatedPatient.getId() + "\n" +
								updatedPatient.getName() + "\n" +
								updatedPatient.getMobileNo() + "\n" +
								updatedPatient.getGender() + "\n" +
								updatedPatient.getAge() + "\n" +
								updatedPatient.getAddress() + "\n" +
								updatedPatient.getAppointedDoctor() + "\n" +
								updatedPatient.getRoom() + "\n"+
								updatedPatient.getDiagnosis() + "\n" +
								updatedPatient.getDeposit() + "\n";
								
		System.out.println("Want to update:\n "+ updatedDetails+ "\n");
		System.out.println("----------------------------------------");
								
		//Update in file						
		try{
			String filepath = "Files/PatientList.txt";
			File originalFile = new File(filepath);
			
			String newDetails = "";
			Scanner sc = new Scanner(originalFile);
			while(sc.hasNext()){
				String readUser = sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine() + "\n";
					   readUser += sc.nextLine();
					   
				System.out.println("read:\n "+ readUser+"\n-----------------");
				System.out.println("updt:\n "+ patientToUpdate +"\n-----------------");
				
				if(readUser.equals(patientToUpdate)){
					System.out.println("Updated");
					newDetails += updatedDetails + "\n";
				} else{
					System.out.println("Writing");
					newDetails += readUser + "\n";
				}	
			} sc.close();
			FileWriter fw = new FileWriter(filepath);
			fw.write(newDetails);
			fw.close();
			
		} catch (Exception ex){
			System.out.println(ex);
		}							
	}
		
}
		
		
		

	
	
	
 