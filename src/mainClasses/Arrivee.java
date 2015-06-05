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
public class Arrivee implements Serializable {
    private Bateau boat;
    private String emplacement;

    public Arrivee(Bateau boat, String emplacement) {
        this.boat = boat;
        this.emplacement = emplacement;
    }

    public Bateau getBoat() {
        return boat;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setBoat(Bateau boat) {
        this.boat = boat;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }
    
    @Override
    public String toString() {
        return this.getBoat().getIdentifiant();
    }
}
