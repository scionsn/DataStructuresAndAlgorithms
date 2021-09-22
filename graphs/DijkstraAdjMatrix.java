//ref- codebix
import java.util.ArrayList;

public class DijkstraAdjMatrix {
	void dijkstra(int mat[][], int source) {
		int distance[] = new int[mat.length];
		boolean visited[] = new boolean[mat.length];
		distance[source] = 0;
		for (int i = 0; i < mat.length; i++) {
			if (i == 0)
				continue;
			distance[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
//		we loop till length-1 as we dont need to include last element, as our result as  already been
//		calculated before that
		for (int i = 0; i < mat.length - 1; i++) {
//			this is the index with the min distance and the index which isnt visited
			int idx = min_dist(distance, visited);
			visited[idx] = true;
//			we check if there is any weight between the min index and j and also that j isnt 
//			visited before and also that the min index should not have max distance else
			for (int j = 0; j < mat.length; j++) {
				if (mat[idx][j] != 0 && visited[j] == false && distance[idx] != Integer.MAX_VALUE) {
					int newdist = distance[idx] + mat[idx][j];
					if (newdist < distance[j]) {
						distance[j] = newdist;
					}
				}
			}
		}
	}

	int min_dist(int distance[], boolean visited[]) {
		int idx = Integer.MAX_VALUE;
		for (int i = 0; i < distance.length; i++) {
//			we select and give the index with the minimum distance 
//			but not of those which are visited , to avoid cycles
			if (visited[i] == false && (idx != -1 || distance[i] < distance[idx])) {
				idx = distance[i];
			}
		}
		return idx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
