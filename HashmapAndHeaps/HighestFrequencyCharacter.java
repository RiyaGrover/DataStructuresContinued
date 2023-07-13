import java.io.*;
import java.util.*;

 public class Main {

   public static void main(String[] args) throws Exception{
       
        String str = "babcccdbabcccd";

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0 ; i < str.length() ;i++) {
            char ch = str.charAt(i);

            if( hm.containsKey(ch)) {
                int oldFrequency = hm.get(ch);
                int newFrequency = oldFrequency+1;
                hm.put(ch , newFrequency);

            } else {
                hm.put(ch, 1);
            }
        }

        char maxFrquencyCharacter = str.charAt(0); // for eg b
        for(Character key : hm.keySet()) {
            if(hm.get(key) > hm.get(maxFrquencyCharacter)) {
                maxFrquencyCharacter = key;
            }
        }

        System.out.println(maxFrquencyCharacter);
         System.out.println(hm.get(maxFrquencyCharacter));


    }
}