package JavaPrograms;

import java.util.Scanner;


public class VishalMeghaMart_BillUtility {

	public void getDetails(String name,long mobile,String productName,float productprice)
	{	
//		
		System.out.println("******Vishal Mega Mart**********");
		System.out.println("Cutomer name :"+name);
		System.out.println("customer mobile :"+mobile);
		System.out.println("product name  :"+productName);
		System.out.println("product price :"+productprice);
		GstCalculation obj = new GstCalculation();
		float gst = obj.getCalculateGST(productprice);
		System.out.println("Your GST Is " + gst);
		float total=gst+productprice;
		System.out.println("_______________________________");
		System.out.println("Total amount is "+total);
		System.out.println("_______________________________");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VishalMeghaMart_BillUtility ob = new VishalMeghaMart_BillUtility();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the name");
		String name = sc.next();


		System.out.println("Please enter the mobile number");
		long mobile = sc.nextLong();
		
		System.out.println("Please enter the product name");
		String productName = sc.next();
		
		System.out.println("Please enter the product price ");
		float productprice = sc.nextFloat();
		
		ob.getDetails(name, mobile, productName, productprice);
	}

}

class Users{
	public String name;
	public long mobile; // only can use same package 
	public String productName; // only can use in same class
	public float productprice;
	public GstCalculation gst = new GstCalculation();
	public float total;
}
