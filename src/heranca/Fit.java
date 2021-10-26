package heranca;

public class Fit extends CarroPasseio {
	void acelerar() {
		if (ligado) {
			this.setVelocidade(getVelocidade() + 15);
		}
	}
	
	void frear() {
		if ((ligado) && (this.getVelocidade() >= 15)) {
			this.setVelocidade(this.getVelocidade() - 15);
		}
	}
}


