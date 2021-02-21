import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Siparis {
	
	public static void AnaMenu() {
		System.out.println("\t\t\t\t\tHOSGELDINIZ");
		System.out.println("\t\t\t=========================================");
		System.out.println("\t\t\t\tLutfen reyon no giriniz");
		System.out.println("\t\t\t1. MANAV");
		System.out.println("\t\t\t2. SARKUTERI");
		System.out.println("\t\t\t3. ICECEK");
		System.out.println("\t\t\t4. ATISTIRMALIK");
		System.out.println("\t\t\t5. TEMEL GIDA");
		System.out.println("\t\t\t6. KISISEL BAKIM");
		System.out.println("\t\t\t=========================================");
		
	}
	
	
	static String tekrar;
	int adet;
	static double SepetTutari=0;
	
	/////////////mototlar//////////////////////////////
	public static void Manav1() {
		
		
		System.out.println("\t\t\t\t\tURUNLER");
		System.out.println("\t\t\t=========================================");
		
		
		//https://www.youtube.com/watch?v=lHFlAYaNfdo&t=282s
		//dosya yazdýrma 
		File file = new File("/Users/dilay/Desktop/java/MarketSiparis/Manav.txt");
		Scanner scan = null;
						try {
								scan = new Scanner(file);
								} catch (FileNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
											}
		//while döngüsü ile her satýrý yazdýrma
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		Scanner girdi = new Scanner(System.in);
		System.out.println("\t\t\t\t\t");
		System.out.println("Almak istediginiz ürünün numarasýný giriniz:");
		int UrunNo = girdi.nextInt();
		int i = UrunNo;
		System.out.println("\t\t\t\t\t");
		System.out.println("Almak istediginiz miktarý giriniz:");
		int miktar = girdi.nextInt();
		Manav m = new Manav();
		SepetTutari = SepetTutari + (m.manav[i]*miktar);
		
			
	}
	
public static void Sarkuteri2() {
		
		
		System.out.println("\t\t\t\t\tURUNLER");
		System.out.println("\t\t\t=========================================");
		
		
		//https://www.youtube.com/watch?v=lHFlAYaNfdo&t=282s
		//dosya yazdýrma 
		File file = new File("/Users/dilay/Desktop/java/MarketSiparis/Sarkuteri.txt");
		Scanner scan = null;
						try {
								scan = new Scanner(file);
								} catch (FileNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
											}
		//while döngüsü ile her satýrý yazdýrma
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		Scanner girdi = new Scanner(System.in);
		System.out.println("\t\t\t\t\t");
		System.out.println("Almak istediginiz ürünün numarasýný giriniz:");
		int UrunNo = girdi.nextInt();
		int i = UrunNo;
		System.out.println("\t\t\t\t\t");
		System.out.println("Almak istediginiz miktarý giriniz:");
		int miktar = girdi.nextInt();
		Sarkuteri s = new Sarkuteri();
		SepetTutari = SepetTutari + (s.sarkuteri[i]*miktar);
		
			
	}
public static void Icecek3() {
	
	
	System.out.println("\t\t\t\t\tURUNLER");
	System.out.println("\t\t\t=========================================");
	
	
	//https://www.youtube.com/watch?v=lHFlAYaNfdo&t=282s
	//dosya yazdýrma 
	File file = new File("/Users/dilay/Desktop/java/MarketSiparis/Icecek.txt");
	Scanner scan = null;
					try {
							scan = new Scanner(file);
							} catch (FileNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
										}
	//while döngüsü ile her satýrý yazdýrma
	while(scan.hasNextLine()) {
		System.out.println(scan.nextLine());
	}
	Scanner girdi = new Scanner(System.in);
	System.out.println("\t\t\t\t\t");
	System.out.println("Almak istediginiz ürünün numarasýný giriniz:");
	int UrunNo = girdi.nextInt();
	int i = UrunNo;
	System.out.println("\t\t\t\t\t");
	System.out.println("Almak istediginiz miktarý giriniz:");
	int miktar = girdi.nextInt();
	Icecek c = new Icecek();
	SepetTutari = SepetTutari + (c.icecek[i]*miktar);
	
		
}
public static void Atistirmalik4() {
	
	
	System.out.println("\t\t\t\t\tURUNLER");
	System.out.println("\t\t\t=========================================");
	
	
	//https://www.youtube.com/watch?v=lHFlAYaNfdo&t=282s
	//dosya yazdýrma 
	File file = new File("/Users/dilay/Desktop/java/MarketSiparis/Atistirmalik.txt");
	Scanner scan = null;
					try {
							scan = new Scanner(file);
							} catch (FileNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
										}
	//while döngüsü ile her satýrý yazdýrma
	while(scan.hasNextLine()) {
		System.out.println(scan.nextLine());
	}
	Scanner girdi = new Scanner(System.in);
	System.out.println("\t\t\t\t\t");
	System.out.println("Almak istediginiz ürünün numarasýný giriniz:");
	int UrunNo = girdi.nextInt();
	int i = UrunNo;
	System.out.println("\t\t\t\t\t");
	System.out.println("Almak istediginiz miktarý giriniz:");
	int miktar = girdi.nextInt();
	Atistirmalik a = new Atistirmalik();
	SepetTutari = SepetTutari + (a.atistirmalik[i]*miktar);
	
		
}
public static void TemelGida5() {
	
	
	System.out.println("\t\t\t\t\tURUNLER");
	System.out.println("\t\t\t=========================================");
	
	
	//https://www.youtube.com/watch?v=lHFlAYaNfdo&t=282s
	//dosya yazdýrma 
	File file = new File("/Users/dilay/Desktop/java/MarketSiparis/TemelGida.txt");
	Scanner scan = null;
					try {
							scan = new Scanner(file);
							} catch (FileNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
										}
	//while döngüsü ile her satýrý yazdýrma
	while(scan.hasNextLine()) {
		System.out.println(scan.nextLine());
	}
	Scanner girdi = new Scanner(System.in);
	System.out.println("\t\t\t\t\t");
	System.out.println("Almak istediginiz ürünün numarasýný giriniz:");
	int UrunNo = girdi.nextInt();
	int i = UrunNo;
	System.out.println("\t\t\t\t\t");
	System.out.println("Almak istediginiz miktarý giriniz:");
	int miktar = girdi.nextInt();
	TemelGida t = new TemelGida();
	SepetTutari = SepetTutari + (t.temel[i]*miktar);
	
		
}
public static void KisiselBakim6() {
	
	
	System.out.println("\t\t\t\t\tURUNLER");
	System.out.println("\t\t\t=========================================");
	
	
	//https://www.youtube.com/watch?v=lHFlAYaNfdo&t=282s
	//dosya yazdýrma 
	File file = new File("/Users/dilay/Desktop/java/MarketSiparis/KisiselBakim.txt");
	Scanner scan = null;
					try {
							scan = new Scanner(file);
							} catch (FileNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
										}
	//while döngüsü ile her satýrý yazdýrma
	while(scan.hasNextLine()) {
		System.out.println(scan.nextLine());
	}
	Scanner girdi = new Scanner(System.in);
	System.out.println("\t\t\t\t\t");
	System.out.println("Almak istediginiz ürünün numarasýný giriniz:");
	int UrunNo = girdi.nextInt();
	int i = UrunNo;
	System.out.println("\t\t\t\t\t");
	System.out.println("Almak istediginiz miktarý giriniz:");
	int miktar = girdi.nextInt();
	KisiselBakim k = new KisiselBakim();
	SepetTutari = SepetTutari + (k.kisisel[i]*miktar);
	
		
}
	
	public static void Alisveris()  {
		
		
		
		Scanner girdi = new Scanner(System.in);
		int reyon = girdi.nextInt();
		System.out.println("Secilen reyon : "+reyon);
		
		if (reyon==1) 
		{
			Manav1();
			
		} else if (reyon==2) 
		{
			Sarkuteri2();
			
		} else if (reyon==3)
		{
			Icecek3();
			
		} else if (reyon==4) 
		{
			Atistirmalik4();
			
		} else if (reyon==5) 
		{
			TemelGida5();
			
		} else if (reyon==6) 
		{
			KisiselBakim6();
			
		} else {
			System.out.println("Lutfen dogru deger giriniz ");
		}
		
		
		System.out.println("Alýþveriþe devam	-->	A  ");
		System.out.println("Alýþveriþi Bitir	-->	B  ");
		tekrar = girdi.next();
		
		//equalsIgnoreCase ile string karþýlaþtýrmasý yapýlýr
		if (tekrar.equalsIgnoreCase("A")) {
			AnaMenu();
			Alisveris();
			
		} else {
		System.out.println("SEPET TUTARINIZ1   "+SepetTutari+"TL");
		}
		
			
}
		
	
	
	public static void main(String[] args) {
		
		AnaMenu();
		Alisveris();
	}
}
	


