//Design a HashSet without using any built-in hash table libraries.
//
//To be specific, your design should include these functions:
//
//add(value): Insert a value into the HashSet. 
//contains(value) : Return whether the value exists in the HashSet or not.
//remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing

import java.util.ArrayList;

public class DesignHashset {
    ArrayList<Integer> myhash;

	 public DesignHashset() {
		 myhash=new ArrayList<>();
	    }
	    
	    public void add(int key) {
	    	if(!myhash.contains(key)) {
	       myhash.add(key);
	    	}
	    }
	    
	    public void remove(int key) {
	    	Integer i=new Integer(key);
	        myhash.remove(i);
	    }
	    
	    /** Returns true if this set contains the specified element */
	    public boolean contains(int key) {
	       return myhash.contains(key);
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
