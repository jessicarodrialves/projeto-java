package model;

public class Maquiagem extends Produto{
	
	private String tipoProduto;
	
	public Maquiagem(String nome, String cor, String categoria, double preco, int quantidade,
			String tipoProduto, int id) {
		super(nome, cor, categoria, preco, quantidade, id);
		this.tipoProduto = tipoProduto;
	}

	
	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo de produto: " + this.tipoProduto);
	}


}
