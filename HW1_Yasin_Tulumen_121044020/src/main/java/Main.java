
import ytulumen.hw1_yasin_tulumen_121044020.Administrator;
import ytulumen.hw1_yasin_tulumen_121044020.Teacher;
import ytulumen.hw1_yasin_tulumen_121044020.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yasin
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Administrator admin = new Administrator("Yasin", "6161");
        Teacher teach = admin.addUser("Teach", "pword");
      //  teach.addAssi("Homework", "HW1_Grades");
        Teacher teach2 = admin.addUser("Teach", "pword");
    }
}
