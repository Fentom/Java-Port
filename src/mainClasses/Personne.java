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
public class Personne implements Serializable {
    protected String nom;
    protected String prenom;
    protected String dateNaissance;
    
    public Personne(){
        nom = "default";
        prenom = "default";
        dateNaissance = "01/01/2000";
    }
    
    public Personne(String nom, String prenom, String dateNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
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
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the dateNaissance
     */
    public String getDateNaissance() {
        return dateNaissance;
    }

    /**
     * @param dateNaissance the dateNaissance to set
     */
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    
    @Override
    public String toString(){
        return "Personne: " + "\nNom: " + getNom()+ "\nPrenom: " + getPrenom() + "\nDate naissance: " +
                getDateNaissance();
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        
        if (obj == this)
            return true;
        
        if(obj instanceof Personne) {
            Personne p = (Personne)obj;
            
            if(p.getNom().equals(this.getNom()) && p.getPrenom().equals(this.getPrenom()) &&
                    p.getDateNaissance().equals(this.getDateNaissance()))
                return true;
        }
        
        return false;
    }
}
