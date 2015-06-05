/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authenticate;

/**
 *
 * @author Jija
 */
public abstract class VerificateurMotDePasse extends Validateur implements Verificateur {
    protected String login;
    protected String pwdIn;

    public VerificateurMotDePasse() {
        this.login = "Default";
        this.pwdIn = "Default";
    }
    
    public VerificateurMotDePasse(String login, String pwdIn) {
        this.login = login;
        this.pwdIn = pwdIn;
    }
    
    abstract String findPwd(String login);

    @Override
    public boolean isOk() {
        return this.getPwdIn().equals(findPwd(this.getLogin()));
    }
    
    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the pwdIn
     */
    public String getPwdIn() {
        return pwdIn;
    }

    /**
     * @param pwdIn the pwdIn to set
     */
    public void setPwdIn(String pwdIn) {
        this.pwdIn = pwdIn;
    }
}
