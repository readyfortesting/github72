package day08_IfElseStatements;

import java.util.Scanner;

public class C08_NestedIfElse {

	public static void main(String[] args) {
	
		// Birden fazla DEGISKEN oldugu durumlarda Nested If Else kullanilir. NESTED: �C �CE DEMEKT�R.
		// Ornek : Erkler icin emeklilik yasi 65,kadinlar icin emeklilik yasi 60
		// Birisi sorsa yasim 63 emekli olabilir miyim diye? Hemen karar veremeyiz.Cinsiyetini bilmemiz gerekir.
		// Yani 2 seye bakmamiz gerekir, hem CINSIYET hem YAS.
		
		
		// 1.ad�m KULLANICIDAN B�LG� ALMAK ���N scan objesi olu�turmak laz�m.
		Scanner scan=new Scanner(System.in);
		
				
		// 2.ad�m 	KULLANICIYA MESAJ VERMEK ���N 	System.out.println ("   ") yap�l�r.
		System.out.println("Lutfen cinsiyetinizi giriniz \nErkek icin E, Kadin icin K");
		
				
				// 3.ad�m KULLANICIDAN B�LG� ALMAK, kesirli bir say� istedi�imiz i�in double kullan�r�z.
		
		// �LK KARAKTER� (�LK HARF�) alacagimiz icin char kullan�r�z.
		char cinsiyet=scan.next().toUpperCase().charAt(0); // tuUpper Case harfi buyuk veya kucuk yazarsa hata vermesin diye seceriz.
				                                                   // boylece karsima kucuk k BUYUK K, kucuk e BUYUK E gelecek.
				
		System.out.println("Lutfen yasinizi giriniz.");
		double yas=scan.nextDouble(); // Yasini yazarken kesirli yazabilir diye double sectim,killik yapabilir diye.
		
		 // 4.ad�m if b�l�m� 
		// once cinsiyete gore ayr�m yapar�z.   // Burasi ERKEK alani
		
		if (cinsiyet=='E') {
			
			if (yas>=65) {  // yas BUYUK veya 60' ES�T ise 
				System.out.println("Emekli olabilirsin");
				
			} else {     // yas 60'TAN BUYUK VEYA 60'a ES�T degilse
               System.out.println("Emekli olamazsin"); 
               
			}
		} else if (cinsiyet=='K') {            // Burasi KAD�N alani
			
			if (yas>=60) {  // yas BUYUK veya 60' ES�T ise 
				System.out.println("Emekli olabilirsin");
				
			} else {      // yas 60'TAN BUYUK VEYA 60'a ES�T degilse
				
				 System.out.println("Emekli olamazsin");
			}
		} else System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz"); {  // Burasi da YANL�S G�RENLERE UYAR� ALAN�.

		} {

		}
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
