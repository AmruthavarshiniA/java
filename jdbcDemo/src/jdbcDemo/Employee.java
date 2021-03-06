package jdbcDemo;

public class Employee {

	String uName;
	String email;
	String city;
	int income;
	
	public Employee(String uName, String email, String city, int income) {
		super();
		this.uName = uName;
		this.email = email;
		this.city = city;
		this.income = income;
	}

	
	@Override
	public String toString() {
		return "Employee [Uname:"+uName+",email:"+email+",city:"+city+",income:"+income+"]";
	}


	public String getuName() {
		return uName;
	}

	public String getEmail() {
		return email;
	}

	public String getCity() {
		return city;
	}

	public int getIncome() {
		return income;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setIncome(int income) {
		this.income = income;
	}
	
	
}
