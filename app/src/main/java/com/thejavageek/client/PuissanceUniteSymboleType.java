
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PuissanceUniteSymboleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PuissanceUniteSymboleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="kVA"/>
 *     &lt;enumeration value="kVAR"/>
 *     &lt;enumeration value="kW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PuissanceUniteSymboleType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum PuissanceUniteSymboleType {

    @XmlEnumValue("kVA")
    K_VA("kVA"),
    @XmlEnumValue("kVAR")
    K_VAR("kVAR"),
    @XmlEnumValue("kW")
    K_W("kW");
    private final String value;

    PuissanceUniteSymboleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PuissanceUniteSymboleType fromValue(String v) {
        for (PuissanceUniteSymboleType c: PuissanceUniteSymboleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
