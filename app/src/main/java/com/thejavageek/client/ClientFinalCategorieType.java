
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientFinalCategorieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientFinalCategorieType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="libelle" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}Chaine255Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="code" use="required" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}ClientFinalCategorieCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientFinalCategorieType", propOrder = {
    "libelle"
})
public class ClientFinalCategorieType {

    protected String libelle;
    @XmlAttribute(name = "code", required = true)
    protected ClientFinalCategorieCodeType code;

    /**
     * Gets the value of the libelle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Sets the value of the libelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle(String value) {
        this.libelle = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link ClientFinalCategorieCodeType }
     *     
     */
    public ClientFinalCategorieCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientFinalCategorieCodeType }
     *     
     */
    public void setCode(ClientFinalCategorieCodeType value) {
        this.code = value;
    }

}
