//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.29 at 01:52:28 PM IST 
//


package com.claymus.xml;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="claymus-homes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="claymus-home" type="{}claymus-home" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="url-forwarding">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="forward" type="{}forward" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="catch-all" type="{}catch-all"/>
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
    "claymusHomes",
    "urlForwarding",
    "catchAll"
})
@XmlRootElement(name = "claymus-web-app")
public class ClaymusWebApp {

    @XmlElement(name = "claymus-homes", required = true)
    protected ClaymusWebApp.ClaymusHomes claymusHomes;
    @XmlElement(name = "url-forwarding", required = true)
    protected ClaymusWebApp.UrlForwarding urlForwarding;
    @XmlElement(name = "catch-all", required = true)
    protected CatchAll catchAll;

    /**
     * Gets the value of the claymusHomes property.
     * 
     * @return
     *     possible object is
     *     {@link ClaymusWebApp.ClaymusHomes }
     *     
     */
    public ClaymusWebApp.ClaymusHomes getClaymusHomes() {
        return claymusHomes;
    }

    /**
     * Sets the value of the claymusHomes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaymusWebApp.ClaymusHomes }
     *     
     */
    public void setClaymusHomes(ClaymusWebApp.ClaymusHomes value) {
        this.claymusHomes = value;
    }

    /**
     * Gets the value of the urlForwarding property.
     * 
     * @return
     *     possible object is
     *     {@link ClaymusWebApp.UrlForwarding }
     *     
     */
    public ClaymusWebApp.UrlForwarding getUrlForwarding() {
        return urlForwarding;
    }

    /**
     * Sets the value of the urlForwarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaymusWebApp.UrlForwarding }
     *     
     */
    public void setUrlForwarding(ClaymusWebApp.UrlForwarding value) {
        this.urlForwarding = value;
    }

    /**
     * Gets the value of the catchAll property.
     * 
     * @return
     *     possible object is
     *     {@link CatchAll }
     *     
     */
    public CatchAll getCatchAll() {
        return catchAll;
    }

    /**
     * Sets the value of the catchAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatchAll }
     *     
     */
    public void setCatchAll(CatchAll value) {
        this.catchAll = value;
    }


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
     *         &lt;element name="claymus-home" type="{}claymus-home" maxOccurs="unbounded" minOccurs="0"/>
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
        "claymusHome"
    })
    public static class ClaymusHomes {

        @XmlElement(name = "claymus-home")
        protected List<ClaymusHome> claymusHome;

        /**
         * Gets the value of the claymusHome property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the claymusHome property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClaymusHome().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClaymusHome }
         * 
         * 
         */
        public List<ClaymusHome> getClaymusHome() {
            if (claymusHome == null) {
                claymusHome = new ArrayList<ClaymusHome>();
            }
            return this.claymusHome;
        }

    }


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
     *         &lt;element name="forward" type="{}forward" maxOccurs="unbounded" minOccurs="0"/>
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
        "forward"
    })
    public static class UrlForwarding {

        protected List<Forward> forward;

        /**
         * Gets the value of the forward property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the forward property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getForward().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Forward }
         * 
         * 
         */
        public List<Forward> getForward() {
            if (forward == null) {
                forward = new ArrayList<Forward>();
            }
            return this.forward;
        }

    }

}
