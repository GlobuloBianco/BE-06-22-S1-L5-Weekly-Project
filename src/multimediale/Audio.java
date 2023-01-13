package multimediale;

public class Audio extends PlayerMultimediale implements Riproducibile {
	
	private int durata;
	private int volume;
	
	//constructor
	public Audio(String titolo, int durata) {
		super(titolo);
		this.durata = durata;
		this.volume = 3;
	}
	
	//get 
	@Override
	public int getDurata() {
		return durata;
	}
	
	public int getVolume() {
		return volume;
	}
	
	// methods
	@Override
	public void play() {
		// loop per stampare quantità in base alla durata della registrazione
	    for (int i = 0; i < getDurata(); i++) {			  // \uD83D\uDD0A = 🔊 
	        System.out.printf("Riproducendo: %s.mp3   || Volume: \uD83D\uDD0A [ ", getTitolo());
	    // altri loop per contare quante tacche di volume da mettere e da lasciare vuoto
	        for (int b = 0; b < volume; b++) {
	            System.out.print("🟩");
	        }
	        for (int c = 0; c < 5 - volume; c++) {
	            System.out.print(" ");
	        } // cosi facendo esce un risultato tipo 3 tacche su 5 allora [ |||  ]
	        System.out.println(" ]"); //printline per andare a capo una volta chiuso il messaggio
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
}