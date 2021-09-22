import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public abstract class TopologicalSortDFS {
	static int[] topoSort(int[][] adj, int N) {
		int res[] = new int[N];
		LinkedList<Integer> stack = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();
		for (int i = 0; i < N; i++) {
			visited.put(i, false);
		}
		System.out.println(visited);
		for (int i = 0; i < N; i++) {
			if (visited.get(i) == false) {
				visited.put(i, true);
				helper(i, adj, visited, stack);
			}
		}
		int k = 0;
		while (!stack.isEmpty()) {
			res[k++] = stack.pop();
		}

		return res;
	}

	private static void helper(int node, int[][] adj, HashMap<Integer, Boolean> visited, LinkedList<Integer> stack) {
		for (int i = 0; i < adj.length; i++) {
			if (adj[node][i] != 0 && visited.get(i) == false) {
				visited.put(i, true);
				helper(i, adj, visited, stack);
			}
		}
		// we backtrack to add those child nodef of the parent elements that havent been
		// visited before.
//		so that the child nodes always come after parent nodes as we want them to
		stack.push(node);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {

				{ 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 5, 0 } };
		for (int i : topoSort(arr, arr.length))
			System.out.println(i);
	}

}
