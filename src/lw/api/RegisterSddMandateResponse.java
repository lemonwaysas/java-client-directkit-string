
package lw.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisterSddMandateResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registerSddMandateResult"
})
@XmlRootElement(name = "RegisterSddMandateResponse")
public class RegisterSddMandateResponse {

    @XmlElement(name = "RegisterSddMandateResult")
    protected String registerSddMandateResult;

    /**
     * Gets the value of the registerSddMandateResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterSddMandateResult() {
        return registerSddMandateResult;
    }

    /**
     * Sets the value of the registerSddMandateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterSddMandateResult(String value) {
        this.registerSddMandateResult = value;
    }

}
