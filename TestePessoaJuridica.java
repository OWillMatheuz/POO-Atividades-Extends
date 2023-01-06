package FisicaJuridica;

public class TestePessoaJuridica {

	public static void main(String[] args) {
		PessoaFisica pessju = new PessoaFisica("Maria","Antonia","06.06.1992",97654321,59,15,4000);
		pessju.imprimirInfo();
		pessju.calcularSalario();

	}

}
