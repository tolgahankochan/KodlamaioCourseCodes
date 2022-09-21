package oop1;

public class Main {

	public static void main(String[] args) {

		

		String mesaj = "Vade oranı ";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.img");
		
		Product product2 = new Product();
		product2.setName("Delonghi Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image1.img");
	

		
		
		
		Product[] products = {product1,product2};
		
		
		System.out.println("<ul>");
		System.out.println("-------------------------");
		for (Product product : products) {
			
			System.out.println("<li>"+product.getName()+"</li>");
			System.out.println("<li>"+product.getUnitPrice()+"</li>");
			System.out.println("-------------------------");
		}
		System.out.println("</ul>");
		
		
		
		IndividualCustomer individualCustomer1 = new IndividualCustomer();
		individualCustomer1.setId(1);
		individualCustomer1.setCustomerNumber("5");
		individualCustomer1.setPhone("5456650485");
		individualCustomer1.setFirstName("Tolga");
		individualCustomer1.setLastName("Kochan");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("5458996969");
		corporateCustomer.setCustomerNumber("54321");
		
		
		
		
		Customer[] customers = {individualCustomer1,corporateCustomer};
		
		
		
		
		
		
		
		

		
	}

}
