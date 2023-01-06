package FisicaJuridica;

public class TestePessoaFisica {

	public static void main(String[] args) {
		PessoaFisica Pess = new PessoaFisica("Joao","nascimento","12.01.1990",912345678,59,40,4000);
		
		Pess.imprimirInfo();
		Pess.calcularSalario();

	}

}
