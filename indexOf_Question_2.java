// @author semih şahin
package Projects;

public class indexOf_Question_2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldıgınız texde 3 veya daha fazla e olup olmadıgını yazdırın.
        */
        String text = "evde oyun oynarken, evi cok dagittik";
        
        int birinci = text.indexOf('e');
        int ikinci = text.indexOf('e',birinci + 1);
        int ücüncü = text.indexOf('e',ikinci + 1);
        
        System.out.println(text);
        
        if (ücüncü >= 3){
            System.out.println("3 veya daha fazla 'e' mevcutdur");
        }else{
            System.out.println("3'den az 'e' vardır");
        }
    }
}
