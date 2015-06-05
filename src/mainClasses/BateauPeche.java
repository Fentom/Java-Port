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
public class BateauPeche extends Bateau{
    public enum typePeche{
        thonier,
        morutier,
        crevettier
    }
    
    private typePeche type;
    
    public BateauPeche(typePeche type, String nom, String portAttache, float tonnage, 
            float longueur, Pavillon pavillon, int capacite, Equipage crew) 
            throws ShipWithoutIdentificationException {
        super(nom, portAttache, tonnage, longueur, pavillon, capacite, crew);
        this.type = type;
    }
    
    /**
     * @return the type
     */
    public typePeche getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(typePeche type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
        return "Peche" + " / " + this.getPavillon();
    }
    
}
