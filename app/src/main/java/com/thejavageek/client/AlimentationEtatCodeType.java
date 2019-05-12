
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlimentationEtatCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlimentationEtatCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALIM"/>
 *     &lt;enumeration value="COUP"/>
 *     &lt;enumeration value="LIMI"/>
 *     &lt;enumeration value="NRAC"/>
 *     &lt;enumeration value="NALI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlimentationEtatCodeType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum AlimentationEtatCodeType {

    ALIM,
    COUP,
    LIMI,
    NRAC,
    NALI;

    public String value() {
        return name();
    }

    public static AlimentationEtatCodeType fromValue(String v) {
        return valueOf(v);
    }

}
