package abstraction;

interface A{
	public void read();
	public void write();
}

interface B extends A{
	public void learn();
	public void explain();
}

interface c{
	public void teaching();
}




public class ExInterface2 implements B,c {

	@Override
	public void read() {
		System.out.println("read");
		
	}

	@Override
	public void write() {
		System.out.println("write");
		
	}

	@Override
	public void learn() {
		System.out.println("learn");
		
	}

	@Override
	public void explain() {
		System.out.println("explaim");
		
	}
	
	
	public static void main(String[] args) {
		ExInterface2 e2=new ExInterface2();
		e2.read();
		e2.write();
		e2.learn();
		.args.e2.explain();
	}

	@Override
	public void teaching() {
		System.out.println("teaching");
		
	}
	

}
