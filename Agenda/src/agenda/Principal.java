/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Cliente
 */
public class Principal {
    public static void main(String[] args) {
                
       		Agenda  agenda1 = new Agenda ();
		Agenda  agenda2 = new Agenda ();

		agenda1.anote(12,10,"Dia da Criança");
		agenda2.anote(7,15,"Independência do Brasil");

		agenda1.mostraAnotacao();
		agenda2.mostraAnotacao();
                
                agenda2.dia = 7;
                agenda2.mes =15;
                agenda2.anotacao ="Dia da independecia";
                agenda2.mostraAnotacao();
	}
    
    
    

}