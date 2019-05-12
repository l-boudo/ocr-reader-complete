
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffaireStatutCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AffaireStatutCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANNUL"/>
 *     &lt;enumeration value="COURS"/>
 *     &lt;enumeration value="TERMN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AffaireStatutCodeType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum AffaireStatutCodeType {

    ANNUL,
    COURS,
    TERMN;

    public String value() {
        return name();
    }

    public static AffaireStatutCodeType fromValue(String v) {
        return valueOf(v);
    }

}
