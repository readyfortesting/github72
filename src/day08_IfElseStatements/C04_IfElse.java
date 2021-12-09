package day08_IfElseStatements;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		
		//SORU4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin
		// eger uc kenar uzunlugu birbirine esit ise ekrana "Eskenar ucgen" yazdirin.
		// Diger durumlarda ekrana  "Eskenar degil yazdirin."

		
		//1.adim SCAN OLUSTUR
		Scanner scan=new Scanner(System.in);
		
		//2.adim Kullanicidan bilgi istemek,YAZDÝRMAK
		System.out.println("Lutfen ucgenin kenar uzunluklarini yaziniz \nilk kenarý girdikten sonra diger kenarlar icin enter'a basin");
		 //  \n TERS SLASH n  cümleyi bir alt satýra kaydirir.
		
		
		// 3.adim kesirli bir sayi olma ihtimalinden DOUBLE secilir.
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		
		// 4. adim if. Bir ucgen ya eskenardir veya eskenar degildir. 2 ihtimalli oldugundan IF ELSE secilir.
		if (kenar1==kenar2 && kenar2==kenar3) {  
			System.out.println("Eskenar ucgen"); // eger kenarlar esit ise eskanar ucgen yazmasi icin syso. icine"Eskenar ucgen" yazilir.
		} else {
           System.out.println("Eskenar ucgen degil");
		}
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		

	} 

}
