package day08_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseIf {

	public static void main(String[] args) {
		
		
		
		// Soru 8) Kullanicidan maas icin bir teklif isteyin 
        //      ve asagidaki degerlere gore cevap azdirin.  
        //      Teklif 80.000�in uzerinde ise �Kabul ediyorum� , 
        //      60 � 80.000 arasinda ise �Konusabiliriz�, 
        //      60.000�nin altinda ise �Maalesef Kabul edemem� yazdirin
		
		
		// 1.ad�m KULLANICIDAN B�LG� ALMAK ���N scan objesi olu�turmak laz�m.
		 Scanner scan = new Scanner(System.in);
		 
		
		// 2.ad�m 	KULLANICIYA MESAJ VERMEK ���N 	System.out.println ("   ") yap�l�r.
		
		 System.out.println("Maas i�in bir teklif giriniz");
		
		// 3.ad�m KULLANICIDAN B�LG� ALMAK, kesirli bir say� istedi�imiz i�in double kullan�r�z.
		
		 int teklif = scan.nextInt();
		
		
		// 4.ad�m if b�l�m� 2'DEN FAZLA SART VARSE IF ELSE IF  KULLANILIR
		 
		 if (teklif>80000) { // eger teklif 80bin uzeri ise kabul ediyorum demeliyiz.
	            System.out.println("Kabul ediyorum");
	       
		 } else if(teklif>60000){  // teklif 60bin uzeriyse : 'Konusabiliriz'
	            System.out.println("Konusabiliriz");
	      
		 } else {    // Son sart,60bin altiysa :'Maalesef kabul edemem' diyecegiz.
	            System.out.println("Maalesef Kabul edemem");
	        }
		
		
		
		scan.close();
		
		
		

	}

}
