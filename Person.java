public class Person {
	public String id;
    private String name;
    private String gender;
    private String mobileNo;
	private String address;

    // Constructor
    public Person(String id,String name,String gender,String mobileNo) {
		this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.gender = gender;
    }

    // Getters and Setters
	public String getId() {
        return id;
    }
	
	public void setId(String id) {
        this.id = id;
    }

	
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	
	public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    } 

  

    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
}
