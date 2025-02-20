package lojaAcessorios.alwaysShine;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		int opcao = 0;
		Scanner recebeDados = new Scanner (System.in);

		do {
		System.out.println("========================================================");
		System.out.println("               Digite uma opção:                        ");
		System.out.println("========================================================");
		System.out.println("              1 - Selecionar produto                   ");
		System.out.println("              2 - Listar todos os produtos             ");
		System.out.println("              3 - Buscar produto por categoria         ");
		System.out.println("              4 - Apagar produto                       ");
		System.out.println("              5 - Pagamento                            ");
		System.out.println("              6 - Sair                                 ");
		System.out.println("========================================================");
	
		opcao = recebeDados.nextInt();
		
		switch (opcao) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				System.out.println("Encerrando....");

				break;
		
			default:
				System.out.println("Opção Inválida!! Favor informar um número de 1 a 6 ");
				break;
			}
		}while(opcao != 6);
		recebeDados.close();
	}
	
	

}
