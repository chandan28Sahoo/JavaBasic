package CollectionFram_WOrk;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_demo
{

	public static void main(String[] args)
	{
	
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(12, "ravi");
		map.put(3, "raja");
		map.put(12, "ajay");
		map.put(43, "raja");
		map.put(1, "abhishek");
		
		Set<Entry<Integer, String>> set = map.entrySet();
		
		for(Entry<Integer, String> dd:set)
		{
		//	System.out.println(dd.getKey()+" "+dd.getValue());
			System.out.println(dd.getKey());
		
		}
	
	
	}
}