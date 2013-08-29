/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ima.controller;

import com.ima.entity.User;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author Riddy NDOMA
 */

@ManagedBean(name = "usercontroller")
public class UserController {
/*
 Enumération Outcome
*/
    public enum Outcome {
        Dashboad, failure
    }
    /*injection du bean User, qui porte les valeurs 
     entrées dans le formulaire*/
    @ManagedProperty(value = "#{user}")
    private User userBean;
    /*méthode invoquée lorsque le formulaire login est 
     validé*/

    public Outcome login() {
        if ("ima".equals(userBean.getLogin())
                && "ima".equals(userBean.getPwd())) {
            return Outcome.Dashboad;
        }
        return Outcome.failure;
        
    }

    public User getUserBean() {
        return userBean;
    }

    public void setUserBean(User userBean) {
        this.userBean = userBean;
    }
}
