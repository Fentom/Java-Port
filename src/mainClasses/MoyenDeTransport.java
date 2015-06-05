/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClasses;

/**
 *
 * @author Jija
 */
public abstract class MoyenDeTransport implements AvecPersonne{
    public enum typeEnergie{
        essence,
        diesel,
        kerosene,
        vapeur
    }
    protected typeEnergie energie;

    /**
     * @return the energie
     */
    public typeEnergie getEnergie() {
        return energie;
    }

    /**
     * @param energie the energie to set
     */
    public void setEnergie(typeEnergie energie) {
        this.energie = energie;
    }
}
