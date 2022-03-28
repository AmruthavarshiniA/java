package assignment1;

public class CustomerTester {

	public void acceptCustomerInfo() {
		System.out.println("\n\n\t please enter details of the customer");
		System.out.println("customer id:");
		String custId=ReadData.acceptstring();
		System.out.println("customer Name");
		String custName=ReadData.acceptstring();
		Customer customer=new Customer();
		customer.setCustomerId(Integer.parseInt(custId));
		customer.setCustomerName(custName);
		int status=new CustomerFileDB().saveCustomer(customer);
		if(status==0) {
			System.out.println("your details are saved");
			ReadData.acceptstring();
			System.out.println("\n\n\n\n\n\n\n");
			}else {
				System.out.println("your details could,t be saves, please try later");
				ReadData.acceptstring();
				System.out.println("\n\n\n\n\n\n");
			}
	}
	public void displayCustInfo() {
		System.out.println("\n please enter the customer id:");
		String custId=ReadData.acceptstring();
		Customer customer=new CustomerFileDB().getCustomer(Integer.parseInt(custId));
		if(customer!=null) {
			System.out.println("\n customer Id"+customer.getCustomerId());
			System.out.println("customer name"+customer.getCustomerName());
			
		}else {
			System.out.println("invalid customer id!!!");
			ReadData.acceptstring();
			System.out.println("\n\n\n\n\n\n");
		}
	}
	public void customerMenu() {
		while(true) {
			System.out.println("\t customer Menu");
			System.out.println("-----------------------------------");
			
			System.out.println("1. add customer");
			System.out.println("2. get cutomer");
			System.out.println("3. exit");
			System.out.println("\n enter option");
			String opteValue=ReadData.acceptstring();
			int option=Integer.parseInt(opteValue);
			
			switch (option) {
			case 1: 
				acceptCustomerInfo();
				break;
			case 2:
				displayCustInfo();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("enter the valid option");
				ReadData.acceptstring();
			}
		}
	}
}
