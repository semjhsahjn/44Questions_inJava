// @author semih şahin
package Projects;

import java.util.Scanner;

public class MetniTerstenYazdırma {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);      
    // Kullanıcdan bir String isteyin ve String'i tersten yazdirin.
    
        System.out.println("Bir text girin ...");
        String text = input.nextLine();
        
        for (int i = text.length()-1; i >= 0; i--) {
            
            System.out.print(text.charAt(i));
        }
    
    }
    
}
