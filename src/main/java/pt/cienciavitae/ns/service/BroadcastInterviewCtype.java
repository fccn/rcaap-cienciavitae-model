//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.07 at 12:49:04 PM UTC 
//


package pt.cienciavitae.ns.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import pt.cienciavitae.ns.common.DateCtype;
import pt.cienciavitae.ns.common.KeywordsCtype;
import pt.cienciavitae.ns.common.ResearchClassificationsCtype;


/**
 * Corresponding to "service:service-category[@code='S108']"
 * 
 * <p>Java class for broadcast-interview-ctype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="broadcast-interview-ctype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="first-broadcast-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype"/&gt;
 *         &lt;element name="end-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype" minOccurs="0"/&gt;
 *         &lt;element name="program" type="{http://www.cienciavitae.pt/ns/common}string-555-stype"/&gt;
 *         &lt;element name="theme" type="{http://www.cienciavitae.pt/ns/common}string-255-stype" minOccurs="0"/&gt;
 *         &lt;element name="interviewer-name" type="{http://www.cienciavitae.pt/ns/common}string-120-stype" minOccurs="0"/&gt;
 *         &lt;element name="producer" type="{http://www.cienciavitae.pt/ns/common}string-255-stype" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.cienciavitae.pt/ns/common}string-uri-stype" minOccurs="0"/&gt;
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
@XmlType(name = "broadcast-interview-ctype", propOrder = {
    "firstBroadcastDate",
    "endDate",
    "program",
    "theme",
    "interviewerName",
    "producer",
    "url",
    "researchClassifications",
    "keywords"
})
public class BroadcastInterviewCtype {

    @XmlElement(name = "first-broadcast-date", required = true)
    protected DateCtype firstBroadcastDate;
    @XmlElement(name = "end-date")
    protected DateCtype endDate;
    @XmlElement(required = true)
    protected String program;
    protected String theme;
    @XmlElement(name = "interviewer-name")
    protected String interviewerName;
    protected String producer;
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "research-classifications", namespace = "http://www.cienciavitae.pt/ns/common")
    protected ResearchClassificationsCtype researchClassifications;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/common")
    protected KeywordsCtype keywords;

    /**
     * Gets the value of the firstBroadcastDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getFirstBroadcastDate() {
        return firstBroadcastDate;
    }

    /**
     * Sets the value of the firstBroadcastDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setFirstBroadcastDate(DateCtype value) {
        this.firstBroadcastDate = value;
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
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgram(String value) {
        this.program = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

    /**
     * Gets the value of the interviewerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterviewerName() {
        return interviewerName;
    }

    /**
     * Sets the value of the interviewerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterviewerName(String value) {
        this.interviewerName = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducer(String value) {
        this.producer = value;
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
