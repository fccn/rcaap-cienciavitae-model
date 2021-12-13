//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.07 at 12:49:04 PM UTC 
//


package pt.cienciavitae.ns.common_enum;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for career-contract-enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="career-contract-enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="T02V01"/&gt;
 *     &lt;enumeration value="CC02"/&gt;
 *     &lt;enumeration value="CC03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "career-contract-enum", namespace = "http://www.cienciavitae.pt/ns/common-enum")
@XmlEnum
public enum CareerContractEnum {


    /**
     * PT: De carreira / EN: 
     * 
     */
    @XmlEnumValue("T02V01")
    T_02_V_01("T02V01"),

    /**
     * PT: Convidado / EN: 
     * 
     */
    @XmlEnumValue("CC02")
    CC_02("CC02"),

    /**
     * PT: Outro / EN: 
     * 
     */
    @XmlEnumValue("CC03")
    CC_03("CC03");
    private final String value;

    CareerContractEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CareerContractEnum fromValue(String v) {
        for (CareerContractEnum c: CareerContractEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
