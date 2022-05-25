// arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5]
public class waveArray {
    public static void convertToWave(int arr[], int n) {
        if (arr.length == 1)
            return;

        // Your code here
        for (int i = 1; i < arr.length; i += 2) {
            // System.out.println(arr[i]);
            if (arr[i] > arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            // System.out.println(arr[i]);

        }

    }
}
