
public class Empregado {
	

	private String nome;
	private String cargo;
	private double salario;
	
	
	void imprimir() {
		System.out.println("Nome: "+nome+"/"+cargo+"  R$ "+salario);
	}
	
	
	void aumentarSalario(double percentual) {
		salario = salario + salario * percentual/100;
	}

}