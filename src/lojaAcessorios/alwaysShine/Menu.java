package lojaAcessorios.alwaysShine;
import java.util.InputMismatchException;
import java.util.Scanner;
import controller.ProdutoController;
import model.Bolsa;
import model.Colar;
import model.Maquiagem;

public class Menu {

	public static void main(String[] args) {
		
		String tipoMaquiagem;
		String tipoColar;
		String nome = "";
		String cor;
		int categoria;
		int opcao = 0;
		int quantidade;
		double valorProduto;
		int id = 0;
			
		Scanner recebeDados = new Scanner (System.in);
					
		ProdutoController p1 = new ProdutoController();

		do {
			try {
				
		System.out.println("========================================================");
		System.out.println("               Digite uma opção:                        ");
		System.out.println("========================================================");
		System.out.println("              1 - Cadastrar o produto                   ");
		System.out.println("              2 - Listar todos os produtos              ");
		System.out.println("              3 - Atualizar produto                     ");
		System.out.println("              4 - Apagar produto                        ");
		System.out.println("              5 - Sair                                  ");
		System.out.println("========================================================");
	
		
		opcao = recebeDados.nextInt();
		
		recebeDados.nextLine();	
		
		switch (opcao) {
			case 1:				
				System.out.println("Informe a marca do produto: ");
				nome = recebeDados.nextLine();
				
				System.out.println("Informe a cor: ");
				cor = recebeDados.nextLine();
						
				System.out.println("Informe o valor (R$): ");
				valorProduto = recebeDados.nextDouble();
				
				
				System.out.println("Informe a quantidade: ");
				quantidade = recebeDados.nextInt();
												
				System.out.println("Informe a categoria: ");
				System.out.println(" 1 - Bolsa ");
				System.out.println(" 2 - Colar ");
				System.out.println(" 3 - Maquiagem ");
				
				categoria = recebeDados.nextInt();
				
				String material;
				int quantidadeCompartimento;
				
				if(categoria == 1) {
					
					System.out.println("Informe a quantidade de compartimento da bolsa: ");
					quantidadeCompartimento = recebeDados.nextInt();
					
					recebeDados.nextLine();
					System.out.println("Informe o material da bolsa: ");
					material = recebeDados.nextLine();
					p1.cadastrarProduto(new Bolsa(nome, cor, "Bolsa", valorProduto, quantidade, material, quantidadeCompartimento, p1.gerarId()));
				
				}else if(categoria == 2) {
					recebeDados.nextLine();
					System.out.println("Informe o tipo de colar (Longo ou Curto):");
					tipoColar = recebeDados.nextLine();
					p1.cadastrarProduto(new Colar(nome, cor, "Colar", valorProduto, quantidade, tipoColar, p1.gerarId()));
				
				}else if(categoria == 3) {
					recebeDados.nextLine();
					System.out.println("Informe o tipo de maquiagem: ");
					tipoMaquiagem = recebeDados.nextLine();
										
					p1.cadastrarProduto(new Maquiagem(nome, cor, "Maquiagem", valorProduto, quantidade, tipoMaquiagem, p1.gerarId()));
				}
				
				break;
			case 2:
				p1.listarTodosProdutos();
				break;
			case 3:
				System.out.println("Informe o número do produto:");
				
				id = recebeDados.nextInt();
								
				var buscarProduto = p1.buscarProduto(id);
				recebeDados.nextLine();

				
				if(buscarProduto != null) {
					
					System.out.println("Informe a marca do produto: ");
					nome = recebeDados.nextLine();
					
					System.out.println("Informe a cor: ");
					cor = recebeDados.nextLine();
							
					System.out.println("Informe o valor (R$): ");
					valorProduto = recebeDados.nextDouble();
					
					System.out.println("Informe a quantidade: ");
					quantidade = recebeDados.nextInt();
					
					System.out.println("Informe a categoria: ");
					System.out.println(" 1 - Bolsa ");
					System.out.println(" 2 - Colar ");
					System.out.println(" 3 - Maquiagem ");
					
					categoria = recebeDados.nextInt();
																
					if(categoria == 1) {
						
						System.out.println("Informe a quantidade de compartimento da bolsa: ");
						quantidadeCompartimento = recebeDados.nextInt();
						
						recebeDados.nextLine();
						System.out.println("Informe o material da bolsa: ");
						material = recebeDados.nextLine();
						p1.atualizarProduto(new Bolsa(nome, cor, "Bolsa", valorProduto, quantidade, material, quantidadeCompartimento, id));
					
					}else if(categoria == 2) {
						recebeDados.nextLine();
						System.out.println("Informe o tipo de colar (Longo ou Curto):");
						tipoColar = recebeDados.nextLine();
						p1.atualizarProduto(new Colar(nome, cor, "Colar", valorProduto, quantidade, tipoColar, id));
						
					}else if(categoria == 3) {
						recebeDados.nextLine();
						System.out.println("Informe o tipo de maquiagem: ");
						tipoMaquiagem = recebeDados.nextLine();
						p1.atualizarProduto(new Maquiagem(nome, cor, "Maquiagem", valorProduto, quantidade, tipoMaquiagem, id));
					}else {
						System.out.println("Número do Produto não encontrado!");
					}
				}
				
				
				break;
			case 4:
				System.out.println("Informe o número do produto: ");
				id = recebeDados.nextInt();
				
				p1.apagarTudo(id);
				 
				break;
			case 5:
				System.out.println("Encerrando....");
				break;
	
			default:
				System.out.println("Opção Inválida!! Favor informar um número de 1 a 6 ");
				break;
			}
		
			} catch (InputMismatchException e) {
				System.out.println("Tipo de dado inválido, favor inserir número");
				recebeDados.nextLine();	
			}
		}while(opcao != 5 );
			
		
		recebeDados.close();
	}
	
	

}
