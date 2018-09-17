package zadatak4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite recenicu: ");
		
		String recenica = sc.nextLine();
		
		
		String rijec = "";
		int ws = 0;
		for (int i = recenica.length()-1; i >= 0; i--) {
			if(recenica.charAt(i) == ' ')
				ws++;
			if(ws == 1)
				rijec += recenica.charAt(i);
			if(ws > 1)
				break;
		}
		
		String str = "";
		for (int i = rijec.length()-1; i >= 0; i--) {
			str += rijec.charAt(i);
		}
		
		
		
		System.out.println(str);

	}

}
