package heranca;

public class CarroPasseio {
	String fabricante;
	String modelo;
	String cor;
	private double velocidade;
	boolean ligado = false;
	
	void ligar() {
		ligado = true;
	}
	
	void desligar() {
		ligado = false;
	}
	
	void acelerar() {
		if (ligado) {
			this.velocidade = this.velocidade + 10;
		}
	}
	
	void frear() {
		if ((ligado) && (this.velocidade >= 10)) {
			this.velocidade = this.velocidade - 10;
		}
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	void alterarVelocidade(double velocidade) {
		if (ligado) {
			this.velocidade = velocidade;
			}
	}
}
	
