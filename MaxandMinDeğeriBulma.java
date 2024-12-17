// @author semih şahin
package Projects;

import java.util.Scanner;

public class MaxandMinDeğeriBulma {
    public static void main(String[] args) {
       /*
        Örnek cıktı;
Kaç adet sayı gireceksiniz: 5
1. sayıyı giriniz: 12
2. sayıyı giriniz: 25
3. sayıyı giriniz: 6
4. sayıyı giriniz: 17
5. sayıyı giriniz: 9
Girilen sayılar arasında en küçük sayı: 6
Girilen sayılar arasında en büyük sayı: 25
        */
        
        Scanner input = new Scanner (System.in);
        System.out.print("Kac adet sayi giriceksiniz ? : "); 
        int n = input.nextInt();
        
        int max =0;
        int min =0;
        for (int i = 1; i <= n; i++){
            System.out.println(i + ".ci sayiyi giriniz ");
            int number = input.nextInt();
            if (number < min || min == 0){
                min = number;
            }
            if (number > max){
                max = number;
            }
        }
           
            System.out.println("Kucuk olan sayi == " + min); 
            System.out.println("Buyuk olan sayi = " + max); 
    }
    
}
