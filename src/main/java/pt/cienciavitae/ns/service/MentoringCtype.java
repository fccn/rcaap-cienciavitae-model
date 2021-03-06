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
import javax.xml.bind.annotation.XmlType;
import pt.cienciavitae.ns.common.DateCtype;


/**
 * Corresponding to "service:service-category[@code='S107']"
 * 
 * <p>Java class for mentoring-ctype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mentoring-ctype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="start-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype"/&gt;
 *         &lt;element name="end-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype" minOccurs="0"/&gt;
 *         &lt;element name="topic-of-mentor-ship" type="{http://www.cienciavitae.pt/ns/common}string-255-stype" minOccurs="0"/&gt;
 *         &lt;element name="name-of-protege" type="{http://www.cienciavitae.pt/ns/common}string-120-stype"/&gt;
 *         &lt;element name="description" type="{http://www.cienciavitae.pt/ns/common}string-255-stype" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mentoring-ctype", propOrder = {
    "startDate",
    "endDate",
    "topicOfMentorShip",
    "nameOfProtege",
    "description"
})
public class MentoringCtype {

    @XmlElement(name = "start-date", required = true)
    protected DateCtype startDate;
    @XmlElement(name = "end-date")
    protected DateCtype endDate;
    @XmlElement(name = "topic-of-mentor-ship")
    protected String topicOfMentorShip;
    @XmlElement(name = "name-of-protege", required = true)
    protected String nameOfProtege;
    protected String description;

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
     * Gets the value of the topicOfMentorShip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopicOfMentorShip() {
        return topicOfMentorShip;
    }

    /**
     * Sets the value of the topicOfMentorShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopicOfMentorShip(String value) {
        this.topicOfMentorShip = value;
    }

    /**
     * Gets the value of the nameOfProtege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfProtege() {
        return nameOfProtege;
    }

    /**
     * Sets the value of the nameOfProtege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfProtege(String value) {
        this.nameOfProtege = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
