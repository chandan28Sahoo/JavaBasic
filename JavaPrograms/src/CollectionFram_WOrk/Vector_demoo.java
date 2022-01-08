package CollectionFram_WOrk;

import java.util.Vector;

public class Vector_demoo
{

	public static  void getdata()
	{
		Vector<String> vs= new Vector<String>();
		//collection
		vs.add("ajay");
		vs.add("vijay");
		// vector method
		vs.addElement("ravi");
		vs.addElement("sham");
		vs.addElement("ravi");
		vs.addElement("sham");
		 Object dd = vs.clone();
		 System.out.println(dd);
		System.out.println( vs.firstElement());
		vs.insertElementAt("raja", 3);
		System.out.println(vs.capacity());
		System.out.println(vs.capacity());
		for(String dd1:vs)
		{
			System.out.println(dd1);
		}
	}
	public static void main(String[] args) 
	{
		getdata();
	}
}