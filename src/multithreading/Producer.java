package multithreading;

public class Producer extends Thread {
	
	ProducerConsumer c = new ProducerConsumer();
	
	public void run() {
		int i=1;
		while(true) {
			c.produce_item(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		
	}

	
	
}
