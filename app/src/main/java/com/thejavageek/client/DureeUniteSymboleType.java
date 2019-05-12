
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DureeUniteSymboleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DureeUniteSymboleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="annee"/>
 *     &lt;enumeration value="h"/>
 *     &lt;enumeration value="jour"/>
 *     &lt;enumeration value="min"/>
 *     &lt;enumeration value="mois"/>
 *     &lt;enumeration value="ms"/>
 *     &lt;enumeration value="s"/>
 *     &lt;enumeration value="semaine"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DureeUniteSymboleType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum DureeUniteSymboleType {

    @XmlEnumValue("annee")
    ANNEE("annee"),
    @XmlEnumValue("h")
    H("h"),
    @XmlEnumValue("jour")
    JOUR("jour"),
    @XmlEnumValue("min")
    MIN("min"),
    @XmlEnumValue("mois")
    MOIS("mois"),
    @XmlEnumValue("ms")
    MS("ms"),
    @XmlEnumValue("s")
    S("s"),
    @XmlEnumValue("semaine")
    SEMAINE("semaine");
    private final String value;

    DureeUniteSymboleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DureeUniteSymboleType fromValue(String v) {
        for (DureeUniteSymboleType c: DureeUniteSymboleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
