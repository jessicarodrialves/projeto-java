package model;

import util.Cores;

public class Bolsa extends Produto {
	
	public Bolsa(String nome, String cor, String categoria, double preco, int quantidade,  String material,
			int quantidadeCompartimento, int id) {
		super(nome, cor, categoria, preco, quantidade, id);
		this.material = material;
		this.quantidadeCompartimento = quantidadeCompartimento;
	}
	
	private String material;
	private int quantidadeCompartimento;
	

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getQuantidadeCompartimento() {
		return quantidadeCompartimento;
	}

	public void setQuantidadeCompartimento(int quantidadeCompartimento) {
		this.quantidadeCompartimento = quantidadeCompartimento;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(Cores.TEXT_CYAN_BOLD+"Material: "+Cores.TEXT_RESET  + this.material);
		System.out.println(Cores.TEXT_CYAN_BOLD+"Quantidade de Compartimento: " +Cores.TEXT_RESET + this.quantidadeCompartimento);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

	}

	

}
