package operadoresLogicos;

import java.util.Scanner;

public class DesafioLogico {

	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		String work1;
		String work2;
		
		System.out.print("O trabalho de Ter�a est� confirmado? ");
		work1 = Entrada.nextLine();
		
		System.out.print("O trabalho de Quinta est� confirmado? ");
		work2 = Entrada.nextLine();
		
		if ((work1.equals("sim"))&(work2.equals("sim"))) {
			System.out.println("ter�a e quinta est�o confirmado!");
		} 
		else if ((work1.equals("n�o"))&(work2.equals("sim"))){
			System.out.println("apenas quinta est� confirmado!");			
		}
		else if ((work1.equals("sim"))&(work2.equals("n�o"))){
			System.out.println("apenas ter�a est� confirmado!");
		}
		else if ((work1.equals("n�o"))&(work2.equals("n�o"))){
			System.out.println("nenhum servi�o est� confirmado!");
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
		else if ((work1.equals("n�o")) & (work2.equals("n�o"))) {
			System.out.println("Infelizmente n�o iremos ao shopping"
					+ ", nem tomaremos sorvete. "
					+ "\n Mas olha pelo lado bom, voc� ficar� mais saud�vel"
					+ " por n�o consumir muito a��car!");
			
		}
	}
}
