
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationInfoBasicEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationInfoBasicEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhotoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationModuleFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityDeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LocationInfoSimple" type="{https://services.alarmnet.com/TC2/}LocationInfoSimple" minOccurs="0"/>
 *         &lt;element name="PanelConnectionStatusInfo" type="{https://services.alarmnet.com/TC2/}ArrayOfPanelConnectionStatusInfo" minOccurs="0"/>
 *         &lt;element name="DeviceList" type="{https://services.alarmnet.com/TC2/}ArrayOfDeviceInfoBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationInfoBasicEx", propOrder = {
    "locationID",
    "locationName",
    "photoURL",
    "locationModuleFlags",
    "securityDeviceID",
    "locationInfoSimple",
    "panelConnectionStatusInfo",
    "deviceList"
})
public class LocationInfoBasicEx {

    @XmlElement(name = "LocationID")
    protected long locationID;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "PhotoURL")
    protected String photoURL;
    @XmlElement(name = "LocationModuleFlags")
    protected String locationModuleFlags;
    @XmlElement(name = "SecurityDeviceID")
    protected long securityDeviceID;
    @XmlElement(name = "LocationInfoSimple")
    protected LocationInfoSimple locationInfoSimple;
    @XmlElement(name = "PanelConnectionStatusInfo")
    protected ArrayOfPanelConnectionStatusInfo panelConnectionStatusInfo;
    @XmlElement(name = "DeviceList")
    protected ArrayOfDeviceInfoBasic deviceList;

    /**
     * Gets the value of the locationID property.
     * 
     */
    public long getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(long value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the photoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Sets the value of the photoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoURL(String value) {
        this.photoURL = value;
    }

    /**
     * Gets the value of the locationModuleFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationModuleFlags() {
        return locationModuleFlags;
    }

    /**
     * Sets the value of the locationModuleFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationModuleFlags(String value) {
        this.locationModuleFlags = value;
    }

    /**
     * Gets the value of the securityDeviceID property.
     * 
     */
    public long getSecurityDeviceID() {
        return securityDeviceID;
    }

    /**
     * Sets the value of the securityDeviceID property.
     * 
     */
    public void setSecurityDeviceID(long value) {
        this.securityDeviceID = value;
    }

    /**
     * Gets the value of the locationInfoSimple property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfoSimple }
     *     
     */
    public LocationInfoSimple getLocationInfoSimple() {
        return locationInfoSimple;
    }

    /**
     * Sets the value of the locationInfoSimple property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfoSimple }
     *     
     */
    public void setLocationInfoSimple(LocationInfoSimple value) {
        this.locationInfoSimple = value;
    }

    /**
     * Gets the value of the panelConnectionStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPanelConnectionStatusInfo }
     *     
     */
    public ArrayOfPanelConnectionStatusInfo getPanelConnectionStatusInfo() {
        return panelConnectionStatusInfo;
    }

    /**
     * Sets the value of the panelConnectionStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPanelConnectionStatusInfo }
     *     
     */
    public void setPanelConnectionStatusInfo(ArrayOfPanelConnectionStatusInfo value) {
        this.panelConnectionStatusInfo = value;
    }

    /**
     * Gets the value of the deviceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeviceInfoBasic }
     *     
     */
    public ArrayOfDeviceInfoBasic getDeviceList() {
        return deviceList;
    }

    /**
     * Sets the value of the deviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeviceInfoBasic }
     *     
     */
    public void setDeviceList(ArrayOfDeviceInfoBasic value) {
        this.deviceList = value;
    }

}
