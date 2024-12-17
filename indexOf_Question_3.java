// @author semih şahin
package Projects;

public class indexOf_Question_3 {
    public static void main(String[] args) {
        /*
        metinde aranan kelimenin değerlendirmesini yapınız.
        */
        String text = "Java sen mi buyuksun, ben mi ? Elbette sen buyuksun..";
        String searchtext = "sen";
        
        int first = text.indexOf(searchtext);
        int second = text.indexOf(searchtext,first + 1);
        
         if (first == -1){
             System.out.println("cumle aranan metni icermiyor");
         } else if(first >= 0 && second == -1){
             System.out.println("cumle aranan metni sadece 1 kere iceriyor");
         }else {
             System.out.println("cumle aranan metni birden fazla iceriyor");
         }
        
    }
    
}
