package com.task5;

public class User {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}

/*Considering the following getAddress() method inside User class -

Address getAddress() {
    return this.address;
}
Here is how you would achieve the desired result -

if(user != null) {
    Address address = user.getAddress();
    if(address != null && address.getCountry().equalsIgnoreCase("India")) {
	    System.out.println("User belongs to India");
    }
}
Now, let’s see how we can get the same result using map() method -

userOptional.map(User::getAddress)
.filter(address -> address.getCountry().equalsIgnoreCase("India"))
.ifPresent(() -> {
    System.out.println("User belongs to India");
});*/