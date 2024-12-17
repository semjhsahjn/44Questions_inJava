// @author semih şahin
package Projects;

import java.util.Scanner;


public class Math_Question {
    public static void main(String[] args) {
        //kullanıcıdan alınan farklı ve iki adet ondalıklı sayıya
        // yukarı yuvarlama işlemi yapınız
        //ardından bu sayının kücük ve büyük olanlarını belirtip konsala yazdırınız
        
        
        Scanner input = new Scanner (System.in);
        System.out.println("birinci ondalikli sayiyi giriniz:");
        double girilen1 = input.nextDouble();
        System.out.println("ikinci ondalikli sayiyi giriniz:");
        double girilen2 = input.nextDouble();
        
        
        girilen1 = Math.ceil(girilen1);
        girilen2 = Math.ceil(girilen2);
        
        if (girilen1 < girilen2){
            System.out.println("birinci girilen kucuktur. ");
        }
        else if (girilen1 == girilen2){
            System.out.println("iki sayininda yukari yuvarlanmis hali esittir.");
        }
        else if (girilen2 < girilen1){
            System.out.println("ikinci sayi kucuktur.");
        }else {
            System.out.println("beklenmedik bir hata olustu");
        }
        
        
    
    }
    
}
