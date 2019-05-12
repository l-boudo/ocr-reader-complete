
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfoDemandeurType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoDemandeurType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginDemandeur" type="{http://www.enedis.fr/sge/b2b/technique/v1.0}DemandeurAdresseEmailType" minOccurs="0"/>
 *         &lt;element name="appelDemandeurId" type="{http://www.enedis.fr/sge/b2b/technique/v1.0}DemandeurAppelIdType" minOccurs="0"/>
 *         &lt;element name="referenceDemandeur" type="{http://www.enedis.fr/sge/b2b/technique/v1.0}DemandeurRefFrnType" minOccurs="0"/>
 *         &lt;element name="referenceDemandeurGroupee" type="{http://www.enedis.fr/sge/b2b/technique/v1.0}DemandeurRefFrnType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoDemandeurType", namespace = "http://www.enedis.fr/sge/b2b/technique/v1.0", propOrder = {
    "loginDemandeur",
    "appelDemandeurId",
    "referenceDemandeur",
    "referenceDemandeurGroupee"
})
public class InfoDemandeurType {

    protected String loginDemandeur;
    protected String appelDemandeurId;
    protected String referenceDemandeur;
    protected String referenceDemandeurGroupee;

    /**
     * Gets the value of the loginDemandeur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginDemandeur() {
        return loginDemandeur;
    }

    /**
     * Sets the value of the loginDemandeur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginDemandeur(String value) {
        this.loginDemandeur = value;
    }

    /**
     * Gets the value of the appelDemandeurId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppelDemandeurId() {
        return appelDemandeurId;
    }

    /**
     * Sets the value of the appelDemandeurId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppelDemandeurId(String value) {
        this.appelDemandeurId = value;
    }

    /**
     * Gets the value of the referenceDemandeur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDemandeur() {
        return referenceDemandeur;
    }

    /**
     * Sets the value of the referenceDemandeur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDemandeur(String value) {
        this.referenceDemandeur = value;
    }

    /**
     * Gets the value of the referenceDemandeurGroupee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDemandeurGroupee() {
        return referenceDemandeurGroupee;
    }

    /**
     * Sets the value of the referenceDemandeurGroupee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDemandeurGroupee(String value) {
        this.referenceDemandeurGroupee = value;
    }

}
