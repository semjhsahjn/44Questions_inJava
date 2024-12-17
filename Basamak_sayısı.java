// @author semih şahin
package Projects;

import java.util.Scanner;

public class Basamak_sayısı {
    public static void main(String[] args) {
        /*
        Bir tam sayinin basamak değerini bulun. 
        */
        Scanner input = new Scanner (System.in);
        System.out.print("Sayi giriniz : ");
        int number = input.nextInt();
        int digitCount = 0;
        do {            
            number = number / 10;
            digitCount++;
        } while (number !=0);
        System.out.println("Basamak sayisi " + digitCount);
    }
    
    
}
