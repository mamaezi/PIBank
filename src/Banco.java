
public class Banco {

	public Banco() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Conta c1 = new Conta(1,10012,"isidro",1000);
		//ContaEspecial c2 = new ContaEspecial(1,20012,"josineidson",2000,1000);
		
		Conta c1, c2;
		
		c1 = new Conta(1,10012,"Isidro",1000);
		c2 = new ContaEspecial(1,20012, "Josideidson",2000,1000);
		
	/*	c1.setAgencia(1);
		c1.setNumConta(10012);
		c1.setTitular("isidro");
		c1.setSaldo (1000);
		
		c2.setAgencia(1);
		c2.setNumConta(20012);
		c2.setTitular("jose");
		c2.setSaldo(2000);
		c2.setLimite(1000);
		*/
		
		c1.creditar(500);
		c2.creditar(300);
		
		System.out.println ("Conta " + c1.getTitular() +  "saldo R$ " + c1.getSaldo());
		
	  //System.out.println ("Conta " + c2.getTitular() +  "saldo R$ " + c2.getSaldo() + " limite R$" + c2.getLimite());
		System.out.println ("Conta " + c2.getTitular() +  "saldo R$ " + c2.getSaldo() );
	  
	  if (c1.debitar(800)) {
		  System.out.println ("debito em c1 " + c1.getSaldo());
	  }
		  else {
			  System.out.println("debito nao autorizado em c1");			  
		  }
		  
	  if (c2.debitar(1950)) {
		  System.out.println ("debito em c2 " + c2.getSaldo());
	  }
		  else {
			  System.out.println("debito nao autorizado em c2");			  
		  }
		  
   System.out.println("------------------> Tentando fazer novo debito");
	  if (c1.debitar(1000)){
		  System.out.println ("debito em c1 " + c1.saldo);
	  }
		  else {
			  System.out.println("debito nao autorizado em c1");			  
		  }
		  
	  if (c2.debitar(1000)) {
		  System.out.println ("debito em c2 " + c2.saldo);
	  }
		  else {
			  System.out.println("debito nao autorizado em c2");			  
		  }
	  
	 
	}

}
