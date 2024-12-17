// @author semih şahin
package Projects;

import java.util.Scanner;

public class AradakiHarfleriYazdirma_doWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    
    //Kullanıcıdan baslangıc ve bitis harflerini alıp,
    //o harfleri ve aralarındaki harfleri yazdirin.
    
        System.out.println("Baslangic ve bitis icin birer harf giriniz..");
        char baslangic = input.next().charAt(0);
        
        char bitis = input.next().charAt(0);
        
       
        
        do {            
            System.out.print(baslangic + " ");
            baslangic++;
        } while (baslangic <= bitis);
    
    }
    
}
