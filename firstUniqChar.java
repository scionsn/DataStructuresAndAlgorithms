import java.util.LinkedHashMap;

public class firstUniqChar {
    // soln -1
    public int firstUniqCharfunc1(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) == 1)
                return s.indexOf(c);
        }
        return -1;
    }

    // just in case if we cant use inbuild methods of string
    public int firstUniqCharfunc2(String s) {
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }

}
