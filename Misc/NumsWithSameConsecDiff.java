import java.util.ArrayList;

//Return all non-negative integers of length N such that
//the absolute difference between every two consecutive digits is K.
//
//Note that every number in the answer must not have leading zeros except
//for the number 0 itself. For example, 01 has one leading zero and is invalid, but 0 is valid.
//
//You may return the answer in any order.
//		Input: N = 3, K = 7
//		Output: [181,292,707,818,929]
//		Explanation: Note that 070 is not a valid number, because it has leading zeroes.
//		Example 2:
//
//		Input: N = 2, K = 1
//		Output: [10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]
public class NumsWithSameConsecDiff {
	 public static int[] numsSameConsecDiff(int N, int K) {
		 if(N==1) {
			 return new int[] {0,1,2,3,4,5,6,7,8,9};
		 }
		ArrayList<Integer> res=new ArrayList<>();
		for(int i=1;i<=9;i++) {
			helper(N,K,i,0,i,res);
		}
		int arr[]=new int[res.size()];
for(int i=0;i<arr.length;i++) {
	arr[i]=res.get(i);
}
return arr;
	    }
//	 current holds my number formed. i is pointer and prev is the value to be added or sub with k
	static void helper(int n,int k,int current,int i,int calcnext,ArrayList<Integer> res) {
		 if(i==n-1) {
			 res.add(current);
			 return ;
		 }
		 int nextdigit=calcnext+k;
		 if(nextdigit<10) {
			 helper(n,k,(current*10)+nextdigit,i+1,nextdigit,res);
		 }
		 
		 nextdigit=calcnext-k;
		 if(k!=0&&nextdigit>=0)
		 {
			 helper(n,k,(current*10)+nextdigit,i+1,nextdigit,res);		 
		 }
		 
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i:numsSameConsecDiff(2,1)) {
			System.out.println(i);
		}
	}

}
