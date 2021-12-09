package day08_IfElseStatements;

import java.util.Scanner;

public class C06_IfElseStatements {

	public static void main(String[] args) {
		
		 // Soru 7) Kullanicidan 100 uzerinden notunu isteyin. 
        //          Not’u harf sistemine cevirip yazdirin. 
        //          50’den kucukse “D”, 
        //          50 ye esit ve buyuk  ve 60 dan kucuk ise “C”, 
        //          60 a esit ve buyuk  ve 80 dan kucuk ise “B”, 
        //          80 ve uzerinde ise “A” 
	
		// 1.adým KULLANICIDAN BÝLGÝ ALMAK ÝÇÝN scan objesi oluþturmak lazým.
		
		Scanner scan=new Scanner(System.in);
		
		
		// 2.adým 	KULLANICIYA MESAJ VERMEK ÝÇÝN 	System.out.println ("   ") yapýlýr.
	       
		System.out.println("Lutfen notunuzu giriniz");
        
     
		// 3.adým KULLANICIDAN BÝLGÝ ALMAK, kesirli bir sayý istediðimiz için double kullanýrýz.
	  
	     double not=scan.nextDouble();
        
	  
	  // 4.adým if bölümü 2'DEN FAZLA SART VARSE IF ELSE IF  KULLANILIR
	  
	  if (not<0 || not >100) {   //SAYÝ SIFIRDAN KUCUKSE VEYA 100'DEN BUYUKSE KULLANICI ÝCÝN ACÝKLAMA YAZDÝRSÝN.
          System.out.println("lutfen gecerli bir not yaziniz");
          
      } else if(not<50){    // NOT 50'den kucukse notunuz D
              System.out.println("Notunuz : D");
              
      } else if(not<60){                   
              System.out.println("Notunuz : C"); // NOT 50-60 ARASÝ ÝSE NOTUNUZ C
              
      } else if(not<80){
          System.out.println("Notunuz : B");
      }else {
          System.out.println("Notunuz : A");
      }
		
		//*** kod mutlaka ELSE ile bitmeli,yoksa hata verir.
		
  scan.close();
	}

}
