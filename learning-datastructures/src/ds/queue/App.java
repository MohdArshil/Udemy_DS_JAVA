package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(1010);
		myQueue.insert(20100);
		myQueue.insert(13);
		myQueue.insert(112);
		myQueue.insert(452);
		
		myQueue.insert(555);
		myQueue.view();
		
		System.out.println(myQueue.peekFront());
	}

}
