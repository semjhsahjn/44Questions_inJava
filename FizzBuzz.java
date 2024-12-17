// @author semih şahin
package Projects;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner  (System.in);
        /*
        Kullanıcıdan pozitif bir sayi alin.
        1'den baslayarak o sayiya kadar tüm sayiları yazdırın,
        sira 3 ile bölünebilen bir sayiya gelirse sayi yerine "fizz"
        sira 5 ile bölünen bir sayiya gelirse sayi yerine "buzz"
        hem 3 hem 5 ile bölünen bir sayiya gelirse sayi yerine "fizzbuzz" yazdırın.
        */
        
        //ör : 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz
        
        System.out.println("Bir pozitif tamsayi giriniz...");
        int girilenSayi = input.nextInt();
        
        for (int i = 1; i <= girilenSayi;i++){
            
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print("fizzbuzz ");   
            }
            else if (i % 3 == 0){
                System.out.print("fizz ");
            }
            else if (i % 5 == 0){
                System.out.print("buzz ");
            }
            else { //  3 veya 5 'e bölünmeyenler
                System.out.print(i+ " ");
            }
        }
    }
    
}
