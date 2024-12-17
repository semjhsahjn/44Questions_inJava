// @author semih şahin 
package Projects;
import java.util.Scanner;
public class FaktoriyelYazdırma {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
//Kullanıcıdan 17'den kucuk bir tam sayi alıp,
//bu sayinin faktoriyel degerini hesaplayın.
// konsola faktoriyel hesabının nasıl yapıldıgınıda yazdırın.
// Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
 
//6! =                  6 * 5 * 4 * 3 * 2 * 1               = 720
// forloopdan önce      loop her döndüğünde i yi yazdır     loop'dan sonra
        System.out.println("Lutfen 17' den kucuk bir tam sayi giriniz -->");
        int sayi = input.nextInt();
        
        int carpım = 1;
        
        System.out.print(sayi+"!  = ");
        
        for(int i = sayi; i >= 2; i--){
            carpım *= i;
            
            System.out.print(i + " * ");
        }
        
        System.out.println("1 = " + carpım);

    }
    
}
