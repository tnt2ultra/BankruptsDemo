
package ru.demo.bankrupts.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Trade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trade"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageList" type="{http://tempuri.org/}ArrayOfTradeMessage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ID_External" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ID_EFRSB" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trade", propOrder = {
    "messageList"
})
public class Trade {

    @XmlElement(name = "MessageList")
    protected ArrayOfTradeMessage messageList;
    @XmlAttribute(name = "ID_External")
    protected String idExternal;
    @XmlAttribute(name = "ID_EFRSB", required = true)
    protected int idefrsb;

    /**
     * Gets the value of the messageList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTradeMessage }
     *     
     */
    public ArrayOfTradeMessage getMessageList() {
        return messageList;
    }

    /**
     * Sets the value of the messageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTradeMessage }
     *     
     */
    public void setMessageList(ArrayOfTradeMessage value) {
        this.messageList = value;
    }

    /**
     * Gets the value of the idExternal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDExternal() {
        return idExternal;
    }

    /**
     * Sets the value of the idExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDExternal(String value) {
        this.idExternal = value;
    }

    /**
     * Gets the value of the idefrsb property.
     * 
     */
    public int getIDEFRSB() {
        return idefrsb;
    }

    /**
     * Sets the value of the idefrsb property.
     * 
     */
    public void setIDEFRSB(int value) {
        this.idefrsb = value;
    }

}
