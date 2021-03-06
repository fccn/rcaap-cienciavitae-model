//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.07 at 12:49:04 PM UTC 
//


package pt.cienciavitae.ns.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import pt.cienciavitae.ns.common.ContactTypeCtype;
import pt.cienciavitae.ns.common.RecordCtype;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cienciavitae.pt/ns/common}record-ctype"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="email-type" type="{http://www.cienciavitae.pt/ns/common}contact-type-ctype"/&gt;
 *         &lt;element name="email-address" type="{http://www.cienciavitae.pt/ns/common}string-email-stype"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="preferred-email" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emailType",
    "emailAddress"
})
@XmlRootElement(name = "email")
public class Email
    extends RecordCtype
{

    @XmlElement(name = "email-type", required = true)
    protected ContactTypeCtype emailType;
    @XmlElement(name = "email-address", required = true)
    protected String emailAddress;
    @XmlAttribute(name = "preferred-email")
    protected Boolean preferredEmail;

    /**
     * Gets the value of the emailType property.
     * 
     * @return
     *     possible object is
     *     {@link ContactTypeCtype }
     *     
     */
    public ContactTypeCtype getEmailType() {
        return emailType;
    }

    /**
     * Sets the value of the emailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactTypeCtype }
     *     
     */
    public void setEmailType(ContactTypeCtype value) {
        this.emailType = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the preferredEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreferredEmail() {
        if (preferredEmail == null) {
            return false;
        } else {
            return preferredEmail;
        }
    }

    /**
     * Sets the value of the preferredEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredEmail(Boolean value) {
        this.preferredEmail = value;
    }

}
