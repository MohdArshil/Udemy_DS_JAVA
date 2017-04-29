package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 3;
		array[1] = 4;
		array[2] = 9;
		array[3] = 6;
		array[4] = 1;
		System.out.println(linearSearch(array, 4));
		System.out.println(linearSearch(array, 23));
	}

	public static int linearSearch(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
