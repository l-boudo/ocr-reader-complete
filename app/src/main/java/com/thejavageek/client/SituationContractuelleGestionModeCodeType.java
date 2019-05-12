
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituationContractuelleGestionModeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituationContractuelleGestionModeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="GRD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SituationContractuelleGestionModeCodeType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum SituationContractuelleGestionModeCodeType {

    INT,
    GRD;

    public String value() {
        return name();
    }

    public static SituationContractuelleGestionModeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
