
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
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceList" type="{https://services.alarmnet.com/TC2/}ArrayOfDeviceAuthorizingCode" minOccurs="0"/>
 *         &lt;element name="StatusOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AdditionalInput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionID",
    "deviceList",
    "statusOnly",
    "additionalInput"
})
@XmlRootElement(name = "SynchronizePanelUser")
public class SynchronizePanelUser {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "DeviceList")
    protected ArrayOfDeviceAuthorizingCode deviceList;
    @XmlElement(name = "StatusOnly")
    protected boolean statusOnly;
    @XmlElement(name = "AdditionalInput")
    protected String additionalInput;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the deviceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeviceAuthorizingCode }
     *     
     */
    public ArrayOfDeviceAuthorizingCode getDeviceList() {
        return deviceList;
    }

    /**
     * Sets the value of the deviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeviceAuthorizingCode }
     *     
     */
    public void setDeviceList(ArrayOfDeviceAuthorizingCode value) {
        this.deviceList = value;
    }

    /**
     * Gets the value of the statusOnly property.
     * 
     */
    public boolean isStatusOnly() {
        return statusOnly;
    }

    /**
     * Sets the value of the statusOnly property.
     * 
     */
    public void setStatusOnly(boolean value) {
        this.statusOnly = value;
    }

    /**
     * Gets the value of the additionalInput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInput() {
        return additionalInput;
    }

    /**
     * Sets the value of the additionalInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInput(String value) {
        this.additionalInput = value;
    }

}
