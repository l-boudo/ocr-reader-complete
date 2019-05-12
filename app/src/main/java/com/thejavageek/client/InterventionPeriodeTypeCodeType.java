
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterventionPeriodeTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterventionPeriodeTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HEOE"/>
 *     &lt;enumeration value="HHOE"/>
 *     &lt;enumeration value="HHOS"/>
 *     &lt;enumeration value="HHOW"/>
 *     &lt;enumeration value="HHSW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterventionPeriodeTypeCodeType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum InterventionPeriodeTypeCodeType {

    HEOE,
    HHOE,
    HHOS,
    HHOW,
    HHSW;

    public String value() {
        return name();
    }

    public static InterventionPeriodeTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
