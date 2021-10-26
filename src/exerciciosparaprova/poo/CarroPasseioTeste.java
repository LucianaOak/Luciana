package exerciciosparaprova.poo;

public class CarroPasseioTeste {

	public static void main(String[] args) {
		CarroPasseio carro1 = new Gol();
		Fit carro2 = new Fit();

		carro1.setAno(2015);
		carro1.setCor("prata");
		carro1.setFabricante("VW");
		carro1.setVelocidade(0);
		carro1.setLigado(true);

		carro1.acelerar(100);
		System.out.println("Velocidade do carro1: " + carro1.getVelocidade());
		carro1.acelerar(200);
		System.out.println("Velocidade do carro1: " + carro1.getVelocidade());
		carro1.acelerar(100);
		System.out.println("Velocidade do carro1: " + carro1.getVelocidade());
		carro1.frear(360);
		System.out.println("Velocidade do carro1: " + carro1.getVelocidade());

		carro2.setAno(2020);
		carro2.setCor("preto");
		carro2.setFabricante("Honda");
		carro2.setVelocidade(0);
		carro2.setLigado(false);

		carro2.acelerar(100);
		System.out.println("Velocidade do carro 2: " + carro2.getVelocidade());
		carro2.setLigado(true);
		carro2.acelerar(200);
		System.out.println("Velocidade do carro 2: " + carro2.getVelocidade());
		carro2.acelerar(200);
		System.out.println("Velocidade do carro 2: " + carro2.getVelocidade());
		carro2.frear(130);
		System.out.println("Velocidade do carro 2: " + carro2.getVelocidade());

	}

}
