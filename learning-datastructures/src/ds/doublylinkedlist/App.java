package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList theList = new DoublyLinkedList();
		theList.insertFirst(45);
		theList.insertFirst(11);
		theList.insertFirst(56);
		theList.insertLast(55);
		theList.insertLast(90);
		theList.insertLast(20);
		theList.displayForward();
		theList.displayBackward();
	}

}
