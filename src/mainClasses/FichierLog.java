/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClasses;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileWriteEvent;

/**
 *
 * @author Jija
 */
public class FichierLog {
    private BufferedWriter bw;
    private File f;

    public FichierLog(File f) {
        this.f = f;
    }
    
    public void writeLine(String line) {
        try {
            FileWriter fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            
            bw.write("["+new Date() + "] : " + line);
            bw.newLine();
            
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(FichierLog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void writeLine(String head, String info) {
        writeLine(head + " > " + info);
    }

    public File getF() {
        return f;
    }
    
}
