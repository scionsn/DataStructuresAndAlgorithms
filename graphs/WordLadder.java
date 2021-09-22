
// ref codebix
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//very slow code
public class WordLadder {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//       this means that i cant make the endword using begin as it doesnt exist.
		if (!wordList.contains(endWord))
			return 0;
		HashMap<String, Boolean> visited = new HashMap<>();
//       initialize
		for (int i = 0; i < wordList.size(); i++)
			visited.put(wordList.get(i), false);
		LinkedList<String> q = new LinkedList<>();
		visited.put(beginWord, true);
//       lets take begin word to be on the first level
		q.addLast(beginWord);
		int level = 1;

		while (!q.isEmpty()) {
			int size = q.size();
			System.out.println(size);
			for (int i = 0; i < size; i++) {
				String node = q.poll();
				System.out.println(node);
				if (node.equals(endWord))
					return level;
				wordMaker(node, visited, q);

			}
//           the length here indicates the level of the graph, as in till when do i find my endword
			level++;
		}
		return 0;
	}

	void wordMaker(String node, HashMap<String, Boolean> visited, LinkedList<String> q) {

//       we try to change each character of our node to other alphabets till we find a 
//       character that is diff from our node by 1 character and can be an adjacent node to that node
		for (int i = 0; i < node.length(); i++) {
			char word[] = node.toCharArray();
//           we try all the 26 combos
			for (int j = 0; j < 26; j++) {
//               as the characters in the string are not capital , so we did  it from small a
//               we try all permuations of the node and see if can get a word that differs by one character
				char c = (char) ('a' + j);
				word[i] = c;
				String s = String.valueOf(word);
				System.out.println(s);

				if (visited.containsKey(s) && visited.get(s) == false) {
					visited.put(s, true);
					q.addLast(s);
					System.out.println(q.peek());

				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
