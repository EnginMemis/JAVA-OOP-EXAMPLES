package enginmemis;

public class Villa extends Home{
	public Villa(double price, String location) {
		super(price, location);
	}
	
	public double discountedPrice() {
		return getPrice() * 0.90;
	}
	
	public String toString() {
		String bilgi = "";
		bilgi += "Home Category: Villa, Price: " + this.getPrice() + " Location: " + this.getLocation();
		return bilgi;
	}
}
