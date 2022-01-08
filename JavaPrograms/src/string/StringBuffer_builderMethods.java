package string;

public class StringBuffer_builderMethods {
	public static void main(String[] args) 
	{
	
		StringBuffer sb = new StringBuffer("ajaysingh");
		//System.out.println(sb.charAt(4));
		//System.out.println(sb.indexOf("s"));
	//	System.out.println(sb.length());
		//System.out.println(sb.substring(4));
		//System.out.println(sb.subSequence(0, 4));
		//System.out.println(sb.delete(4, 9));
	//	System.out.println(sb.insert(4, "kumar"));
		//System.out.println(sb.replace(4, 9, "kumar"));
		System.out.println(sb.reverse());
		System.out.println(sb.substring(0,2));
		
		StringBuilder ob = new StringBuilder("ajaysingh");
		System.out.println(sb.charAt(4));
		System.out.println(sb.indexOf("s"));
		System.out.println(sb.length());
		System.out.println(sb.substring(4));
		System.out.println(sb.subSequence(0, 4));
		System.out.println(sb.delete(4, 9));
		System.out.println(sb.insert(4, "kumar"));
		System.out.println(sb.replace(4, 9, "kumar"));
		System.out.println(sb.reverse());
		System.out.println(sb.substring(0,2));
	}
}
