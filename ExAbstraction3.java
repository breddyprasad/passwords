package abstraction;



abstract class managements{
	public void hotels(){
		System.out.println("hotels");
	}
	
	public void buses(){
		System.out.println("buses");
	}
	
	public abstract void shops();
}


public class ExAbstraction3 extends managements {

	@Override
	public void shops() {
		System.out.println("shops");
		
	}
	public static void main(String[] args) {
		ExAbstraction3 e3=new ExAbstraction3();
		e3.hotels();
		e3.buses();
		e3.shops();
	}
	

}
