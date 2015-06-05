/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClasses;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jija
 */
public class Ponton implements Amarrage, Serializable {
    private String identifiant;
    private int capacite;
    private ArrayList<MoyenDeTransportEau> liste1;
    private ArrayList<MoyenDeTransportEau> liste2;

    public Ponton() {
        this.identifiant = "default";
        this.capacite = 0;
        
        liste1 = new ArrayList<>();
        liste2 = new ArrayList<>();
    }
    
    
    public Ponton(String identifiant, int capacite) {
        this();
        
        this.identifiant = identifiant;
        this.capacite = capacite;
        
        for(int i = 0 ; i < this.capacite ; i++)
            liste1.add(i, null);
        
        for(int i = 0 ; i < this.capacite ; i++)
            liste2.add(i, null);
    }
    
    

    /**
     * @return the identifiant
     */
    @Override
    public String getIdentifiant() {
        return identifiant;
    }

    /**
     * @param identifiant the identifiant to set
     */
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    /**
     * @return the capacite
     */
    @Override
    public int getCapacite() {
        return capacite * 2;
    }

    
    public ArrayList<MoyenDeTransportEau> getListe(int numero){
        if(numero == 1)
            return liste1;
        else
            return liste2;
        
        // throw exception if something else than 1 or 2
    }
    
    public void ajouter(MoyenDeTransportEau m, int index) throws PlaceAlreadyTakenException {
        if(index < getCapacite()) {
            if(this.get(index) == null) {
                if(index < this.capacite)
                   liste1.add(index, m);
                else
                   liste2.add(index - this.capacite, m);
            }
            else
                throw new PlaceAlreadyTakenException();
        }
    }
    
    public void retirer(MoyenDeTransportEau m) {
        if(liste1.contains(m))
            liste1.remove(m);
        else if(liste2.contains(m))
            liste2.remove(m);
    }

    @Override
    public MoyenDeTransportEau get(int index) {
        if(index < getCapacite()) {
             if(index < this.capacite)
                return liste1.get(index);
             else
                return liste2.get(index - this.capacite);
        }
        
        return null;
    }
    
    
}
