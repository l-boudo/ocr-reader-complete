
package com.thejavageek.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresseInstallationNormalisee" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/dc}AdresseAfnorType"/>
 *         &lt;element name="matricule" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}Chaine255Type" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="numeroSerie" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}Chaine255Type" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="typeComptage" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/dc}StructureComptageType" minOccurs="0"/>
 *         &lt;element name="etatContractuel" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/dc}PointEtatContractuelType"/>
 *         &lt;element name="nomClientFinalOuDenominationSociale" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}Chaine255Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}PointIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointType", namespace = "http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", propOrder = {
    "adresseInstallationNormalisee",
    "matricule",
    "numeroSerie",
    "typeComptage",
    "etatContractuel",
    "nomClientFinalOuDenominationSociale"
})
public class PointType {

    @XmlElement(required = true)
    protected AdresseAfnorType adresseInstallationNormalisee;
    protected List<String> matricule;
    protected List<String> numeroSerie;
    protected StructureComptageType typeComptage;
    @XmlElement(required = true)
    protected PointEtatContractuelType etatContractuel;
    protected String nomClientFinalOuDenominationSociale;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the adresseInstallationNormalisee property.
     * 
     * @return
     *     possible object is
     *     {@link AdresseAfnorType }
     *     
     */
    public AdresseAfnorType getAdresseInstallationNormalisee() {
        return adresseInstallationNormalisee;
    }

    /**
     * Sets the value of the adresseInstallationNormalisee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresseAfnorType }
     *     
     */
    public void setAdresseInstallationNormalisee(AdresseAfnorType value) {
        this.adresseInstallationNormalisee = value;
    }

    /**
     * Gets the value of the matricule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matricule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatricule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMatricule() {
        if (matricule == null) {
            matricule = new ArrayList<String>();
        }
        return this.matricule;
    }

    /**
     * Gets the value of the numeroSerie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numeroSerie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumeroSerie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumeroSerie() {
        if (numeroSerie == null) {
            numeroSerie = new ArrayList<String>();
        }
        return this.numeroSerie;
    }

    /**
     * Gets the value of the typeComptage property.
     * 
     * @return
     *     possible object is
     *     {@link StructureComptageType }
     *     
     */
    public StructureComptageType getTypeComptage() {
        return typeComptage;
    }

    /**
     * Sets the value of the typeComptage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureComptageType }
     *     
     */
    public void setTypeComptage(StructureComptageType value) {
        this.typeComptage = value;
    }

    /**
     * Gets the value of the etatContractuel property.
     * 
     * @return
     *     possible object is
     *     {@link PointEtatContractuelType }
     *     
     */
    public PointEtatContractuelType getEtatContractuel() {
        return etatContractuel;
    }

    /**
     * Sets the value of the etatContractuel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointEtatContractuelType }
     *     
     */
    public void setEtatContractuel(PointEtatContractuelType value) {
        this.etatContractuel = value;
    }

    /**
     * Gets the value of the nomClientFinalOuDenominationSociale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomClientFinalOuDenominationSociale() {
        return nomClientFinalOuDenominationSociale;
    }

    /**
     * Sets the value of the nomClientFinalOuDenominationSociale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomClientFinalOuDenominationSociale(String value) {
        this.nomClientFinalOuDenominationSociale = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
