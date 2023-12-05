package polymorphism;
// method overloading is - within a single class method names are same but different different
// datatype arguments called as method overloading
public class MOverloading {
	
	public void kartik()
	{
		System.out.println("this is no arhument method");
	}
	
	public void kartik(int x)
	{
		System.out.println("this is int arg method");
	}

	public void kartik(double d)
	{
		System.out.println("this is double arg method");
	}
	
	public void kartik(String s)
	{
		System.out.println("this is string arg method");
	}
	
	public static void main(String[] args) {
		
             MOverloading obj=new MOverloading();
             obj.kartik();
             obj.kartik(10.10);
             obj.kartik(5);
             obj.kartik("patra");
	}

}
