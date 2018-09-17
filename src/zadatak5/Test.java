package zadatak5;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str="";
		
		ArrayList<String> lista = new ArrayList<String>();
		
		while(true) {
			System.out.print("Unesite rijec: ");
			str = sc.nextLine();
			if(str.equals("kraj"))
				break;
			else
				lista.add(str);
		}
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + " ");
		}
		
		sc.close();
	}

}
