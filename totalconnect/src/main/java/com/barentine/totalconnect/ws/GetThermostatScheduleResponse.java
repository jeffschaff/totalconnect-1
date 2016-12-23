
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
 *         &lt;element name="GetThermostatScheduleResult" type="{https://services.alarmnet.com/TC2/}ThermostatScheduleResults" minOccurs="0"/>
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
    "getThermostatScheduleResult"
})
@XmlRootElement(name = "GetThermostatScheduleResponse")
public class GetThermostatScheduleResponse {

    @XmlElement(name = "GetThermostatScheduleResult")
    protected ThermostatScheduleResults getThermostatScheduleResult;

    /**
     * Gets the value of the getThermostatScheduleResult property.
     * 
     * @return
     *     possible object is
     *     {@link ThermostatScheduleResults }
     *     
     */
    public ThermostatScheduleResults getGetThermostatScheduleResult() {
        return getThermostatScheduleResult;
    }

    /**
     * Sets the value of the getThermostatScheduleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermostatScheduleResults }
     *     
     */
    public void setGetThermostatScheduleResult(ThermostatScheduleResults value) {
        this.getThermostatScheduleResult = value;
    }

}