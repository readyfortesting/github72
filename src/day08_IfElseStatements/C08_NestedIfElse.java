package day08_IfElseStatements;

import java.util.Scanner;

public class C08_NestedIfElse {

	public static void main(String[] args) {
	
		// Birden fazla DEGISKEN oldugu durumlarda Nested If Else kullanilir. NESTED: ÝC ÝCE DEMEKTÝR.
		// Ornek : Erkler icin emeklilik yasi 65,kadinlar icin emeklilik yasi 60
		// Birisi sorsa yasim 63 emekli olabilir miyim diye? Hemen karar veremeyiz.Cinsiyetini bilmemiz gerekir.
		// Yani 2 seye bakmamiz gerekir, hem CINSIYET hem YAS.
		
		
		// 1.adým KULLANICIDAN BÝLGÝ ALMAK ÝÇÝN scan objesi oluþturmak lazým.
		Scanner scan=new Scanner(System.in);
		
				
		// 2.adým 	KULLANICIYA MESAJ VERMEK ÝÇÝN 	System.out.println ("   ") yapýlýr.
		System.out.println("Lutfen cinsiyetinizi giriniz \nErkek icin E, Kadin icin K");
		
				
				// 3.adým KULLANICIDAN BÝLGÝ ALMAK, kesirli bir sayý istediðimiz için double kullanýrýz.
		
		// ÝLK KARAKTERÝ (ÝLK HARFÝ) alacagimiz icin char kullanýrýz.
		char cinsiyet=scan.next().toUpperCase().charAt(0); // tuUpper Case harfi buyuk veya kucuk yazarsa hata vermesin diye seceriz.
				                                                   // boylece karsima kucuk k BUYUK K, kucuk e BUYUK E gelecek.
				
		System.out.println("Lutfen yasinizi giriniz.");
		double yas=scan.nextDouble(); // Yasini yazarken kesirli yazabilir diye double sectim,killik yapabilir diye.
		
		 // 4.adým if bölümü 
		// once cinsiyete gore ayrým yaparýz.   // Burasi ERKEK alani
		
		if (cinsiyet=='E') {
			
			if (yas>=65) {  // yas BUYUK veya 60' ESÝT ise 
				System.out.println("Emekli olabilirsin");
				
			} else {     // yas 60'TAN BUYUK VEYA 60'a ESÝT degilse
               System.out.println("Emekli olamazsin"); 
               
			}
		} else if (cinsiyet=='K') {            // Burasi KADÝN alani
			
			if (yas>=60) {  // yas BUYUK veya 60' ESÝT ise 
				System.out.println("Emekli olabilirsin");
				
			} else {      // yas 60'TAN BUYUK VEYA 60'a ESÝT degilse
				
				 System.out.println("Emekli olamazsin");
			}
		} else System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz"); {  // Burasi da YANLÝS GÝRENLERE UYARÝ ALANÝ.

		} {

		}
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
