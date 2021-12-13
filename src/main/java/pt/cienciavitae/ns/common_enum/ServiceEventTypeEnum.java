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
 * <p>Java class for service-event-type-enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="service-event-type-enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CE"/&gt;
 *     &lt;enumeration value="CF"/&gt;
 *     &lt;enumeration value="CG"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="EN"/&gt;
 *     &lt;enumeration value="EX"/&gt;
 *     &lt;enumeration value="FE"/&gt;
 *     &lt;enumeration value="MR"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="OF"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="SI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "service-event-type-enum", namespace = "http://www.cienciavitae.pt/ns/common-enum")
@XmlEnum
public enum ServiceEventTypeEnum {


    /**
     * PT: Concerto / EN: Concert
     * 
     */
    CE,

    /**
     * PT: Conferência / EN: Conference
     * 
     */
    CF,

    /**
     * PT: Congresso / EN: Congress
     * 
     */
    CG,

    /**
     * PT: Concurso / EN: Call
     * 
     */
    CR,

    /**
     * PT: Encontro / EN: Meeting
     * 
     */
    EN,

    /**
     * PT: Exposição / EN: Exhibition
     * 
     */
    EX,

    /**
     * PT: Festival / EN: Festival
     * 
     */
    FE,

    /**
     * PT: Mesa-redonda / EN: Round table
     * 
     */
    MR,

    /**
     * PT: Outro / EN: Other
     * 
     */
    O,

    /**
     * PT: Oficina (workshop) / EN: Workshop
     * 
     */
    OF,

    /**
     * PT: Seminário / EN: Seminar
     * 
     */
    SE,

    /**
     * PT: Simpósio / EN: Symposium
     * 
     */
    SI;

    public String value() {
        return name();
    }

    public static ServiceEventTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
