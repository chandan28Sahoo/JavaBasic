package oops;

interface RBIDemo
{
	public int ROI();
	public int servicetax();
	public int exciseduty();
	
}
interface XYZABC extends RBIDemo
{
	public void showdata();
}
class AXISBank implements  XYZABC
{
	@Override
	public int ROI() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int servicetax() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int exciseduty() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public void showdata() {
		System.out.println("Hello showdata");
		
	}
	
}
public class InterfaceDemooo 
{
public static void main(String[] args) {
	AXISBank ob = new AXISBank();
	System.out.println(ob.ROI());
	System.out.println(ob.exciseduty());
	System.out.println(ob.servicetax());
}
}