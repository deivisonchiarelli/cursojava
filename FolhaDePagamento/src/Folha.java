public class Folha {
	public static void main(String[] args) {
		
		Empregado e1, e2;
		
		e1 = new Empregado();
		e2 = new Empregado();
		
		e1.setNome("Isidro");
		e1.setCargo("Professor");
		e1.setSalario(2000.0);
		
		e2.setNome("Jose");
		e2.setCargo("Diretor");
		e2.setSalario(5000.0);
		
		e1.imprimir();
		e2.imprimir();
		
		e1.aumentarSalario(10.0);
		e2.aumentarSalario(5.0);
		
		System.out.println("--- Novas informações....");
		e1.imprimir();
		e2.imprimir();
		
	}

}