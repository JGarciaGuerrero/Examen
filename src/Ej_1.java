import java.util.Scanner;

public class Ej_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] vocal = {"A" , "E", "I", "O", "U"};
		int[] aux = new int[vocal.length];
		String cadena;
		int contador = 0;
		
		System.out.println("Introduce una palabra");
		cadena = scan.nextLine();
		cadena = cadena.toUpperCase();
		
		for(int i = 0; i < cadena.length(); i++) {
			for(int a = 0; a < vocal.length; a++) {
				if(String.valueOf(cadena.charAt(i)).equals(vocal[a])) {
					aux[a] = 1;
				}
			}
		}
		for(int x = 0; x < aux.length; x++) {
			if(aux[x] > 0) {
				contador ++;
			}
		}
		if(contador >= 5) {
			System.out.println("La palabra tiene aeiou - Tururú!!");
		}else {
			System.out.println("Le faltan vocales");
		}

	}

}
