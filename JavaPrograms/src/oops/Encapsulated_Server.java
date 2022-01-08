package oops;

public class Encapsulated_Server
{
	public static void main(String[] args) {
		Encapsulated_POJO ob = new Encapsulated_POJO();
		ob.setName("chandan");
		ob.setFname("sahoo");
		ob.setCollegename("ABES");
		ob.setRollno(12344);
		
		
		System.out.println(ob.getCollegename()+" "+ob.getName()+"\n"+
		ob.getFname()+" "+ob.getRollno());
		
	}
}