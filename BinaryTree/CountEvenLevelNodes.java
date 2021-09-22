import java.util.LinkedList;

public class CountEvenLevelNodes {
	public int countnodes(Node root) {
		int count = 0;
		boolean flag = false;
		LinkedList<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			if (flag) {
				for (int i = 0; i < size; i++) {
					count++;
				}
			}
			for (int i = 0; i < size; i++) {
				Node rem = q.poll();
				if (rem.left != null)
					q.addLast(root.left);
				if (rem.right != null)
					q.addLast(root.right);
			}
			flag = !flag;

		}

	}
}
