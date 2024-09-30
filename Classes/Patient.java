package Classes;

public class Patient extends Person {
	private String age;
	private String address;
    private String appointedDoctor;
    private String room;
    private String diagnosis;
	private String deposit;

    
    public Patient( String id, String name, String mobileNo, String gender, String age, String address, String appointedDoctor, String room, String diagnosis,String deposit) {
        super(id,name,mobileNo,gender);
		
		this.age = age;
		this.address = 	address;
        this.appointedDoctor = appointedDoctor;
        this.room = room;
        this.diagnosis = diagnosis;
		this.deposit = deposit;
    }

  
	public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
	
	
	public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
	
	
    public String getAppointedDoctor() {
        return appointedDoctor;
    }

    public void setAppointedDoctor(String appointedDoctor) {
        this.appointedDoctor = appointedDoctor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
	
	public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }
	
	
	
	
}
 