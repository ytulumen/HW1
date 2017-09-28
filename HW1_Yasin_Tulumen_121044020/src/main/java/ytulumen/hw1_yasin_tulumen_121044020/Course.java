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
public class Course {
    private ArrayList<String> courseCode = new ArrayList<>(); 
    private ArrayList<String> courseName = new ArrayList<>();
    private boolean control(String cCodes){
        for(int i=0 ; i<courseCode.size() ; ++i){
            if(courseCode.get(i) == cCodes)
                return false;
        }
        return true;
    }
    /**
     * 
     * @param cName new course's name
     * @param cCodes new course's code
     */
    Course(String cName, String cCodes){
        control(cCodes);
    }
    
    /**
     *
     * @param cName course name
     */
    public void setFullName(String cName){
        this.courseName.add(cName);
    }

    /**
     *
     * @param i return edilecek dersin indexi
     * @return courseName 
     */
    public String getFullName(int i){
        return this.courseName.get(i);
    }

    /**
     *
     * @param cCode course code
     */
    public void setCourseCode(String cCode){
        this.courseCode.add(cCode);
    }

    /**
     *
     * @param i return edilecek ders kodunun indexi
     * @return courseCode
     */
    public String getCourseCode(int i){
        return this.courseCode.get(i);
    }
}
