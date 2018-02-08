import java.util.Scanner;

public class Ej_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int picos;
		int num;
		int numpic = 0;
		
		System.out.println("Introduce los números correspondientes a las alturas");
		picos = scan.nextInt();
		int[] aux = new int[picos];
		
		for(int i = 0; i < aux.length; i ++) {
			System.out.println("Introduce la altura " + (i+1));
			num = scan.nextInt();
			aux[i] = num;
		}
		
		for(int i = 0; i < aux.length; i++) {
			if(i == 0) {
				if(aux[i] > aux[i + 1] && aux[i] > aux[aux.length - 1]) {
					numpic ++;
				}
			}else if(i <= aux.length - 2){
				if(aux[i] > aux[i + 1] && aux[i] > aux[i - 1]) {
					numpic ++;
				}
			}else {
					if(aux[i] > aux[0] && aux[i] > aux[i - 1]) {
						numpic ++;
					}	
			}
		}
		System.out.println("Hay: " + numpic);
	}

	}

