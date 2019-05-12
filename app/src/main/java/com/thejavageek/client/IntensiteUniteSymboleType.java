
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntensiteUniteSymboleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntensiteUniteSymboleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="mA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntensiteUniteSymboleType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum IntensiteUniteSymboleType {

    A("A"),
    @XmlEnumValue("mA")
    M_A("mA");
    private final String value;

    IntensiteUniteSymboleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntensiteUniteSymboleType fromValue(String v) {
        for (IntensiteUniteSymboleType c: IntensiteUniteSymboleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
