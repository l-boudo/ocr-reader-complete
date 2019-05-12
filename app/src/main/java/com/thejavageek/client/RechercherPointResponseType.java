
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RechercherPointResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RechercherPointResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="points" type="{http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0}PointsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechercherPointResponseType", namespace = "http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", propOrder = {
    "points"
})
public class RechercherPointResponseType {

    protected PointsType points;

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link PointsType }
     *     
     */
    public PointsType getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointsType }
     *     
     */
    public void setPoints(PointsType value) {
        this.points = value;
    }

}
