
public class lis {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 3, 4 };
        int res = lis_solve(arr);
        System.out.println(res); 
    }

    static int lis_solve(int arr[]) {
        return helper(-1, 0, arr);
    }

    static int helper(int prev, int curr, int arr[]) {
        if (curr == arr.length)
            return 0;
        int include = 0;
        if (prev == -1 || arr[curr] > arr[prev]) {
            include = 1 + helper(curr, curr + 1, arr);
        }
        int not_incl = helper(prev, curr + 1, arr);
        return Math.max(include, not_incl);
    }

    int helper2(int arr[]) {

        if (arr.length == 0)
            return 0;
        if (arr.length == 1)
            return 1;
        int lis[] = new int[arr.length];

        for (int i = 0; i < lis.length; i++) {
            // since each elem is itself a lis of size 1
            lis[i] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                // compare the elem at index i to elem at index j , if its greater then find the
                // max of lis at idx i to (idx j+1)-> including the elemenet at idx i
                if (arr[i] > arr[j]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }
        return findmax(arr);
    }

    static int findmax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }
}
