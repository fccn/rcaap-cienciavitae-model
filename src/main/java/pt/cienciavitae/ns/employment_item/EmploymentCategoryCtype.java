//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.07 at 12:49:04 PM UTC 
//


package pt.cienciavitae.ns.employment_item;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pt.cienciavitae.ns.common_enum.EmploymentCategoryEnum;


/**
 * <p>Java class for employment-category-ctype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employment-category-ctype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="employment-position-type" type="{http://www.cienciavitae.pt/ns/employment-item}employment-position-type-ctype" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="code" type="{http://www.cienciavitae.pt/ns/common-enum}employment-category-enum" /&gt;
 *       &lt;attribute name="value" type="{http://www.cienciavitae.pt/ns/common}string-100-stype" /&gt;
 *       &lt;attribute name="selectable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employment-category-ctype", propOrder = {
    "employmentPositionType"
})
public class EmploymentCategoryCtype {

    @XmlElement(name = "employment-position-type", required = true)
    protected List<EmploymentPositionTypeCtype> employmentPositionType;
    @XmlAttribute(name = "code")
    protected EmploymentCategoryEnum code;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "selectable")
    protected Boolean selectable;

    /**
     * Gets the value of the employmentPositionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employmentPositionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmploymentPositionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmploymentPositionTypeCtype }
     * 
     * 
     */
    public List<EmploymentPositionTypeCtype> getEmploymentPositionType() {
        if (employmentPositionType == null) {
            employmentPositionType = new ArrayList<EmploymentPositionTypeCtype>();
        }
        return this.employmentPositionType;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentCategoryEnum }
     *     
     */
    public EmploymentCategoryEnum getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentCategoryEnum }
     *     
     */
    public void setCode(EmploymentCategoryEnum value) {
        this.code = value;
    }

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
     * Gets the value of the selectable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectable() {
        return selectable;
    }

    /**
     * Sets the value of the selectable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectable(Boolean value) {
        this.selectable = value;
    }

}
