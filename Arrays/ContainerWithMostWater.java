// ref codebix
public class ContainerWithMostWater {
	 public int maxArea(int[] height) {
	     int l_idx=0;
	        int r_idx=height.length-1;
	        int max=Integer.MIN_VALUE;
	        while(l_idx<r_idx)
	        {
	            int l=height[l_idx];
	            int r=height[r_idx];
//	             only the smaller height will contribute to area
	            int min_height=Math.min(l,r);
	            int area=min_height*(r_idx-l_idx);
	            max=Math.max(max,area);
//	            we move thr smaller height pointr fwd because it is only contributing to that area
//	            as water can be filled only upto the smaller height, so therefore we move the pointr 
//	            at the smaller height fwd or bkwd, so as  to check if we can get better area.
	    if(l<r)
	        l_idx++;
	            else
	                r_idx--;
	        
	            
	        }
	        return max;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
