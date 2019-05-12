
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RechercherPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RechercherPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteres" type="{http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0}CriteresType"/>
 *         &lt;element name="loginUtilisateur" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}UtilisateurLoginType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechercherPointType", namespace = "http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", propOrder = {
    "criteres",
    "loginUtilisateur"
})
public class RechercherPointType {

    @XmlElement(required = true)
    protected CriteresType criteres;
    @XmlElement(required = true)
    protected String loginUtilisateur;

    /**
     * Gets the value of the criteres property.
     * 
     * @return
     *     possible object is
     *     {@link CriteresType }
     *     
     */
    public CriteresType getCriteres() {
        return criteres;
    }

    /**
     * Sets the value of the criteres property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteresType }
     *     
     */
    public void setCriteres(CriteresType value) {
        this.criteres = value;
    }

    /**
     * Gets the value of the loginUtilisateur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUtilisateur() {
        return loginUtilisateur;
    }

    /**
     * Sets the value of the loginUtilisateur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUtilisateur(String value) {
        this.loginUtilisateur = value;
    }

}
