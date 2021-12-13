//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.07 at 12:49:04 PM UTC 
//


package pt.cienciavitae.ns.common_enum;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for output-publication-status-enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="output-publication-status-enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APB"/&gt;
 *     &lt;enumeration value="ERV"/&gt;
 *     &lt;enumeration value="PBD"/&gt;
 *     &lt;enumeration value="SBT"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "output-publication-status-enum", namespace = "http://www.cienciavitae.pt/ns/common-enum")
@XmlEnum
public enum OutputPublicationStatusEnum {


    /**
     * PT: Aceite para publicação / EN: Accepted
     * 
     */
    APB,

    /**
     * PT: Em revisão / EN: In review
     * 
     */
    ERV,

    /**
     * PT: Publicado / EN: Published
     * 
     */
    PBD,

    /**
     * PT: Submetido / EN: Submitted
     * 
     */
    SBT,

    /**
     * PT: No prelo / EN: In print
     * 
     */
    NPR;

    public String value() {
        return name();
    }

    public static OutputPublicationStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
