package zadatak2;

public class Racunar {

	int kolicinaRAMa;
	int kapacitetHD;
	double brzinaProcesora;
	double dijagonalaMonitora;
	double nabavnaCijena;
	
	
	
	public Racunar(int kolicinaRAMa, int kapacitetHD, double brzinaProcesora, double dijagonalaMonitora,
			double nabavnaCijena) {
		this.kolicinaRAMa = kolicinaRAMa;
		this.kapacitetHD = kapacitetHD;
		this.brzinaProcesora = brzinaProcesora;
		this.dijagonalaMonitora = dijagonalaMonitora;
		this.nabavnaCijena = nabavnaCijena;
	}



	public double izracunajCijenu() {
		return nabavnaCijena + (1/10 * nabavnaCijena);
	}
}
