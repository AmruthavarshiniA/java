package day5;

//import java.util.ArrayList;
import java.io.Serializable;

public class Project implements Serializable {
	
	private static final long serialVersionUID=1L;
	private int PId;
	private String PName;
	private String Location;
	private int budget;
	
	public int getPId() {
		return PId;
	}

	public String getLocation() {
		return Location;
	}

	public int getBudget() {
		return budget;
	}

	public void setPId(int pId) {
		PId = pId;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public String toString(){
		return "Project [PId="+PId+",pName="+PName+",Location="+Location+",budget="+budget+"] ";
	}
	
	public Project(int pId, String pName, String location, int budget) {
		super();
		PId = pId;
		PName = pName;
		Location = location;
		this.budget = budget;
	}
	
	
	
}
