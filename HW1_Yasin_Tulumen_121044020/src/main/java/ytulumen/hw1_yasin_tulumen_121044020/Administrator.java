/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytulumen.hw1_yasin_tulumen_121044020;

/**
 *
 * @author yasin
 */
public class Administrator extends User {

    /**
     * 
     * @param uName new user's name
     * @param password new user's password
     */
    public Administrator(String uName, String password){
        super(uName, password);
    }
    /**
     * 
     * @param cName new course's name
     * @param cCode new course's code
     * @return newCourse olusturulan yeni course objesi return edilecek
     */
    public Course addCourse(String cName, String cCode) {
        Course newCourse = new Course(cName, cCode);
        return newCourse;
    }

    /**
     *
     * @param cName new course's name
     * @param cCode new course's code
     * @return true
     */
    public boolean removeCourse(String cName, String cCode) {
        //course objesi olustur
        return true;
    }
    
    /**
     *
     * @param uName new user's name
     * @param password new password's name
     * @return newUser olusturulan yeni user return edilecek
     */
    public Teacher addUser(String uName, String password) {
        Teacher newUser = new Teacher(uName, password);
        return newUser;
    }

    /**
     *
     * @param uName cikarilacak user name
     * @return true
     */
    public boolean removeUser(String uName) {
        return true;
    }
    @Override
    public boolean viewDocPer() {
        return false;
    }
    @Override
    public boolean viewAssPer() {
        return false;
    }

}
