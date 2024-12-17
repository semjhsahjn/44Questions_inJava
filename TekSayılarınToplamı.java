// @author semih şahin
package Projects;

import java.util.Scanner;

public class TekSayılarınToplamı {
    public static void main(String[] args) {
       
/*
Örnek Çıktı
Sayı Giriniz : 2
Sayı Giriniz : 3
Sayı Giriniz : 7
Sayı Giriniz : -15
Toplam : 10
        
       Kullanıcı negatif  bir sayi girene kadar sayı al  
*/ 
    
    Scanner input = new Scanner (System.in);
 int tekSayi = 0;
      while (true){
            System.out.println("Sayi giriniz");
            int sayi = input.nextInt();
            
            if(sayi % 2 == 1){
                tekSayi += sayi;
            }
            else if (sayi < 0){
                break;
            }
}    
        System.out.println("Toplami : " + tekSayi);
}
}
