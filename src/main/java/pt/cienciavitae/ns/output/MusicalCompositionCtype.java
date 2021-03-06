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
 * Corresponding to "output:output-type[@code='P304']"
 * 
 * <p>Java class for musical-composition-ctype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="musical-composition-ctype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.cienciavitae.pt/ns/common}string-400-stype"/&gt;
 *         &lt;element name="instrumentation" type="{http://www.cienciavitae.pt/ns/common}string-150-stype" minOccurs="0"/&gt;
 *         &lt;element name="number-of-pages" type="{http://www.cienciavitae.pt/ns/common}int-6-stype" minOccurs="0"/&gt;
 *         &lt;element name="duration" type="{http://www.cienciavitae.pt/ns/common}string-20-stype" minOccurs="0"/&gt;
 *         &lt;element name="composition-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype"/&gt;
 *         &lt;element name="publisher" type="{http://www.cienciavitae.pt/ns/common}string-255-stype" minOccurs="0"/&gt;
 *         &lt;element name="identifiers" type="{http://www.cienciavitae.pt/ns/output}identifiers-ctype" minOccurs="0"/&gt;
 *         &lt;element name="composers" type="{http://www.cienciavitae.pt/ns/output}authors-ctype"/&gt;
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
@XmlType(name = "musical-composition-ctype", propOrder = {
    "title",
    "instrumentation",
    "numberOfPages",
    "duration",
    "compositionDate",
    "publisher",
    "identifiers",
    "composers",
    "researchClassifications",
    "keywords"
})
public class MusicalCompositionCtype {

    @XmlElement(required = true)
    protected String title;
    protected String instrumentation;
    @XmlElement(name = "number-of-pages")
    protected Integer numberOfPages;
    protected String duration;
    @XmlElement(name = "composition-date", required = true)
    protected DateCtype compositionDate;
    protected String publisher;
    protected IdentifiersCtype identifiers;
    @XmlElement(required = true)
    protected AuthorsCtype composers;
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
     * Gets the value of the instrumentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentation() {
        return instrumentation;
    }

    /**
     * Sets the value of the instrumentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentation(String value) {
        this.instrumentation = value;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the compositionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getCompositionDate() {
        return compositionDate;
    }

    /**
     * Sets the value of the compositionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setCompositionDate(DateCtype value) {
        this.compositionDate = value;
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
     * Gets the value of the composers property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorsCtype }
     *     
     */
    public AuthorsCtype getComposers() {
        return composers;
    }

    /**
     * Sets the value of the composers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorsCtype }
     *     
     */
    public void setComposers(AuthorsCtype value) {
        this.composers = value;
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
