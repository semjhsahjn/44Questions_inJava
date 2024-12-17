// @author semih şahin
package Projects;

import java.util.Scanner;

public class BasicHesapMakinesi_Switch {
    public static void main(String[] args) {
        /*
        Java ile girilen 2 sayı ile kullanıcının seçtiği 4 işlemleri yapabilen bir hesap makinesi yapınız.
        (Switch case)
        */
        Scanner input = new Scanner (System.in);
    
    System.out.println("Toplama islemi icin  1 'e tiklayiniz ");
    System.out.println("Cikarma islemi icin  2 'ye tiklayiniz ");
    System.out.println("Carpma islemi icin  3 'e tiklayiniz ");
    System.out.println("Bolme islemi icin  4 'e tiklayiniz ");
    byte değer = input.nextByte();
    
        System.out.println("Birinci sayiyi giriniz");
        double s1 = input.nextDouble();
        System.out.println("Birinci sayiyi giriniz");
        double s2 = input.nextDouble();
    switch (değer){
        
        case 1 :
            System.out.println("Toplami = " + (s1 + s2) );
        break;
        
        case 2 :
            System.out.println("Cikarmasi = " + (s1 - s2) );
        break ;
        
        case 3 :
            System.out.println("Carpmasi = " + (s1 * s2) );
        break;
        
        case 4 :
            System.out.println("Bolmesi = " + (s1 / s2) );
        break;
        
        default:
            System.out.println("Hatali tuslama yaptiniz!");
    }
    
    
    }
    
}
