// @author semih şahin
package Projects;

import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
          /*
    Java dili ile
    kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    Tutar Giriniz : 100
    KDV Oranı : %18
    KDV Tutarı : 18.00
    KDV'li Tutar : 118.0
    */   
    Scanner input = new Scanner (System.in);
        System.out.print("Tutar  Giriniz : ");    
         double tutar = input.nextDouble();
    
         double kdvoranı = 18;
      
         double kdvtutar = tutar * (kdvoranı / 100);
         
         double total = tutar + kdvtutar;
         
         System.out.println("KDV Orani : %" + (int) kdvoranı);
         System.out.println("KDV Tutari : " + kdvtutar);
         System.out.println("KDV'li tutar : " + total);
          
    }
    
}
