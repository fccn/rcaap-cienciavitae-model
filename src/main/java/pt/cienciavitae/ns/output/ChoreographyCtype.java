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
import pt.cienciavitae.ns.common.KeywordsCtype;
import pt.cienciavitae.ns.common.ResearchClassificationsCtype;


/**
 * Corresponding to "output:output-type[@code='P315']"
 * 
 * <p>Java class for choreography-ctype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="choreography-ctype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="show-title" type="{http://www.cienciavitae.pt/ns/common}string-400-stype"/&gt;
 *         &lt;element name="composer" type="{http://www.cienciavitae.pt/ns/common}string-255-stype" minOccurs="0"/&gt;
 *         &lt;element name="premier-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype"/&gt;
 *         &lt;element name="company" type="{http://www.cienciavitae.pt/ns/common}string-150-stype" minOccurs="0"/&gt;
 *         &lt;element name="identifiers" type="{http://www.cienciavitae.pt/ns/output}identifiers-ctype" minOccurs="0"/&gt;
 *         &lt;element name="authors" type="{http://www.cienciavitae.pt/ns/output}authors-ctype"/&gt;
 *         &lt;element name="key-collaborators" type="{http://www.cienciavitae.pt/ns/output}authors-ctype" minOccurs="0"/&gt;
 *         &lt;element name="principal-dancers" type="{http://www.cienciavitae.pt/ns/output}authors-ctype" minOccurs="0"/&gt;
 *         &lt;element name="major-performance-dates" type="{http://www.cienciavitae.pt/ns/output}dates-ctype" minOccurs="0"/&gt;
 *         &lt;element name="media-release-dates" type="{http://www.cienciavitae.pt/ns/output}dates-ctype" minOccurs="0"/&gt;
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
@XmlType(name = "choreography-ctype", propOrder = {
    "showTitle",
    "composer",
    "premierDate",
    "company",
    "identifiers",
    "authors",
    "keyCollaborators",
    "principalDancers",
    "majorPerformanceDates",
    "mediaReleaseDates",
    "researchClassifications",
    "keywords"
})
public class ChoreographyCtype {

    @XmlElement(name = "show-title", required = true)
    protected String showTitle;
    protected String composer;
    @XmlElement(name = "premier-date", required = true)
    protected DateCtype premierDate;
    protected String company;
    protected IdentifiersCtype identifiers;
    @XmlElement(required = true)
    protected AuthorsCtype authors;
    @XmlElement(name = "key-collaborators")
    protected AuthorsCtype keyCollaborators;
    @XmlElement(name = "principal-dancers")
    protected AuthorsCtype principalDancers;
    @XmlElement(name = "major-performance-dates")
    protected DatesCtype majorPerformanceDates;
    @XmlElement(name = "media-release-dates")
    protected DatesCtype mediaReleaseDates;
    @XmlElement(name = "research-classifications", namespace = "http://www.cienciavitae.pt/ns/common")
    protected ResearchClassificationsCtype researchClassifications;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/common")
    protected KeywordsCtype keywords;

    /**
     * Gets the value of the showTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowTitle() {
        return showTitle;
    }

    /**
     * Sets the value of the showTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowTitle(String value) {
        this.showTitle = value;
    }

    /**
     * Gets the value of the composer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComposer() {
        return composer;
    }

    /**
     * Sets the value of the composer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComposer(String value) {
        this.composer = value;
    }

    /**
     * Gets the value of the premierDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getPremierDate() {
        return premierDate;
    }

    /**
     * Sets the value of the premierDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setPremierDate(DateCtype value) {
        this.premierDate = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
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
     * Gets the value of the keyCollaborators property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorsCtype }
     *     
     */
    public AuthorsCtype getKeyCollaborators() {
        return keyCollaborators;
    }

    /**
     * Sets the value of the keyCollaborators property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorsCtype }
     *     
     */
    public void setKeyCollaborators(AuthorsCtype value) {
        this.keyCollaborators = value;
    }

    /**
     * Gets the value of the principalDancers property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorsCtype }
     *     
     */
    public AuthorsCtype getPrincipalDancers() {
        return principalDancers;
    }

    /**
     * Sets the value of the principalDancers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorsCtype }
     *     
     */
    public void setPrincipalDancers(AuthorsCtype value) {
        this.principalDancers = value;
    }

    /**
     * Gets the value of the majorPerformanceDates property.
     * 
     * @return
     *     possible object is
     *     {@link DatesCtype }
     *     
     */
    public DatesCtype getMajorPerformanceDates() {
        return majorPerformanceDates;
    }

    /**
     * Sets the value of the majorPerformanceDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatesCtype }
     *     
     */
    public void setMajorPerformanceDates(DatesCtype value) {
        this.majorPerformanceDates = value;
    }

    /**
     * Gets the value of the mediaReleaseDates property.
     * 
     * @return
     *     possible object is
     *     {@link DatesCtype }
     *     
     */
    public DatesCtype getMediaReleaseDates() {
        return mediaReleaseDates;
    }

    /**
     * Sets the value of the mediaReleaseDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatesCtype }
     *     
     */
    public void setMediaReleaseDates(DatesCtype value) {
        this.mediaReleaseDates = value;
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
