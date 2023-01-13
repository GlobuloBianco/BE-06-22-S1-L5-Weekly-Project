package multimediale;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		inizioProgetto(); //Progetto settimanale: BE-06-22-S1-L5-WeeklyProject
	}

	static void inizioProgetto() {
		Scanner input = new Scanner(System.in);
		int scelta;

		while (true) {
			System.out.println("Invia il numero corrispondente da voler selezionare: ");
			System.out.println("----------------------------------------");
			System.out.println("| \033[32m(1) Immagine \033[37m| (2) Video | \033[31m(3) Audio \033[37m|");
			System.out.println("----------------------------------------");

			if (input.hasNextInt()) {
				scelta = input.nextInt();
				if (scelta >= 1 && scelta <= 3) {
					break;
				} else {
					System.out.println("Scelta non valida. Riprovare.");
				}
			} else { // se scelgono un decimale
				System.out.println("Inserire un numero intero valido.");
				input.next(); // per pulire l'input
			}
		}

		switch (scelta) {
		case 1:
			avviaImmagine();
			break;
		case 2:
			avviaVideo();
			break;
		case 3:
			avviaAudio();
			break;
		}
		input.close();
	}

	private static void avviaImmagine() {
		Scanner immagine = new Scanner(System.in);
		System.out.println("Inserire il nome dell' immagine: ");
		String titolo = immagine.nextLine();
		Immagine x = new Immagine(titolo);
		Immagine.comandi(x);
		immagine.close();
	}

	private static void avviaAudio() {
		Scanner audio = new Scanner(System.in);
		System.out.println("Inserire il nome dell' audio: ");
		String titolo = audio.nextLine();
		System.out.println("Inserire durata audio (in secondi): ");
		String durata = audio.nextLine();
		Audio x = new Audio(titolo, Integer.parseInt(durata));
		Audio.comandi(x);
		audio.close();
	}

	private static void avviaVideo() {
		Scanner video = new Scanner(System.in);
		System.out.println("Inserire il nome del video: ");
		String titolo = video.nextLine();
		System.out.println("Inserire durata video (in secondi): ");
		String durata = video.nextLine();
		Video x = new Video(titolo, Integer.parseInt(durata));
		Video.comandi(x);
		video.close();
	}
}
/* -------- Da fare:
 * Si scriva il codice Java necessario all’implementazione di un Player
 * multimediale impiegando i principi OOP Descrizione del sistema:
 * 
 * Un Elemento Multimediale è una Immagine, un Video o una registrazione Audio
 * identificato da un titolo. Un elemento è riproducibile se ha una durata (un
 * valore positivo di tipo int) e un metodo play(). Una registrazione Audio è
 * riproducibile e ha associato anche un volume (un valore positivo di tipo int)
 * e i metodi abbassaVolume() e alzaVolume() per regolarlo. Se riprodotta,
 * ripete per un numero di volte pari alla durata la stampa del titolo
 * concatenato a una sequenza di punti esclamativi di lunghezza pari al volume
 * (una stampa per riga).
 * 
 * Un Video è riproducibile e ha associato un volume regolabile analogo a quello
 * delle registrazioni audio e anche una luminosità (un valore positivo di tipo
 * int) e i metodi aumentaLuminosita() e diminuisciLuminosita() per regolarla.
 * Se riprodotta, ripete per un numero di volte pari alla durata la stampa del
 * titolo concatenato a una sequenza di punti esclamativi di lunghezza pari al
 * volume e poi a una sequenza di asterischi di lunghezza pari alla luminosità
 * (una stampa per riga). Una Immagine non è riproducibile, ma ha una luminosità
 * regolabile analoga a quella dei filmati e un metodo show() che stampa il
 * titolo concatenato a una sequenza di asterischi di lunghezza pari alla
 * luminosità Eseguire un oggetto multimediale significa invocarne il metodo
 * show() se è un'immagine o il metodo play() se è riproducibile. Organizzare
 * opportunamente con classi astratte, interfacce e classi concrete il codice di
 * un lettore multimediale che memorizza 5 elementi (creati con valori letti da
 * tastiera) in un array e poi chiede ripetutamente all'utente quale oggetto
 * eseguire (leggendo un intero da 1 a 5 oppure 0 per finire).
 */