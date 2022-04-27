package Universite;

import java.util.ArrayList;

public class OgretimElemani extends Person{
	private int ID;
	private ArrayList<Yetki> yetkiler;
	
	public OgretimElemani(String name, String surname, int age) {
		super(name, surname, age);
		yetkiler = new ArrayList<Yetki>();
	}
	
	public void yetkiEkle(Yetki yetki) {
		yetkiler.add(yetki);
		System.out.println("Yetki Basarili Sekilde Eklendi.");
	}
	
	public Yetki getYetki(int ID) {
		int i = 0;
		while(i < yetkiler.size() && yetkiler.get(i).getID() != ID) {
			i++;
		}
		if(i < yetkiler.size())
			return yetkiler.get(i);
		else
			return null;
	}
	
	public void showInfos() {
		System.out.println("Isim: " + this.getName() + " Soyisim: " + this.getSurname() + " Yas: " + this.getAge());
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

}
