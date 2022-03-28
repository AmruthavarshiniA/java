package inheritdemo;

public class Admin extends Employee{
	
	private String domain;

	public Admin(int empId, String empName, String domain) {
		super(empId, empName);
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "Admin [domain=" + domain +" empName="+empName+"]";
	}
	
	

}
