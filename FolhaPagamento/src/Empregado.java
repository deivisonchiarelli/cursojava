/* quero definir um novo tipo de dado */
public class Empregado {
	
	/* quais infomra��es ele armazena? */
	
	/*
	 * defino os atributos com o modificador "PRIVATE" para que a estrutura do objeto
	 * n�o seja aces�vel de outra classe. Isso preserva o acesso, evitando, por exemplo
	 * que outra classes atribuam/consultem valores indevidamente
	 *
	 * mas ent�o como fazer para acess�-los? CRIANDO FUNCIONALIDADES
	 */
	private String nome;
	private String cargo;
	private double salario;
	
	/* o que ele tem de funcionalidades? */
	// um m�todo para modificar o valor do atributo (por que isso? pq eu posso, por exemplo,
	// criar uma rotina de valida��o antes de atribuir
	
	// um m�todo para consultar o valor do nome, que pode at� vir com uma formata��o diferente
	
	// em casos de coincid�ncia de nomenclatura entre atributos e par�metros,
	// fica OBRIGAT�RIO o uso do operador THIS (referindo-se ao atributo)
	// para diferencia-lo do nome do par�metro
	
	
	/* funcionalidade1: mostrar as informa��es do empregado */
	void imprimir() {
		System.out.println("Nome: "+nome+"/"+cargo+"  R$ "+salario);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/* funcionalidade2: aumentar (modificar) o sal�rio do empregado */
	void aumentarSalario(double percentual) {
		salario = salario + salario * percentual/100;
	}

}