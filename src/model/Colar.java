package model;

public class Colar extends Produto{
	
	private String tipoColar;

	public Colar(String nome, String cor, String categoria, double preco, int quantidade, String tipoColar,int id) {
		super(nome, cor, categoria, preco, quantidade, id);
		this.tipoColar = tipoColar;
	}
	public String getTipoColar() {
		return tipoColar;
	}

	public void setTipoColar(String tipoColar) {
		this.tipoColar = tipoColar;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo de colar: " + this.tipoColar);
	}


	
	
}
