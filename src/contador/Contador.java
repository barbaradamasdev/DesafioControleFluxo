package contador;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = userInput.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = userInput.nextInt();
		userInput.close();

		System.out.println("Os números digitados foram: " + parametroUm + " e " + parametroDois);
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.err.println("O segundo parâmetro deve ser maior que o primeiro. Por favor, tente novamente!");
		}
		
	}

	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int total = parametroDois - parametroUm;
		System.out.println("Resultando no valor: " + total);

		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		}

		for (int i = 1; i <= total; i++){
			System.out.println("Imprimindo o número " + i + "/" + total);
		}
	}
}

