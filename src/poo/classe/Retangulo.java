package poo.classe;

public class Retangulo {
	
		int largura;
		int altura;
		
		Retangulo(){	
		}
		
		
		Retangulo(int largura, int altura){
			this.largura = largura;
			this.altura = altura;
		}
		
		int cArea() {
		int area;
		area = largura * altura;
		return area;
		}

		int cVolume(int profundidade) {
			return this.largura * this.altura * profundidade;
		}
		
		int cPerimetro() {
			return (2*this.largura + 2*this.altura);
			}
		}


