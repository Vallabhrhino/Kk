package multithreading;

public class ProducerConsumerMain {
	
	public static void main(String[] args) {
		
		ProducerConsumer comp = new ProducerConsumer();
		Producer p = new Producer();
		Consumer c = new Consumer();
		
		p.start();
		c.start();
		
	}
	
}
