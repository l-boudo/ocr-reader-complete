
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TensionUniteSymboleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TensionUniteSymboleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="kV"/>
 *     &lt;enumeration value="V"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TensionUniteSymboleType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum TensionUniteSymboleType {

    @XmlEnumValue("kV")
    K_V("kV"),
    V("V");
    private final String value;

    TensionUniteSymboleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TensionUniteSymboleType fromValue(String v) {
        for (TensionUniteSymboleType c: TensionUniteSymboleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
