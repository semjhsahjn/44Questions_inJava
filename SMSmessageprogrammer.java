// @author semih şahin
package Projects;

import java.util.Scanner;

public class SMSmessageprogrammer {
    public static void main(String[] args) {
        /*
 ornek cıktı;       
Lütfen mesajınızı girin:
Merhaba, nasılsın? Bugün hava nasıl?
Mesajınız 36 karakterden oluşuyor ve 1 SMS'e bölünebilir.

Java ile kullanıcı girdiği metinin mesaj boyunu hesaplayan programı yazın.
Her bir mesaj karakter sınırı 160 kelimedir.        
        */
        //length
      Scanner input = new Scanner (System.in);
        System.out.println("Mesajinizi giriniz : ");
        String message = input.nextLine();
        
        double smsLength = message.length() / 160.0;               
        smsLength = Math.ceil(smsLength);
        int karakter = message.length();
        
        System.out.println("Mesajiniz " + (karakter) + "karakterden olusuyor ve " + (int) (smsLength) + " SMS'e bolunebilir");
        
        
      
      
    }
    
}
