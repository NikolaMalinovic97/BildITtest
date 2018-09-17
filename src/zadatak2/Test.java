package zadatak2;

public class Test {

	public static void main(String[] args) {

		Racunar racunar = new Racunar(8, 550, 3.00, 18, 700);
		Laptop laptop = new Laptop(4, 1020, 3.00, 15, 1100, 16);
		
		System.out.println("Cijena racunara: " + racunar.izracunajCijenu());
		System.out.println("Cijena laptopa: " + laptop.izracunajCijenu());
		
		System.out.println("\nKonfiguracije racunara:");
		System.out.println("RAM: "+racunar.kolicinaRAMa+"GB");
		System.out.println("HDD: "+racunar.kapacitetHD+"GB");
		System.out.println("Procesor: "+racunar.brzinaProcesora+"GHz");
		System.out.println("Dijagonala ekrana: "+racunar.dijagonalaMonitora+"inca");
		System.out.println("CIJENA: "+racunar.izracunajCijenu()+"KM");
		

		System.out.println("\nKonfiguracije laptopa:");
		System.out.println("RAM: "+laptop.kolicinaRAMa+"GB");
		System.out.println("HDD: "+laptop.kapacitetHD+"GB");
		System.out.println("Procesor: "+laptop.brzinaProcesora+"GHz");
		System.out.println("Dijagonala ekrana: "+laptop.dijagonalaMonitora+"inca");
		System.out.println("Baterija: "+laptop.trajanjeBaterije+"h");
		System.out.println("CIJENA: "+laptop.izracunajCijenu()+"KM");
	}

}
