// @author semih şahin
package Projects;

import java.util.Scanner;

public class SıcaklığaGörePlan {
    public static void main(String[] args) {
        /*
Sıcaklık 5'den küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Tiyatro" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Mangal" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        */
        Scanner input = new Scanner (System.in);
        System.out.println("Bugun hava kac derece ? ");
        int derece = input.nextInt();
        
        if (derece <= 5){
            System.out.println("Bence bugun kayak yapmalisin !!!!!");
        } else if (derece > 5 && derece <= 15){
            System.out.println("Bugun tiyatro'ya gitmelisin!!!");
        }else if (derece > 15 && derece <= 25){
            System.out.println("Bugun mangal yapmalisiniz!!");
        } else if (derece > 25){
            System.out.println("Bugun yuzmeye gitmelisiniz!!!");
        } else {
            System.out.println("Hatalı tuslama yaptiniz!");
        }
        
        
    }
    
}
