package pertemuan12;

public class Class1 extends Thread{

	public Class1() {
		setDaemon(true); // daemon thread
		start();
	}
	
	public void run() {
		System.out.println("Countdown 10 to 5");
		
		int count = 10;
		
		while(count>5) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count--; // kurangin 1 setiap kali
			System.out.println("Countdown 1 current: " + count);
		}
		
		System.out.println("Status: " + isDaemon()); // tampilin status thread apakah ia daemon
	}

}
