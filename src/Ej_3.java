import java.util.ArrayList;
import java.util.Scanner;

public class Ej_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		ArrayList<Integer> aux = new ArrayList<Integer>();
		
		do {
			System.out.println("Introduce un número positivo");
			num = scan.nextInt();
			if(num < 0) {
				break;
			}
			aux.add(num * 5 - 3);
			
		}while(num >= 0);
		
		System.out.println(aux);


	}

}
