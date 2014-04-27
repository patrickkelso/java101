public class SortingAndSearching {
	public static void main(String[] args) {
		int[] numbers = { 13, 1, 7, 4, 17, 8, 6 };

		print(numbers);
		sort(numbers);
		print(numbers);

		System.out.println("I found 7 at position " + linearSearch(numbers, 7));
		System.out.println("I found 7 at position " + binarySearch(numbers, 7));
	}

	public static void print(int[] array) {
		System.out.println("Numbers:");
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

	private static void sort(int[] array) {
		System.out.println("sorting...");
		for (int right = array.length - 1; right > 0; right--)
			for (int i = 0; i < right; i++)
				if (array[i] > array[i+1])
					swap(array, i, i+1);
	}

	private static void swap(int[] array, int pos1, int pos2) {
		int temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}

	private static int linearSearch(int[] array, int number) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == number)
				return i;

		return -1;
	}

	private static int binarySearch(int[] array, int number) {
		int first = 0;
		int last = array.length - 1;

		while (first <= last) {
			int pos = (first + last) / 2;

			if (number == array[pos])
				return pos;
			else if (number < array[pos])
				last = pos - 1;
			else
				first = pos + 1;
		}

		return -1;
	}
}
