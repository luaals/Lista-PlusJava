package pcgExercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int ne;
		System.out.println("Escolha um número de 0 a 10 para ver sua forma por extensa");
		ne = entrada.nextInt();
		switch (ne) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("um");
			break;
		case 2:
			System.out.println("dois");
			break;
		case 3:
			System.out.println("três");
			break;
		case 4:
			System.out.println("quatro");
			break;
		case 5:
			System.out.println("cinco");
			break;
		case 6:
			System.out.println("seis");
			break;
		case 7:
			System.out.println("sete");
			break;
		case 8:
			System.out.println("oito");
			break;
		case 9:
			System.out.println("nove");
			break;
		case 10:
			System.out.println("dez");
			break;
		default:
			System.out.println("Falha, escreva um número maior que zero e menor que 10.");
			
		}

	}
}
