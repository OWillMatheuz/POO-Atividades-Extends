package FisicaJuridica;

import ClientePoo.Cliente;

public class PessoaFisica extends Cliente{
	private double desconto;
	private double salario;
	
	public PessoaFisica(String nomeCliente,String sobrenomeCliente,String dataNasc, int telefone, int matricula,double desconto, double salario) {
		super(nomeCliente,sobrenomeCliente,dataNasc,telefone,matricula);
		this.desconto = desconto;
		this.salario = salario;
	}

	public double getdesconto() {
		return desconto;
	}

	public void setdesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void imprimirInfo() {
		System.out.println("\nNome : "+getNomeCliente()+"\nSobrenome: "+getSobrenomeCliente()+"\nData de Nascimento: "+getDataNasc()+"\nTelefone: "+getTelefone()+"\nMatrícula: "+getMatricula()+"\nDesconto do salário: "+desconto+" % "+"\nSalário Bruto: "+salario);
	}	
	public void calcularSalario() {
		double salario_total = salario - (salario * (desconto/100));
		System.out.println("\nO salario líquido a ser recebido pela PF(pessoa física): "+getNomeCliente()+" é igual a: "+salario_total);
	}
}
