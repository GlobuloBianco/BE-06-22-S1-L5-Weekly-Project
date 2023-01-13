package multimediale;

import java.util.Scanner;

public class Audio extends PlayerMultimediale implements Riproducibile {

	private int durata;
	private int volume;

	//---------------------- constructor ----------------------
	public Audio(String titolo, int durata) {
		super(titolo);
		this.durata = durata;
		this.volume = 3;
	}

	//---------------------- get ----------------------
	@Override
	public int getDurata() {
		return durata;
	}

	public int getVolume() {
		return volume;
	}
	
	//---------------------- Partenza di audio ----------------------
		public static void comandi(Audio x) {
			Scanner scanner = new Scanner(System.in);
			boolean esci = false;
			while (!esci) {
				System.out.println("Scegli un'azione: [ play | alzaVolume | abbassaVolume | esci ]");
				String scelta = scanner.nextLine();
				switch (scelta) {
				case "play":
					x.play();
					break;
				case "alzaVolume":
					x.alzaVolume();
					break;
				case "abbassaVolume":
					x.abbassaVolume();
					break;
				case "esci":
					esci = true;
					System.out.println("Sei uscito dall'audio");
					Main.inizioProgetto();
					break;
				default:
					System.out.println("Scelta non valida. Riprova.");
					break;
				}
			}
			scanner.close();
		}

	//---------------------- methods ----------------------
	@Override
	public void play() {
		// loop per stampare quantità in base alla durata della registrazione
		for (int i = 0; i < getDurata(); i++) { // \uD83D\uDD0A = 🔊
			System.out.printf("Riproducendo: %s.mp3   || Volume: \uD83D\uDD0A [ ", getTitolo());
			// altri loop per contare quante tacche di volume da mettere e da lasciare vuoto
			for (int b = 0; b < volume; b++) {
				System.out.print("🟩");
			}
			for (int c = 0; c < 5 - volume; c++) {
				System.out.print(" ");
			} // cosi facendo esce un risultato tipo 3 tacche su 5 allora [ ||| ]
			System.out.println(" ]"); // printline per andare a capo una volta chiuso il messaggio
		}
	}

	@Override
	public void alzaVolume() {
		if (volume < 5) {
			volume++;
			System.out.println("Volume alzato");
		} else {
			System.out.println("Il volume è al massimo");
		}
	}

	@Override
	public void abbassaVolume() {
		if (volume > 0) {
			volume--;
			System.out.println("Volume abbassato");
		} else {
			System.out.println("Il volume è spento");
		}
	}
}