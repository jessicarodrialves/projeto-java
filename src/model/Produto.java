package model;

import util.Cores;

public abstract class Produto {
	
	private String nome;
	private String cor;
	private String categoria;
	private double preco;
	private int quantidade;
	private int id;

		public Produto(String nome, String cor, String categoria, double preco, int quantidade, int id) {
			super();
			this.nome = nome;
			this.cor = cor;
			this.categoria = categoria;
			this.preco = preco;
			this.quantidade = quantidade;
			this.id = id;
		}

		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}


		public String getCategoria() {
			return categoria;
		}


		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public double getPreco() {
			return preco;
		}
		
		public void setPreco(double preco) {
			this.preco = preco;
		}


		public int getQuantidade() {
			return quantidade;
		}


		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void visualizar(){
			
			System.out.println("\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n");

			System.out.println(Cores.TEXT_CYAN_BOLD+"                  Produto            \n"+ Cores.TEXT_RESET);
			System.out.println(Cores.TEXT_CYAN_BOLD+"Nome: "+ Cores.TEXT_RESET + this.nome);
			System.out.println(Cores.TEXT_CYAN_BOLD+"Cor: "+ Cores.TEXT_RESET  + this.cor);
			System.out.println(Cores.TEXT_CYAN_BOLD+"Categoria: "+ Cores.TEXT_RESET  + this.categoria);
			System.out.println(Cores.TEXT_CYAN_BOLD+"Preço: "+ Cores.TEXT_RESET  + this.preco);
			System.out.println(Cores.TEXT_CYAN_BOLD+"Quantidade: "+ Cores.TEXT_RESET  + this.quantidade);
			System.out.println(Cores.TEXT_CYAN_BOLD+"ID: "+ Cores.TEXT_RESET  + this.id);

		}
	}
