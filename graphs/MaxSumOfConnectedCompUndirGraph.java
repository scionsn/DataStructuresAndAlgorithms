//ref gfg
import java.util.LinkedList;

public class MaxSumOfConnectedCompUndirGraph {
	static int sum=0;
	static void maxSum(int arr[][], int value[], int source,boolean[] visited) {
		LinkedList<Integer> stk = new LinkedList<>();
		visited[source] = true;
		stk.addFirst(source);
		while (!stk.isEmpty()) {
			int rem = stk.poll();
			System.out.println(rem);
			sum += value[rem - 1];
			System.out.println(sum);
			for (int i = 1; i < arr.length; i++) {
				if (arr[rem][i] != 0 && visited[i] == false) {
					stk.addFirst(i);
					visited[i] = true;

				}
			}
		}

	}
	static int dfsutil(int mat[][],int []value) {
		boolean visited[]=new boolean[mat.length];
		int result=Integer.MIN_VALUE;
		for(int i=1;i<mat.length;i++)
		{
			

			if(visited[i]==false)
			{
				sum=0;
				maxSum(mat,value,i,visited);
				System.out.println(sum);
				if(sum>result)
					result=sum;
			}
			
		}
		System.out.println("res is:"+result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 1, 0, 1 }, { 0, 0, 0, 0, 1, 0 } };
		int value[] = { 10, 20, 5, 15, 5 };
		System.out.println(dfsutil(arr, value));
	}

}
