import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> money = new ArrayList<Integer>();
		int rowSize = 0;
		int cashBox = 0;
		int peopleLocalization = 0;
		boolean test = true;

		/**
		 *	ENTRADA DE DADOS DO TAMANHO DO ARRAY;
		 */
		try {
			System.out.print("Informe a quantidade de pessoas na fila: ");
			rowSize = scanner.nextInt();
			
		} catch(InputMismatchException error) {
			System.out.println("Você não informou um número válido");
		}

		System.out.println("");
		
		/**
		 * 	ENTRADA DE DADOS DAS PESSOAS DA FILA;
		 */
		for (int i = 0; i < rowSize; i++) {
	    	try {
	    		System.out.print("Informe o dinheiro dado pela " + (i+1) + "º pessoa [25, 50 ou 100]: ");
	    		money.add(scanner.nextInt());
	    		
	    	} catch(InputMismatchException error) {
	    		System.out.println("Você não informou um número válido");
	    	}
	    }

		System.out.println("");
		
		/**
		 * 	LÓGICA DAS ENTRADAS DE DADOS DOS VALORES;
		 */
		for (int i = 0; i < rowSize; i++) {
			switch(money.get(i)) {
				case 25:
					cashBox ++;
					
					if (cashBox < 0) {
						peopleLocalization = i + 1;
					}
					
					break;
				
				case 50:
					cashBox = cashBox - 1;
					
					if (cashBox < 0) {
						peopleLocalization = i + 1;
					}
					
					break;
					
				case 100:
					cashBox = cashBox - 3;
					
					if (cashBox < 0) {
						peopleLocalization = i + 1;
					}
					
					break;
			
				default:
					System.out.println("Valor inválido");
					
					test = false;
					break;
			}			
		}
		
		/**
		 * 	VERIFICA SE DEU CERTO O TROCO OU SE NÃO, QUAL A POSIÇÃO DA PESSOA QUE NÃO TEVE TROCO;
		 */
		if (test) {
			if (peopleLocalization == 0) {
				System.out.println("SIM.");
				
			} else {
				System.out.println("NÃO, pois não terá troco ao " + peopleLocalization + "º da fila.");
			}
			
		} else {
			System.out.println("Realize o processo dos valores novamente!");
		}
	}
}
