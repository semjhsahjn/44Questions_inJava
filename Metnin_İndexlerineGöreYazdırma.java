// @author semih şahin
package Projects;

import java.util.Scanner;

public class Metnin_İndexlerineGöreYazdırma {
    public static void main(String[] args) {
       /*
        Kullanıcıdan baslangıc ve bitis indexini alın .
        asagıdaki str Stringinden kullanıcının girdiği değerlere göre yazdırın
        Kullanıcı baslangıc ve bitis indexsini 0 dan küçük girerse hata versin
        baslangıc ve bitis indexsini str'ın indexsinden fazla girerse yine hata versin
        kullanıcı baslangıc indexsini bitis indexsinden fazla girerse hata versin.
        */ 
        Scanner input = new Scanner (System.in);
 
        String str = "Java her gecen gun daha da guzellesiyor.";
         
        System.out.println(str ); System.out.println(""); 
        
        System.out.println("lutfen baslangic indexsini giriniz");
        int baslangıc = input.nextInt();
        System.out.println("lutfen bitis indexsini giriniz");
        int bitis = input.nextInt();
        
        if (baslangıc < 0 || bitis < 0 || baslangıc > str.length() || bitis > str.length()){
            System.out.println("Indexler metnin sinirlari icinde olmali");
        } 
        else if (baslangıc > bitis){
            System.out.println("baslangic degeri bitis degerinden buyuk OLAMAZ");
        }
        else {
            
            for (int i = baslangıc; i < bitis ; i++){
                System.out.print(str.charAt(i));
            }
             System.out.println("");
        }  
    }  
}
