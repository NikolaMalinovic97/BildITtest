package zadatak2;

public class Laptop extends Racunar {

	double trajanjeBaterije;
	
	
	
	public Laptop(int kolicinaRAMa, int kapacitetHD, double brzinaProcesora, double dijagonalaMonitora,
			double nabavnaCijena, double trajanjeBaterije) {
		super(kolicinaRAMa, kapacitetHD, brzinaProcesora, dijagonalaMonitora, nabavnaCijena);
		this.trajanjeBaterije = trajanjeBaterije;
	}



	public double izracunajCijenu() {
		return nabavnaCijena + (15/100 * nabavnaCijena);
	}
}
