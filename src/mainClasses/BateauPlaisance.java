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
public class BateauPlaisance extends Bateau{
    public enum typePermis{
        plaisanceOptionCotiere,
        plaisanceExtensionHauturiere
    }
    
    private typePermis permis;
    
    public BateauPlaisance(typePermis permis, String nom, String portAttache, float tonnage, 
            float longueur, Pavillon pavillon, int capacite, Equipage crew) 
            throws ShipWithoutIdentificationException {
        super(nom, portAttache, tonnage, longueur, pavillon, capacite, crew);
        this.permis = permis;
    }
    
    /**
     * @return the permis
     */
    public typePermis getPermis() {
        return permis;
    }

    /**
     * @param permis the permis to set
     */
    public void setPermis(typePermis permis) {
        this.permis = permis;
    }
    
    public String toString(){
        return "Plaisance" + " / " + this.getPavillon();
    }
}
