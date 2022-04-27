package Universite;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int secim;
		String universiteIsmi;
		String fakulteIsmi;
		String bolumID;
		Universite universite = null;
		
		do{
			secim = menu(scanner);
			switch(secim) {
				case 1:
					scanner.nextLine();
					if(universite == null) {
						System.out.print("Universite Ismini Giriniz: ");
						universiteIsmi = scanner.nextLine();
						universite = new Universite(universiteIsmi);
					}
					else {
						System.out.println("Zaten Universite Bulunmaktadir.");
					}
					
					break;
				case 2:
					scanner.nextLine();
					if(universite != null) {
						System.out.print("Fakulte Ismini Giriniz: ");
						universite.fakulteEkle(new Fakulte(scanner.nextLine()));
					}
					else {
						System.out.println("Oncelikle universite olusturunuz.");
					}
						
					break;
				case 3:
					scanner.nextLine();
					System.out.print("Bolumu Acmak Istediginiz Fakulte Ismini Giriniz: ");
					fakulteIsmi = scanner.nextLine();
					Fakulte fakulte = new Fakulte(fakulteIsmi);
					fakulte = universite.isThereFakulte(fakulteIsmi);
					if(fakulte != null) {
						System.out.print("Bolum ID Giriniz: ");
						bolumID = scanner.nextLine();
						fakulte.bolumOlustur(new Bolum(bolumID));
					}
					else{
						System.out.println("Boyle Bir Fakulte Bulunmamaktadir.");
					}
					break;
				case 4:
					System.out.println("Basarili Sekilde Cikis Yaptiniz.");
					break;
				
			}
			
		}while(secim != 4);
		
		
		scanner.close();
	}
	
	
	public static int menu(Scanner scanner) {
		System.out.println("\n\n1. Universite Olustur");
		System.out.println("2. Fakulte Olustur");
		System.out.println("3. Bolum Olustur");
		System.out.println("4. Cikis");
		System.out.print("Seciminiz: ");
		return scanner.nextInt();
	}
}
