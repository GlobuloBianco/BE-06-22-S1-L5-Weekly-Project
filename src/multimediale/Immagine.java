package multimediale;

public class Immagine extends PlayerMultimediale implements Luminosita {
	private int luminosita;
	
	//constructor
	public Immagine(String titolo) {
		super(titolo);
		this.luminosita = 4;
	}

	// get
	public int getLuminosita() {
		return luminosita;
	}
	
	//methods
	public void show() {
        System.out.printf(" Riproducendo: %s.jpg || Luminosità: ☀ [ ", getTitolo());
        for (int b = 0; b < luminosita; b++) {
            System.out.print("🟥");
        }
        for (int c = 0; c < 5 - luminosita; c++) {
            System.out.print(" ");
        }
        System.out.println(" ]");
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
