package multimediale;

import java.util.Scanner;

public class Immagine extends PlayerMultimediale implements Luminosita {
	private int luminosita;

	// ---------------------- constructor ----------------------
	public Immagine(String titolo) {
		super(titolo);
		this.luminosita = 4;
	}

	// ---------------------- get ----------------------
	public int getLuminosita() {
		return luminosita;
	}

	// ---------------------- Partenza di video ----------------------
	public static void comandi(Immagine x) {
		Scanner scanner = new Scanner(System.in);
		boolean esci = false;
		while (!esci) {
			System.out.println("Scegli un'azione: [ show | aumentaLuminosita | diminuisciLuminosita | esci ]");
			String scelta = scanner.nextLine();
			switch (scelta) {
			case "show":
				x.show();
				break;
			case "aumentaLuminosita":
				x.aumentaLuminosita();
				break;
			case "diminuisciLuminosita":
				x.diminuisciLuminosita();
				break;
			case "esci":
				esci = true;
				System.out.println("Sei uscito dall'immagine");
				Main.inizioProgetto();
				break;
			default:
				System.out.println("Scelta non valida. Riprova.");
				break;
			}
		}
		scanner.close();
	}

	// ---------------------- methods ----------------------
	public void show() {
		System.out.printf(" Osservando: %s.jpg || Luminosità: ☀ [ ", getTitolo());
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
			System.out.println("Luminosità aumentata");
		} else {
			System.out.println("La luminosità è al massimo");
		}
	}

	@Override
	public void diminuisciLuminosita() {
		if (luminosita > 0) {
			luminosita--;
			System.out.println("Luminosità diminuita");
		} else {
			System.out.println("La luminosità è al minimo");
		}
	}

}
