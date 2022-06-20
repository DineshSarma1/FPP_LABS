package secondclass.firstprogram;

public class Prog1Main {

	public static void main(String[] args) {
		
		//declaring and initializing array of 3 Customer
		Customer[] customers = new Customer[3];
		customers[0] = new Customer("Nirmal","Silwal","12-34-45-56-7");
		customers[1] = new Customer("Binod","Kathayat","12-343-454-56-7");
		customers[2] = new Customer("Anand","KC","14-54-65-76-77");
		
		//Declaring and Initializing 3 Billing Addresses for 3 customers
		Address billingAddressC1 = new Address("1000 North 4th street","Fairfield","iowa","52557");
		Address billingAddressC2 = new Address("1000 North 10th street","Chicago","Chicago","34346");
		Address billingAddressC3 = new Address("2000 North 20th street","Chicago","Chicago","32346");
		
		//Declaring and Initializing 3 Shipping Addresses for 3 customers
		Address shippingAddressc1 = new Address("4th street","Chicago","iowa","52557");
		Address shippingAddressc2 = new Address("10th street","Fairfield","Chicago","34346");
		Address shippingAddressc3 = new Address("20th street","Chicago","Chicago","32346");
		
		//Setting billing and shipping address using setter method
		customers[0].setBillingAddress(billingAddressC1);
		customers[0].setShippingAddress(shippingAddressc1);
		
		//Setting billing and shipping address using setter method
		customers[1].setBillingAddress(billingAddressC2);
		customers[1].setShippingAddress(shippingAddressc2);
		
		//Setting billing and shipping address using setter method
		customers[2].setBillingAddress(billingAddressC3);
		customers[2].setShippingAddress(shippingAddressc3);
		
		//displaying all the customers whose billing address is "Chicago"
		for(int i =0 ; i < customers.length ; i++) {
			if(customers[i].getBillingAddress().getCity().equals("Chicago")) {
				System.out.println(customers[i].toString());
			}
		}

	}
}
