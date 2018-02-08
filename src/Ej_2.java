import java.util.Scanner;

public class Ej_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String cadena;
		String[] vocal = {"A" , "E", "I", "O", "U"};
		
		System.out.println("Introduce una palabra");
		cadena = scan.nextLine();
		cadena = cadena.toUpperCase();
		String[] aux = new String[cadena.length()];
		
		for(int i = 0; i < aux.length; i++) {
			aux[i] = String.valueOf(cadena.charAt(i));
		}
		
		for(int a = 0; a < vocal.length; a++) {
			for(int b = 0; b < aux.length; b++) {
				for(int c = 0; c < vocal.length; c++) {
					if(aux[b].equals(vocal[c])) {
						if(a == 0) {
							aux[b] = "A";
						}else if(a == 1) {
							aux[b] = "E";
						}else if(a == 2) {
							aux[b] = "I";
						}else if(a == 3) {
							aux[b] = "O";
						}else if(a == 4) {
							aux[b] = "U";
						}
					}
				}
			}
			if(a == 0) {
				System.out.print("Con la a...");
				for(int x = 0; x <aux.length; x++) {
				System.out.print(aux[x]);
				}
				System.out.println("");
			}else if(a == 1) {
				System.out.print("Con la e...");
				for(int x = 0; x <aux.length; x++) {
					System.out.print(aux[x]);
					}
				System.out.println("");
			}else if(a == 2) {
				System.out.print("Con la i...");
				for(int x = 0; x <aux.length; x++) {
					System.out.print(aux[x]);
					}
				System.out.println("");
			}else if(a == 3) {
				System.out.print("Con la o..." );
				for(int x = 0; x <aux.length; x++) {
					System.out.print(aux[x]);
					}
				System.out.println("");
			}else if(a == 4) {
				System.out.print("Con la u..." );
				for(int x = 0; x <aux.length; x++) {
					System.out.print(aux[x]);
					}
				System.out.println("");
			}
		}
		
		
		

	}

}
