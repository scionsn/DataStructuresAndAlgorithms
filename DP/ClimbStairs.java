//You are climbing a staircase. It takes n steps to reach the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

//based on fibbonaci only
public class ClimbStairs {
public static int meth(int n) {
	if(n==1||n==0) {
		return 1;
	}
	 if(n==2) {
		return 2;
	}
	 if(n==3) {
		return 3;
	}
	return meth(n-1)+meth(n-2);
}
static int memo(int n) {
	int cache[]=new int[n+1];
	cache[1]=1;
	cache[2]=2;
	cache[3]=3;
	 if(cache[n]!=0) {
		 return cache[n];
	 }
	int first= meth(n-1);
	int second=meth(n-2);
	int sum=first+second;
	cache[n]=sum;
	return sum;
}
static int tab(int n) {
	int cache[]=new int[n+1];
	cache[1]=1;
	cache[2]=2;
	cache[3]=3;
	for(int i=4;i<=n;i++) {
		cache[i]=cache[i-1]+cache[i-2];
	}
	return cache[n];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("tab "+tab(47));
//System.out.println(meth(47));



	}

}
