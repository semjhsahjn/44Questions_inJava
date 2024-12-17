// @author semih şahin
package Projects;

import java.util.Scanner;


public class EmeklilikSorusu {
    public static void main(String[] args) {
        // Kullanıcıdan yasını alınız
        // yas 65'den büyükse emekli olabilirsin
        // yas 65den kücükse "emekli olmak için ... çalışsmalısın"
        // kullanıcı 20 den kücük ve 80den büyük bir yas girerse 
        // girilen yas için emeklilik hesaplanamaz
        
        Scanner input = new Scanner (System.in);
        System.out.println("Yasinizi Giriniz");
        int yas = input.nextInt();
        
      if (yas < 20 || yas > 80){
          System.out.println("Girdiginiz yas icin emekliliik hesaplanamaz");
      } else if (yas >=65) {
          System.out.println("emekli olabilirsiniz");
      } else {
          System.out.println("Emekli olabilmeniz icin : " + (65-yas) + " yil calismaniz lazim");
      }
        
        
        
        
    }
    
}
