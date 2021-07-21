/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Cliente
 */
public class Agenda {
     int dia;
    int mes;
    String  anotacao;
	
	public void anote(int d, int m, String nota){
		this.dia = d;
		this.mes = m;
		this.anotacao = nota;

		validaData();
	}
	private void validaData(){
		if ((dia<1) ||(dia>31) || (mes<1) || (mes>12)){
			dia = 0;
			mes = 0;
			anotacao = "Anotação não inserida devido a data inválida";
		}
	}
   public void mostraAnotacao(){
		System.out.println(dia+ "/" +mes+ ": " +anotacao);
        }
}
