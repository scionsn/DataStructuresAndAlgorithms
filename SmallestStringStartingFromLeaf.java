public class SmallestStringStartingFromLeaf {
    int min_res = 0;

    public String smallestFromLeaf(TreeNode root) {
        helper(root, 0);
        return convt_to_str(min_res);
    }

    void helper(TreeNode root, int sum) {
        if (root == null)
            return;
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            int rev = reverse_digits(sum);
            if (rev < min_res) {
                min_res = rev;
            }

        }
    }

    int reverse_digits(int number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }

    String convt_to_str(int num)
    {
         
    
            int number=reverse_digits(num);
            String res="";
            while(number!=0)
            {
                System.out.println(number);
              int remainder=number%10;
              System.out.println(remainder);
              char asci=Character.forDigit(remainder,10);
              System.out.println(asci);
              int val=asci+'1';
              System.out.println(val);
              char c=(char)val;
              System.out.println(c);
              res+=c;
              number=number/10;
            }
            return res;
        }
}
