package inheritance;

public class Driver {

	public static void main(String[] args) {
		Parent c1 = new Child();
		
		c1.speed();//if method is same in two classes it gives prioroty to which class object is created
		c1.who();//by creating object child class you can access parent methods
	}
}
