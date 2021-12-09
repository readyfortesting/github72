package day08_IfElseStatements;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
		
		
		//Soru3) Kullaniciya yasini sorun,eger yas 65'ten kucukse "emekli olamazsin,calismalisin"
		  // 65'e esit veya buyukse buyukse "Emekli olabilirsin" yazdirin.
		
		Scanner scan=new Scanner(System.in);    //1.adim
		
		System.out.println("Lutfen yasinizi giriniz"); //2.adim
		
		int yas=scan.nextInt();         //3.adim
		           
		if (yas<65) {                   //4.adim
			System.out.println("emekli olamazsin,calismalisin");
		} else {
           System.out.println("Emekli olabilirsin\" yazdirin");
		}                       // 2 ihtimalli durumda if else kullanýlýr. yas 65'ten kucukse emekli olamazsin yazdirilir syso ile.
		  
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		

	}

}
