
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointAppartenanceRegroupementHebergeurDecomptantCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PointAppartenanceRegroupementHebergeurDecomptantCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DECO"/>
 *     &lt;enumeration value="HEBE"/>
 *     &lt;enumeration value="NON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PointAppartenanceRegroupementHebergeurDecomptantCodeType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum PointAppartenanceRegroupementHebergeurDecomptantCodeType {

    DECO,
    HEBE,
    NON;

    public String value() {
        return name();
    }

    public static PointAppartenanceRegroupementHebergeurDecomptantCodeType fromValue(String v) {
        return valueOf(v);
    }

}
