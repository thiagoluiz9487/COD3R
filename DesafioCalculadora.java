package operadoresLogicos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite um numero: ");
		String valor1 = entrada.nextLine().replace(",",".");
		System.out.print("digite outro número: ");
		String valor2 = entrada.nextLine().replace(",",".");
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		System.out.print("escolha a operação +, -, *, /: ");
		String operador = entrada.next();
		
		double resultado = operador.equals("+") ? num1+num2 : 0;
		resultado = operador.equals("-") ? num1-num2 : resultado;
		resultado = operador.equals("*") ? num1*num2 : resultado;
		resultado = operador.equals("/") ? num1/num2 : resultado;
		resultado = operador.equals("%") ? num1%num2 : resultado;
		
		
		System.out.printf("O resultado de %.2f %s %.2f é: %s",
				num1, operador, num2, resultado);
		
		
		entrada.close();
		
	}
}
