// @author semih şahin
package Projects;

import java.util.Scanner;

public class AradakiSayilariToplama2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);    
      // Kullacıdan baslangıc ve bitiş değeri olarak pozitif sayilar alin.
      // sınırlar dahil olarak aralarındaki tüm sayilarının toplamını yazdırın.
      //bitis değeri baslangıc değerinden kucuk olsa da program calıssın.
    
        System.out.print("Lutfen baslangic icin pozitif bir tamsayi giriniz -->");
        int baslangıc = input.nextInt();
        System.out.print("Lutfen bitis icin pozitif bir tamsayi giriniz -->");
        int bitis = input.nextInt();
             
             int toplam = 0;             
        
            if (baslangıc < 0 || bitis < 0){
                System.out.println("Baslangic ve bitis degerleri pozitif olmali");
            }
            else if (baslangıc < bitis ){
                     
                for (int i = baslangıc; i <= bitis ;i++){
                       toplam += i ;
                }
            }
            else {
                for (int i = bitis ;  i <= baslangıc; i++){
                    toplam += i;
                }  
            }
             System.out.println(baslangıc + "ile" + bitis + " arasindaki sayilarin toplami " + toplam );
    }
}
