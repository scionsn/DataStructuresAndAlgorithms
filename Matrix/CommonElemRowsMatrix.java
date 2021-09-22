import java.util.ArrayList;
import java.util.HashMap;
//ref- GFG

public class CommonElemRowsMatrix {
	public static ArrayList<Integer> commonElem(int arr[][]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		 ArrayList<Integer> list=new ArrayList<>();
//		 initialising every element in first row with 1 , so as to consider duplicate elements only once
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[0][i], 1);
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
//				this condition is added to avoid duplicate elements in the row
				if (map.get(arr[i][j]) != null && map.get(arr[i][j]) == i) {
             map.put(arr[i][j],i+1);
				}
			}
		}
		for(int key:map.keySet())
		{
			if(map.get(key)==arr.length)
			{
				list.add(key);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[][]={{1,2,3},{3,5,1},{7,8,1}};
		 System.out.println(commonElem(arr));
		 //label is used to break  from outer loop inside the body of an inner loop
		 outer:
		 for(int i=0; i<4; i++){
			 for(int j=0;j<4;j++)
			 {
				 if (i==2){
			            break outer;
			         }
			 }
			 
	         
	         System.out.println("......."+i);
	      }
	}

}
