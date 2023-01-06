package FisicaJuridica;

import ClientePoo.Cliente;

public class PessoaJuridica extends Cliente {
	private double desconto;
	private double salario;
	
	public PessoaJuridica(String nomeCliente,String sobrenomeCliente,String dataNasc, int telefone, int matricula,double desconto, double salario) {
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
		System.out.println("\nNome : "+getNomeCliente()+"\nSobrenome: "+getSobrenomeCliente()+"\nData de Nascimento: "+getDataNasc()+"Telefone: "+getTelefone()+"\nMatrícula: "+getMatricula()+"\nDesconto do salário: "+desconto+" %"+"Salário Bruto: "+salario);
	}	
	public void calcularSalario() {
		double salario_total = salario - (salario * (desconto/100));
		System.out.println("\nO salario liquido a ser recebido pela PJ(Pessoa Jurídica) "+getNomeCliente()+" é igual a: "+salario_total);
	}
	
}
