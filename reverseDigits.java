public class reverseDigits {
    public int reverse(int x) {
        if (x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE)
            return 0;
        int res = 0;
        boolean negative = false;
        if (x < 0)
            negative = true;
        x = Math.abs(x);
        while (x != 0) {
            if (res > Integer.MAX_VALUE / 10)
                return 0;
            // System.out.println(res);
            res = res * 10 + x % 10;
            x = x / 10;
        }
        // System.out.println(res);

        return negative ? -1 * res : res;
    }

}
