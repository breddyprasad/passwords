package abstraction;

abstract class manual{
	
	public void functional(){
		System.out.println("functional");
	}
	
	public void nonfunctional(){
		System.out.println("nonfunctional");
	}
	
	public abstract void selenium();

}

public class ExAbstraction1 extends manual{


	public void selenium() {
		System.out.println("automation");
		
	}
	public static void main(String[] args) {
		ExAbstraction1 e1=new ExAbstraction1();
		e1.functional();
		e1.nonfunctional();
		e1.selenium();/
	}

}
