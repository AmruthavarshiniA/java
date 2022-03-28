package day5;

import java.util.ArrayList;
import java.util.Collections;


public class ProjectMain {
	
	public static void main(String[] args) {
		
		ArrayList<Project> p=new ArrayList<Project>();
		p.add(new Project(100,"java","Banglore",25000));
		p.add(new Project(101,"python","pune",15000));
		p.add(new Project(102,"cloud","pune",18000));
		
		Collections.sort(p,new BudgetOrder());
		
		for(Project P:p) {	
			System.out.println(P);
			}
	}
	
}
