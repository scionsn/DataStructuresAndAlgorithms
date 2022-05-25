public class SpirallySortedArray{
// two pointer approach

    static boolean isSpiral(int arr[]){
        int j=arr.length-1;
for(int i=0;i<j;i++)
{
if(arr[i]<arr[j]&&arr[i+1]>arr[j]){
    j--;
    continue;
}

else
return false;

}
return true;
}
    public static void main(String[] args) {
       int arr[]={1,2,4,3};
System.out.println(isSpiral(arr)); 
    }
}