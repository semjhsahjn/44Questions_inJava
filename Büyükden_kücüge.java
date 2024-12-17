// @author semih şahin
package Projects;

import java.util.Scanner;

public class Büyükden_kücüge {
    public static void main(String[] args) {
        /*
        Java ile kullanıcının girdiği 3 sayıyı büyükten küçüğe sıralayan programı yazınız.
        */
        
        Scanner input = new Scanner (System.in);
 
        System.out.println("birinci sayiyi giriniz = ");
        double s1 = input.nextDouble();
        System.out.println("ikinci sayiyi giriniz = ");
        double s2 = input.nextDouble();
        System.out.println("ucuncu sayiyi giriniz = ");
        double s3 = input.nextDouble();
        
     double buyuk = Math.max(s1, Math.max(s2, s3));
    
        System.out.println("Buyuk olan deger = " + buyuk);
    
    
    }
    
}
