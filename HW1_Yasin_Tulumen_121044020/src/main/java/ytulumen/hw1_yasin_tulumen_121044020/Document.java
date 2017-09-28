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
public class Document implements Record{

    private String recordType;
    private String recordName;

    /**
     * 
     * @param docType new document's type
     * @param docName new document's name
     */
    Document(String docType, String docName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     *
     * @param recordType set edilecek record tipi
     */
    @Override
    public void setType(String recordType) {
        this.recordType = recordType;
    }

    /**
     *
     * @param recordName set edilecek record ismi
     */
    @Override
    public void setName(String recordName) {
        this.recordName = recordName;
    }

    /**
     *
     * @return elde edilecek record ismi
     */
    @Override
    public String getType() {
        return recordType;
    }

    /**
     *
     * @return elde edilecek record ismi
     */
    @Override
    public String getName() {
        return recordName;
    }
    
}
