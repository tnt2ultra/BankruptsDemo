
package ru.demo.bankrupts.soap.ws.client.generated;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetMessageIdsResult" type="{http://tempuri.org/}ArrayOfInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMessageIdsResult"
})
@XmlRootElement(name = "GetMessageIdsResponse")
public class GetMessageIdsResponse {

    @XmlElement(name = "GetMessageIdsResult")
    protected ArrayOfInt getMessageIdsResult;

    /**
     * Gets the value of the getMessageIdsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getGetMessageIdsResult() {
        return getMessageIdsResult;
    }

    /**
     * Sets the value of the getMessageIdsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setGetMessageIdsResult(ArrayOfInt value) {
        this.getMessageIdsResult = value;
    }

}
