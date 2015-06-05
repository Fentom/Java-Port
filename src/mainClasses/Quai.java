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
public class Quai implements Amarrage, Serializable {
    private String identifiant;
    private int capacite;
    private ArrayList<MoyenDeTransportEau> liste;
    
    
    public Quai(){
        this.identifiant = "Default";
        this.capacite = 0;
        
        liste = new ArrayList<>();
    }

    public Quai(String identifiant, int capacite) {
        this();
        
        this.identifiant = identifiant;
        this.capacite = capacite;
        
        for(int i = 0 ; i < this.capacite ; i++)
            liste.add(i, null);
    }
    
    
    /**
     * @return the listeBateau
     */
    public ArrayList<MoyenDeTransportEau> getListe() {
        return liste;
    }

    /**
     * @param listeBateau the listeBateau to set
     */
    public void setListe(ArrayList<MoyenDeTransportEau> listeBateau) {
        this.liste = listeBateau;
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
        return capacite;
    }

    
    public void ajouter(MoyenDeTransportEau m, int index) throws PlaceAlreadyTakenException {
        if(liste.get(index) == null) {
            if(!liste.contains(m))
               liste.add(index, m);   
        }
        else
            throw new PlaceAlreadyTakenException();
    }
    
    public void retirer(int index) {
            liste.remove(index);
    }
    
    @Override
    public MoyenDeTransportEau get (int index) {
        if (index < getCapacite())
            return liste.get(index);
        
        return null;
    }
}
