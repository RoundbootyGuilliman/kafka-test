//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.02 at 11:34:06 AM MSK 
//


package app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for DocumentsCheckData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentsCheckData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insurerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="insurerCheckInfo" type="{}CheckInfo" minOccurs="0"/&gt;
 *         &lt;element name="vehicleOwnerCheckInfo" type="{}CheckInfo" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCheckInfo" type="{}CheckInfo" minOccurs="0"/&gt;
 *         &lt;element name="driverCheckInfo" type="{}CheckInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="maintenanceCardCheckInfo" type="{}CheckInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsCheckData", propOrder = {
    "insurerId",
    "insurerCheckInfo",
    "vehicleOwnerCheckInfo",
    "vehicleCheckInfo",
    "driverCheckInfo",
    "maintenanceCardCheckInfo"
})
public class DocumentsCheckData {

    protected Long insurerId;
    protected CheckInfo insurerCheckInfo;
    protected CheckInfo vehicleOwnerCheckInfo;
    protected CheckInfo vehicleCheckInfo;
    protected List<CheckInfo> driverCheckInfo;
    protected CheckInfo maintenanceCardCheckInfo;

    /**
     * Gets the value of the insurerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsurerId() {
        return insurerId;
    }

    /**
     * Sets the value of the insurerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsurerId(Long value) {
        this.insurerId = value;
    }

    /**
     * Gets the value of the insurerCheckInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CheckInfo }
     *     
     */
    public CheckInfo getInsurerCheckInfo() {
        return insurerCheckInfo;
    }

    /**
     * Sets the value of the insurerCheckInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInfo }
     *     
     */
    public void setInsurerCheckInfo(CheckInfo value) {
        this.insurerCheckInfo = value;
    }

    /**
     * Gets the value of the vehicleOwnerCheckInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CheckInfo }
     *     
     */
    public CheckInfo getVehicleOwnerCheckInfo() {
        return vehicleOwnerCheckInfo;
    }

    /**
     * Sets the value of the vehicleOwnerCheckInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInfo }
     *     
     */
    public void setVehicleOwnerCheckInfo(CheckInfo value) {
        this.vehicleOwnerCheckInfo = value;
    }

    /**
     * Gets the value of the vehicleCheckInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CheckInfo }
     *     
     */
    public CheckInfo getVehicleCheckInfo() {
        return vehicleCheckInfo;
    }

    /**
     * Sets the value of the vehicleCheckInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInfo }
     *     
     */
    public void setVehicleCheckInfo(CheckInfo value) {
        this.vehicleCheckInfo = value;
    }

    /**
     * Gets the value of the driverCheckInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverCheckInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverCheckInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckInfo }
     * 
     * 
     */
    public List<CheckInfo> getDriverCheckInfo() {
        if (driverCheckInfo == null) {
            driverCheckInfo = new ArrayList<CheckInfo>();
        }
        return this.driverCheckInfo;
    }

    /**
     * Gets the value of the maintenanceCardCheckInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CheckInfo }
     *     
     */
    public CheckInfo getMaintenanceCardCheckInfo() {
        return maintenanceCardCheckInfo;
    }

    /**
     * Sets the value of the maintenanceCardCheckInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInfo }
     *     
     */
    public void setMaintenanceCardCheckInfo(CheckInfo value) {
        this.maintenanceCardCheckInfo = value;
    }

}
