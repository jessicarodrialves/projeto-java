package model;

public class Produto {
	
	private String nome;
	private String cor;
	private String categoria;
	private double preco;
	private int quantidade;
	private int tipoPagamento;
		
	public Produto(String nome, String cor, String categoria, double preco, int quantidade, int tipoPagamento) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.categoria = categoria;
		this.preco = preco;
		this.quantidade = quantidade;
		this.tipoPagamento = tipoPagamento;
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

		public int getTipoPagamento() {
			return tipoPagamento;
		}

		public void setTipoPagamento(int tipoPagamento) {
			this.tipoPagamento = tipoPagamento;
		}
		public void tipoPagamento(){
			
			switch (tipoPagamento) {
			case 1:
				System.out.println("Cartão Crédito");
				break;
			case 2:
				System.out.println("Cartão Débito");
				break;
			case 3:
				System.out.println("Pix");
				break;
			case 4:
				System.out.println("A vista");
				break;
			default:
				System.out.println("Opção inválida, selecionar do 1 ao 4");
				break;
			}
		}
		
		public void visualizar(){
			System.out.println("Nome produto: " + this.nome);
			System.out.println("Cor produto: " + this.cor);
			System.out.println("Categoria produto: " + this.categoria);
			System.out.println("Preço produto: " + this.preco);
			System.out.println("Quantidade produto: " + this.quantidade);
		}

	}
