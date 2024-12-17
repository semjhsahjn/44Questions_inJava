// @author semih şahin
package Projects;

import java.util.Scanner;

public class Metni_Düzenleme {
    public static void main(String[] args) {
    /*
    Kullanıcıdan bir String alin,
    - String uzunlugu çift sayi ise tam ortasına ":)" ekleyin.
    - Stringin uzunlugu tek sayi ise tam ortasına ":(" ekleyin.    
    */
    Scanner input = new Scanner (System.in);

     System.out.print("Bir kelime veya cumle giriniz -->");
     String text = input.nextLine();
     
     if (text.length() % 2 == 0){ //Çift ise
         System.out.println(
         
         text.substring(0,text.length() / 2)
                +":)"+ 
         text.substring(text.length()/2)

         );       
     }
     
     else { //Tek ise
         System.out.println(
                 
         text.substring(0, text.length()/2) 
                 + ":(" +
         text.substring(1+ text.length()/2)
     
         );
 }   
}
}