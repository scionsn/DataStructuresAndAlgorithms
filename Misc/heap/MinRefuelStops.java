package heap;

import java.util.PriorityQueue;

public class MinRefuelStops {
	public int minRefuelStops(int target, int startFuel, int[][] stations) {
//		if we have enough fuel to visit the target then w dont need to visit any stations.
		if (startFuel == target) {
			return 0;

		}
		int currentFuel = startFuel;
//	         index var to traverse the stations
		int idx = 0;
		int res = 0;
//	         sorting in descending order based on the highest full available at a petrol pump(GREEDY)
		PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
//		this loop runs until out current fuel becomes equal to greater than the target ,
//		it can stop if the stations dont have enough fuel to help us reach the target,
//		or we cant reach the station to refuel .
		while (currentFuel < target) {
//we check if we can reach the stations with the fuel we have and we add all those stations in
//			 the heap which we can reach from our current fuel,
//		and pick the station with the highest fuel(GREEDY)

			while (idx < stations.length && currentFuel >= stations[idx][0]) {
				heap.add(stations[idx]);
				idx++;
			}
//			heap will  be empty either if we have no stations at all
//			or if the stations cant provide enough fuel to help us reach the target 
//			since our outer loop always checks that condition
			if (!heap.isEmpty()) {
				int pump[] = heap.poll();
				res++;
				currentFuel += pump[1];
			}
//			if heap is empty and we are here that means there are no stations left to provide us more fuel
//			to reach the target
			else {
				res = -1;
				break;
			}
		}
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
