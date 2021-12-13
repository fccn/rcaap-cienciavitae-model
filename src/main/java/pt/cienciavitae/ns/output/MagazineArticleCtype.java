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
import pt.cienciavitae.ns.common.DateCtype;
import pt.cienciavitae.ns.common.KeywordsCtype;
import pt.cienciavitae.ns.common.ResearchClassificationsCtype;


/**
 * Corresponding to "output:output-type[@code='P113']"
 * 
 * <p>Java class for magazine-article-ctype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="magazine-article-ctype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="article-title" type="{http://www.cienciavitae.pt/ns/common}string-400-stype"/&gt;
 *         &lt;element name="magazine" type="{http://www.cienciavitae.pt/ns/common}string-400-stype" minOccurs="0"/&gt;
 *         &lt;element name="volume" type="{http://www.cienciavitae.pt/ns/common}string-10-stype" minOccurs="0"/&gt;
 *         &lt;element name="issue" type="{http://www.cienciavitae.pt/ns/common}string-10-stype" minOccurs="0"/&gt;
 *         &lt;element name="page-range-from" type="{http://www.cienciavitae.pt/ns/common}string-20-stype" minOccurs="0"/&gt;
 *         &lt;element name="page-range-to" type="{http://www.cienciavitae.pt/ns/common}string-20-stype" minOccurs="0"/&gt;
 *         &lt;element name="publication-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype"/&gt;
 *         &lt;element name="publication-location" type="{http://www.cienciavitae.pt/ns/output}publication-location-ctype" minOccurs="0"/&gt;
 *         &lt;element name="authoring-role" type="{http://www.cienciavitae.pt/ns/output}publication-role-ctype" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.cienciavitae.pt/ns/common}string-uri-stype" minOccurs="0"/&gt;
 *         &lt;element name="identifiers" type="{http://www.cienciavitae.pt/ns/output}identifiers-ctype" minOccurs="0"/&gt;
 *         &lt;element name="authors" type="{http://www.cienciavitae.pt/ns/output}authors-ctype"/&gt;
 *         &lt;element name="editors" type="{http://www.cienciavitae.pt/ns/output}authors-ctype" minOccurs="0"/&gt;
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
@XmlType(name = "magazine-article-ctype", propOrder = {
    "articleTitle",
    "magazine",
    "volume",
    "issue",
    "pageRangeFrom",
    "pageRangeTo",
    "publicationDate",
    "publicationLocation",
    "authoringRole",
    "url",
    "identifiers",
    "authors",
    "editors",
    "researchClassifications",
    "keywords"
})
public class MagazineArticleCtype {

    @XmlElement(name = "article-title", required = true)
    protected String articleTitle;
    protected String magazine;
    protected String volume;
    protected String issue;
    @XmlElement(name = "page-range-from")
    protected String pageRangeFrom;
    @XmlElement(name = "page-range-to")
    protected String pageRangeTo;
    @XmlElement(name = "publication-date", required = true)
    protected DateCtype publicationDate;
    @XmlElement(name = "publication-location")
    protected PublicationLocationCtype publicationLocation;
    @XmlElement(name = "authoring-role")
    protected PublicationRoleCtype authoringRole;
    @XmlSchemaType(name = "anyURI")
    protected String url;
    protected IdentifiersCtype identifiers;
    @XmlElement(required = true)
    protected AuthorsCtype authors;
    protected AuthorsCtype editors;
    @XmlElement(name = "research-classifications", namespace = "http://www.cienciavitae.pt/ns/common")
    protected ResearchClassificationsCtype researchClassifications;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/common")
    protected KeywordsCtype keywords;

    /**
     * Gets the value of the articleTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * Sets the value of the articleTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleTitle(String value) {
        this.articleTitle = value;
    }

    /**
     * Gets the value of the magazine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagazine() {
        return magazine;
    }

    /**
     * Sets the value of the magazine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagazine(String value) {
        this.magazine = value;
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
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
    }

    /**
     * Gets the value of the pageRangeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageRangeFrom() {
        return pageRangeFrom;
    }

    /**
     * Sets the value of the pageRangeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageRangeFrom(String value) {
        this.pageRangeFrom = value;
    }

    /**
     * Gets the value of the pageRangeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageRangeTo() {
        return pageRangeTo;
    }

    /**
     * Sets the value of the pageRangeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageRangeTo(String value) {
        this.pageRangeTo = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setPublicationDate(DateCtype value) {
        this.publicationDate = value;
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
     * Gets the value of the authoringRole property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationRoleCtype }
     *     
     */
    public PublicationRoleCtype getAuthoringRole() {
        return authoringRole;
    }

    /**
     * Sets the value of the authoringRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationRoleCtype }
     *     
     */
    public void setAuthoringRole(PublicationRoleCtype value) {
        this.authoringRole = value;
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
     * Gets the value of the editors property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorsCtype }
     *     
     */
    public AuthorsCtype getEditors() {
        return editors;
    }

    /**
     * Sets the value of the editors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorsCtype }
     *     
     */
    public void setEditors(AuthorsCtype value) {
        this.editors = value;
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
