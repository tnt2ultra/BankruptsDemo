
package ru.demo.bankrupts.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebtorCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebtorCompany"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}DebtorRegisterItem"&gt;
 *       &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LegalAddress" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtorCompany")
public class DebtorCompany
    extends DebtorRegisterItem
{

    @XmlAttribute(name = "FullName")
    protected String fullName;
    @XmlAttribute(name = "ShortName")
    protected String shortName;
    @XmlAttribute(name = "OGRN")
    protected String ogrn;
    @XmlAttribute(name = "LegalAddress")
    protected String legalAddress;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the legalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalAddress() {
        return legalAddress;
    }

    /**
     * Sets the value of the legalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalAddress(String value) {
        this.legalAddress = value;
    }

}