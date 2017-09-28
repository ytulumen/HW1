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
public class Teacher extends User{

    /**
     *
     * @param uName new user's name
     * @param password new user's password
     */
    public Teacher(String uName, String password){
        super(uName, password);
        System.out.printf("%s %s", uName, password);
    }

    /**
     *
     * @param uName new user's name
     * @param password new user's password
     * @return newUser olusturulan yeni user return edilecek
     */
    public Tutor addUser(String uName, String password) {
        Tutor newUser = new Tutor(uName, password);
        return newUser;
    }

    /**
     *
     * @param uName new user's name
     * @return newUser olusturulan yeni user return edilecek
     */
    public boolean removeUser(String uName) {
        //Tutor sil
        return true;
    }

    /**
     *
     * @param docType new document's type
     * @param docName new document's name
     * @return olusturulan yeni document return edilecek
     */
    public Document addDoc(String docType, String docName) {
        Document newDoc = new Document(docType, docName);
        return newDoc;
    }

    /**
     *
     * @param docName silicek document ismi
     * @return true
     */
    public boolean removeDoc(String docName) {
        //Document sil
        return true;
    }

    /**
     *
     * @param assiType new assignment's type
     * @param assiName new assignment's name
     * @return olusturulan yeni assignment return edilecek
     */
    public Assignment addAssi(String assiType, String assiName) {
        Assignment newAssi = new Assignment(assiType, assiName);
        return newAssi;
    }

    /**
     *
     * @param assiName silinecek assignment ismi
     * @return
     */
    public boolean removeAssi(String assiName) {
        return true;
    }
    @Override
    public boolean viewDocPer() {
        return true;
    }

    @Override
    public boolean viewAssPer() {
        return true;
    }
}
