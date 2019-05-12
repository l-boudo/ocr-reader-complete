
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriteresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriteresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresseInstallation" type="{http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0}AdresseInstallationType" minOccurs="0"/>
 *         &lt;element name="numSiret" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}EtablissementNumSiretType" minOccurs="0"/>
 *         &lt;element name="matriculeOuNumeroSerie" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}Chaine255Type" minOccurs="0"/>
 *         &lt;element name="domaineTensionAlimentationCode" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}DomaineTensionCodeType" minOccurs="0"/>
 *         &lt;element name="nomClientFinalOuDenominationSociale" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}Chaine255Type" minOccurs="0"/>
 *         &lt;element name="categorieClientFinalCode" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}ClientFinalCategorieCodeType" minOccurs="0"/>
 *         &lt;element name="rechercheHorsPerimetre" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteresType", namespace = "http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", propOrder = {
    "adresseInstallation",
    "numSiret",
    "matriculeOuNumeroSerie",
    "domaineTensionAlimentationCode",
    "nomClientFinalOuDenominationSociale",
    "categorieClientFinalCode",
    "rechercheHorsPerimetre"
})
public class CriteresType {

    protected AdresseInstallationType adresseInstallation;
    protected String numSiret;
    protected String matriculeOuNumeroSerie;
    @XmlSchemaType(name = "string")
    protected DomaineTensionCodeType domaineTensionAlimentationCode;
    protected String nomClientFinalOuDenominationSociale;
    @XmlSchemaType(name = "string")
    protected ClientFinalCategorieCodeType categorieClientFinalCode;
    protected Boolean rechercheHorsPerimetre;

    /**
     * Gets the value of the adresseInstallation property.
     * 
     * @return
     *     possible object is
     *     {@link AdresseInstallationType }
     *     
     */
    public AdresseInstallationType getAdresseInstallation() {
        return adresseInstallation;
    }

    /**
     * Sets the value of the adresseInstallation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresseInstallationType }
     *     
     */
    public void setAdresseInstallation(AdresseInstallationType value) {
        this.adresseInstallation = value;
    }

    /**
     * Gets the value of the numSiret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSiret() {
        return numSiret;
    }

    /**
     * Sets the value of the numSiret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSiret(String value) {
        this.numSiret = value;
    }

    /**
     * Gets the value of the matriculeOuNumeroSerie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculeOuNumeroSerie() {
        return matriculeOuNumeroSerie;
    }

    /**
     * Sets the value of the matriculeOuNumeroSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculeOuNumeroSerie(String value) {
        this.matriculeOuNumeroSerie = value;
    }

    /**
     * Gets the value of the domaineTensionAlimentationCode property.
     * 
     * @return
     *     possible object is
     *     {@link DomaineTensionCodeType }
     *     
     */
    public DomaineTensionCodeType getDomaineTensionAlimentationCode() {
        return domaineTensionAlimentationCode;
    }

    /**
     * Sets the value of the domaineTensionAlimentationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomaineTensionCodeType }
     *     
     */
    public void setDomaineTensionAlimentationCode(DomaineTensionCodeType value) {
        this.domaineTensionAlimentationCode = value;
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
     * Gets the value of the categorieClientFinalCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClientFinalCategorieCodeType }
     *     
     */
    public ClientFinalCategorieCodeType getCategorieClientFinalCode() {
        return categorieClientFinalCode;
    }

    /**
     * Sets the value of the categorieClientFinalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientFinalCategorieCodeType }
     *     
     */
    public void setCategorieClientFinalCode(ClientFinalCategorieCodeType value) {
        this.categorieClientFinalCode = value;
    }

    /**
     * Gets the value of the rechercheHorsPerimetre property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRechercheHorsPerimetre() {
        return rechercheHorsPerimetre;
    }

    /**
     * Sets the value of the rechercheHorsPerimetre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRechercheHorsPerimetre(Boolean value) {
        this.rechercheHorsPerimetre = value;
    }

}
