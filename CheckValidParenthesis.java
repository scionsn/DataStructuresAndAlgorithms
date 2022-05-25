import java.util.LinkedList;

public class CheckValidParenthesis {
    public static void main(String[] args) {
        System.out.println(checkvalid("[(){}}"));
    }

    static boolean checkvalid(String s) {
        if (s.length() % 2 != 0)
            return false;
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            // push opening brack into stack
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.addFirst(s.charAt(i));
            }
            // in case of closing brack, check if stack is empty, this means that there was
            // no opening brack for it, return false
            // check if the last bracket in stack is its corresp opening , if true then just
            // pop, meaning its balanced
            // if the last opening bracket in stack isn't corrsp opening, then just return
            // false;
            else {
                if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.removeFirst();

                } else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{')

                {

                    stack.removeFirst();
                } else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[')

                {
                    stack.removeFirst();
                } else
                    return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
