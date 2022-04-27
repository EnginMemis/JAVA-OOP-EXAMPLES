package Universite;

public class Bolum {
	private String ID;
	private Fakulte bulunduguFakulte;
	
	public Bolum(String ID) {
		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public Fakulte getBulunduguFakulte() {
		return bulunduguFakulte;
	}

	public void setBulunduguFakulte(Fakulte bulunduguFakulte) {
		this.bulunduguFakulte = bulunduguFakulte;
	}
	
}
