//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.07 at 12:49:04 PM UTC 
//


package pt.cienciavitae.ns.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import pt.cienciavitae.ns.common.DateCtype;
import pt.cienciavitae.ns.common.KeywordsCtype;
import pt.cienciavitae.ns.common.ResearchClassificationsCtype;


/**
 * Corresponding to "service:service-category[@code='S103']"
 * 
 * <p>Java class for journal-reviewing-refereeing-ctype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="journal-reviewing-refereeing-ctype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="start-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype"/&gt;
 *         &lt;element name="end-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype" minOccurs="0"/&gt;
 *         &lt;element name="journal"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.cienciavitae.pt/ns/common&gt;string-555-stype"&gt;
 *                 &lt;attribute name="issn" type="{http://www.cienciavitae.pt/ns/common}string-20-stype" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="press" type="{http://www.cienciavitae.pt/ns/common}string-255-stype" minOccurs="0"/&gt;
 *         &lt;element name="works-reviewed" type="{http://www.cienciavitae.pt/ns/common}int-4-stype" minOccurs="0"/&gt;
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
@XmlType(name = "journal-reviewing-refereeing-ctype", propOrder = {
    "startDate",
    "endDate",
    "journal",
    "press",
    "worksReviewed",
    "url",
    "researchClassifications",
    "keywords"
})
public class JournalReviewingRefereeingCtype {

    @XmlElement(name = "start-date", required = true)
    protected DateCtype startDate;
    @XmlElement(name = "end-date")
    protected DateCtype endDate;
    @XmlElement(required = true)
    protected JournalReviewingRefereeingCtype.Journal journal;
    protected String press;
    @XmlElement(name = "works-reviewed")
    protected Integer worksReviewed;
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "research-classifications", namespace = "http://www.cienciavitae.pt/ns/common")
    protected ResearchClassificationsCtype researchClassifications;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/common")
    protected KeywordsCtype keywords;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setStartDate(DateCtype value) {
        this.startDate = value;
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
     * Gets the value of the journal property.
     * 
     * @return
     *     possible object is
     *     {@link JournalReviewingRefereeingCtype.Journal }
     *     
     */
    public JournalReviewingRefereeingCtype.Journal getJournal() {
        return journal;
    }

    /**
     * Sets the value of the journal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalReviewingRefereeingCtype.Journal }
     *     
     */
    public void setJournal(JournalReviewingRefereeingCtype.Journal value) {
        this.journal = value;
    }

    /**
     * Gets the value of the press property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPress() {
        return press;
    }

    /**
     * Sets the value of the press property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPress(String value) {
        this.press = value;
    }

    /**
     * Gets the value of the worksReviewed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorksReviewed() {
        return worksReviewed;
    }

    /**
     * Sets the value of the worksReviewed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorksReviewed(Integer value) {
        this.worksReviewed = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.cienciavitae.pt/ns/common&gt;string-555-stype"&gt;
     *       &lt;attribute name="issn" type="{http://www.cienciavitae.pt/ns/common}string-20-stype" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Journal {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "issn")
        protected String issn;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the issn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssn() {
            return issn;
        }

        /**
         * Sets the value of the issn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssn(String value) {
            this.issn = value;
        }

    }

}
