/* esta classe Carro n�o ter� m�todo MAIN, pois nela
 * teremos apenas a defini��o de como � o novo tipo de dado 
 * CARRO, ou seja, teremos aqui defini��es de vari�veis
 */
public class Carro {
	// estas vari�veis s�o chamadas de ATRIBUTOS ou PROPRIEDADES
	String marca;
	String modelo;
	int    ano;
	String cor;
	int    finalPlaca;
	double preco;

	/* posso tamb�m declarar funcionalidades para o objeto, capazes
	 * de, por exemplo: receber dados de outras classes, retornar
	 * valores calculados ou n�o ou simplesmente fazer uma a��o
	 *
	 * qual � a forma dessa funcionalidade? Um bloco de c�digo
	 *  
	 *  
	 *  NOME_DA_FUNCIONALIDADE(){
	 *    ... comandos...
	 *  }
	 * 
	 * 
	 * por�m toda funcionalidade, por ser um trecho de c�digo tamb�m
	 * trabalha no modelo E -> P -> S
	 * 
	 * TIPO_SAIDA NOME_DA_FUNCIONALIDADE(VARIAVEIS_DE_ENTRADA){
	 *    ... comandos...
	 *  }
	 *  
	 *  tipos poss�veis de sa�da:
	 *  	int, float, double, etc..
	 *      void --> aqui � quando a funcionalidade n�o gera valores de sa�da para o programa principal
	 * 
	 */
	
	// exemplo: vamos fazer um m�todo (funcionalide) para exibir as informa��es
	void exibirInfo() {
		System.out.println("Carro: "+marca+"-"+modelo);
		System.out.println("   Ano: "+ano+"  Final Placa "+finalPlaca);
		System.out.println("   Cor: "+cor+"  Pre�o R$ "+preco);
	}
	
	// a fun��o calcularIPVA vai retornar um valor que, ao ser chamado na fun��o principal, deve ser atribu�do a uma variavel
	double calcularIPVA() {  
		double ipva;
		if (ano < 2000) {
			ipva = 0.0;
		}
		else {
			ipva = preco * 0.04;
		}
		// aqui � fundamental: toda fun��o que � declarada com tipo
		// diferente de VOID, OBRIGATORIAMENTE tem que ter a instru��o
		// RETURN
		return ipva;
	}
	
	// neste caso, o m�todo calcularDesconto recebe como par�metro
	// o valor do percentual a ser descontado
	// a entrada � o valor do percentual
	// a sa�da � o novo valor do ve�culo com desconto (descontando este percentual)
	double calcularDesconto(double percentual) {
		double desconto = preco - preco*percentual/100;
		return desconto;
	}
	
}