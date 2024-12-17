// @author semih şahin
package Projects;

import java.util.Scanner;

public class NotOralamaHesaplama {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 6 ders notu alınız .
        ortalaması 50'nin altındaysa "kaldiniz" yazdirin.
        50 veya üstündeyse "Gectiniz!" yazdırın.
        */
        Scanner input = new Scanner (System.in);
    System.out.println("Fizik notunuz:");
    double fizik = input.nextDouble();
    System.out.println("Matematik notunuz:");
    double matematik = input.nextDouble();
    System.out.println("Turkce notunuz:");
    double türkce = input.nextDouble();
    System.out.println("Kimya notunuz:");
    double kimya = input.nextDouble();
    System.out.println("Muzik notunuz:");
    double müzik = input.nextDouble();
    System.out.println("Tarih notunuz:");
    double tarih = input.nextDouble();
    
    
    
    System.out.println("Fizik Notunuz==" + fizik);
    System.out.println("Matematik Notunuz==" + matematik);
    System.out.println("Turkce Notunuz==" + türkce);
    System.out.println("Kimya Notunuz==" + kimya);
    System.out.println("Muzik Notunuz==" + müzik);
    System.out.println("Tarih Notunuz==" + tarih);
    
    double ortalama = (fizik + matematik + türkce + kimya + müzik + tarih) / 6;
    System.out.println("Not ortalamasi : " + ortalama);
    
    if (ortalama < 50){
        System.out.println("kaldiniz");
    } else if (ortalama >= 50 && ortalama <= 100){
        System.out.println("Gectiniz!");
    } else {
        System.out.println("Beklenmedik bir HATA");
    }

    }
    
}
