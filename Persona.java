
package esercizio33;
public class Persona {
    private int eta;
    private String nome;
    private String sesso;
    private String impiego;
    
    public Persona (int eta, String nome, String sesso, String impiego) {
        this.eta=eta;
        this.nome=nome;
        this.sesso=sesso;
        this.impiego=impiego;
      
    }
    
    public void chiSei(){
        System.out.println("Sono una persona di nome: "+nome+", sesso: "+sesso+", di eta: "+eta+", di professione: "+impiego);
    }
    
}
