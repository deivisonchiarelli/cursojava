public class Time {
	private int hora;
	private int minu;
	private int segu;
	
	
	/* aqui vamos criar sobrecargas para o m�todo setTime
	 *  3 diferentes "vers�es" do mesmo m�todo
	 *  	vers�o 1 - 3 par�metros inteiros (h,m,s)
	 *  	vers�o 2 - 2 par�metros inteiros (h,m)
	 *  	vers�o 3 - 1 par�metro  inteiro  (h)
	 */
	
	public void setTime(int hora, int minu, int segu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}
	public void setTime(int hora, int minu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = 0;
	}
	public void setTime(int hora) {
		this.hora = hora;
		this.minu = 0;
		this.segu = 0;
	}
	
	public String exibirHoraUniversal() {
		String res;
		res = formataNumero(hora) + ":" + formataNumero(minu) + ":" + formataNumero(segu);
		return res;
	}
	
	public String exibirHoraPadrao() {
		int novaHora;
		String sufixo;
		if (this.hora == 0) {
			novaHora = 12;
			sufixo = "AM";
		}
		else if (this.hora == 12) {
			novaHora = 12;
			sufixo = "PM";
		}
		else if (this.hora >= 1 && this.hora <= 11) {
			novaHora = hora;
			sufixo = "AM";
		}
		else {
			novaHora = hora - 12;
			sufixo = "PM";
		}
		
		String res = formataNumero(novaHora)+":"+formataNumero(minu)+":"+formataNumero(segu)+" "+sufixo;
		return res;
	}
	
	
	private String formataNumero(int num) {
		if (num < 10) {
			return "0"+num;
		}
		else {
			return String.valueOf(num);  // retorno o valor num�rico convertido para texto
		}
	}
}