import java.util.LinkedList;

public class nextGreaterElem {
    public static void main(String[] args) {
        int arr[] = { 13, 7, 6, 10, 12 };
        for (int i : nge(arr)) {
            System.out.println(i);
        }
    }

    static int[] nge(int arr[]) {
        if (arr.length == 0)
            // return a new empty array of length 0
            return new int[] {};
        if (arr.length == 1)
            return arr;
        // push idx's in stack
        LinkedList<Integer> stack = new LinkedList<>();
        int res[] = new int[arr.length];
        stack.addLast(0);
        for (int i = 1; i < arr.length; i++) {

            // we need to pop the stack if the current value of array is greater than the
            // element at the peak index of array i.e arr[i]>arr[pop value],
            // keep doing that til<l we find a idx on peek which is greater than current
            // valuye in array.
            
            while (!stack.isEmpty() && arr[i] > arr[stack.peekLast()]) {
                // update those values in resultant array
                int idx = stack.removeLast();
                res[idx] = arr[i];
            }
            // if the current elem of arr is smaller than the peak index then just simply
            // push the index of that element to stack
            stack.addLast(i);
        }
        while (!stack.isEmpty()) {
            // this is used to iterare those elem in stack for which there was no nge, so
            // simply put -1 in res
            int idx = stack.removeLast();
            res[idx] = -1;
        }
        return res;
    }
}
