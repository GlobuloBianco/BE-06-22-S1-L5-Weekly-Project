package multimediale;

import java.util.Scanner;

public class Video extends PlayerMultimediale implements Riproducibile, Luminosita {

	private int durata;
	private int volume;
	private int luminosita;

	// ---------------------- constructor ----------------------
	public Video(String titolo, int durata) {
		super(titolo);
		this.durata = durata;
		this.volume = 3;
		this.luminosita = 4;
	}

	// ---------------------- get ----------------------
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

	// ---------------------- Partenza di video ----------------------
	public static void comandi(Video x) {
		Scanner scanner = new Scanner(System.in);
		boolean esci = false;
		while (!esci) {
			System.out.println(
					"Scegli un'azione: [ play | alzaVolume | abbassaVolume | aumentaLuminosita | diminuisciLuminosita | esci ]");
			String scelta = scanner.nextLine();
			switch (scelta) {
			case "play":
				x.play();
				break;
			case "alzaVolume":
				x.alzaVolume();
				break; // da notare che sembra un mezzo albero di natale 🎄
			case "abbassaVolume":
				x.abbassaVolume();
				break;
			case "aumentaLuminosita":
				x.aumentaLuminosita();
				break;
			case "diminuisciLuminosita":
				x.diminuisciLuminosita();
				break;
			case "esci":
				esci = true;
				System.out.println("Sei uscito dal video");
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

	@Override
	public void aumentaLuminosita() {
		if (luminosita < 5) {
			luminosita++;
			System.out.println("Luminosità alzata");
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
