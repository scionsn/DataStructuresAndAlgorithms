import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0)
            return new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        helper(digits, 0, map, res, new StringBuilder());
        return res;
    }

    void helper(String digits, int i, HashMap<Character, String> map, List<String> res, StringBuilder sb) {
        if (i == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String current = map.get(digits.charAt(i));
        for (int j = 0; j < current.length(); j++) {
            sb.append(current.charAt(j));
            helper(digits, i + 1, map, res, sb);
            sb.deleteCharAt(sb.length() - 1);

        }
    }
}