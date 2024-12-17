// @author semih şahin
package Projects;

import java.util.Scanner;


public class Vucutİndeks {
    public static void main(String[] args) {
     /*
        Java ile kullanıcıdan boy ve kilo değerlerini alarak aşağıdaki formüle göre
        kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın
        
        Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
          Lütfen kilonuzu giriniz : 105
          Vücut Kitle İndeksiniz : 35.49215792320173
        Formül : Kilo (kg) / Boy(m) * Boy(m)
        
        18.5'ten küçükse ekrana "Zayıf"
        18.5 ile 24.9 arasında ise ekrana "İdeal"
        25 ile 29.9 arasında ise ekrana "Şişman"
        30 ile 34.9 arasında ise ekrana "Obez"
        35'ten büyükse ise ekrana "Aşırı Obez" yazsın.
        
        */
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen boyunuzu metre cinsinde (,) kullanarak giriniz : ");
        double boy = input.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz : ");
        double kg = input.nextDouble();
        
        double indeks =  kg / (boy * boy);
        
        System.out.println("Vucut kitle indeksiniz : " + indeks);
        String Sboy = (boy + "");
        
      
       if (indeks < 18){
        System.out.println("Zayif");
    }  else if (indeks >= 18 && indeks <= 25){
            System.out.println("ideal");
    }  else if (indeks > 25 && indeks <= 30){
            System.out.println("Sisman");
    } else if (indeks > 30 && indeks <= 35){
            System.out.println("Obez");
    } else{
            System.out.println("Asırı obez");
    }

    }
      
}
