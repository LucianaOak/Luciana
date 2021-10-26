package heranca;

public class CarroTeste {

	public static void main(String[] args) {
		Gol gol = new Gol();
		Fit fit = new Fit();
		
		gol.ligar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		System.out.println("Velocidade do gol: " + gol.getVelocidade());

		fit.ligar();
		fit.acelerar();
		fit.acelerar();
		fit.acelerar();
		System.out.println("Velocidade do fit: " + fit.getVelocidade());
		
		fit.alterarVelocidade(200);
		System.out.println("Velocidade do fit: " + fit.getVelocidade());
		}
	}
