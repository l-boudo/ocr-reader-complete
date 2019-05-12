
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LongueurUniteSymboleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LongueurUniteSymboleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="km"/>
 *     &lt;enumeration value="m"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LongueurUniteSymboleType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum LongueurUniteSymboleType {

    @XmlEnumValue("km")
    KM("km"),
    @XmlEnumValue("m")
    M("m");
    private final String value;

    LongueurUniteSymboleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LongueurUniteSymboleType fromValue(String v) {
        for (LongueurUniteSymboleType c: LongueurUniteSymboleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
