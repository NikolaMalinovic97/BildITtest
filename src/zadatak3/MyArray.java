package zadatak3;

public class MyArray {

	int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}
	
	
	public int getSmallestElement() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i] < min)
				min = array[i];
		}
		
		return min;
	}
	
	public int getLargestElement() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max)
				max = array[i];
		}
		
		return max;
	}
	
	public int sumAllElements() {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public void printAllElements() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
