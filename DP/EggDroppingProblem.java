// ref adithya verma, register 4 pg 36
public class EggDroppingProblem {
	 public int superEggDrop(int K, int N) {
		 int eggs=K;
	        int floors=N;
	        // we take the worst case so if egg is 1 then the worst case is that we have to throw it
//	         from the height of the building
	        if(eggs==1)
	            return floors;
	        if(floors==0||floors==1)
	            return floors;
	        int res=Integer.MAX_VALUE;
	        for(int i=0;i<floors;i++)
	        {
	           int brk= superEggDrop(eggs-1,i-1);
	            int notbreak=superEggDrop(eggs,floors-i);
//	             added 1 to include the attempts, as our attempts increase when egg breaks
	            int temp=1+Math.max(brk,notbreak);
	            res=Math.min(res,temp);
	            
	        }
	        return res;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
