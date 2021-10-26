package exerciciosparaprova.poo;

public class CarroPasseio {
	static final double VELOCIDADE_MAX = 330;
	private String fabricante;
	private String modelo;
	private String cor;
	private double velocidade;
	private int ano;
	private boolean ligado = false;

	void ligar() {
		ligado = true;
	}

	void desligar() {
		ligado = false;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		if ((velocidade >= 0) && (velocidade <= VELOCIDADE_MAX)) {
			this.velocidade = velocidade;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public static double getVelocidadeMax() {
		return VELOCIDADE_MAX;
	}

	void acelerar(int valor) {
		if (ligado) {
			if ((this.velocidade + valor) <= VELOCIDADE_MAX) {
				this.velocidade += valor;
			} else {
				this.velocidade = VELOCIDADE_MAX;
			}
		}
	}

	void frear(int valor) {
		if (ligado) {
			if ((this.velocidade - valor) >= 0) {
				this.velocidade -= valor;
			} else {
				this.velocidade = 0;
			}
		}
	}

	void alterarVelocidade(double velocidade) {
		if (ligado) {
			this.velocidade = velocidade;
		}
	}

}
