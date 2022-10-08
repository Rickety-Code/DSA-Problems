import java.util.HashMap;
import java.util.HashSet;

public class RingsRods {
    public static void main(String[] args) {
        System.out.println(countPoints("B0R0G0R9R0B0G0"));
    }

    public static int countPoints(String rings) {

        HashMap<Character, HashSet<Character>> m = new HashMap<>();
        for (int i = 1; i < rings.length(); i += 2) {
            m.putIfAbsent(rings.charAt(i), new HashSet());
            HashSet set = m.get(rings.charAt(i));
            set.add(rings.charAt(i - 1));
            m.put(rings.charAt(i), set);
        }
        // System.out.println(m);
        int result = 0;
        for (int i = 48; i <= 57; i++) {
            char ch = (char) i;
            if (m.containsKey(ch)) {
                if (m.get(ch).size() == 3) {
                    result++;
                }
            }
        }
        return result;
    }
}
