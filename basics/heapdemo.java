/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;
    import java.util.ArrayList;

/**
 *
 * @author SCION
 */


class Heap{
	ArrayList<Integer> data = new ArrayList<>();
	void add(int item) {
		data.add(item);
		upHeapify(data.size()-1);
	}
	private void upHeapify(int childIndex) {
		int parentIndex = (childIndex - 1)/2;
		if(data.get(childIndex)<data.get(parentIndex)) {
			swap(parentIndex, childIndex);
			upHeapify(parentIndex);
		}
	}
	private void swap(int parentIndex, int childIndex) {
		int parentValue = data.get(parentIndex);
		int childValue = data.get(childIndex);
		data.set(childIndex, parentValue);
		data.set(parentIndex, childValue);
	}
	void print(){
		for(Integer i : data) {
			System.out.println(i);
		}
	}
	int delete() {
		// swap 0 element last element
		//store the last element some varaible and remove the last element from the arraylist
		// now do the downheapify
		// return the last element store in variable
		return 0; // temp
	}
	void downHeapify(int parentIndex){
		// parent index get the lci and rci
		// lci < parent
		// rci < parent
		// swap
		// till arrange recursive call upHeapify
	}
}
public class heapdemo {

	public static void main(String[] args) {
		Heap obj = new Heap();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(5);
		obj.add(15);
		obj.add(25);
		obj.print();

	}

}

    

