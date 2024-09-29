package Classes;

public class Doctor extends Person {
    private String department;
    private String joiningDate;
    private String bmdcReg;
	private String password;
	
    public Doctor(String id, String name, String gender, String mobileNo, String department, String joiningDate, String bmdcReg, String password) {
        super(id,name,gender,mobileNo);
        this.department = department;
        this.joiningDate = joiningDate;
        this.bmdcReg = bmdcReg;
		this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getPassword() {
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
    public String getBmdcReg() {
        return bmdcReg;
    }

    public void setBmdcReg(String bmdcReg) {
        this.bmdcReg = bmdcReg;
    }
}
