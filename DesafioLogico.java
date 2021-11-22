package operadoresLogicos;

import java.util.Scanner;

public class DesafioLogico {

	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		String work1;
		String work2;
		
		System.out.print("O trabalho de Terça está confirmado? ");
		work1 = Entrada.nextLine();
		
		System.out.print("O trabalho de Quinta está confirmado? ");
		work2 = Entrada.nextLine();
		
		if ((work1.equals("sim"))&(work2.equals("sim"))) {
			System.out.println("terça e quinta estão confirmado!");
		} 
		else if ((work1.equals("não"))&(work2.equals("sim"))){
			System.out.println("apenas quinta está confirmado!");			
		}
		else if ((work1.equals("sim"))&(work2.equals("não"))){
			System.out.println("apenas terça está confirmado!");
		}
		else if ((work1.equals("não"))&(work2.equals("não"))){
			System.out.println("nenhum serviço está confirmado!");
		}
		
		Entrada.close();
		
		if ((work1.equals("sim"))&(work2.equals("sim"))) {
			System.out.println("Final de semana iremos ao shopping comprar"
					+ " uma tv de 50'' e tomar sorvete!");
		}
		else if ((work1.equals("sim")) | (work2.equals("sim"))) {
			System.out.println("Final de semana iremos ao shopping comprar"
					+ " uma tv de 35'' e tomar sorvete!");
		}
		else if ((work1.equals("não")) & (work2.equals("não"))) {
			System.out.println("Infelizmente não iremos ao shopping"
					+ ", nem tomaremos sorvete. "
					+ "\n Mas olha pelo lado bom, você ficará mais saudável"
					+ " por não consumir muito açúcar!");
			
		}
	}
}
