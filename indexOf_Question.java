// @author semih şahin
package Projects;

import java.util.Scanner;
public class indexOf_Question {
    public static void main(String[] args) {
        String text = "Ali topu at, at ali at";
        /*
        3'den fazla a harfi olan metinde 3.anın indexini yazdırın
        */
        
        int birinciIndex = text.indexOf('a'); // 9
        int ikinciIndex = text.indexOf('a',birinciIndex + 1);
        int ücüncüIndex = text.indexOf('a',ikinciIndex + 1);
        
        System.out.println("Ucuncu 'a' nin indexi = " + ücüncüIndex);
    }
    
}
