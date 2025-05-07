import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    public char findFirstNotRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        for (char ch : str.toCharArray()){
            if (map.get(ch) == 1)
                return ch;


        }
        return Character.MIN_VALUE;
    }
    public char findFirstRepeatingChar(String str) {
        Set<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (seen.contains(ch))
                return ch;
            seen.add(ch);
        }

        return Character.MIN_VALUE;
    }

}
