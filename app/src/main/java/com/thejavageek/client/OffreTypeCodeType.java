
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffreTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OffreTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="OH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OffreTypeCodeType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum OffreTypeCodeType {

    NO,
    OH;

    public String value() {
        return name();
    }

    public static OffreTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
