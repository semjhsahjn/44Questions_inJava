// @author semih şahin 
package Projects;
import java.util.Scanner;
public class SayınınRakamlarToplamınıBulma_ForLoop {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        //kullanıcdan pozitif bir tamsayi alıp, rakamlar toplamını yazdırın.
        
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = input.nextInt();
        int sayi = girilenSayi;
        
        int basamakSayisi = (sayi+"").length(); // int stringe çevirip basamak sayısını almak.
        int rakamlarToplamı = 0;

        for (int i = 0; i < basamakSayisi; i++) {
            
             rakamlarToplamı += sayi % 10;
               sayi /= 10;
        } 
        System.out.println("Verilen " + girilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplamı);
    }
    
}
