package Universite;

import java.util.ArrayList;

public class Universite {
	private String universiteIsmi;
	private OgretimElemani rektor;
	private ArrayList<Fakulte> fakulteler;
	
	public Universite(String universiteIsmi) {
		this.universiteIsmi = universiteIsmi;
		fakulteler = new ArrayList<Fakulte>();
	}
	
	public void fakulteEkle(Fakulte fakulte) {
		fakulteler.add(fakulte);
		System.out.println("Fakulte Basarili Sekilde Eklendi.");
	}
	
	public Fakulte isThereFakulte(String name) {
		int i = 0;
		while(i < fakulteler.size() && !fakulteler.get(i).getName().equals(name)) {
			i++;
		}
		if(i < fakulteler.size())
			return fakulteler.get(i);
		else
			return null;
	}

	public String getUniversiteIsmi() {
		return universiteIsmi;
	}

	public void setUniversiteIsmi(String universiteIsmi) {
		this.universiteIsmi = universiteIsmi;
	}

	public OgretimElemani getRektor() {
		return rektor;
	}

	public void setRektor(OgretimElemani rektor) {
		this.rektor = rektor;
	}
}
