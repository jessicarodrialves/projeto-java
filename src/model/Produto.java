package model;

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
			System.out.println("Nome: " + this.nome);
			System.out.println("Cor: " + this.cor);
			System.out.println("Categoria: " + this.categoria);
			System.out.println("Preço: " + this.preco);
			System.out.println("Quantidade: " + this.quantidade);
			System.out.println("ID: " + this.id);

		}
	}
