package pertemuan12;

public class Main {

	public Main() {
		Class1 countdown1 = new Class1();
		countdown1.setPriority(10);
		
		Class2 count = new Class2();
		Thread countdown2 = new Thread(count); // new
		countdown2.start();
		countdown2.setPriority(2);
		
		System.out.println(countdown1.getName());
		System.out.println(countdown2.getName());
		
		System.out.println("Priority countdown 1: " + countdown1.getPriority());
		System.out.println("Priority countdown 2: " + countdown2.getPriority());
		
	}

	public static void main(String[] args) {
		
		new Main();

	}

}
