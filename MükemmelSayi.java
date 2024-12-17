// @author semih şahin
package Projects;

import java.util.Scanner;

public class MükemmelSayi {
    /*
    Bir sayının mükemmel sayı olması için,
    kendisi hariç pozitif tam bölenlerinin toplamının kendisine eşit olması gerekmektedir.
    */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in); 
        System.out.println("Bir sayi giriniz ! = ");
        int n = input.nextInt();
        
        int total =0;
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                total += i;
            }
        }
        
    if (total == n ){
        System.out.println("Mukemmel sayi");
    }
    else if (total != n){
        System.out.println("Mukemmel sayi degil");
    }
    }
    
}
