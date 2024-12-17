// @author semih şahin
package Projects;
import java.util.Scanner;
public class Palindrome_testi {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     // bir textin (metnin) tersden yazılışı kendisiyle aynıysa PALİNDROME DENİR.
     // kullanıcdan bir text alın.
     // textin tersten yazılmış hali kendisiyle eşitse "PALİNDROME" yazdırın. 
     // değilse "PALİNDROME DEĞİL" yazdırın.
    
     // Ör : madam metninin terside madam 'dır.
     
     System.out.println("Bir metin giriniz..");
        String metin = input.nextLine();
        
        String tersMetin = "";
        
        for (int i = metin.length()-1; i >= 0; i-- ){
            
          tersMetin += metin.charAt(i);
            
        }
        System.out.print(tersMetin);
        
        System.out.println(" ");
        if(metin.equalsIgnoreCase(tersMetin)){
            System.out.println("PALINDROME");
        } else {
            System.out.println("PALINDROME DEGIL");
        }
    }
    
}
