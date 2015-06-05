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
public abstract class MoyenDeTransportEau extends MoyenDeTransport{
    protected boolean submersible;

    /**
     * @return the submersible
     */
    public boolean isSubmersible() {
        return submersible;
    }

    /**
     * @param submersible the submersible to set
     */
    public void setSubmersible(boolean submersible) {
        this.submersible = submersible;
    }
}
