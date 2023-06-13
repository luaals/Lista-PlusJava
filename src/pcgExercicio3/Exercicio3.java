package pcgExercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int salr, hor;
		char oq;
		do {
			System.out.println("Qual seu salário por hora?");
			salr = entrada.nextInt();
			System.out.println("Quantas horas trabalhadas por mês?");
			hor = entrada.nextInt();
			System.out.println("O total de seu salário vai ser R$" + (salr * hor));
			System.out.println("Deseja finalizar o programa?");
			System.out.println("S-sim N-não");
			oq = entrada.next().charAt(0);
		} while (oq != 'S');
		System.out.println("Programa finalizado");
	}
}