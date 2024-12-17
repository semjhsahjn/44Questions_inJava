// @author semih şahin
package Projects;

import java.util.Scanner;

public class BasicHesapMakinesi_İfelse {
    public static void main(String[] args) {
        /*
        Java ile girilen 2 sayı ile kullanıcının seçtiği 4 işlemleri yapabilen bir hesap makinesi yapınız.
        (İfElse ile)
        */
        Scanner input = new Scanner (System.in);
        System.out.println("Yapicaginiz islemi secin -->  + - * /");
        char islem = input.next().charAt(0);
        System.out.println("birinci sayiyi giriniz : ");
        double s1 = input.nextDouble();
        System.out.println("ikinci sayiyi giriniz : ");
        double s2 = input.nextDouble();
        
        
        
        if (islem == '+'){
            System.out.println("Toplami == " + (s1 + s2));
        } else if (islem == '-'){
            System.out.println("Cikarma == " + (s1 - s2) );
        } else if (islem == '*'){
            System.out.println("Carpma == " + (s1 * s2) );
        } else if (islem == '/'){
            System.out.println("Bolmesi == " + (s1 / s2) );
        } else {
            System.out.println("Hatali tuslama yaptiniz!");
        }
    
    
    
    
    
        
    }
    
}
