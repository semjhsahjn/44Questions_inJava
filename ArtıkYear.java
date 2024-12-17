// @author semih şahin
package Projects;

import java.util.Scanner;

public class ArtıkYear {
public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Enter year");
    int year = input.nextInt();
    
     if ( year % 400 == 0 ){
         System.out.println("Artık yil girdiniz");
     } else if (year % 4 == 0 ){
         System.out.println("Artık yil girdiniz");
     } else {
         System.out.println("Artik yil girmediniz");
                 
     }
}    
}
