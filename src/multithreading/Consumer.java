package multithreading;

public class Consumer extends Thread {
	
	ProducerConsumer k = new ProducerConsumer();
	

	public void run() {
		while(true) {
			k.consume_item();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
