/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytulumen.hw1_yasin_tulumen_121044020;

import java.util.ArrayList;

/**
 *
 * @author yasin
 */
public abstract class User {
    private ArrayList<String> userNames = new ArrayList<>(); 
    private ArrayList<String> passwords = new ArrayList<>();
    
    private boolean control(String uName)throws OwnExceptions{
        for(int i=0 ; i<userNames.size() ; ++i){
            if(userNames.get(i) == uName)
                throw new OwnExceptions();
        }
        return true;
    }
    /**
     * 
     * @param uName
     * @param password 
     */
    User(String uName, String password) {
        try {
            control(uName);
            this.userNames.add(uName);
            this.passwords.add(password);
        }
        catch(OwnExceptions e){
            System.out.println("This input have already exist");
        }
    }

    /**
     *
     * @return
     */
    public abstract boolean viewDocPer();

    /**
     *
     * @return
     */
    public abstract boolean viewAssPer();
    
    
/*    
    public void setFullName(String uName){
        this.userNames.add(uName);
    }
    public String getFullName(int i){
        return this.userNames.get(i);
    }
    public void setCourseCode(String password){
        this.passwords.add(password);
    }
    public String getCourseCode(int i){
        return this.passwords.get(i);
    }
*/
}
