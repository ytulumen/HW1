/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytulumen.hw1_yasin_tulumen_121044020;

/**
 *
 * @author yasin
 */
public class Student extends User{

    /**
     *
     * @param uName new user's name
     * @param password new user's password
     */
    public Student(String uName, String password) {
        super(uName, password);
    }

    /**
     *
     * @return true
     */
    @Override
    public boolean viewDocPer() {
        return true;
    }

    /**
     *
     * @return true
     */
    @Override
    public boolean viewAssPer() {
        return true;
    }
    
}
