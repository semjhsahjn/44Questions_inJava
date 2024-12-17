// @author semih şahin
package Projects;

import java.util.Scanner;

public class Metin_Temizleme_Question {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        /*
        - metindeki tüm fazla space'leri 
        - tüm rakamları 
        - tüm özel karakterleri yok edin
        sonra ilk harfi buyuk diger harfler kucuk olacak sekilde duzenleyin
        sonunda . yoksa . koyun.
        */          
        System.out.print("Lutfen bir metin giriniz -->");
       
          String text = input.nextLine();
       
           text = text.replaceAll("\\s+", " "); // fazla boşlukları yok edicek
           text = text.replaceAll("\\d", ""); // tüm rakamları yok edicek
           text = text.replace(" ", "4"); // bosluk yerine 4 koyduk silicez!
           text = text.replaceAll("\\W", ""); // harf,rakam, veya _ olamayanları yok et.
           text = text.replaceAll("_", "");
           text = text.replace("4", " "); // 4 yerine space yazdık!
           
           text = text.substring(0,1).toUpperCase() // 0.cı karakterden 1. karaktere kadar olan karakteri büyük harfe cevir
                   +
                   text.substring(1).toLowerCase(); // 1. indexden sonra kucuk harf yap
           
          if (text.charAt(text.length()-1) != '.') // textin son indexsi . ya eşit değilse nokta ekle!
          {
              text += ".";
          }
          
           
          System.out.println("Metnin son hali -->" + text );  
    
    
    
    }
    
}
