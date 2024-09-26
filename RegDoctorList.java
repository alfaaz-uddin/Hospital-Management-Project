import java.io.*;
import java.util.Scanner;

public class RegDoctorList{
	Doctor doctorList[] = new Doctor[100];
	public static int doctorCount = 0;
	
	RegDoctorList(){
		try{
			File file = new File("Files/DoctorList.txt"); 
			Scanner sc = new Scanner(file);
				while(sc.hasNext()){
					String line1 = sc.nextLine();  //id
					String line2 = sc.nextLine();  //name
					String line3 = sc.nextLine();  //mo n.
					String line4 = sc.nextLine();  //gender
					String line5 = sc.nextLine();  //department
					String line6 = sc.nextLine();  //joinig date
					String line7 = sc.nextLine();  //bmdc
					String line8 = sc.nextLine();  //pass
					String line9 = sc.nextLine();  //extra newline
					
					//printing them to cmd just to see if they are getting added to the list or not
				 	System.out.println(line1);
					System.out.println(line2);
					System.out.println(line3);
					System.out.println(line4);
					System.out.println(line5);
					System.out.println(line6);
					System.out.println(line7);
					System.out.println(line8);
					
					//user u = new user("sadia","1234","Female","1/JAN/1990","Mirpur");
					Doctor d = new Doctor(line1,line2,line3,line4,line5,line6,line7,line8);
					doctorList[doctorCount] = d;
					doctorCount++;
					System.out.println(doctorCount+"*********************");
				}
			sc.close();   //closing the file 		
		}catch(Exception ex){
			//System.out.println(ex);
			System.out.println("File not found.");
			return;
		}
		/*Doctor d1 = new Doctor("1001","Alfaz", "Male", "01745215623", "Cardiology", "4/JAN/2022", "321", "alfaz00");
		doctorList[doctorCount] = d1;
		doctorCount++;
		
		Doctor d2 = new Doctor("1002","Kazi", "Male", "01548751085", "Oncologist", "16/SEP/2023", "456", "3009782");
		doctorList[doctorCount++] = d2;*/
	}
	
	public void addDoctor(Doctor d){
		doctorList[doctorCount] = d;
		doctorCount++;
	
	
	String DrDetails = d.getId() + "\n" + d.getName() + "\n" +d.getGender() + "\n" +d.getMobileNo() + "\n"+ d.getDepartment() + "\n" +
						   d.getJoiningDate() + "\n" + d.getBmdcReg() +"\n" + d.getPassword() + "\n" + "\n";
		try{
			FileWriter fw = new FileWriter("Files/DoctorList.txt",true);
			fw.write(DrDetails);
			fw.close();
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public int doctorExists(String name){
		int index = -1;
		for(int i = 0; i<doctorCount; i++){
			if(doctorList[i]!=null && doctorList[i].getName().equals(name)){
				index = i;
				break;
			}
		}
		return index;
	}
	
	public Doctor checkPassword(int index, String pass){
		Doctor d = null;
		if(doctorList[index].getPassword().equals(pass)){
			d = doctorList[index];
		}
		return d;
	}
	
	public Doctor getDoctor(int index){
		return doctorList[index];
	}

	public int getDoctorCount() {
        return doctorCount;
    }
	
	/*public void deleteDoctor(Doctor d){
		for(int i = 0; i<doctorCount; i++){
			if(doctorList[i] == d){
				for(int j = i; j<doctorCount-1; j++){
					doctorList[j] = doctorList[j+1];
				}
				doctorCount--;
				doctorList[doctorCount]=null;
				break;
			}
		}
	}*/
	
	
}