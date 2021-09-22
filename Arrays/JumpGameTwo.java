
public class JumpGameTwo {
	 public int jump(int[] nums) {
	        
	        int reach=0,pos=0,steps=0;
	        for(int i=0;i<nums.length-1;i++){
	            reach=Math.max(reach,i+nums[i]);
	if(pos==i){
	    pos=reach;
	    steps++;
	}
	        }
	    return steps;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
