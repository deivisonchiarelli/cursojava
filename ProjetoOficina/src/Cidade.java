public class Cidade {
	public static void main(String[] args) {
		Carro c1, c2, c3;
		
		c1 = new Carro("Vokis");
		c2 = new Carro("F�rde");
		c3 = new Carro("Fiote");
		
		Oficina o = new Oficina("Z� das Couve");
		
		c1.andar();
		c2.andar();
		c3.andar();
		
		c1.quebrar();
		c2.quebrar();
		
		
		c1.andar();
		c2.andar();
		c3.andar();
		
		o.realizarReparoDoCarro(c1);  // l� no m�todo da classe Oficina, o par�metro c recebe a refer�ncia c1
		                              // c = c1
		
		
		c1.andar();
		
		o.fazerRevisao(c3);
		
	}

}