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
public class PlaceAlreadyTakenException extends Exception {
    public PlaceAlreadyTakenException(){
        super("Cette emplacement est déjà occupé");
    }
}
