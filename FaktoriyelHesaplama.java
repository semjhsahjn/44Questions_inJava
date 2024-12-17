// @author semih şahin 
package Projects;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
    /*
    Kullanıcıdan 17'den kücük pozitif bir tam sayi isteyin.
    bu sayinin faktariyelini hesaplayın.
    */
    Scanner input = new Scanner (System.in);
    
        System.out.println("18'den kucuk bir tam sayi giriniz -->");
        int sayi = input.nextInt();
         
        int carpım = 1;
        for (int i = sayi; i >= 1 ; i-- ){
            carpım *= i;
        }
        System.out.println(sayi + "! sayisin faktoriyel acilimi " +  carpım + "dir.");
    
    }
}
