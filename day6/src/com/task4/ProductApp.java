package com.task4;

import java.util.ArrayList;

public class ProductApp {

	public static void main(String[] args) {
		
		ArrayList<Products> p=new ArrayList<Products>();
		p.add(new Products(1001,"charger",500));
		p.add(new Products(1002,"dongle",2500));
		p.add(new Products(1003,"earpod",3000));
		p.add(new Products(1004,"powerbank",2500));
		p.add(new Products(1005,"connector",250));
		
		
		p.stream().filter((P)->P.getPrice()>2000).forEach(System.out::println);
	}
}
