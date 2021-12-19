package oops;

import java.util.Scanner;

class CongressDemo
{
	public float getGSt(float input)
	{
		float gst=(input*5)/100;
		return gst;
	}
}	

public class BJPOverridingDemo extends CongressDemo
{

	public float getGSt(float input)
	{
		float gst=(input*18)/100;
		return gst;
	}
	public static void main(String[] args) {
		BJPOverridingDemo ob = new BJPOverridingDemo();
		Scanner sc = new Scanner(System.in);
		float input = sc.nextFloat();
		float out = ob.getGSt(input);
		System.out.println(out);
	}

}
