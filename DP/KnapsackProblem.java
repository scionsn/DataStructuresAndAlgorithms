
public class KnapsackProblem {
	 static int knapSack(int W, int wt[], int val[], int n) 
	    { 
		 int memo[][]=new int[n+1][W+1];
	return helper(W,wt,val,0,memo);
	    } 
	    static int helper(int w,int[] weight,int[] value,int i,int[][] memo){
	        if(i==value.length||w==0)
	        return 0;
	        if(memo[i][w]!=0)
	        	return memo[i][w];
	      else  if(weight[i]>w) {
	       memo[i][w]= helper(w,weight,value,i+1,memo);
	       return memo[i][w];
	      }
	        else{
	            int inc=value[i]+helper(w-weight[i],weight,value,i+1,memo);
	          int notinc=  helper(w,weight,value,i+1,memo);
	                   memo[i][w]= Integer.max(inc,notinc);
	        	       return memo[i][w];

	        } 
	    }
	    static int dp(int W, int wt[], int val[], int n) {
	    	int arr[][]=new int[n+1][W+1];
	    	//	    initialization
	    	for(int i=0;i<arr.length;i++) {
	    		for(int j=0;j<arr[0].length;j++) {
	    			if(i==0||j==0) {
	    				arr[i][j]=0;
	    			}
	    		}
	    	}
	    	//	    here we take i-1 and not i because we have initialized the zero index as a part of our base
	    	//	    condn in recursive function so basically our index 1 represents index 0 of the value and weight array.
	    	for(int i=1;i<arr.length;i++) {
	    		for(int j=1;j<arr[0].length;j++) {
	    			if(wt[i-1]<j) {
	    				int inc=val[i-1]+arr[i-1][j-wt[i-1]];
	    				int notinc=arr[i-1][j];
	    				arr[i][j]= Integer.max(inc,notinc);
	    			}
	    			else
	    				arr[i][j]=arr[i-1][j];			
	    		}

	    	}
	    	//	    the final block gives the max profit
	    	return arr[n][W];


	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
