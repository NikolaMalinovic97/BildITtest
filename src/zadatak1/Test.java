package zadatak1;

public class Test {

	public static void main(String[] args) {

		Author a = new Author("Ivo Andric", "nobelovac@gmail.com", 'm');
		
		Book b = new Book("Na Drini cuprija", a, 29.99, 37);
		
		System.out.println(b.toString());
	}

}
