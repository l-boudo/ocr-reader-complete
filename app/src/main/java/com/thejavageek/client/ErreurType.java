
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErreurType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErreurType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultat" type="{http://www.enedis.fr/sge/b2b/technique/v1.0}ResultatType"/>
 *         &lt;element name="infoFonctionnelles" type="{http://www.enedis.fr/sge/b2b/technique/v1.0}InfoFonctionnellesType" minOccurs="0"/>
 *         &lt;element name="infoDemandeur" type="{http://www.enedis.fr/sge/b2b/technique/v1.0}InfoDemandeurType" minOccurs="0"/>
 *         &lt;element name="commentaire" type="{http://www.enedis.fr/sge/b2b/technique/v1.0}ErreurCommentaireType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErreurType", namespace = "http://www.enedis.fr/sge/b2b/technique/v1.0", propOrder = {
    "resultat",
    "infoFonctionnelles",
    "infoDemandeur",
    "commentaire"
})
public class ErreurType {

    @XmlElement(required = true)
    protected ResultatType resultat;
    protected InfoFonctionnellesType infoFonctionnelles;
    protected InfoDemandeurType infoDemandeur;
    protected String commentaire;

    /**
     * Gets the value of the resultat property.
     * 
     * @return
     *     possible object is
     *     {@link ResultatType }
     *     
     */
    public ResultatType getResultat() {
        return resultat;
    }

    /**
     * Sets the value of the resultat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultatType }
     *     
     */
    public void setResultat(ResultatType value) {
        this.resultat = value;
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
     * Gets the value of the commentaire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * Sets the value of the commentaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentaire(String value) {
        this.commentaire = value;
    }

}
