import java.util.*;

public class DecodeMessage {
    public static void main(String[] args) {
         String str = decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv");
         System.out.println(str);
    }

    public static String decodeMessage(String key, String message) {
        HashMap<Character,Character> m = new HashMap<>();
        Character ch = 97;
        for(int i=0;i<key.length();i++){
            if(key.charAt(i) != ' '){
                if(!m.containsKey(key.charAt(i))){
                    m.put(key.charAt(i), ch);
                    ch++;
                }
            }
            
        }

        StringBuilder str = new StringBuilder();
        for(int i=0;i<message.length();i++){
            if(message.charAt(i) == ' '){
                str.append(' ');
            } else {
                str.append(m.get(message.charAt(i)));
            } 
        }
       return str.toString();
    }
}
