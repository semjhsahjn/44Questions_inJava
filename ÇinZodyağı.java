
package Projects;

import java.util.Scanner;


public class ÇinZodyağı {
  public static void main (String [] atgs){
      /*
Doğum Tarihi %12 = 0 -> Maymun
Doğum Tarihi %12 = 1 -> Horoz
Doğum Tarihi %12 = 2 -> Köpek
Doğum Tarihi %12 = 3 -> Domuz
Doğum Tarihi %12 = 4 -> Fare
Doğum Tarihi %12 = 5 -> Öküz
Doğum Tarihi %12 = 6 -> Kaplan
Doğum Tarihi %12 = 7 -> Tavşan
Doğum Tarihi %12 = 8 -> Ejderha
Doğum Tarihi %12 = 9 -> Yılan
Doğum Tarihi %12 = 10 ->At
Doğum Tarihi %12 = 11 ->Koyun
      */
      Scanner input = new Scanner (System.in);
      System.out.print("Dogum tarihinizi giriniz : (Yil olarak)");
      int year = input.nextInt();
      
      if (year % 12 == 0){
          System.out.println("Cin Zodyagi Burcunuz : Maymun " );
      }else if (year % 12 == 1){
          System.out.println("Cin Zodyagi Burcunuz : Horoz " );
      }else if (year % 12 == 2){
          System.out.println("Cin Zodyagi Burcunuz : Kopek " );
      }else if (year % 12 == 3){
          System.out.println("Cin Zodyagi Burcunuz : Domuz " );
      }else if (year % 12 == 4){
          System.out.println("Cin Zodyagi Burcunuz : Fare " );
      }else if (year % 12 == 5){
          System.out.println("Cin Zodyagi Burcunuz : Okuz " );
      }else if (year % 12 == 6){
          System.out.println("Cin Zodyagi Burcunuz : Kaplan " );
      }else if (year % 12 == 7){
          System.out.println("Cin Zodyagi Burcunuz : Tavsan " );
      }else if (year % 12 == 8){
          System.out.println("Cin Zodyagi Burcunuz : Ejderha " );
      }else if (year % 12 == 9){
          System.out.println("Cin Zodyagi Burcunuz : Yilan " );
      }else if (year % 12 == 10){
          System.out.println("Cin Zodyagi Burcunuz : At " );
      }else if (year % 12 == 11){
          System.out.println("Cin Zodyagi Burcunuz : Koyun " );
      }else {
          System.out.println("Hatali tuslama yaptiniz! " );
      }
      
      
      




  }
}
