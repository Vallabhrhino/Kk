package multithreading;




//By using Runnable interface

//public class Basic implements Runnable{
//	
//	public void run() {
//		for(int i=0; i<10; i++) {
//			System.out.println("Value of i " + i);
//		}
//	}
//	
//	public static void main(String[] args) {
//		Basic b = new Basic();
////		b.start();By implementing runnable we cant use start method to run the thread
//
////	Here we have to follow following steps
//		
//		Thread t = new Thread(b);
//		t.start();
//	
//	}


//By Using Extendending thread class
//public class Basic extends Thread{
//	
//	public void run() {
//		for(int i=0; i<10; i++) {
//			System.out.println("Value of i " + i);
//		}
//	}
//	
//	public static void main(String[] args) {
//		Basic b = new Basic();
//		b.start();
//		
//	}
//	
//	
//
//}
	


//Methods

public class Basic extends Thread{
	
//	In run method we write task that we want done by thread
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Value of i " + i);
		}
	}
	 
	public static void main(String[] args) {
		Basic b = new Basic();
		b.start();
		System.out.println(b.getName());
		System.out.println(b.getId());
		b.setName("Rhinoking");
		System.out.println(b.getName());
		b.setPriority(2);
		System.out.println(b.getPriority());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Stopped");
	}
	
	

}
	

