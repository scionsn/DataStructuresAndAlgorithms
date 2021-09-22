import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AdjacentList {
int[] arr= {};
ArrayList<Integer>[] arr2= new ArrayList[10];


public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{0,1},
				{1,2},
				{2,0},
				{1,3}
				};
		System.out.println(arr);
		
		List<List<Integer>> mainList = new ArrayList<>();
		for(int i = 0; i<arr.length; i++) {
			List<Integer> subList = new ArrayList<>();
			subList.add(arr[i][0]);
			subList.add(arr[i][1]);
			mainList.add(subList);
		}

		System.out.println(mainList);
		Graph graph = new Graph();
//		for(int i =0 ; i<arr.length; i++) {
//			graph.addVertex(String.valueOf(i));
//		}
//		for(List<Integer> sub : mainList) {
//			String firstVertex = sub.get(0).toString();
//			String secondVertex = sub.get(1).toString();
//			graph.addEdge(firstVertex, secondVertex, 0);
//		}
//		graph.print();
//		
		
		
		
		

	}

}
