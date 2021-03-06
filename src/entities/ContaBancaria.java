package entities;

public class ContaBancaria {
	
	 private Integer numero;
	 private String titular;
	 protected double saldo;
	 
	 public ContaBancaria() {
		 
	 }

	public ContaBancaria(Integer numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double deposito) {
		
		saldo = saldo + deposito;
	}
	
	public void saque(double saque) {
		
		saldo = saldo + saque;
	}

}
