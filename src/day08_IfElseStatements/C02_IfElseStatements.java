package day08_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {

	public static void main(String[] args) {
		
		//soru2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz");
		char karakter=scan.next().charAt(0); // Kullanicidan karakter almak istiyorsak scan.next().char(0); kullanmamiz gerekir.
		
		//bir karakterin harf olup olmadigini anlamak icin google'a ASCII TABLE yazıp tabloya bakariz.
		// ASCII tablosunda bir karakterin harf olabilmesi icin ya BUYUK A ile BUYUK Z arasinda olmali
		// veya KUCUK a ile KUCUK z arasinda olmalidir.
		
		// bir karakterin harf olup olmamasi ile ilgili 2 sart vardir,ya harftir ya da harf degildir.
		// 2 ihtimal oldugu icin if else formulunu seceriz.
		
		if ((karakter>='A') && karakter<= 'Z' || (karakter>='a' && karakter<='z')) {
			System.out.println("girdiginiz :" + karakter + " bir harftir");
		} else {
       System.out.println("girdiginiz :" + karakter + "bir harf degildir" );
       
		}
		
	
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
