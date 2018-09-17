package zadatak3;

public class Test {

	public static void main(String[] args) {

		int[] niz = {10, 5, 6, 21, 2};
		
		MyArray mojNiz = new MyArray(niz);
		
		System.out.println("Najmanji: " + mojNiz.getSmallestElement());
		System.out.println("Najveci: " + mojNiz.getLargestElement());
		System.out.println("Suma: " + mojNiz.sumAllElements());
		mojNiz.printAllElements();
	}

}
