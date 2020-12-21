
package ru.demo.bankrupts.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ArbitrManagerRegisterItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArbitrManagerRegisterItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateAffiliations" type="{http://tempuri.org/}ArrayOfDateAffiliation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ArbitrManagerID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RegNum" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="INN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OGRNIP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SNILS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SRORegNum" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DateLastModif" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Region" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DateReg" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="SRORegDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="DateDelete" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArbitrManagerRegisterItem", propOrder = {
    "dateAffiliations"
})
public class ArbitrManagerRegisterItem {

    @XmlElement(name = "DateAffiliations")
    protected ArrayOfDateAffiliation dateAffiliations;
    @XmlAttribute(name = "ArbitrManagerID")
    protected String arbitrManagerID;
    @XmlAttribute(name = "FirstName")
    protected String firstName;
    @XmlAttribute(name = "MiddleName")
    protected String middleName;
    @XmlAttribute(name = "LastName")
    protected String lastName;
    @XmlAttribute(name = "RegNum")
    protected String regNum;
    @XmlAttribute(name = "INN")
    protected String inn;
    @XmlAttribute(name = "OGRNIP")
    protected String ogrnip;
    @XmlAttribute(name = "SNILS")
    protected String snils;
    @XmlAttribute(name = "SRORegNum")
    protected String sroRegNum;
    @XmlAttribute(name = "DateLastModif", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastModif;
    @XmlAttribute(name = "Region")
    protected String region;
    @XmlAttribute(name = "DateReg")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReg;
    @XmlAttribute(name = "SRORegDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sroRegDate;
    @XmlAttribute(name = "DateDelete")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDelete;

    /**
     * Gets the value of the dateAffiliations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDateAffiliation }
     *     
     */
    public ArrayOfDateAffiliation getDateAffiliations() {
        return dateAffiliations;
    }

    /**
     * Sets the value of the dateAffiliations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDateAffiliation }
     *     
     */
    public void setDateAffiliations(ArrayOfDateAffiliation value) {
        this.dateAffiliations = value;
    }

    /**
     * Gets the value of the arbitrManagerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArbitrManagerID() {
        return arbitrManagerID;
    }

    /**
     * Sets the value of the arbitrManagerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArbitrManagerID(String value) {
        this.arbitrManagerID = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the ogrnip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRNIP() {
        return ogrnip;
    }

    /**
     * Sets the value of the ogrnip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRNIP(String value) {
        this.ogrnip = value;
    }

    /**
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNILS() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNILS(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the sroRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRORegNum() {
        return sroRegNum;
    }

    /**
     * Sets the value of the sroRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRORegNum(String value) {
        this.sroRegNum = value;
    }

    /**
     * Gets the value of the dateLastModif property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastModif() {
        return dateLastModif;
    }

    /**
     * Sets the value of the dateLastModif property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastModif(XMLGregorianCalendar value) {
        this.dateLastModif = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the dateReg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReg() {
        return dateReg;
    }

    /**
     * Sets the value of the dateReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReg(XMLGregorianCalendar value) {
        this.dateReg = value;
    }

    /**
     * Gets the value of the sroRegDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSRORegDate() {
        return sroRegDate;
    }

    /**
     * Sets the value of the sroRegDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSRORegDate(XMLGregorianCalendar value) {
        this.sroRegDate = value;
    }

    /**
     * Gets the value of the dateDelete property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDelete() {
        return dateDelete;
    }

    /**
     * Sets the value of the dateDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDelete(XMLGregorianCalendar value) {
        this.dateDelete = value;
    }

}
