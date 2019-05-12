
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomaineTensionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DomaineTensionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BTINF"/>
 *     &lt;enumeration value="BTSUP"/>
 *     &lt;enumeration value="HTA"/>
 *     &lt;enumeration value="HTB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DomaineTensionCodeType", namespace = "http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds")
@XmlEnum
public enum DomaineTensionCodeType {

    BTINF,
    BTSUP,
    HTA,
    HTB;

    public String value() {
        return name();
    }

    public static DomaineTensionCodeType fromValue(String v) {
        return valueOf(v);
    }

}
