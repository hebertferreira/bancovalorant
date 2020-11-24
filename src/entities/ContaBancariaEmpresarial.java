package entities;

public class ContaBancariaEmpresarial extends ContaBancaria{
	
	private double limiteCredito;
	
	public ContaBancariaEmpresarial() {
		
	}

	public ContaBancariaEmpresarial(Integer numero, String titular, double saldo, double limiteCredito) {
		super(numero, titular, saldo);
		this.limiteCredito = limiteCredito;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public void pegarCredito(double pegarCredito) {
		
		if(pegarCredito <= limiteCredito) {
			saldo = saldo + pegarCredito - 10.0;
		}else {
			System.out.println("Emprestimo Negado");
		}
	}
	

}
