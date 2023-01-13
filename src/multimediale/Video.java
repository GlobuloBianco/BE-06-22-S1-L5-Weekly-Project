package multimediale;

public class Video extends PlayerMultimediale implements Riproducibile,Luminosita {

	private int durata;
	private int volume;
	private int luminosita;

	//constructor
	public Video(String titolo, int durata) {
		super(titolo);
		this.durata = durata;
		this.volume = 3;
		this.luminosita = 4;
	}
	
	//get 
	@Override
	public int getDurata() {
		return durata;
	}
	
	public int getLuminosita() {
		return luminosita;
	}
	
	public int getVolume() {
		return volume;
	}
	
	// methods
	
	@Override
	public void play() {
	    for (int i = 0; i < getDurata(); i++) {	
	        System.out.printf("Riproducendo: %s.mp4   || Volume: \uD83D\uDD0A [ ", getTitolo());
	        for (int b = 0; b < volume; b++) {
	            System.out.print("🟩");
	        }
	        for (int c = 0; c < 5 - volume; c++) {
	            System.out.print(" ");
	        }
	        System.out.print(" ] || Luminosità: ☀ [ ");
	        for (int b = 0; b < luminosita; b++) {
	            System.out.print("🟥");
	        }
	        for (int c = 0; c < 5 - luminosita; c++) {
	            System.out.print(" ");
	        }
	        System.out.println(" ]");
	    }
	}
	
	@Override
	public void alzaVolume() {
	    if (volume < 5) {
	        volume++;
	    } else {
	        System.out.println("Il volume è al massimo");
	    }
	}
	
	@Override
	public void abassaVolume() {
	    if (volume > 0) {
	        volume--;
	    } else {
	        System.out.println("Il volume è spento");
	    }
	}
	
	@Override
	public void aumentaLuminosita() {
	    if (luminosita < 5) {
	        luminosita++;
	    } else {
	        System.out.println("La luminosità è al massimo");
	    }
	}
	
	@Override
	public void diminuisciLuminosita() {
	    if (luminosita > 0) {
	        luminosita--;
	    } else {
	        System.out.println("La luminosità è al minimo");
	    }
	}
}
