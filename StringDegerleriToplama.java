// @author semih şahin
package Projects;

public class StringDegerleriToplama {
    public static void main(String[] args) {
        /*
        kullanıcıdan belirli bir formatta verdiği String fiyatları toplayıp yazdırın.
        sondaki para birimi değişkendir . yazılan kod tum para birimleri ile çalısmalıdır.
        input1 : "15.30$"  , input2 = "11.45 $"
        output : 26.75 $
        */
        
        String input1 = "15.30 $";
        String input2 = "11.45 $";
        
        // önce para birimini alip kaydedelim
        
        int spaceIndex = input1.indexOf(" "); // boşlugun indexini bul (5)
        
        String ParaBirimi = input1.substring(spaceIndex); // 5.indexden sonrasını al
        
        input1 = input1.replaceAll("\\D", ""); // "1530"
        input2 = input2.replaceAll("\\D", ""); // "1145"
        
        double fiyat1 = Double.parseDouble(input1); //double'a çevirme
        double fiyat2 = Double.parseDouble(input2); //double'a çevirme

        double total = (fiyat1 + fiyat2)/100;
        
        System.out.println("Verilen fiyatların toplami : " + total + ParaBirimi);
    }
    
}
