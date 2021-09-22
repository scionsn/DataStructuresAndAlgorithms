/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 */
import java.util.HashMap;
import java.util.Map;

class Node2{
	char data;
	HashMap<Character, Node2> children;
	boolean isEnd;
	Node2(char data){
		this.data = data;
		children = new HashMap<>();
	}
	
}
class Trie{
	private Node2 root;
	private int noOfWords;
	Trie(){
		root =new Node2('\0');
		noOfWords = 0;
	}
	public int getNoOfWords() {
		return noOfWords;
	}
	public Node2 getRoot() {
		return root;
	}
	void addWord(String word, Node2 parent) {
		if(word.length()==0) {
			if(parent.isEnd) {
				// if word is already exist in trie
			}
			else {
				parent.isEnd = true;
				noOfWords++;
			}
			return;
		}
		char firstChar =word.charAt(0);
		String remainingString = word.substring(1);
		Node2 child = parent.children.get(firstChar);
		if(child == null) {
			child = new Node2(firstChar);
			parent.children.put(firstChar, child);
		}
		addWord(remainingString, child);
	}
	void print(Node2 parent , String wordResult ) {
		if(parent.isEnd) {
			System.out.println(wordResult);
		}
		for(Map.Entry<Character, Node2> obj: parent.children.entrySet()) {
			print(obj.getValue(), wordResult+obj.getKey());
		}
	}
	
}
public class TrieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie obj = new Trie();
		obj.addWord("amit", obj.getRoot());
		obj.addWord("amrish", obj.getRoot());
		obj.addWord("ajay", obj.getRoot());
		obj.addWord("anil", obj.getRoot());
		obj.print(obj.getRoot(), "");
		

	}

}
