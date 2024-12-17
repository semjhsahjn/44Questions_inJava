// @author semih şahin
package Projects;
import java.util.Scanner;

public class TekCift {
    public static void main(String[] args) {
/*
   Java ile kullanıcın girdiği tamsayinin tek veya çift oldugunu kontrol eden bir program yazınız.
*/
        Scanner input = new Scanner (System.in);
        System.out.println("Bir tam sayi giriniz");
        int number = input.nextInt();
        
       if (number % 2 == 0){
           System.out.println("Cift sayi girdiniz");
        } else if (number % 2 == 1){
            System.out.println("Tek sayi girdiniz ");
        } else {
            System.out.println("Hatalı tuslama yaptınız!");                 
        }
        
        
    }
    
}
