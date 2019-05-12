
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfoFonctionnellesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoFonctionnellesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pointId" type="{http://www.enedis.fr/sge/b2b/technique/v1.0}ObjetIdType" minOccurs="0"/>
 *         &lt;element name="affaireId" type="{http://www.enedis.fr/sge/b2b/technique/v1.0}ObjetIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoFonctionnellesType", namespace = "http://www.enedis.fr/sge/b2b/technique/v1.0", propOrder = {
    "pointId",
    "affaireId"
})
public class InfoFonctionnellesType {

    protected String pointId;
    protected String affaireId;

    /**
     * Gets the value of the pointId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointId() {
        return pointId;
    }

    /**
     * Sets the value of the pointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointId(String value) {
        this.pointId = value;
    }

    /**
     * Gets the value of the affaireId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffaireId() {
        return affaireId;
    }

    /**
     * Sets the value of the affaireId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffaireId(String value) {
        this.affaireId = value;
    }

}
