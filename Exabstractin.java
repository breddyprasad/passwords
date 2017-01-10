package abstraction;

abstract class Automatrion{
	
	public void java(){
		System.out.println("java");
	}
	
	public void selenium(){
		System.out.println("selenium");
	}
	
	public abstract void framework();
	
}


public class Exabstractin extends Automatrion {

	
	public void framework() {
		System.out.println("framework");
		
	}
	
	public static void main(String[] args) {
		Exabstractin e1=new Exabstractin();
		e1.java();
		e1.selenium();
		e1.framework();
	}

}
