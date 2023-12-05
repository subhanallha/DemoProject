package polymorphism;

public class Child extends Parent{
	
	public void kartikMarriage()
	{
		System.out.println("Ananya pande");
	}

	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.kartikMarriage();
		obj.property();

	}

}
