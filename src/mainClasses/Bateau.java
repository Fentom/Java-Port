/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClasses;

import java.io.Serializable;

/**
 *
 * @author Jija
 */
public class Bateau extends MoyenDeTransportEau implements AUnIdentifiant, Serializable, Comparable<Bateau>{
    protected String nom;
    protected String portAttache;
    protected float tonnage;
    protected float longueur;
    protected Pavillon pavillon;
    protected int capacite;
    protected Equipage crew;

    public void setCrew(Equipage crew) {
        this.crew = crew;
    }

    public Equipage getCrew() {
        return crew;
    }
    
    
    public Bateau(String nom, String portAttache, float tonnage, float longueur, Pavillon pavillon, 
            int capacite, Equipage crew) throws ShipWithoutIdentificationException {
        if (nom == null || portAttache == null)
            throw new ShipWithoutIdentificationException();
        
        this.nom = nom;
        this.portAttache = portAttache;
        this.tonnage = tonnage;
        this.longueur = longueur;
        this.pavillon = pavillon;
        this.capacite = capacite;
        this.crew = crew;
    }

    public Bateau() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the portAttache
     */
    public String getPortAttache() {
        return portAttache;
    }

    /**
     * @param portAttache the portAttache to set
     */
    public void setPortAttache(String portAttache) {
        this.portAttache = portAttache;
    }

    /**
     * @return the tonnage
     */
    public float getTonnage() {
        return tonnage;
    }

    /**
     * @param tonnage the tonnage to set
     */
    public void setTonnage(float tonnage) {
        this.tonnage = tonnage;
    }

    /**
     * @return the longueur
     */
    public float getLongueur() {
        return longueur;
    }

    /**
     * @param longueur the longueur to set
     */
    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    /**
     * @return the pavillon
     */
    public Pavillon getPavillon() {
        return pavillon;
    }

    /**
     * @param pavillon the pavillon to set
     */
    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }


    /**
     * @return the capacite
     */
    public int getCapacite() {
        return capacite;
    }

    /**
     * @param capacite the capacite to set
     */
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public int getNbPersonnes() {
        return getCapacite();
    }

    @Override
    public String getIdentifiant() {
        return getNom()+ " - " + getPavillon();
    }
    
    @Override
    public String toString(){
        return "Bateau: " + "\nNom: " + getNom() + "\nPort d'attache: " + getPortAttache() +
                "\nTonnage: " + getTonnage() + "\nLongueur: " + getLongueur() + "\nPavillon: "
                + getPavillon() + "\nCapacite: " + getCapacite();
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        
        if(obj == this)
            return true;
        
        if(obj instanceof Bateau){
            Bateau b = (Bateau)obj;
            
            if((b.getIdentifiant()).equals(this.getIdentifiant()))
                return true;
        }
        
        return false;
    }

    @Override
    public int compareTo(Bateau o) {
        return this.getNom().compareTo(o.getNom());
    }

}
