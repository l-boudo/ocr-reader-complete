
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdresseAfnorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdresseAfnorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ligne1" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}AdresseAfnorLigneType" minOccurs="0"/>
 *         &lt;element name="ligne2" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}AdresseAfnorLigneType" minOccurs="0"/>
 *         &lt;element name="ligne3" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}AdresseAfnorLigneType" minOccurs="0"/>
 *         &lt;element name="ligne4" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}AdresseAfnorLigneType" minOccurs="0"/>
 *         &lt;element name="ligne5" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}AdresseAfnorLigneType" minOccurs="0"/>
 *         &lt;element name="ligne6" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}AdresseAfnorLigneType"/>
 *         &lt;element name="ligne7" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}AdresseAfnorLigneType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdresseAfnorType", propOrder = {
    "ligne1",
    "ligne2",
    "ligne3",
    "ligne4",
    "ligne5",
    "ligne6",
    "ligne7"
})
public class AdresseAfnorType {

    protected String ligne1;
    protected String ligne2;
    protected String ligne3;
    protected String ligne4;
    protected String ligne5;
    @XmlElement(required = true)
    protected String ligne6;
    protected String ligne7;

    /**
     * Gets the value of the ligne1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLigne1() {
        return ligne1;
    }

    /**
     * Sets the value of the ligne1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLigne1(String value) {
        this.ligne1 = value;
    }

    /**
     * Gets the value of the ligne2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLigne2() {
        return ligne2;
    }

    /**
     * Sets the value of the ligne2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLigne2(String value) {
        this.ligne2 = value;
    }

    /**
     * Gets the value of the ligne3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLigne3() {
        return ligne3;
    }

    /**
     * Sets the value of the ligne3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLigne3(String value) {
        this.ligne3 = value;
    }

    /**
     * Gets the value of the ligne4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLigne4() {
        return ligne4;
    }

    /**
     * Sets the value of the ligne4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLigne4(String value) {
        this.ligne4 = value;
    }

    /**
     * Gets the value of the ligne5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLigne5() {
        return ligne5;
    }

    /**
     * Sets the value of the ligne5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLigne5(String value) {
        this.ligne5 = value;
    }

    /**
     * Gets the value of the ligne6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLigne6() {
        return ligne6;
    }

    /**
     * Sets the value of the ligne6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLigne6(String value) {
        this.ligne6 = value;
    }

    /**
     * Gets the value of the ligne7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLigne7() {
        return ligne7;
    }

    /**
     * Sets the value of the ligne7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLigne7(String value) {
        this.ligne7 = value;
    }

}
