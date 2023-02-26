package app;
public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 31;

	public void desligarTv() {
		ligada = false;
	}

	public void ligarTv() {
		ligada = true;
	}
	public void diminuirVolume() {
		volume--;
	}
	public void aumentarVolume() {
		volume++;
	}
	public void aumentarCanal() {
		canal++;
	}
	public void diminuirCanal() {
		canal--;
	}
	public void escolherCanal(int novoCanal) {
		canal  = novoCanal; 
	}


}
