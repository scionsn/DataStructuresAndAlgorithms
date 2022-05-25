import java.util.LinkedHashMap;
//linked hashmap to maintain the order for the insertion

public class RunLengthEncoding {
    static String func(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(map);
        String res = "";
        for (char k : map.keySet()) {

            String st = k + "" + map.get(k);
            res += st;
        }
        return res;
    }

    public static void main(String args[]) {
        String s = func("wwwwaadexxxxx");
        System.out.println(s);
    }
}
