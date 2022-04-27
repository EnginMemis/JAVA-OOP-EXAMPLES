package Universite;

public class Derslik {
	private String ID;
	private int kapasite;
	private Bolum bulunduguBolum;
	
	public Derslik(String ID, int kapasite, Bolum bulunduguBolum) {
		this.ID = ID;
		this.kapasite = kapasite;
		this.bulunduguBolum = bulunduguBolum;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getKapasite() {
		return kapasite;
	}

	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}

	public Bolum getBulunduguBolum() {
		return bulunduguBolum;
	}

	public void setBulunduguBolum(Bolum bulunduguBolum) {
		this.bulunduguBolum = bulunduguBolum;
	}
}
