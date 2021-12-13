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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import pt.cienciavitae.ns.common.KeywordsCtype;
import pt.cienciavitae.ns.common.ResearchClassificationsCtype;


/**
 * Corresponding to "output:output-type[@code='P107']"
 * 
 * <p>Java class for translation-ctype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="translation-ctype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.cienciavitae.pt/ns/common}string-400-stype"/&gt;
 *         &lt;element name="series-title" type="{http://www.cienciavitae.pt/ns/common}string-400-stype" minOccurs="0"/&gt;
 *         &lt;element name="volume" type="{http://www.cienciavitae.pt/ns/common}string-10-stype" minOccurs="0"/&gt;
 *         &lt;element name="number-of-volumes" type="{http://www.cienciavitae.pt/ns/common}int-6-stype" minOccurs="0"/&gt;
 *         &lt;element name="edition" type="{http://www.cienciavitae.pt/ns/common}string-10-stype" minOccurs="0"/&gt;
 *         &lt;element name="number-of-pages" type="{http://www.cienciavitae.pt/ns/common}int-6-stype" minOccurs="0"/&gt;
 *         &lt;element name="publication-status" type="{http://www.cienciavitae.pt/ns/output}publication-status-ctype" minOccurs="0"/&gt;
 *         &lt;element name="publication-year" type="{http://www.cienciavitae.pt/ns/common}year-stype"/&gt;
 *         &lt;element name="publication-location" type="{http://www.cienciavitae.pt/ns/output}publication-location-ctype" minOccurs="0"/&gt;
 *         &lt;element name="publisher" type="{http://www.cienciavitae.pt/ns/common}string-255-stype" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.cienciavitae.pt/ns/common}string-uri-stype" minOccurs="0"/&gt;
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
@XmlType(name = "translation-ctype", propOrder = {
    "title",
    "seriesTitle",
    "volume",
    "numberOfVolumes",
    "edition",
    "numberOfPages",
    "publicationStatus",
    "publicationYear",
    "publicationLocation",
    "publisher",
    "url",
    "identifiers",
    "authors",
    "researchClassifications",
    "keywords"
})
public class TranslationCtype {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(name = "series-title")
    protected String seriesTitle;
    protected String volume;
    @XmlElement(name = "number-of-volumes")
    protected Integer numberOfVolumes;
    protected String edition;
    @XmlElement(name = "number-of-pages")
    protected Integer numberOfPages;
    @XmlElement(name = "publication-status")
    protected PublicationStatusCtype publicationStatus;
    @XmlElement(name = "publication-year", required = true)
    protected String publicationYear;
    @XmlElement(name = "publication-location")
    protected PublicationLocationCtype publicationLocation;
    protected String publisher;
    @XmlSchemaType(name = "anyURI")
    protected String url;
    protected IdentifiersCtype identifiers;
    @XmlElement(required = true)
    protected AuthorsCtype authors;
    @XmlElement(name = "research-classifications", namespace = "http://www.cienciavitae.pt/ns/common")
    protected ResearchClassificationsCtype researchClassifications;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/common")
    protected KeywordsCtype keywords;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the seriesTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesTitle() {
        return seriesTitle;
    }

    /**
     * Sets the value of the seriesTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesTitle(String value) {
        this.seriesTitle = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Gets the value of the numberOfVolumes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfVolumes() {
        return numberOfVolumes;
    }

    /**
     * Sets the value of the numberOfVolumes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfVolumes(Integer value) {
        this.numberOfVolumes = value;
    }

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

    /**
     * Gets the value of the numberOfPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets the value of the numberOfPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPages(Integer value) {
        this.numberOfPages = value;
    }

    /**
     * Gets the value of the publicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationStatusCtype }
     *     
     */
    public PublicationStatusCtype getPublicationStatus() {
        return publicationStatus;
    }

    /**
     * Sets the value of the publicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationStatusCtype }
     *     
     */
    public void setPublicationStatus(PublicationStatusCtype value) {
        this.publicationStatus = value;
    }

    /**
     * Gets the value of the publicationYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationYear() {
        return publicationYear;
    }

    /**
     * Sets the value of the publicationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationYear(String value) {
        this.publicationYear = value;
    }

    /**
     * Gets the value of the publicationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationLocationCtype }
     *     
     */
    public PublicationLocationCtype getPublicationLocation() {
        return publicationLocation;
    }

    /**
     * Sets the value of the publicationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationLocationCtype }
     *     
     */
    public void setPublicationLocation(PublicationLocationCtype value) {
        this.publicationLocation = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
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
