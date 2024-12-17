// @author semih şahin
package Projects;

import java.util.Scanner;

public class İsimeGöreDeğer_Question {
    public static void main(String[] args) {
        /*
        Kullanıcıdan isim ve soyisimini ayrı ayrı alın.
        - ismi daha uzun ise ,
        isim ve soyisim ilk harf buyuk kalanlar kucuk olsun
        
        - soyisim daha uzun ise
        ismi ilk harf buyuk diğerleri kucuk, soyisminin tamamı buyuk harf olacak sekilde yazın
        */
        Scanner input = new Scanner (System.in);
        
        System.out.println("Lutfen adinizi giriniz.");
        String name = input.nextLine();
        
        System.out.println("Lutfen Soyisminizi giriniz.");
        String lastName = input.nextLine();
        
        
        if (name.length() > lastName.length()){ // isim daha uzun ise
            System.out.println(   
          name.substring(0, 1).toUpperCase()+
          name.substring(1).toLowerCase()+
                  
                  " "  +
                  
          lastName.substring(0, 1).toUpperCase() +
          lastName.substring(1).toLowerCase()
     );
        }
        else if (lastName.length() > name.length()){ // soyisim daha uzun ise
            System.out.println(
            
             name.substring(0, 1).toUpperCase() +
                     name.substring(1).toLowerCase()+
                     " " +
                     lastName.substring(0).toUpperCase()
            );
        }
    }
            
}
