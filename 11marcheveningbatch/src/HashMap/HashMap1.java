package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	
	public static void main (String [] args) {
		HashMap<Integer ,String> HM= new HashMap<Integer ,String >();
		HashMap HM1 = new HashMap();
		
		HM.put(107, "John");
		HM.put(102, "David");
		HM.put(103, "Rahul");
		HM.put(104, "Rohit");
		HM.put(105, "Dipali");
		HM.put(106, "Mangal");
		
		System.out.println(HM);
		System.out.println(HM.get(102));
		
		System.out.println(HM.containsKey(102));
		System.out.println(HM.containsKey(105));
		
		System.out.println(HM.containsValue("Rohit"));
	    System.out.println(HM.containsValue("David"));
		
		System.out.println(HM.isEmpty());
	    System.out.println(HM1.isEmpty());
		
		System.out.println(HM.keySet());
     	System.out.println(HM.values());
     	
     	for(Object obj :HM.values()) {
     		System.out.println(obj);
     	}
     	for(Object obj1 : HM.keySet()) {
     		System.out.println(obj1);
     		
     	}
         for (Object Obj2 : HM.keySet()) {
     	System.out.println(Obj2+"  "+HM.get(Obj2));
    	}
		System.out.println("**********");
		for(Map.Entry entry:HM.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("********");
		Set S = HM.entrySet();
		Iterator it = S.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		}
		
	}

