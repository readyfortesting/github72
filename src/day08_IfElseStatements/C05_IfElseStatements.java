package day08_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {

	public static void main(String[] args) {
		
		 // Soru 6) Kullanicidan iki sayi isteyin, 
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin, 
        // sayilarin ikisi de negative ise sayilarin carpimini yazdirin, 
        // sayilarin ikisi farkli isaretlere sahipse �farkli isaretlerde sayilarla islem yapamazsin� yazdirin, 
        // sayilardan sifira esit olan varsa �sifir carpmaya gore yutan elemandir� yazdirin.
		
		// 1.ad�m KULLANICIDAN B�LG� ALMAK ���N scan objesi olu�turmak laz�m.	
	
		Scanner scan=new Scanner(System.in);
		
		// 2.ad�m 	KULLANICIYA MESAJ VERMEK ���N 	System.out.println ("   ") yap�l�r.
      
		System.out.println("Lutfen iki sayi yaz�n�z \nilk sayidan sonra diger sayi i�in enter'e bas�niz");
        
          // 3.ad�m KULLANICIDAN B�LG� ALMAK, kesirli bir say� istedi�imiz i�in double kullan�r�z.
        
       double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
      
        // 4.ad�m if b�l�m� 
        
        if (sayi1>0 && sayi2>0) {
            System.out.println("sayilarin toplami : " + (sayi1 + sayi2));
        } else if(sayi1<0 && sayi2<0) {
            System.out.println("sayilarin carpimi : " +sayi1 *sayi2);
        } else if(sayi1*sayi2<0){
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        } else {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }
        
		
		
		
		
		
		scan.close();
		
		
		
		
		
		

	}

}
