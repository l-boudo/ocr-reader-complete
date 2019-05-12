
package com.thejavageek.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LignesFraisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LignesFraisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ligneFrais" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/dc}LigneFraisType" maxOccurs="200"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LignesFraisType", propOrder = {
    "ligneFrais"
})
public class LignesFraisType {

    @XmlElement(required = true)
    protected List<LigneFraisType> ligneFrais;

    /**
     * Gets the value of the ligneFrais property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ligneFrais property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLigneFrais().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LigneFraisType }
     * 
     * 
     */
    public List<LigneFraisType> getLigneFrais() {
        if (ligneFrais == null) {
            ligneFrais = new ArrayList<LigneFraisType>();
        }
        return this.ligneFrais;
    }

}
