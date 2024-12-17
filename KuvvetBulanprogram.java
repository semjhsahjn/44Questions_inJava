// @author semih şahin
package Projects;

import java.util.Scanner;

public class KuvvetBulanprogram {
    /*
    Java ile girilen sayıya kadar olan,
    n değerininde kullacıdan alındığı n sayısının kuvvetlerini ekrana yazdıran programı yazıyoruz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("N degerini giriniz = ");
        int n = input.nextInt();
        System.out.println("Sinir degerini giriniz = ");
        int s = input.nextInt();
        
        
        for(int i = 1; i <= s; i*=n){
            System.out.println(i);
        }
    }
    
}
