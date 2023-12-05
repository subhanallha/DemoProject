package www.tryoverload.com;

public class OverLoad {
	void petertingle()
	{
		System.out.println("This is from spiderman s1");
	}
	
	void petertingle(String s)
	{
		System.out.println("This is from no way home");
	}

	void petertingle(boolean b) {
		System.out.println("This is far from home");
	}
	public static void main(String[] args) {
		OverLoad nb=new OverLoad();
		nb.petertingle();
		nb.petertingle(true);
		nb.petertingle("Good One!!");

	}

}
