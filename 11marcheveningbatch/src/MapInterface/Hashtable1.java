package MapInterface;

import java.util.Hashtable;

public class Hashtable1 {
	
	public static void main(String [] args) {
		
		//Map interface - hashmap & hashtable 
		
		Hashtable <Integer ,String >HT = new Hashtable <>();
		
		//insert the element 
		
		HT.put(2, "john");
		HT.put(22, "Sumit");
		HT.put(32, "Rohit");
		HT.put(4, "Rahul");
		
		System.out.println(HT);
		System.out.println(HT.remove(32));
		
		System.out.println(HT.containsKey(32));
		System.out.println(HT.containsKey(2));
		
		System.out.println(HT.containsValue("Sumit"));
		System.out.println(HT.containsValue("Rohit"));
		System.out.println(HT.containsValue("Rahul"));
		
		System.out.println(HT.keySet());
		System.out.println(HT.values());
		
	}
}
