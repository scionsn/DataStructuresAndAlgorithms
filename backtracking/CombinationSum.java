import java.util.ArrayList;
import java.util.List;
// ref time complexity infinity youtube
public class CombinationSum {
	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> res=new ArrayList<>();
     List<Integer> sub=new ArrayList<>();
//      passing index of the first element and the sublist to be added to the result
     helper(candidates,target,0,sub,res);
 return res;
 }
void helper(int arr[],int target,int i,List<Integer> combin, List<List<Integer>> res)
{
 if(target==0)
 {
     res.add(new ArrayList<>(combin));
     return;

 }
if(target<0)
 return;
 if(i==arr.length)
     return;
     
 combin.add(arr[i]);
 helper(arr,target-arr[i],i,combin,res);
//  backtracking
 combin.remove(combin.size()-1);
//  we dont want to subtract the target here , as i cant subtract a value without adding the it in the 
//  sublist, so this call just takes it to the next index, this is like a loop in the form of recursion
 helper(arr,target,i+1,combin,res);   
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
