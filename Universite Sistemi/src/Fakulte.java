package Universite;

import java.util.ArrayList;

public class Fakulte {
	private String name;
	private ArrayList<Bolum> bolumler;
	private ArrayList<Derslik> derslikler;
	private OgretimElemani dekan;
	
	public Fakulte(String name) {
		this.name = name;
		bolumler = new ArrayList<Bolum>();
		derslikler = new ArrayList<Derslik>();
	}
	
	public void bolumOlustur(Bolum bolum) {
		bolumler.add(bolum);
		System.out.println("Bolum Basarili Sekilde Olusturuldu.");
	}
	
	public void derslikEkle(Derslik derslik) {
		derslikler.add(derslik);
		System.out.println("Derslik Basarili Sekilde Eklendi.");
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OgretimElemani getDekan() {
		return dekan;
	}

	public void setDekan(OgretimElemani dekan) {
		this.dekan = dekan;
	}
}
