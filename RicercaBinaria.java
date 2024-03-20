
import java.util.Scanner;

public class RicercaBinaria {

	public static int ricercaBinaria(int[] array, int numeroCercato) {

		int fine = array.length - 1;
		int inizio = 0;
		int centro = (int) ((inizio + fine) / 2); // indice del numero che ci uscirà al centro
		int indiceNumCercato = -1;// Lo dichiaro -1, perchè se il metodo restituisce questo significa che non
															// esiste
		while (indiceNumCercato == -1 && inizio <= fine) {
			centro = (int) ((inizio + fine) / 2);
			if (array[centro] == numeroCercato) {// SE il centro corrisponde al numero cercato
				indiceNumCercato = centro;
			} else if (numeroCercato > array[centro]) {// se il numero cercato è maggiore del numero al centro dell'array
				// Ci spostiamo nella parte di destra dell'array, che avrà:
				inizio = centro + 1; // Il centro +1 come inizio
				// centro = (int)(centro);//E un nuovo centro che verrà calcolato col vecchio
				// centro come inizio
			} else {// Se invece il numero cercato è minore
				// Ci sposteremo nella parte sinistra
				fine = centro - 1;// che avrà il centro -1 come fine
			}
		}
		return indiceNumCercato;
	}

	public static void main(String[] args) {
		int[] numerini = { 1, 2, 5, 6, 7, 9, 11, 15, 17, 20, 26, 27, 28 }; // Array di interi crescenti
		System.out.println("Scegli un numero (preferibilmente da 1 a 30, ma non è detto che ci siano tuttiì");
		Scanner sc = new Scanner(System.in);
		int numeroUtente = sc.nextInt();
		System.out.println(
				"Bene! Il mumero che hai scelto è: " + numeroUtente + ". Vediamo se è presente nell'array e a quale indice!");
		ricercaBinaria(numerini, numeroUtente);
		if (ricercaBinaria(numerini, numeroUtente) != -1) {
			System.out.println("Il tuo numero " + numeroUtente + " è presente nell'array all'indice "
					+ ricercaBinaria(numerini, numeroUtente) + "!");
		} else {
			System.out.println("Oh! Sembrerebbe che " + numeroUtente + " non sia presente nell'array...");
		}

	}

}
