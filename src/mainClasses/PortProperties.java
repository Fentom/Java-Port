/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jija
 */
public class PortProperties {
    private Properties prop;
    

    public PortProperties() {
        prop = new Properties();
        
        prop.setProperty("port", "60000");
        prop.setProperty("borne-inf", "0");
        prop.setProperty("borne-sup", "1000");
        prop.setProperty("multiple-decl", "2");
        prop.setProperty("temps-pause", "1");
    }

    public PortProperties(Properties prop) {
        this.prop = prop;
    }
    
    
    public void load(File f){
        try {
            FileInputStream fis = new FileInputStream(f);
            prop.load(fis);
            
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PortProperties.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PortProperties.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void save(File f) {
        try {
            FileOutputStream fos = new FileOutputStream(f);
            prop.store(fos, "--");
            
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PortProperties.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PortProperties.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Properties getProp() {
        return prop;
    }
    
}
