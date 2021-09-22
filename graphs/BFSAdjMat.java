import java.util.LinkedList;
public class BFSAdjMat {
	public static void bfs_adj(int mat[][], int source) {
		LinkedList<Integer> q = new LinkedList<>();
		q.addLast(source);
		boolean visited[] = new boolean[mat.length];
		visited[source] = true;
		while (!q.isEmpty()) {
			int vert = q.poll();
			System.out.println(vert);
			for (int i = 0; i < mat.length; i++) {
				if (mat[vert][i] != 0 && visited[i] == false) {
					q.addLast(i);
					visited[i] = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
