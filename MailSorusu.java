// @author semih şahin
package Projects;

import java.util.Scanner;

public class MailSorusu {
    public static void main(String[] args) {
      /*
        kullanıcıdan bir mail alın
        mail @ içermiyorsa "gecersiz mail"
        mail @gmail.com içermiyorsa "mail gmail olmalı"
        mail @gmail.com ile bitmiyorsa "mailde yazım hatası var yazdırın"
        */  
      Scanner input = new Scanner (System.in);
        System.out.print("Mailinizi giriniz : ");
        String email = input.nextLine();
        
        if( !email.contains("@")){
            System.out.println("Geçersiz mail");
        }
        if (!email.contains("@gmail.com")){
            System.out.println("mail gmail olmalı!");
        }
        if(!email.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }
        else{
            System.out.println("Login successful");
                  
        }
        
    }
    
}
