package day5;

import java.util.Comparator;

public class BudgetOrder implements Comparator<Project> {

	public int compare(Project o1,Project o2) {
		return o1.getBudget()-(o2.getBudget());
	}
	
}
