package repository;

import model.Produto;

public interface ProdutoRepository {
	
	public void cadastrarProduto(Produto produto);
	public void listarTodosProdutos();
	public void atualizarProduto(Produto produto);
	public void apagarTudo(int id);
	
}
