package controller;

import java.util.ArrayList;

import model.Produto;
import repository.ProdutoRepository;
import util.Cores;

public class ProdutoController implements ProdutoRepository{
	
	private int id = 0;
	
	private ArrayList<Produto> listaProduto= new ArrayList<Produto>();

	@Override
	public void cadastrarProduto(Produto produto) {
		listaProduto.add(produto);
		System.out.println("\n O produto: "+ produto.getNome() + " foi adicionado com sucesso!");
	}

	@Override
	public void listarTodosProdutos() {
		for (Produto produto : listaProduto) {
			produto.visualizar();
		}
	}

	@Override
	public void atualizarProduto(Produto produto) {
		var atualizarProduto = buscarProduto(produto.getId());
		
		if(atualizarProduto != null) {
			listaProduto.set(listaProduto.indexOf(atualizarProduto), produto);
			System.out.println("\nA O produto número: " + produto.getId() + " foi atualizado com sucesso!");
		}else {
			System.out.println( Cores.TEXT_RED_BOLD + "\n O produto número: " + produto.getId() + " não foi encontrada!" + Cores.TEXT_RESET);
		}
		
	}

	@Override
	public void apagarTudo(int id) {
		var produto = buscarProduto(id);
		
		if(produto != null) {
			if (listaProduto.remove(produto) == true) 
				System.out.println("\nO produto de número: " + produto.getId() + " foi deletado com sucesso!");
			}else {
				System.out.println(Cores.TEXT_RED_BOLD +"\nO produto de número: " + id + " não foi encontrado!" + Cores.TEXT_RESET);
			}
	}
	
	public int gerarId() {
		return ++ id;
	}
	
	public Produto buscarProduto(int id) {
		for (Produto produto : listaProduto) {
			if (id == produto.getId()) {
				return produto;
			}
			
		}
		return null;
	}
	
	
	

}
