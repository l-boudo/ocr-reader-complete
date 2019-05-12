
package com.thejavageek.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LigneFraisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LigneFraisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frais" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/dc}FraisType"/>
 *         &lt;element name="quantite" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}NbEntierType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LigneFraisType", propOrder = {
    "frais",
    "quantite"
})
public class LigneFraisType {

    @XmlElement(required = true)
    protected FraisType frais;
    @XmlElement(required = true)
    protected BigInteger quantite;

    /**
     * Gets the value of the frais property.
     * 
     * @return
     *     possible object is
     *     {@link FraisType }
     *     
     */
    public FraisType getFrais() {
        return frais;
    }

    /**
     * Sets the value of the frais property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraisType }
     *     
     */
    public void setFrais(FraisType value) {
        this.frais = value;
    }

    /**
     * Gets the value of the quantite property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantite() {
        return quantite;
    }

    /**
     * Sets the value of the quantite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantite(BigInteger value) {
        this.quantite = value;
    }

}
