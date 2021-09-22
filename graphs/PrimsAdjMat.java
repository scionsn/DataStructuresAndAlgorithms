//ref- codebix
public class PrimsAdjMat {

	void prims(int adjmat[][]) {
		int v = adjmat.length;
		int parent[] = new int[v];
		int weight[] = new int[v];
		boolean visited[] = new boolean[v];
		for (int i = 0; i < v; i++) {
			parent[i] = -1;
			weight[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
//		we can pick any node as our start , so we are picking 0 here
		weight[0] = 0;
//		we loop till length-1 as we dont need to include last element, as our result as  already been
//		calculated before that
		for (int i = 0; i < adjmat.length - 1; i++) {
//		we pick the node with the minimum wt , so minwt functions gives us that node

			int u = minweight(weight, visited);
			visited[u] = true;
			for (int j = 0; j < v; j++) {
//				if there exists an edge between node u and node i and node i isnt visited so and weight of 
//				edge between u and i is lesser than the present weight at i , then make u as the parent of i
//				and change the weight of i to the lesser value
				if (adjmat[u][j] != 0 && visited[j] == false && weight[j] > adjmat[u][j]) {
					parent[j] = u;
					weight[j] = adjmat[u][j];
				}
			}
		}

	}

	int minweight(int[] weight, boolean[] visited) {
		int minwtindex = -1;
		int minwt = Integer.MAX_VALUE;
		for (int i = 0; i < weight.length; i++) {
			if (visited[i] == false && weight[i] < minwt) {
				minwt = weight[i];
				minwtindex = i;
			}
		}
		return minwtindex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
