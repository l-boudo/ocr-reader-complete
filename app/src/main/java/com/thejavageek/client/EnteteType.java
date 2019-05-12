
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EnteteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnteteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.enedis.fr/sge/b2b/technique/v1.0}VersionType" minOccurs="0"/>
 *         &lt;element name="infoFonctionnelles" type="{http://www.enedis.fr/sge/b2b/technique/v1.0}InfoFonctionnellesType" minOccurs="0"/>
 *         &lt;element name="infoDemandeur" type="{http://www.enedis.fr/sge/b2b/technique/v1.0}InfoDemandeurType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://schemas.xmlsoap.org/soap/envelope/}mustUnderstand"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnteteType", namespace = "http://www.enedis.fr/sge/b2b/technique/v1.0", propOrder = {
    "version",
    "infoFonctionnelles",
    "infoDemandeur"
})
public class EnteteType {

    protected String version;
    protected InfoFonctionnellesType infoFonctionnelles;
    protected InfoDemandeurType infoDemandeur;
    @XmlAttribute(name = "mustUnderstand", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
    @XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
    protected Boolean mustUnderstand;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the infoFonctionnelles property.
     * 
     * @return
     *     possible object is
     *     {@link InfoFonctionnellesType }
     *     
     */
    public InfoFonctionnellesType getInfoFonctionnelles() {
        return infoFonctionnelles;
    }

    /**
     * Sets the value of the infoFonctionnelles property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoFonctionnellesType }
     *     
     */
    public void setInfoFonctionnelles(InfoFonctionnellesType value) {
        this.infoFonctionnelles = value;
    }

    /**
     * Gets the value of the infoDemandeur property.
     * 
     * @return
     *     possible object is
     *     {@link InfoDemandeurType }
     *     
     */
    public InfoDemandeurType getInfoDemandeur() {
        return infoDemandeur;
    }

    /**
     * Sets the value of the infoDemandeur property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoDemandeurType }
     *     
     */
    public void setInfoDemandeur(InfoDemandeurType value) {
        this.infoDemandeur = value;
    }

    /**
     * Gets the value of the mustUnderstand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isMustUnderstand() {
        return mustUnderstand;
    }

    /**
     * Sets the value of the mustUnderstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMustUnderstand(Boolean value) {
        this.mustUnderstand = value;
    }

}
