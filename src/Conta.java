
public class Conta {
	protected int agencia;
	protected int numConta;
	protected String titular;
	protected double saldo;

	public Conta ( int ag, int numC, String titu, double sa)
	{
	super();
	this.agencia=ag;
	this.numConta= numC;
	this.titular=titu;
	this.saldo=sa;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void creditar(double valor) {
		saldo += valor;
		
	}
	public boolean debitar(double valor) {
		
		if (saldo>valor) { 
			saldo -= valor;
			return true;
		}
		else {
			return false;
		}
		
	}
	

}
