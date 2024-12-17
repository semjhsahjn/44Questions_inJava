// @author semih şahin
package Projects;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
     /*
        Java ile gidilen kilometre verisine göre Taksimetre tutarını hesaplayıp ekrana yazdıran programı yazın.
        
Taksimetre kilometre başına 2.20 TL tutmaktadır.
Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/        

 Scanner input = new Scanner (System.in);
 
        System.out.println("Km verisini giriniz : ");
        double km = input.nextDouble();
       double baslangıc = 10;       
       double total = baslangıc + (km * 2.20); 
        
       if (total < 20 ){
           System.out.println("Ucretiniz : " + 20);
       } else {
           System.out.println("Ucretiniz : " + total);
       }
         
    }
    
}
