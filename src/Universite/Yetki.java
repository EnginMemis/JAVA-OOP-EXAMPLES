package Universite;

public class Yetki {
	private int ID;
	private String name;
	
	public Yetki(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	
	public void showInfos() {
		System.out.println(this.ID + " numarali " + this.name);
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
