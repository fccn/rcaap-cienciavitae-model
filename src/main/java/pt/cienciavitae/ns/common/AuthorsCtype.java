//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.07 at 12:49:04 PM UTC 
//


package pt.cienciavitae.ns.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authors-ctype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authors-ctype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cienciavitae.pt/ns/common}container-ctype"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="author" type="{http://www.cienciavitae.pt/ns/common}author-ctype" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authors-ctype", propOrder = {
    "author"
})
@XmlSeeAlso({
    pt.cienciavitae.ns.output.AuthorsCtype.class
})
public class AuthorsCtype
    extends ContainerCtype
{

    @XmlElement(required = true)
    protected List<AuthorCtype> author;

    /**
     * Gets the value of the author property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the author property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorCtype }
     * 
     * 
     */
    public List<AuthorCtype> getAuthor() {
        if (author == null) {
            author = new ArrayList<AuthorCtype>();
        }
        return this.author;
    }

}
