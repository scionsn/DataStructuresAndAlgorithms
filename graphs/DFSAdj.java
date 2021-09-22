import java.util.LinkedList;

public class DFSAdj {
//	this function returns dfs for the mentioned source so only for a connected graph with this source
//	and not other graphs
	public static void DFS(int mat[][], int source,boolean[] visited) {
		LinkedList<Integer> stk = new LinkedList<>();
		visited[source] = true;
		stk.addFirst(source);
		while (!stk.isEmpty()) {
			int vert = stk.poll();
			System.out.println(vert);
			for (int i = 0; i < mat.length; i++) {
				if (mat[vert][i] != 0 && visited[i] == false) {
					stk.addFirst(i);
					visited[i] = true;
				}
			}
		}
	}
//	this function prints all the components , even if connected or not
	static void dfsutil(int mat[][]) {
		boolean visited[]=new boolean[mat.length];
		for(int i=0;i<mat.length;i++)
		{
			if(visited[i]==false)
			{
				DFS(mat,i,visited);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] =
			{
				{ 0, 1, 0, 0, 0, 0, 0 }, 
				{ 1, 0, 1, 0, 0, 0, 0 }, 
				{ 0, 1, 0, 1, 0, 0 ,0}, 
				{ 0, 0, 1, 0, 1, 0 ,0},
				{ 0, 0, 0, 1, 0, 0 ,0},
				{ 0, 0, 0, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 0 ,1, 0}

		};
		dfsutil(arr);
	}

}
