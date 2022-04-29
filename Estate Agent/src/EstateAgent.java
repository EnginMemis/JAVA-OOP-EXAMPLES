package enginmemiþ;

public class EstateAgent {
	private String name;
	private Home[] h;
	
	public EstateAgent() {
		h = new Home[5];
	}
	
	public void hasHome(Home home) {
		int i = 0;
		while(i < 5 && h[i] != null) {
			i++;
		}
		if(i >= 5)
			System.out.println("Daha Fazla Ev Eklenememektedir!");
		else
			h[i] = home;
	}
	
	public void listHome() {
		System.out.println("Welcome to ABC Real Estate Agent");
		System.out.println("Here is the homes:");
		for(Home home : h) {
			if(home != null)
				System.out.println(home.toString());
		}
	}
	
	public void sellHome(Home home, Customer customer) {
		int i = 0;
		while(i < 5 && h[i] != home) {
			i++;
		}
		if(i < 5) {
			customer.buyHome(home);
			h[i] = null;
		}
		else
			System.out.println("Boyle Bir Eve Sahip Degildir!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
