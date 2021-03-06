
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
 *         &lt;element name="EulaID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LanguageID" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "eulaID",
    "languageID"
})
@XmlRootElement(name = "GetPreLoginEulaText")
public class GetPreLoginEulaText {

    @XmlElement(name = "EulaID")
    protected long eulaID;
    @XmlElement(name = "LanguageID")
    protected long languageID;

    /**
     * Gets the value of the eulaID property.
     * 
     */
    public long getEulaID() {
        return eulaID;
    }

    /**
     * Sets the value of the eulaID property.
     * 
     */
    public void setEulaID(long value) {
        this.eulaID = value;
    }

    /**
     * Gets the value of the languageID property.
     * 
     */
    public long getLanguageID() {
        return languageID;
    }

    /**
     * Sets the value of the languageID property.
     * 
     */
    public void setLanguageID(long value) {
        this.languageID = value;
    }

}
