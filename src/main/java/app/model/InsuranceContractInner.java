//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.02 at 11:34:06 AM MSK 
//


package app.model;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for InsuranceContractInner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceContractInner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classifiedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="closingType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="contractClosingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="contractEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="contractSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverLimitIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="premiumAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="premiumSynchDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="primaryDrivingArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purposeCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="rates" type="{}Rates"/&gt;
 *         &lt;element name="registrationTransitIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="revisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="stoas" type="{}Stoas" maxOccurs="unbounded"/&gt;
 *         &lt;element name="trailerIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="utilisationPeriod1Begin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="utilisationPeriod1End" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="utilisationPeriod2Begin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="utilisationPeriod2End" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceContractInner", propOrder = {
    "classifiedIndicator",
    "closingType",
    "contractClosingDate",
    "contractEffectiveDate",
    "contractNumber",
    "contractSeries",
    "driverLimitIndicator",
    "expirationDate",
    "premiumAmount",
    "premiumSynchDate",
    "primaryDrivingArea",
    "purposeCode",
    "rates",
    "registrationTransitIndicator",
    "revisionDate",
    "stoas",
    "trailerIndicator",
    "utilisationPeriod1Begin",
    "utilisationPeriod1End",
    "utilisationPeriod2Begin",
    "utilisationPeriod2End"
})
public class InsuranceContractInner {

    protected String classifiedIndicator;
    protected Long closingType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractClosingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractEffectiveDate;
    protected Long contractNumber;
    protected String contractSeries;
    protected String driverLimitIndicator;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected BigDecimal premiumAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar premiumSynchDate;
    protected String primaryDrivingArea;
    protected Long purposeCode;
    @XmlElement(required = true)
    protected Rates rates;
    protected String registrationTransitIndicator;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revisionDate;
    @XmlElement(required = true)
    protected List<Stoas> stoas;
    protected String trailerIndicator;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utilisationPeriod1Begin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utilisationPeriod1End;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utilisationPeriod2Begin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utilisationPeriod2End;

    /**
     * Gets the value of the classifiedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassifiedIndicator() {
        return classifiedIndicator;
    }

    /**
     * Sets the value of the classifiedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassifiedIndicator(String value) {
        this.classifiedIndicator = value;
    }

    /**
     * Gets the value of the closingType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClosingType() {
        return closingType;
    }

    /**
     * Sets the value of the closingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClosingType(Long value) {
        this.closingType = value;
    }

    /**
     * Gets the value of the contractClosingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractClosingDate() {
        return contractClosingDate;
    }

    /**
     * Sets the value of the contractClosingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractClosingDate(XMLGregorianCalendar value) {
        this.contractClosingDate = value;
    }

    /**
     * Gets the value of the contractEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEffectiveDate() {
        return contractEffectiveDate;
    }

    /**
     * Sets the value of the contractEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEffectiveDate(XMLGregorianCalendar value) {
        this.contractEffectiveDate = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractNumber(Long value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the contractSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractSeries() {
        return contractSeries;
    }

    /**
     * Sets the value of the contractSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractSeries(String value) {
        this.contractSeries = value;
    }

    /**
     * Gets the value of the driverLimitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverLimitIndicator() {
        return driverLimitIndicator;
    }

    /**
     * Sets the value of the driverLimitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverLimitIndicator(String value) {
        this.driverLimitIndicator = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the premiumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPremiumAmount() {
        return premiumAmount;
    }

    /**
     * Sets the value of the premiumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPremiumAmount(BigDecimal value) {
        this.premiumAmount = value;
    }

    /**
     * Gets the value of the premiumSynchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPremiumSynchDate() {
        return premiumSynchDate;
    }

    /**
     * Sets the value of the premiumSynchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPremiumSynchDate(XMLGregorianCalendar value) {
        this.premiumSynchDate = value;
    }

    /**
     * Gets the value of the primaryDrivingArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryDrivingArea() {
        return primaryDrivingArea;
    }

    /**
     * Sets the value of the primaryDrivingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryDrivingArea(String value) {
        this.primaryDrivingArea = value;
    }

    /**
     * Gets the value of the purposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurposeCode() {
        return purposeCode;
    }

    /**
     * Sets the value of the purposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurposeCode(Long value) {
        this.purposeCode = value;
    }

    /**
     * Gets the value of the rates property.
     * 
     * @return
     *     possible object is
     *     {@link Rates }
     *     
     */
    public Rates getRates() {
        return rates;
    }

    /**
     * Sets the value of the rates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rates }
     *     
     */
    public void setRates(Rates value) {
        this.rates = value;
    }

    /**
     * Gets the value of the registrationTransitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationTransitIndicator() {
        return registrationTransitIndicator;
    }

    /**
     * Sets the value of the registrationTransitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationTransitIndicator(String value) {
        this.registrationTransitIndicator = value;
    }

    /**
     * Gets the value of the revisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevisionDate() {
        return revisionDate;
    }

    /**
     * Sets the value of the revisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevisionDate(XMLGregorianCalendar value) {
        this.revisionDate = value;
    }

    /**
     * Gets the value of the stoas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stoas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stoas }
     * 
     * 
     */
    public List<Stoas> getStoas() {
        if (stoas == null) {
            stoas = new ArrayList<Stoas>();
        }
        return this.stoas;
    }

    /**
     * Gets the value of the trailerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerIndicator() {
        return trailerIndicator;
    }

    /**
     * Sets the value of the trailerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerIndicator(String value) {
        this.trailerIndicator = value;
    }

    /**
     * Gets the value of the utilisationPeriod1Begin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtilisationPeriod1Begin() {
        return utilisationPeriod1Begin;
    }

    /**
     * Sets the value of the utilisationPeriod1Begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtilisationPeriod1Begin(XMLGregorianCalendar value) {
        this.utilisationPeriod1Begin = value;
    }

    /**
     * Gets the value of the utilisationPeriod1End property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtilisationPeriod1End() {
        return utilisationPeriod1End;
    }

    /**
     * Sets the value of the utilisationPeriod1End property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtilisationPeriod1End(XMLGregorianCalendar value) {
        this.utilisationPeriod1End = value;
    }

    /**
     * Gets the value of the utilisationPeriod2Begin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtilisationPeriod2Begin() {
        return utilisationPeriod2Begin;
    }

    /**
     * Sets the value of the utilisationPeriod2Begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtilisationPeriod2Begin(XMLGregorianCalendar value) {
        this.utilisationPeriod2Begin = value;
    }

    /**
     * Gets the value of the utilisationPeriod2End property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtilisationPeriod2End() {
        return utilisationPeriod2End;
    }

    /**
     * Sets the value of the utilisationPeriod2End property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtilisationPeriod2End(XMLGregorianCalendar value) {
        this.utilisationPeriod2End = value;
    }

}
