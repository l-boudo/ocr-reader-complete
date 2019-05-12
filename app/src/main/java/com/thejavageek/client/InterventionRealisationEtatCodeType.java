
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterventionRealisationEtatCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterventionRealisationEtatCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NREA"/>
 *     &lt;enumeration value="PREA"/>
 *     &lt;enumeration value="REAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterventionRealisationEtatCodeType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum InterventionRealisationEtatCodeType {

    NREA,
    PREA,
    REAL;

    public String value() {
        return name();
    }

    public static InterventionRealisationEtatCodeType fromValue(String v) {
        return valueOf(v);
    }

}
