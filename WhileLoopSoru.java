// @author semih şahin 
package Projects;
import java.util.Scanner;
public class WhileLoopSoru {
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
       //Kullanıcıdan toplanmak üzere pozitif tam sayılar isteyin
       //kullanıcı tamsayi verdigi müddetce toplamaya ekleyin.
       // 0 veya negatif sayi girerse, uyarı yazdirip , sayiyi toplamaya eklemeyin
       // toplam 500 veya daha fazla oluncaya kadar sayi istemeye devam edin
       // toplam sınırı gecince kac pozitif sayi girdiğini
       //ve toplamlarinin kac oldugunu yazdirin

       int toplam = 0;
       int sayi = 0;
       int sayac = 0;

         while (toplam < 500){
             System.out.print("Lutfen toplanmasini istediginiz pozitif sayilari giriniz : " );
             sayi = input.nextInt();
             
             
             if (sayi <= 0){
                 System.out.println("Pozitif bir tamsayi giriniz.");
             } else {
                 toplam += sayi ;
                 sayac++;
             }
         
         }
         
         System.out.println("Girilen " + sayac + " adet sayinin toplami = " + toplam );
         

    }
    
}
