package enginmemis;

public class Apartment extends Home{
	private double dues;
	public Apartment(double price, String location, double dues) {
		super(price, location);
		this.dues = dues;
	}
	
	
	public double discountedPrice() {
		return getPrice() * 0.95;
	}
	
	public String toString() {
		String bilgi = "";
		bilgi += "Home Category: Apartment, Price: " + this.getPrice() + " Location: " + this.getLocation() + " Monthly dues: " + this.dues;

		return bilgi;
	}

	public double getDues() {
		return dues;
	}

	public void setDues(double dues) {
		this.dues = dues;
	}
	
	
}
