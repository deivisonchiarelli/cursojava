public class Folha {
	public static void main(String[] args) {
		// declaro as vari�veis e1 e e2 do tipo "Empregado"
		Empregado e1, e2;
		
		// criei os objetos (reservei mem�ria)
		e1 = new Empregado();
		e2 = new Empregado();
		
		// preenchi os objetos
		e1.setNome("Isidro");
		e1.setCargo("Professor");
		e1.setSalario(2000.0);
		
		e2.setNome("Jose");
		e2.setCargo("Diretor");
		e2.setSalario(5000.0);
		
		// usando a funcionalidade de imprimir
		e1.imprimir();
		e2.imprimir();
		
		e1.aumentarSalario(10.0);
		e2.aumentarSalario(5.0);
		
		System.out.println("--- Novas informa��es....");
		e1.imprimir();
		e2.imprimir();
		
	}

}