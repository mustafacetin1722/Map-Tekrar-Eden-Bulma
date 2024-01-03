import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String karakter="Merhaba Dünya";
        Character result = karakterbulma(karakter);

        if (result != null) {
            System.out.println("İlk kendini tekrar eden karakter: " + result);
        } else {
            System.out.println("Herhangi bir kendini tekrar eden karakter bulunamadı.");
        }

    }
    public static Character karakterbulma(String karakter){
        Map<Character,Integer> karamap=new HashMap<>();

        for (char k : karakter.toCharArray()){
            if (karamap.containsKey(k)){
                return k;
            }
            karamap.put(k,1);
        }
         return null;
    }
}