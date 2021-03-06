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
import pt.cienciavitae.ns.common.KeywordsCtype;
import pt.cienciavitae.ns.common.ResearchClassificationsCtype;


/**
 * Corresponding to "service:service-category[@code='S203']"
 * 
 * <p>Java class for membership-ctype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="membership-ctype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="membership-start-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype"/&gt;
 *         &lt;element name="membership-end-date" type="{http://www.cienciavitae.pt/ns/common}date-ctype" minOccurs="0"/&gt;
 *         &lt;element name="society-other-organization" type="{http://www.cienciavitae.pt/ns/common}string-555-stype"/&gt;
 *         &lt;element name="membership-role" type="{http://www.cienciavitae.pt/ns/common}string-555-stype" minOccurs="0"/&gt;
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
@XmlType(name = "membership-ctype", propOrder = {
    "membershipStartDate",
    "membershipEndDate",
    "societyOtherOrganization",
    "membershipRole",
    "researchClassifications",
    "keywords"
})
public class MembershipCtype {

    @XmlElement(name = "membership-start-date", required = true)
    protected DateCtype membershipStartDate;
    @XmlElement(name = "membership-end-date")
    protected DateCtype membershipEndDate;
    @XmlElement(name = "society-other-organization", required = true)
    protected String societyOtherOrganization;
    @XmlElement(name = "membership-role")
    protected String membershipRole;
    @XmlElement(name = "research-classifications", namespace = "http://www.cienciavitae.pt/ns/common")
    protected ResearchClassificationsCtype researchClassifications;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/common")
    protected KeywordsCtype keywords;

    /**
     * Gets the value of the membershipStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getMembershipStartDate() {
        return membershipStartDate;
    }

    /**
     * Sets the value of the membershipStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setMembershipStartDate(DateCtype value) {
        this.membershipStartDate = value;
    }

    /**
     * Gets the value of the membershipEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCtype }
     *     
     */
    public DateCtype getMembershipEndDate() {
        return membershipEndDate;
    }

    /**
     * Sets the value of the membershipEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCtype }
     *     
     */
    public void setMembershipEndDate(DateCtype value) {
        this.membershipEndDate = value;
    }

    /**
     * Gets the value of the societyOtherOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocietyOtherOrganization() {
        return societyOtherOrganization;
    }

    /**
     * Sets the value of the societyOtherOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocietyOtherOrganization(String value) {
        this.societyOtherOrganization = value;
    }

    /**
     * Gets the value of the membershipRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipRole() {
        return membershipRole;
    }

    /**
     * Sets the value of the membershipRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipRole(String value) {
        this.membershipRole = value;
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
