
package com.thejavageek.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntensiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntensiteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valeur" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}NbDecimalType"/>
 *         &lt;element name="unite" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}IntensiteUniteSymboleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntensiteType", propOrder = {
    "valeur",
    "unite"
})
public class IntensiteType {

    @XmlElement(required = true)
    protected BigDecimal valeur;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected IntensiteUniteSymboleType unite;

    /**
     * Gets the value of the valeur property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValeur() {
        return valeur;
    }

    /**
     * Sets the value of the valeur property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValeur(BigDecimal value) {
        this.valeur = value;
    }

    /**
     * Gets the value of the unite property.
     * 
     * @return
     *     possible object is
     *     {@link IntensiteUniteSymboleType }
     *     
     */
    public IntensiteUniteSymboleType getUnite() {
        return unite;
    }

    /**
     * Sets the value of the unite property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntensiteUniteSymboleType }
     *     
     */
    public void setUnite(IntensiteUniteSymboleType value) {
        this.unite = value;
    }

}