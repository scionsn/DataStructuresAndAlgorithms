//A frog jumps either 1, 2, or 3 steps to go to the top. In how many ways can it reach the top
//n is the number of steps to reach the top.
public class FrogHops {
	static int res=0;
	static long countWays(int n) {
//		if(n==1) 
//			return 1;
//		
//		if(n==2)
//			return 2;
//		if(n==3)
//		return 4;
//		if(n<=0)
//			return 0;
//		return countWays(n-1)+countWays(n-2)+countWays(n-3);
		long tab[]=new long[n+1];
		if(n==1)
		    return 1;
		    if(n==2)
		    return 2;
		    if(n==3)
		    return 4;
		    
		        tab[0]=1;
		        tab[1]=1;
		        tab[2]=2;
		        tab[3]=4;
		        for(int i=4;i<=n;i++){
		            tab[i]=tab[i-1]+tab[i-2]+tab[i-3];
		            System.out.println(tab[i]);
		        }
		        return tab[n];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countWays(54));

	}

}
