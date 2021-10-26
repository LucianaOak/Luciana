package exerciciosparaprova.poo;

public class Fit extends CarroPasseio {
	// Se quiser alterar o valor da VELOCIDADE_MAX, s� declara na classe e insere no construtor. 
		void acelerar(int valor) {
			super.acelerar(2*valor);
		}

		void frear(int valor) {
			super.frear(2*valor);
		}

}
