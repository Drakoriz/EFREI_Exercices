package tp2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author William
 */
public class Etagere {
    private int code;
    private String domaine;
    private int capacite;
    private Livre[] livres;
    
    public Etagere(){
	this.code = 001;
	this.domaine = "Blabla";
	this.capacite = 5000;
	this.livres = new Livre[capacite];
    }
    
    public Etagere(int c, String d, int cap){
	this.code = c;
	this.domaine = d;
	this.capacite = cap;
	this.livres = new Livre[]{};
    }
    
    public Livre[] getLivres(){return livres;}
    
    
    public void ajouterLivre(Livre l){
	boolean ok = false;
	for(int i = 0; i <= livres.length - 1 && ok == false; i++){
	    if(livres[i] == null) {
		livres[i] = l;
		ok = true;
	    }
	}
	if(ok){System.out.println("\nLe livre " + l.getTitre() + " a été ajouté !");}
	else{System.out.println("\nIl n'y a plus de place, il faut prendre une plus grosse étagère");}
    }
    
    public void supprimerLivre(int x){
	boolean ok = false;
	for(int i = 0; i <= livres.length - 1 && ok; i++){
	    if(livres[i] != null) {
		livres[i] = null;
		ok = !ok;
	    }
	}
	if(ok){System.out.println("\nLe livre à l'index " + x + " a été supprimé !");}
	else{System.out.println("\nIl n'y avait pas de livre à cet endroit");}
    }
    
    public int sommePages(){
	int x = 0;
	for(int i = 0; i <= livres.length - 1; i++){
	    if(livres[i] != null) {
		x += livres[i].getNbPages();
	    }
	}
	return x;
    }
    
    public String chercherLivreParTitre(String titre){
	for(int i = 0; i <= livres.length - 1; i++){
	    if(livres[i].getTitre() == titre) {
		return "Le livre que vous avez demandé ("+ titre +") est le numéro " + livres[i].getCode();
	    }
	}
	return "\nIl n'y avait pas de livre avec ce nom";
    }
    
    public void chercherPetitsLivres(int seuil){
	boolean ok = false;
	System.out.println("Nombre de livres en dessous de " + seuil + " pages");
	for(int i = 0; i <= livres.length - 1; i++){
	    if(livres[i].getNbPages() <= seuil) {
		livres[i].toString();
		ok = true;
	    }
	}
	if(ok == false){System.out.println("\nAucun livre trouvé en dessous de " + seuil + " pages");}
    }
    
    public void afficherNouveauxLivres(int anneeActuelle){
	boolean ok = false;
	for(int i = 0; i <= livres.length - 1; i++){
	    if(livres[i].getAnneeEdition() == anneeActuelle) {
		System.out.println("[" + livres[i].getCode() + "] " + livres[i].getTitre());
		ok = true;
	    }
	}
	if(ok == false){System.out.println("\nAucun livre de " + anneeActuelle);}
    }
    
    public void changerNbPages(int code, int nbPages){
	if(livres[code] != null){
	    livres[code].setNbPages(nbPages);
	}
    }
    
    public void afficherLivres(){
	boolean ok = false;
	for(int i = 0; i <= livres.length - 1; i++){
	    if(livres[i] != null) {
		System.out.println("\n" + livres[i].toString());
		ok = true;
	    }
	}
	if(ok == false){System.out.println("\nAucun livre");}
    }
    
    public void trier(){
	//A faire
    }
    
    public String[] chercherTitresParAuteur(String auteur){
	//A faire
	return null;
    }
}
