
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointAppartenanceRegroupementTurpeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PointAppartenanceRegroupementTurpeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NON"/>
 *     &lt;enumeration value="REGT"/>
 *     &lt;enumeration value="RGPT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PointAppartenanceRegroupementTurpeCodeType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum PointAppartenanceRegroupementTurpeCodeType {

    NON,
    REGT,
    RGPT;

    public String value() {
        return name();
    }

    public static PointAppartenanceRegroupementTurpeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
