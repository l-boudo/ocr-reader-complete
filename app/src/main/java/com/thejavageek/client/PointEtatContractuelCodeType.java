
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointEtatContractuelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PointEtatContractuelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECRAC"/>
 *     &lt;enumeration value="INACCE"/>
 *     &lt;enumeration value="ECRES"/>
 *     &lt;enumeration value="IMPRO"/>
 *     &lt;enumeration value="RESIL"/>
 *     &lt;enumeration value="SERVC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PointEtatContractuelCodeType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum PointEtatContractuelCodeType {

    ECRAC,
    INACCE,
    ECRES,
    IMPRO,
    RESIL,
    SERVC;

    public String value() {
        return name();
    }

    public static PointEtatContractuelCodeType fromValue(String v) {
        return valueOf(v);
    }

}
