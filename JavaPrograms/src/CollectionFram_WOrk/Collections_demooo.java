package CollectionFram_WOrk;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_demooo 
{

	public static void main(String[] args)
	{
		ArrayList<Integer>li=new ArrayList<Integer>();
		li.add(12);
		li.add(32);
		li.add(45);
		li.add(8);
		
		//System.out.println(Collections.min(li));
		//System.out.println(Collections.max(li));
		Collections.sort(li,Collections.reverseOrder());
		
		for(Integer dd:li)
		{
			System.out.println(dd);
		}
	}


}