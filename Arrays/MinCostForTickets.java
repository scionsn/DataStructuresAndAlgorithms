
public class MinCostForTickets {
	 public static int mincostTickets(int[] days, int[] costs) {
		 int i=0;
		 
	        return helper(days,costs,i);
	    }
	 static int helper(int[] days,int[] costs,int i) {
	;
		 if(i>=days.length) {
			 return 0;
		 }
		 int option1=costs[0]+helper(days,costs,i+1);
		 int k=i;
		 for(;k<days.length;k++) {
			if(days[k]>days[i]+7)
				break;
		}
		int option2=helper(days,costs,k);
		for(;k<days.length;k++) {
			if(days[k]>days[i]+30)
				break;
		}
		int option3=helper(days,costs,k);
		return Math.min(option1, Math.min(option2, option3));
			 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
