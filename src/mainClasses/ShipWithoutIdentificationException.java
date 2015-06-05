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
public class ShipWithoutIdentificationException extends Exception {
    public ShipWithoutIdentificationException(){
        super("Le bateau ne peut pas etre identifie.");
    }
}
