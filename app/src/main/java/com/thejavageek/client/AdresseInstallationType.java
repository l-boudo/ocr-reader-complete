
package com.thejavageek.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdresseInstallationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdresseInstallationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="escalierEtEtageEtAppartement" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}AdresseAfnorLigneType" minOccurs="0"/>
 *         &lt;element name="batiment" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}AdresseAfnorLigneType" minOccurs="0"/>
 *         &lt;element name="numeroEtNomVoie" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}AdresseAfnorLigneType" minOccurs="0"/>
 *         &lt;element name="lieuDit" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}AdresseAfnorLigneType" minOccurs="0"/>
 *         &lt;element name="codePostal" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}CodePostalFrancaisType" minOccurs="0"/>
 *         &lt;element name="codeInseeCommune" type="{http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds}CommuneFranceCodeInseeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdresseInstallationType", namespace = "http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", propOrder = {
    "escalierEtEtageEtAppartement",
    "batiment",
    "numeroEtNomVoie",
    "lieuDit",
    "codePostal",
    "codeInseeCommune"
})
public class AdresseInstallationType {

    protected String escalierEtEtageEtAppartement;
    protected String batiment;
    protected String numeroEtNomVoie;
    protected String lieuDit;
    protected String codePostal;
    protected String codeInseeCommune;

    /**
     * Gets the value of the escalierEtEtageEtAppartement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalierEtEtageEtAppartement() {
        return escalierEtEtageEtAppartement;
    }

    /**
     * Sets the value of the escalierEtEtageEtAppartement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalierEtEtageEtAppartement(String value) {
        this.escalierEtEtageEtAppartement = value;
    }

    /**
     * Gets the value of the batiment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatiment() {
        return batiment;
    }

    /**
     * Sets the value of the batiment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatiment(String value) {
        this.batiment = value;
    }

    /**
     * Gets the value of the numeroEtNomVoie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEtNomVoie() {
        return numeroEtNomVoie;
    }

    /**
     * Sets the value of the numeroEtNomVoie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEtNomVoie(String value) {
        this.numeroEtNomVoie = value;
    }

    /**
     * Gets the value of the lieuDit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLieuDit() {
        return lieuDit;
    }

    /**
     * Sets the value of the lieuDit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLieuDit(String value) {
        this.lieuDit = value;
    }

    /**
     * Gets the value of the codePostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * Sets the value of the codePostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePostal(String value) {
        this.codePostal = value;
    }

    /**
     * Gets the value of the codeInseeCommune property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeInseeCommune() {
        return codeInseeCommune;
    }

    /**
     * Sets the value of the codeInseeCommune property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeInseeCommune(String value) {
        this.codeInseeCommune = value;
    }

}
