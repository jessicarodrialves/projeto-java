package model;

import util.Cores;

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
		System.out.println(Cores.TEXT_CYAN_BOLD+"Tipo de produto: " +Cores.TEXT_RESET + this.tipoProduto);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

	}


}
