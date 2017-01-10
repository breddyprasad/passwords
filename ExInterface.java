package abstraction;

interface A{
	public void read();
	public void write();
}

interface B extends A{
	public void listen();
}

interface c{
	public void run();
}

interface d{
	public void jump();
}

interface e{
	public void longjump();
}
public class ExInterface implements B,c,d,e {

	@Override
	public void read() {
		System.out.println("read");
		
	}

	@Override
	public void write() {
		System.out.println("write");
		
	}

	@Override
	public void listen() {
		System.out.println("listen");
		
	}

	@Override
	public void run() {
		System.out.println("run");
		
	}
	
	public static void main(String[] args) {
		ExInterface e1=new ExInterface();
		e1.read();
		e1.write();
		e1.listen();
		e1.run();
		e1.jump();
		e1.longjump();

	}

	
	@Override
	public void jump() {
		System.out.println("jump");
		
	}

	@Override
	public void longjump() {
		System.out.println("longjump");
		
	}

}
