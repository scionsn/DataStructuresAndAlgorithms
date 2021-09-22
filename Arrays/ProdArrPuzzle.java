
public class ProdArrPuzzle {
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
long product=1;
long res[]=new long[n];
for(int i=0;i<n;i++){
    product*=arr[i];
}
int j=0;
for(int i=0;i<n;i++) {
  if(i==j){
  res[i]=product/arr[j++];
}
}
return res;
} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={10, 3, 5, 6, 2};
for(long i:productExceptSelf(arr,arr.length)) {
	System.out.println(i);
}
	}

}
