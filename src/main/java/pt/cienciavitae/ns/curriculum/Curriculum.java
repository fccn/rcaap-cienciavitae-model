//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.07 at 12:49:04 PM UTC 
//


package pt.cienciavitae.ns.curriculum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import pt.cienciavitae.ns.degree.Degrees;
import pt.cienciavitae.ns.distinction.Distinctions;
import pt.cienciavitae.ns.employment.Employments;
import pt.cienciavitae.ns.funding.Fundings;
import pt.cienciavitae.ns.groups.Groups;
import pt.cienciavitae.ns.identifying_info.IdentifyingInfo;
import pt.cienciavitae.ns.output.Outputs;
import pt.cienciavitae.ns.service.Services;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cienciavitae.pt/ns/identifying-info}identifying-info"/&gt;
 *         &lt;element ref="{http://www.cienciavitae.pt/ns/degree}degrees" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cienciavitae.pt/ns/employment}employments" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cienciavitae.pt/ns/funding}fundings" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cienciavitae.pt/ns/output}outputs" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cienciavitae.pt/ns/service}services" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cienciavitae.pt/ns/distinction}distinctions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cienciavitae.pt/ns/groups}groups" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.cienciavitae.pt/ns/common}last-modified-date"/&gt;
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identifyingInfo",
    "degrees",
    "employments",
    "fundings",
    "outputs",
    "services",
    "distinctions",
    "groups"
})
@XmlRootElement(name = "curriculum")
public class Curriculum {

    @XmlElement(name = "identifying-info", namespace = "http://www.cienciavitae.pt/ns/identifying-info", required = true)
    protected IdentifyingInfo identifyingInfo;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/degree")
    protected Degrees degrees;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/employment")
    protected Employments employments;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/funding")
    protected Fundings fundings;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/output")
    protected Outputs outputs;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/service")
    protected Services services;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/distinction")
    protected Distinctions distinctions;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/groups")
    protected Groups groups;
    @XmlAttribute(name = "last-modified-date", namespace = "http://www.cienciavitae.pt/ns/common")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlAttribute(name = "language")
    protected String language;

    /**
     * Gets the value of the identifyingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifyingInfo }
     *     
     */
    public IdentifyingInfo getIdentifyingInfo() {
        return identifyingInfo;
    }

    /**
     * Sets the value of the identifyingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifyingInfo }
     *     
     */
    public void setIdentifyingInfo(IdentifyingInfo value) {
        this.identifyingInfo = value;
    }

    /**
     * Gets the value of the degrees property.
     * 
     * @return
     *     possible object is
     *     {@link Degrees }
     *     
     */
    public Degrees getDegrees() {
        return degrees;
    }

    /**
     * Sets the value of the degrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Degrees }
     *     
     */
    public void setDegrees(Degrees value) {
        this.degrees = value;
    }

    /**
     * Gets the value of the employments property.
     * 
     * @return
     *     possible object is
     *     {@link Employments }
     *     
     */
    public Employments getEmployments() {
        return employments;
    }

    /**
     * Sets the value of the employments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employments }
     *     
     */
    public void setEmployments(Employments value) {
        this.employments = value;
    }

    /**
     * Gets the value of the fundings property.
     * 
     * @return
     *     possible object is
     *     {@link Fundings }
     *     
     */
    public Fundings getFundings() {
        return fundings;
    }

    /**
     * Sets the value of the fundings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fundings }
     *     
     */
    public void setFundings(Fundings value) {
        this.fundings = value;
    }

    /**
     * Gets the value of the outputs property.
     * 
     * @return
     *     possible object is
     *     {@link Outputs }
     *     
     */
    public Outputs getOutputs() {
        return outputs;
    }

    /**
     * Sets the value of the outputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Outputs }
     *     
     */
    public void setOutputs(Outputs value) {
        this.outputs = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link Services }
     *     
     */
    public Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link Services }
     *     
     */
    public void setServices(Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the distinctions property.
     * 
     * @return
     *     possible object is
     *     {@link Distinctions }
     *     
     */
    public Distinctions getDistinctions() {
        return distinctions;
    }

    /**
     * Sets the value of the distinctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distinctions }
     *     
     */
    public void setDistinctions(Distinctions value) {
        this.distinctions = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link Groups }
     *     
     */
    public Groups getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Groups }
     *     
     */
    public void setGroups(Groups value) {
        this.groups = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
