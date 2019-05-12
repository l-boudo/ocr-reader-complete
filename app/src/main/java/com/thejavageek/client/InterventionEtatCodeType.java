
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterventionEtatCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterventionEtatCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANNUL"/>
 *     &lt;enumeration value="CLOS"/>
 *     &lt;enumeration value="DMND"/>
 *     &lt;enumeration value="PLAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterventionEtatCodeType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum InterventionEtatCodeType {

    ANNUL,
    CLOS,
    DMND,
    PLAN;

    public String value() {
        return name();
    }

    public static InterventionEtatCodeType fromValue(String v) {
        return valueOf(v);
    }

}
