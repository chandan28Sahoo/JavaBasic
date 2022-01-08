package CollectionFram_WOrk;

import java.util.ArrayList;
import java.util.Scanner;

public class ListVerification_demo
{

	public static void getdata(ArrayList<String>li,ArrayList<String>li1)
	{
		
		for(String dd:li)
		{
			for(String dd1:li1)
			{
				if(dd.equals(dd1))
				{
					System.out.println("Match");
				}
				else
				{
					System.out.println("not match");
				}
				li1.remove(dd1);
				break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> li= new ArrayList<String>();
		ArrayList<String> li1= new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the 5 numbers for 1st list");
		for(int i=0;i<=4;i++)
		{
			li.add(sc.next());
		}
		System.out.println("Please enter the 5 numbers for 2nd list");
		for(int i=0;i<=4;i++)
		{
			li1.add(sc.next());
		}
		
		getdata(li,li1);
		
	}
}
