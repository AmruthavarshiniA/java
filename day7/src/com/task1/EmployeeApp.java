package com.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeApp {

public static void main(String[] args) {
		
		ArrayList<Employee> e=new ArrayList<Employee>();
		e.add(new Employee(1001,"anshitha",55000,"IT"));
		e.add(new Employee(1002,"arman",50000,"IT"));
		e.add(new Employee(1003,"raveena",35000,"Advisory"));
		e.add(new Employee(1004,"srusti",45000,"Management"));
		e.add(new Employee(1004,"pavana",20000,"consultent"));
		
		//List<String> newdata=e.stream().filter((E)->E.getIncome()>40000).map(E.getName()::toUpperCase).collect(Collectors.toList());
		//System.out.println(newdata);
		List<Employee> newdata= e.stream().filter((s)->s.getIncome()>40000).collect(Collectors.toList());
		for(Employee es: newdata) {
			System.out.println(es.getName().toUpperCase());
		}
		
		e.stream().filter((E)->E.getIncome()>40000).forEach(System.out::println);
		
		long data=e.stream().filter((E)->E.getDepartment()=="IT").count();
		System.out.println(data);
		
		Optional<Employee> max=e.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getIncome)));
		System.out.println(max);
		Optional<Employee> min=e.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getIncome)));
		System.out.println(min);
		
		//long data= a.stream().filter((s)->s.getDept().equalsIgnoreCase("IT")).count();
		//System.out.println(data);
	}
}
