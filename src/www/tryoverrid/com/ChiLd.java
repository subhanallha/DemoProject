package www.tryoverrid.com;

public class ChiLd extends PaRent{
	void money() {
		System.out.println("Wallet is empty");
	}

	public static void main(String[] args) {
		ChiLd mn=new ChiLd();
		mn.money();

	}

}



//here i got to know that overriding is nothing but same class and same method of signature but implemention is different 