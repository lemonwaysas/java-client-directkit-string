
package lw.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boPass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wallet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="holderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="holderCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bicCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intermediaryBicCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intermediaryBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intermediaryBankCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ip",
    "ua",
    "boLogin",
    "boPass",
    "wallet",
    "accountType",
    "holderName",
    "accountNumber",
    "holderCountry",
    "bicCode",
    "bankName",
    "bankCountry",
    "intermediaryBicCode",
    "intermediaryBankName",
    "intermediaryBankCountry",
    "comment",
    "language"
})
@XmlRootElement(name = "RegisterIBANExtended")
public class RegisterIBANExtended {

    protected String ip;
    protected String ua;
    protected String boLogin;
    protected String boPass;
    protected String wallet;
    protected String accountType;
    protected String holderName;
    protected String accountNumber;
    protected String holderCountry;
    protected String bicCode;
    protected String bankName;
    protected String bankCountry;
    protected String intermediaryBicCode;
    protected String intermediaryBankName;
    protected String intermediaryBankCountry;
    protected String comment;
    protected String language;

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Gets the value of the ua property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUa() {
        return ua;
    }

    /**
     * Sets the value of the ua property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUa(String value) {
        this.ua = value;
    }

    /**
     * Gets the value of the boLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoLogin() {
        return boLogin;
    }

    /**
     * Sets the value of the boLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoLogin(String value) {
        this.boLogin = value;
    }

    /**
     * Gets the value of the boPass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoPass() {
        return boPass;
    }

    /**
     * Sets the value of the boPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoPass(String value) {
        this.boPass = value;
    }

    /**
     * Gets the value of the wallet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWallet() {
        return wallet;
    }

    /**
     * Sets the value of the wallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWallet(String value) {
        this.wallet = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the holderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * Sets the value of the holderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderName(String value) {
        this.holderName = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the holderCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderCountry() {
        return holderCountry;
    }

    /**
     * Sets the value of the holderCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderCountry(String value) {
        this.holderCountry = value;
    }

    /**
     * Gets the value of the bicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBicCode() {
        return bicCode;
    }

    /**
     * Sets the value of the bicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBicCode(String value) {
        this.bicCode = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCountry() {
        return bankCountry;
    }

    /**
     * Sets the value of the bankCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCountry(String value) {
        this.bankCountry = value;
    }

    /**
     * Gets the value of the intermediaryBicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntermediaryBicCode() {
        return intermediaryBicCode;
    }

    /**
     * Sets the value of the intermediaryBicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntermediaryBicCode(String value) {
        this.intermediaryBicCode = value;
    }

    /**
     * Gets the value of the intermediaryBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntermediaryBankName() {
        return intermediaryBankName;
    }

    /**
     * Sets the value of the intermediaryBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntermediaryBankName(String value) {
        this.intermediaryBankName = value;
    }

    /**
     * Gets the value of the intermediaryBankCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntermediaryBankCountry() {
        return intermediaryBankCountry;
    }

    /**
     * Sets the value of the intermediaryBankCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntermediaryBankCountry(String value) {
        this.intermediaryBankCountry = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
