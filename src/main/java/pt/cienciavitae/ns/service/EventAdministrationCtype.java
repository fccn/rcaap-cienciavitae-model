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
import pt.cienciavitae.ns.common.InstitutionsCtype;
import pt.cienciavitae.ns.common.KeywordsCtype;
import pt.cienciavitae.ns.common.ResearchClassificationsCtype;


/**
 * Corresponding to "service:service-category[@code='S201']"
 * 
 * <p>Java class for event-administration-ctype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="event-administration-ctype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activity-start-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype"/&gt;
 *         &lt;element name="activity-end-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype" minOccurs="0"/&gt;
 *         &lt;element name="event-description" type="{http://www.cienciavitae.pt/ns/common}string-555-stype"/&gt;
 *         &lt;element name="event-type" type="{http://www.cienciavitae.pt/ns/service}event-type-ctype" minOccurs="0"/&gt;
 *         &lt;element name="administrative-role" type="{http://www.cienciavitae.pt/ns/service}administrative-role-ctype" minOccurs="0"/&gt;
 *         &lt;element name="event-start-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype"/&gt;
 *         &lt;element name="event-end-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cienciavitae.pt/ns/common}institutions" minOccurs="0"/&gt;
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
@XmlType(name = "event-administration-ctype", propOrder = {
    "activityStartDate",
    "activityEndDate",
    "eventDescription",
    "eventType",
    "administrativeRole",
    "eventStartDate",
    "eventEndDate",
    "institutions",
    "researchClassifications",
    "keywords"
})
public class EventAdministrationCtype {

    @XmlElement(name = "activity-start-date", required = true)
    protected DateCtype activityStartDate;
    @XmlElement(name = "activity-end-date")
    protected DateCtype activityEndDate;
    @XmlElement(name = "event-description", required = true)
    protected String eventDescription;
    @XmlElement(name = "event-type")
    protected EventTypeCtype eventType;
    @XmlElement(name = "administrative-role")
    protected AdministrativeRoleCtype administrativeRole;
    @XmlElement(name = "event-start-date", required = true)
    protected DateCtype eventStartDate;
    @XmlElement(name = "event-end-date")
    protected DateCtype eventEndDate;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/common")
    protected InstitutionsCtype institutions;
    @XmlElement(name = "research-classifications", namespace = "http://www.cienciavitae.pt/ns/common")
    protected ResearchClassificationsCtype researchClassifications;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/common")
    protected KeywordsCtype keywords;

    /**
     * Gets the value of the activityStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getActivityStartDate() {
        return activityStartDate;
    }

    /**
     * Sets the value of the activityStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setActivityStartDate(DateCtype value) {
        this.activityStartDate = value;
    }

    /**
     * Gets the value of the activityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getActivityEndDate() {
        return activityEndDate;
    }

    /**
     * Sets the value of the activityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setActivityEndDate(DateCtype value) {
        this.activityEndDate = value;
    }

    /**
     * Gets the value of the eventDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * Sets the value of the eventDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDescription(String value) {
        this.eventDescription = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link EventTypeCtype }
     *     
     */
    public EventTypeCtype getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTypeCtype }
     *     
     */
    public void setEventType(EventTypeCtype value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the administrativeRole property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeRoleCtype }
     *     
     */
    public AdministrativeRoleCtype getAdministrativeRole() {
        return administrativeRole;
    }

    /**
     * Sets the value of the administrativeRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeRoleCtype }
     *     
     */
    public void setAdministrativeRole(AdministrativeRoleCtype value) {
        this.administrativeRole = value;
    }

    /**
     * Gets the value of the eventStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getEventStartDate() {
        return eventStartDate;
    }

    /**
     * Sets the value of the eventStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setEventStartDate(DateCtype value) {
        this.eventStartDate = value;
    }

    /**
     * Gets the value of the eventEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getEventEndDate() {
        return eventEndDate;
    }

    /**
     * Sets the value of the eventEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setEventEndDate(DateCtype value) {
        this.eventEndDate = value;
    }

    /**
     * Gets the value of the institutions property.
     * 
     * @return
     *     possible object is
     *     {@link InstitutionsCtype }
     *     
     */
    public InstitutionsCtype getInstitutions() {
        return institutions;
    }

    /**
     * Sets the value of the institutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstitutionsCtype }
     *     
     */
    public void setInstitutions(InstitutionsCtype value) {
        this.institutions = value;
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
