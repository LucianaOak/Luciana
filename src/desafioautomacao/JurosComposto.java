package desafioautomacao;

public class JurosComposto {

	public static void main(String[] args) {
		double alba = 70000;
        double bala = 200000;
        int anos = 0;

        while (alba < bala){
            anos++;
            alba = alba * 1.03;
            bala = bala * 1.015;
        }
        System.out.println("Serão necessários "+ anos + " anos");
        }

}
