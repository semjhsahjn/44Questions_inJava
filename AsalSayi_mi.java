// @author semih şahin
package Projects;

import java.util.Scanner;

public class AsalSayi_mi {
    public static void main(String[] args) {
        /*
        Bir sayinin asal sayi olup olmadagını kontrol ediniz.
        */
        Scanner input = new Scanner (System.in);
        System.out.println("Bir sayi giriniz = ");
        int number = input.nextInt();
        
        boolean isPrime = true;
        
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        
    if (isPrime){
        System.out.println(number + " sayisi asaldir");
    }else {
        System.out.println(number + " sayisi asal degildir ");
    }
    }
    
} 
