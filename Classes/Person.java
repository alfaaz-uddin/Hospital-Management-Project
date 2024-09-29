package Classes;
public abstract class Person {
	public String id;
    private String name;
    private String gender;
    private String mobileNo;
	private String address;

    public Person(String id,String name,String mobileNo,String gender) {
		this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.gender = gender;
    }

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
