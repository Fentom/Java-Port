/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.beans.*;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Jija
 */
public class KindOfBoatBean implements Serializable, UtilisateurNombre{
    
    public static final String PROP_SAMPLE_PROPERTY = "info";
    private String info;
    
    private PropertyChangeSupport propertySupport;
    private ThreadRandomGenerator thread;
    
    public KindOfBoatBean() {
        propertySupport = new PropertyChangeSupport(this);
        
        thread = new ThreadRandomGenerator(this, 0, 1000, 2, 1);
    }
    
    public KindOfBoatBean(int borneInf, int borneSup, int multiple, int temps) {
        propertySupport = new PropertyChangeSupport(this);
        
        thread = new ThreadRandomGenerator(this, borneInf, borneSup, multiple, temps);
    }
    
    public void run() {
        thread.start();
    }
    
    public String getInfo() {
        return info;
    }
    
    public void setInfo(String value) {
        String oldValue = info;
        info = value;
        
        System.out.println("VOilà le type de bateau " + value);
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, info);
        System.out.println("fire reussi");
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

    @Override
    public String getIdentifiant() {
         return "KindOfBoat";
    }

    @Override
    public void traiteNombre(int n) {
        if(n % 7 == 0)
            this.setInfo("plaisance");
        else if(n % 17 == 0)
            this.setInfo("peche");
    }
    
}
