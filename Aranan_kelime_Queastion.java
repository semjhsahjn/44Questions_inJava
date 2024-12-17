// @author semih şahin
package Projects;

import java.util.Scanner;

public class Aranan_kelime_Queastion {
    public static void main(String[] args) {
       /*
        Kullanıcıdan bir cümle alın ve birde aranan kelime
        aranan kelime cümlede içermiyorsa "Cumle aranan metni içermiyor" yazdırın.
        aranan kelime cümlede bir kere içeriyorsa, "Cumle aranan metni sadece 1 adet iceriyor."
        aranan kelime birden fazlaysa "Cumle aranan metni birden fazla içeriyor!" yazdırın.
        */
        Scanner input = new Scanner (System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String text = input.nextLine();
        
        System.out.print("Aranan kelimeyi giriniz :");
        String word = input.nextLine();
        
        int firstİndex = text.indexOf(word);
        int lastİndex = text.lastIndexOf(word);
        
        if(firstİndex == -1){
            System.out.println("Cumle aranan metni içermiyor");
        }else if (firstİndex==lastİndex ){
            System.out.println("Cumle aranan metni sadece 1 adet iceriyor.");            
        } else {
            System.out.println("Cumle aranan metni birden fazla içeriyor!");
        }
        
    }
}
