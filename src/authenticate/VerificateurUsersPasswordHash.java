/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authenticate;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jija
 */
public class VerificateurUsersPasswordHash extends VerificateurMotDePasse {
    public final Map<String, String> hm;

    public VerificateurUsersPasswordHash(String login, String pwdIn) {
        super(login, pwdIn);
        
        hm = new HashMap<>();
        hm.put("admin", "admin");
        hm.put("kamiscil", "motdepasse");
        hm.put("user", "motdepasse");
    }

    @Override
    String findPwd(String login) {
        return hm.get(login);
    }
    
    public void addUser(String login, String pwd) {
        hm.put(login, pwd);
    }
    
    public void changePwd(String login, String pwd) {
        hm.replace(login, pwd);
    }
    
    public static void main(String args[]) {
        VerificateurUsersPasswordHash vuph = new VerificateurUsersPasswordHash("admin", "admin1");
        
        if (vuph.isOk())
            System.out.println("C'est ok!!");
        else
            System.out.println("NOOOON!");
        
        if (vuph.isValid("admin"))
            System.out.println("It's good!");
        else
            System.out.println("NOT GOOD!");
    }
    
}
