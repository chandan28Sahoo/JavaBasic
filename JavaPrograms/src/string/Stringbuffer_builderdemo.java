package string;

public class Stringbuffer_builderdemo 
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Chandan");
		StringBuilder sd= new StringBuilder("chandan");
		long starttime = System.currentTimeMillis();
		for(int i=0;i<=100000;i++)
		{
			sb.append("demo");
		}
		long endtime = System.currentTimeMillis();
		System.out.println("Stringbuffer is time taken "+(endtime-starttime)+"ms");
		 starttime = System.currentTimeMillis();
		for(int i=0;i<=100000;i++)
		{
			sd.append("demo");
		}
		 endtime = System.currentTimeMillis();
		System.out.println("StringBuilder is time taken "+(endtime-starttime)+"ms");
		
	}
}
