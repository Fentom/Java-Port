/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClasses;

/**
 *
 * @author Jija
 */
public class Marin extends Personne implements AUnIdentifiant{
    public enum typeFonction{
        capitaine,
        second,
        bosco,
        passager,
        cuisto,
        matelot
    }
    private typeFonction fonction;
    
    public Marin(){
        super();
        this.fonction = typeFonction.matelot;
    }
    
    public Marin(String nom, String prenom, String dateNaissance, typeFonction fonction) 
            throws SailorWithoutIdentificationException {
        if(nom == null || prenom == null)
            throw new SailorWithoutIdentificationException();
        
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.fonction = fonction;
    }

    /**
     * @return the fonction
     */
    public typeFonction getFonction() {
        return fonction;
    }

    /**
     * @param fonction the fonction to set
     */
    public void setFonction(typeFonction fonction) {
        this.fonction = fonction;
    }

    @Override
    public String getIdentifiant() {
        return getNom()+getPrenom();
    }
    
    @Override
    public String toString(){
        return this.getFonction().toString() + "-" + this.getNom();
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        
        if(obj == this)
            return true;
        
        if(obj instanceof Marin){
            Marin m = (Marin)obj;
            
            if(m.getIdentifiant().equals(this.getIdentifiant()))
                return true;
        }
        
        return false;
    }
    
}
