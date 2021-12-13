//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.07 at 12:49:04 PM UTC 
//


package pt.cienciavitae.ns.api_user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import pt.cienciavitae.ns.common.PrivacyLevelCtype;
import pt.cienciavitae.ns.common.RoleCtype;


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
 *         &lt;element name="name" type="{http://www.cienciavitae.pt/ns/common}string-255-stype"/&gt;
 *         &lt;element name="privacy-level" type="{http://www.cienciavitae.pt/ns/common}privacy-level-ctype"/&gt;
 *         &lt;element name="role" type="{http://www.cienciavitae.pt/ns/common}role-ctype"/&gt;
 *         &lt;element name="url" type="{http://www.cienciavitae.pt/ns/common}string-255-stype"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "privacyLevel",
    "role",
    "url"
})
@XmlRootElement(name = "api-user")
public class ApiUser {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "privacy-level", required = true)
    protected PrivacyLevelCtype privacyLevel;
    @XmlElement(required = true)
    protected RoleCtype role;
    @XmlElement(required = true)
    protected String url;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the privacyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PrivacyLevelCtype }
     *     
     */
    public PrivacyLevelCtype getPrivacyLevel() {
        return privacyLevel;
    }

    /**
     * Sets the value of the privacyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivacyLevelCtype }
     *     
     */
    public void setPrivacyLevel(PrivacyLevelCtype value) {
        this.privacyLevel = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link RoleCtype }
     *     
     */
    public RoleCtype getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleCtype }
     *     
     */
    public void setRole(RoleCtype value) {
        this.role = value;
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

}
