package enginmemis;

public class Customer {
	private String name;
	private String telephone;
	private String address;
	private Home[] hm;
	private int homeCounter;
	private double payment;
	
	public Customer(String name, String telephone, String address) {
		this.name = name;
		this.telephone = telephone;
		this.address = address;
		hm = new Home[5];
		homeCounter = 0;
		payment = 0;
	}
	
	public void buyHome(Home home) {
		hm[homeCounter] = home;
		if(homeCounter >= 2) {
			home.setPrice(home.discountedPrice());
			payment += home.getPrice();
		}
			
		else
			payment += home.getPrice();
		homeCounter++;
	}
	
	public void listHome() {
		for(Home home : hm) {
			if(home != null)
				System.out.println(home.toString());
		}
	}
	
	public String getInfo() {
		return this.name + " has " + this.homeCounter + " home(s) with total payment: " + this.payment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public int getHomeCounter() {
		return homeCounter;
	}

	public void setHomeCounter(int homeCounter) {
		this.homeCounter = homeCounter;
	}
	
	
}
