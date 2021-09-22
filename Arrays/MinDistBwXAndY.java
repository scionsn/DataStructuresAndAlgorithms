
public class MinDistBwXAndY {
	 int minDist(int a[], int n, int x, int y) {
	        int dist=Integer.MAX_VALUE;
	        int start_index=-1;

	for(int i=0;i<a.length;i++){
	if(a[i]==x||a[i]==y){
//		the second condition is a check to avoid duplicates since we know that x and y are different
//		but the array can contain duplicates
	    if(start_index!=-1&&a[i]!=a[start_index]){
	        dist=Math.min(i-start_index,dist);
	    }
	    start_index=i;
	}
	}
	if(dist==Integer.MAX_VALUE)
	return -1;
	else
	return dist;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
