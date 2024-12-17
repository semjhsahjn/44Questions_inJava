// @author semih şahin
package Projects;

import java.util.Scanner;

public class ManavSepetTutarıHesaplama {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
        toplam tutarını ekrana yazdıran programı yazın.
        
Ürün Kg Fiyatları;
        
Salatalık : 3,14 TL
Elma : 4,11 TL
Kabak : 2,22 TL
Domates: 0,95 TL
Patlıcan : 7,00 TL

Örnek cıktı;
        
Salatalık Kaç Kilo ? :0
Elma Kaç Kilo ? :0
Kabak Kaç Kilo ? :0
Domates Kaç Kilo ? :1
Patlıcan Kaç Kilo ? :1
Toplam Tutar : 7,95 TL      
        */
        Scanner input = new Scanner (System.in);
        System.out.print("Salatalik Kac Kilo ? :");
        double s = input.nextDouble();
        System.out.print("Elma Kac Kilo ? :");
        double e = input.nextDouble();
        System.out.print("Kabak Kac Kilo ? :");
        double k = input.nextDouble();
        System.out.print("Domates Kac Kilo ? :");
        double d = input.nextDouble();
        System.out.print("Patlican Kac Kilo ? :");
        double p = input.nextDouble(); 
        
        
       double tutar = s * 3.14 + e * 4.11 + k * 2.22 + d * 0.95 + p * 7;
        
        System.out.println("Toplam Tutar : " + tutar);
        
        
        
    }
    
}
