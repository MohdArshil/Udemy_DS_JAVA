package ds.stack;

public class App {

	public static void main(String[] args) {
		System.out.println(reverseString("Arshil"));

		Stack theStack = new Stack(3);
		theStack.push('1');
		theStack.push('3');
		theStack.push('5');
		theStack.push('2');

		while (!theStack.isEmpty()) {
			System.out.println(theStack.pop());
		}

	}

	public static String reverseString(String str) {
		int stackSize = str.length();
		Stack theStack = new Stack(stackSize);
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			theStack.push(ch);
		}

		String result = "";
		while (!theStack.isEmpty()) {
			char ch = theStack.pop();
			result = result + ch;
		}

		return result;
	}

}
