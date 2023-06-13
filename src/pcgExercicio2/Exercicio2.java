package pcgExercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int vel;
		int velm = 50;
		char oq;
		do {
			System.out.println("Qual era a velocidade do motorista?");
			vel = entrada.nextInt();
			if (vel <= 50) {
				System.out.println("Não haverá multa.");
			} else {
				System.out.println("A velocidade ultrapassou o limite, o valor da multa será R$" + (vel - 50) * 5);
			}
			System.out.println("Deseja finalizar o programa?");
			System.out.println("S-sim N-não");
			oq = entrada.next().charAt(0);
		} while (oq != 'S');
		System.out.println("Programa finalizado");
	}
}


