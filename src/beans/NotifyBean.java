/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import mainClasses.Bateau;
import mainClasses.BateauPeche;
import mainClasses.BateauPlaisance;
import mainClasses.Pavillon;
import mainClasses.ShipWithoutIdentificationException;
import java.beans.*;
import java.io.Serializable;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jija
 */
public class NotifyBean implements Serializable, BoatEventListener {
    
    public static final String PROP_SAMPLE_PROPERTY = "Boat";
    
    private Bateau Boat;
    private Random rand;
    
    private PropertyChangeSupport propertySupport;
    
    public NotifyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }

    @Override
    public void boatEventReceived(BoatEvent e) {
        javax.swing.JOptionPane.showMessageDialog(null, "Un nouveau bateau vient d'arriver");
        
        rand = new Random();
        
        if(e.getTypeBateau().equals("peche"))
        {
            try {
                setBateau(new BateauPeche(BateauPeche.typePeche.values()[rand.nextInt(3)], "Default", "Default", 0, 0, e.getPavillon(), 0, null));
            } catch (ShipWithoutIdentificationException ex) {
                Logger.getLogger(NotifyBean.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        else if(e.getTypeBateau().equals("plaisance"))
        {
            try {
                setBateau(new BateauPlaisance(BateauPlaisance.typePermis.values()[rand.nextInt(2)], "Default", "Default", 0, 0, e.getPavillon(), 0, null));
            } catch (ShipWithoutIdentificationException ex) {
                Logger.getLogger(NotifyBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Bateau getBateau() {
        return Boat;
    }
    
    public void setBateau(Bateau value) {
        System.out.println("Voici le bateau " + value.toString());
        Bateau oldValue = Boat;
        Boat = value;
        System.out.println("On va fire le bateau!");
        
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, Boat);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
