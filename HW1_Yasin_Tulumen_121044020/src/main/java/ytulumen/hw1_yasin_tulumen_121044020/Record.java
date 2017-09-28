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
public interface Record {

    /**
     *
     * @param recordType set edilecek record tipi
     */
    public void setType(String recordType);

    /**
     *
     * @param recordName set edilecek record ismi
     */
    public void setName(String recordName);

    /**
     *
     * @return elde edilecek record tipi
     */
    public String getType();

    /**
     *
     * @return elde edilecek record ismi
     */
    public String getName();
}
