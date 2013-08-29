/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ima.entity;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Riddy NDOMA
 */

@ManagedBean(name = "user")
@SessionScoped
public class User implements Serializable{
    private String login, pwd;

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
}
