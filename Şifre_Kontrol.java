// @author semih şahin 
package Projects;
import java.util.Scanner;
public class Şifre_Kontrol {
    public static void main(String[] args) {
     /*
     Kullanıcıdan bir şifre isteyin,
     Aşağıdaki şartları kontrol edin, ve kullanıcıya duzeltmesi gereken tüm eksikleri söyleyin
     eğer tüm şartları sağlarsa, "Şifre başarıyla kaydedildi" yazdirin  
        
     - ilk harf kucuk olmali
     - son karakter rakam olmalı
     - şifre bosluk içermemeli
     - uzunlugu en az 10 karakter olmalı   
     */   
     Scanner input  = new Scanner (System.in);
        System.out.println("Lutfen sifrenizi griniz -->");
        String sifre = input.nextLine();
        
        int sayac = 0;
          
        char ilkHarf = sifre.charAt(0);
        
        if ( !Character.isLowerCase(ilkHarf)){ // İlk harf kücük değilse
            System.out.println("ilk harf kucuk olmali");
            sayac++;
        } 
        char sonkarakter = sifre.charAt(sifre.length()-1);
        
        if ( ! (sonkarakter >= '0' && sonkarakter <= '9')){ // Son karakter rakam değilse
            System.out.println("son karakter rakam olmali");
            sayac++;
        }
        if (sifre.contains(" ")){ // Şifre boşluk içeriyorsa
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }
        if (sifre.length() < 10){ // İndexi 10'dan küçükse
            System.out.println("uzunlugu en az 10 karakter olmali");
            sayac++;
        }
        if (sayac == 0){ 
            System.out.println("Sifre basariyla kaydedildi");
        }
    }
    
}
