
package com.barentine.totalconnect.ws;

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
 *         &lt;element name="SaveUserResult" type="{https://services.alarmnet.com/TC2/}SaveUserResults" minOccurs="0"/>
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
    "saveUserResult"
})
@XmlRootElement(name = "SaveUserResponse")
public class SaveUserResponse {

    @XmlElement(name = "SaveUserResult")
    protected SaveUserResults saveUserResult;

    /**
     * Gets the value of the saveUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUserResults }
     *     
     */
    public SaveUserResults getSaveUserResult() {
        return saveUserResult;
    }

    /**
     * Sets the value of the saveUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUserResults }
     *     
     */
    public void setSaveUserResult(SaveUserResults value) {
        this.saveUserResult = value;
    }

}
