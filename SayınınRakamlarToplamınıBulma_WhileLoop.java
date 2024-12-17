// @author semih şahin 
package Projects;
import java.util.Scanner;
public class SayınınRakamlarToplamınıBulma_WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
      //Verilen pozitif tamsayinin rakamlar toplamını yazdırın (WhileLoop)
        System.out.println("bir sayi giriniz");
        int girilenSayi = input.nextInt();
        int sayi = girilenSayi;
        int rakamlarınToplamı = 0;
        
        while (sayi > 0){
           rakamlarınToplamı += sayi % 10;
           sayi /= 10;
           
           if(sayi == 0){
               break;
           }
        }
        System.out.println(girilenSayi + " sayisinin rakamlarinin toplami -->" + rakamlarınToplamı);
    }
    
}
