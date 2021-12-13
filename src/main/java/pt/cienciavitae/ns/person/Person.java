//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.07 at 12:49:04 PM UTC 
//


package pt.cienciavitae.ns.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import pt.cienciavitae.ns.author_identifier.AuthorIdentifiers;
import pt.cienciavitae.ns.citation_name.CitationNames;
import pt.cienciavitae.ns.common.ContainerCtype;
import pt.cienciavitae.ns.employment.Employments;
import pt.cienciavitae.ns.person_info.PersonInfo;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cienciavitae.pt/ns/common}container-ctype"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cienciavitae.pt/ns/person-info}person-info"/&gt;
 *         &lt;element ref="{http://www.cienciavitae.pt/ns/citation-name}citation-names"/&gt;
 *         &lt;element ref="{http://www.cienciavitae.pt/ns/author-identifier}author-identifiers"/&gt;
 *         &lt;element ref="{http://www.cienciavitae.pt/ns/employment}employments"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.cienciavitae.pt/ns/common}last-modified-date"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personInfo",
    "citationNames",
    "authorIdentifiers",
    "employments"
})
@XmlRootElement(name = "person")
public class Person
    extends ContainerCtype
{

    @XmlElement(name = "person-info", namespace = "http://www.cienciavitae.pt/ns/person-info", required = true)
    protected PersonInfo personInfo;
    @XmlElement(name = "citation-names", namespace = "http://www.cienciavitae.pt/ns/citation-name", required = true)
    protected CitationNames citationNames;
    @XmlElement(name = "author-identifiers", namespace = "http://www.cienciavitae.pt/ns/author-identifier", required = true)
    protected AuthorIdentifiers authorIdentifiers;
    @XmlElement(namespace = "http://www.cienciavitae.pt/ns/employment", required = true)
    protected Employments employments;
    @XmlAttribute(name = "last-modified-date", namespace = "http://www.cienciavitae.pt/ns/common")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setPersonInfo(PersonInfo value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the citationNames property.
     * 
     * @return
     *     possible object is
     *     {@link CitationNames }
     *     
     */
    public CitationNames getCitationNames() {
        return citationNames;
    }

    /**
     * Sets the value of the citationNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitationNames }
     *     
     */
    public void setCitationNames(CitationNames value) {
        this.citationNames = value;
    }

    /**
     * Gets the value of the authorIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorIdentifiers }
     *     
     */
    public AuthorIdentifiers getAuthorIdentifiers() {
        return authorIdentifiers;
    }

    /**
     * Sets the value of the authorIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorIdentifiers }
     *     
     */
    public void setAuthorIdentifiers(AuthorIdentifiers value) {
        this.authorIdentifiers = value;
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

}
