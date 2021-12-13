//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.07 at 12:49:04 PM UTC 
//


package pt.cienciavitae.ns.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pt.cienciavitae.ns.common.DateCtype;
import pt.cienciavitae.ns.common.Iso3166CountryCtype;
import pt.cienciavitae.ns.common.KeywordsCtype;
import pt.cienciavitae.ns.common.ResearchClassificationsCtype;


/**
 * Corresponding to "output:output-type[@code='P402']"
 * 
 * <p>Java class for license-ctype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="license-ctype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="license-title" type="{http://www.cienciavitae.pt/ns/common}string-400-stype"/&gt;
 *         &lt;element name="license-status" type="{http://www.cienciavitae.pt/ns/output}license-status-ctype" minOccurs="0"/&gt;
 *         &lt;element name="application-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype" minOccurs="0"/&gt;
 *         &lt;element name="date-issued" type="{http://www.cienciavitae.pt/ns/common}date-ctype"/&gt;
 *         &lt;element name="end-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://www.cienciavitae.pt/ns/common}iso-3166-country-ctype" minOccurs="0"/&gt;
 *         &lt;element name="identifiers" type="{http://www.cienciavitae.pt/ns/output}identifiers-ctype" minOccurs="0"/&gt;
 *         &lt;element name="authors" type="{http://www.cienciavitae.pt/ns/output}authors-ctype"/&gt;
 *         &lt;group ref="{http://www.cienciavitae.pt/ns/common}research-classifications-keywords-group"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "license-ctype", propOrder = {
    "licenseTitle",
    "licenseStatus",
    "applicationDate",
    "dateIssued",
    "endDate",
    "country",
    "identifiers",
    "authors",
    "researchClassifications",
    "keywords"
})
public class LicenseCtype {

    @XmlElement(name = "license-title", required = true)
    protected String licenseTitle;
    @XmlElement(name = "license-status")
    protected LicenseStatusCtype licenseStatus;
    @XmlElement(name = "application-date")
    protected DateCtype applicationDate;
    @XmlElement(name = "date-issued", required = true)
    protected DateCtype dateIssued;
    @XmlElement(name = "end-date")
    protected DateCtype endDate;
    protected Iso3166CountryCtype country;
    protected IdentifiersCtype identifiers;
    @XmlElement(required = true)
    protected AuthorsCtype authors;
    @XmlElement(name = "research-classifications", namespace = "http://www.cienciavitae.pt/ns/common")
    protected ResearchClassificationsCtype researchClassifications;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/common")
    protected KeywordsCtype keywords;

    /**
     * Gets the value of the licenseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseTitle() {
        return licenseTitle;
    }

    /**
     * Sets the value of the licenseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseTitle(String value) {
        this.licenseTitle = value;
    }

    /**
     * Gets the value of the licenseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseStatusCtype }
     *     
     */
    public LicenseStatusCtype getLicenseStatus() {
        return licenseStatus;
    }

    /**
     * Sets the value of the licenseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseStatusCtype }
     *     
     */
    public void setLicenseStatus(LicenseStatusCtype value) {
        this.licenseStatus = value;
    }

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setApplicationDate(DateCtype value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the dateIssued property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getDateIssued() {
        return dateIssued;
    }

    /**
     * Sets the value of the dateIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setDateIssued(DateCtype value) {
        this.dateIssued = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setEndDate(DateCtype value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Iso3166CountryCtype }
     *     
     */
    public Iso3166CountryCtype getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Iso3166CountryCtype }
     *     
     */
    public void setCountry(Iso3166CountryCtype value) {
        this.country = value;
    }

    /**
     * Gets the value of the identifiers property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiersCtype }
     *     
     */
    public IdentifiersCtype getIdentifiers() {
        return identifiers;
    }

    /**
     * Sets the value of the identifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiersCtype }
     *     
     */
    public void setIdentifiers(IdentifiersCtype value) {
        this.identifiers = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorsCtype }
     *     
     */
    public AuthorsCtype getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorsCtype }
     *     
     */
    public void setAuthors(AuthorsCtype value) {
        this.authors = value;
    }

    /**
     * Gets the value of the researchClassifications property.
     * 
     * @return
     *     possible object is
     *     {@link ResearchClassificationsCtype }
     *     
     */
    public ResearchClassificationsCtype getResearchClassifications() {
        return researchClassifications;
    }

    /**
     * Sets the value of the researchClassifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchClassificationsCtype }
     *     
     */
    public void setResearchClassifications(ResearchClassificationsCtype value) {
        this.researchClassifications = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordsCtype }
     *     
     */
    public KeywordsCtype getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordsCtype }
     *     
     */
    public void setKeywords(KeywordsCtype value) {
        this.keywords = value;
    }

}
