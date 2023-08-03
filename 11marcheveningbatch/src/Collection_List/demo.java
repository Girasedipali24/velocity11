package Collection_List;

import java.util.PriorityQueue;

public class demo {
	
	public static void main(String [] args) {
		//insertion is not allowed in pq 
		//duplicate are allowed
		//homo type data 
		

		PriorityQueue PQ = new PriorityQueue();
		PriorityQueue PQ1 = new PriorityQueue();
		
		//Insert/adding element 
		// 1.add method
		
		PQ.add('D');
		PQ.add('A');
		PQ.add('S');
		PQ.add('F');
		PQ.add('T');
		
	//System.out.println(PQ.offer());
		//PQ.offer("hh"); ClasscastExcetion
		
		System.out.println(PQ);
		
		PQ.offer(null);
		System.out.println(PQ.offer('r'));
		
	
		
		
	
		
	}

	
		
	}


