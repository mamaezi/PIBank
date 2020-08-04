
public class ContaEspecial extends Conta{

	protected double limite;
	
	public ContaEspecial(int agencia,int nconta,String titular, double saldo, double limite) {
		// TODO Auto-generated constructor stub
		super(agencia, nconta, titular,saldo);
		this.limite = limite;
	}
	

	public double getLimite() {
		return this.limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	//super chama o pai da herança
	// this da classe atual
	public boolean debitar(double valor) {
		if (super.saldo+this.limite>valor)
		{
			super.saldo = super.saldo - valor;
			return true;
		}
		else {
			return false;
			
		}
	}
}
