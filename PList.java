import java.io.*;
import java.util.Scanner;

public class PList {
	Patient patientList[] = new Patient[100];
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
				String line10 = sc.nextLine();  //deposite
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
			//add patient in array
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
									p.getDiagnosis() + "\n" + p.getDeposite() + "\n" + "\n";
			
			try{
				FileWriter fw = new FileWriter("Files/PatientList.txt",true);
				fw.write(patientDatiels);
				fw.close();
			}catch(Exception ex){
				System.out.println(ex);
			}
			
			
			
		}
}
		
		
		

	
	
	
 