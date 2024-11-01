package dio.projeto.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// criando entrada e saída de dados ao digitar
		
		Scanner scan = new Scanner(System.in);
		float a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		b = scan.nextFloat();
		
		float soma = soma(a,b);//pegando método e colocando variável
		float subtracao = subtracao(a, b);
		float multiplicacao = multiplicacao(a, b);
		float divisao = divisao(a, b);
		
		System.out.println("Soma : "+soma);
		System.out.println("Subtração : "+subtracao);
		System.out.println("Multiplicação : "+multiplicacao);
		System.out.println("Divisão : "+divisao);
	
	
	}

	public static float soma(float a, float b) {
		return a + b;
	}
	public static float subtracao(float a, float b) {
		return a - b;
	}
	
	public static float divisao(float a, float b) {
		return a / b;
	}
	
	public static float multiplicacao(float a, float b) {
		return a * b;
	}
}
