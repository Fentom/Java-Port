/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import mainClasses.Pavillon;
import java.beans.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jija
 */
public class BoatBean implements Serializable, PropertyChangeListener {
    private List<BoatEventListener> mailingList;
    
    public BoatBean() {
        mailingList = new ArrayList<>();
    }

    public void addBoatEventListener(BoatEventListener b) {
        if(!mailingList.contains(b))
            mailingList.add(b);
    }
    
    public void removeBoatEventListener(BoatEventListener b) {
        if(mailingList.contains(b))
            mailingList.remove(b);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("J'ai recu un type de bateau");
        int aleatoire;
        BoatEvent e;
        
        aleatoire = new Random().nextInt(4);
        
        e = new BoatEvent(evt.getNewValue().toString(), new Date(), Pavillon.values()[aleatoire]);
        
        for (BoatEventListener item : mailingList) {
            item.boatEventReceived(e);
        }
    }
}
