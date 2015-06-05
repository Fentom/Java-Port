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
public class Equipage implements Serializable {
    private Marin capitaine;
    private Marin second;
    private ArrayList<Marin> listeMarin;
    
    public Equipage(){
        this.capitaine = new Marin(); this.capitaine.setFonction(Marin.typeFonction.capitaine);
        this.second = new Marin(); this.second.setFonction(Marin.typeFonction.second);
        
        this.listeMarin = new ArrayList<Marin>();
    }
    
    public Equipage(Marin capitaine, Marin second){
        if((capitaine.getFonction() == Marin.typeFonction.capitaine) &&
                (second.getFonction() == Marin.typeFonction.second)) {
            this.capitaine = capitaine;
            this.second = second;
            
            this.listeMarin = new ArrayList<Marin>();
        }
    }
    
    public void ajouter(Marin m) {
        if(!listeMarin.contains(m)) {
            if (!m.getFonction().toString().equals(Marin.typeFonction.capitaine.toString())) {
                if(!m.getFonction().toString().equals(Marin.typeFonction.second.toString()))
                    listeMarin.add(m);
            }
        }
    }
    
    public void retirer(Marin m){
        if(listeMarin.contains(m))
            listeMarin.remove(m);
    }
    
    public int getNombreMarin() {
        return listeMarin.size();
    }

    public Marin getCapitaine() {
        return capitaine;
    }

    public Marin getSecond() {
        return second;
    }
    
    public Marin getMarin(int index) {
        return listeMarin.get(index);
    }
}
