// @author semih şahin
package Projects;

import java.util.Scanner;

public class AradakiSayilariToplama {
    public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
        /*
       -Kullanıcıdan başlangıç ve bitiş degeri olarak pozitif sayılar alın,
       -sınırlar dahil olarak aralarındaki tum sayilarin toplamını yazdırın.
       -Bitiş değeri baslangıc değerinden kucukse, uyari yazdırıp işlemi sonlandırın.
        */        
        System.out.print("Lutfen baslangic icin pozitif bir tamsayi giriniz -->");
        int baslangıc = input.nextInt();
        System.out.print("Lutfen bitis icin pozitif bir tam sayi giriniz -->");
        int bitis = input.nextInt();
        
        int toplam = 0;
        
        if (bitis < baslangıc){
            System.out.println("UYARI!");       
        }
        else {
            for (int i = baslangıc; i <= bitis; i++){
                
                toplam += i;
            }
            System.out.println(baslangıc + "ile" + bitis + " arasindaki sayilarin toplami " + toplam );
        }
        
        
    }
   
}
