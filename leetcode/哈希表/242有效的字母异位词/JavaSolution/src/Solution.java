import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map_s = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            try {
                map_s.compute(s.charAt(i), (k, n) -> n + 1);
            } catch (NullPointerException e) {
                map_s.put(s.charAt(i), 1);
            }
//            if (map_s.containsKey(s.charAt(i))) {
//                map_s.put(s.charAt(i), map_s.get(s.charAt(i)) + 1);
//            } else {
//                map_s.put(s.charAt(i), 1);
//            }
        }
//        System.out.println(map_s);
        HashMap<Character, Integer> map_t = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            try {
                map_t.compute(t.charAt(i), (k, n) -> n + 1);
            } catch (NullPointerException e) {
                map_t.put(t.charAt(i), 1);
            }
//            if (map_t.containsKey(t.charAt(i))) {
//                map_t.put(t.charAt(i), map_t.get(t.charAt(i)) + 1);
//            } else {
//                map_t.put(t.charAt(i), 1);
//            }
        }
//        System.out.println(map_t);
        return map_s.equals(map_t);
    }
}