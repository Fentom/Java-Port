/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import mainClasses.Pavillon;
import java.util.Date;

/**
 *
 * @author Jija
 */
public class BoatEvent {
    private String typeBateau;
    private Date dateHeure;
    private Pavillon pavillon;
    
    public BoatEvent(String typeBateau, Date dateHeure, Pavillon pavillon) {
        this.typeBateau = typeBateau;
        this.dateHeure = dateHeure;
        this.pavillon = pavillon;
    }

    public String getTypeBateau() {
        return typeBateau;
    }

    public Date getDateHeure() {
        return dateHeure;
    }

    public Pavillon getPavillon() {
        return pavillon;
    }
    
    
}
