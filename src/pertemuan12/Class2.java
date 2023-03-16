package pertemuan12;

public class Class2 implements Runnable {

	public Class2() {
		
	}

	@Override
	public void run() {
		
		System.out.println("Countdown from 1 to 5");
		
		int count=0;
		
		while(count<5) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
			System.out.println("Countdown 2 current: " + count);
		}
		
	}

}
