package CollectionFram_WOrk;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetDemooo
{
	public static void main(String[] args) {
		HashSet<String>hs= new HashSet<String>();
		hs.add("raja");
		hs.add("navenn");
		hs.add("raja");
		hs.add("ravi");
		hs.add("ajay");
		hs.add("rani");
		hs.add("ramwati");
		hs.add("vijay");
		
		for(String dd:hs)
		{
			System.out.println(dd);
		}
		
		LinkedHashSet<String>hs1= new LinkedHashSet<String>();
		hs1.add("raja");
		hs1.add("navenn");
		hs1.add("raja");
		hs1.add("ravi");
		hs1.add("ajay");
		hs1.add("rani");
		hs1.add("ramwati");
		hs1.add("vijay");
		
		for(String dd:hs1)
		{
			System.out.println(dd);
		}
	}
}