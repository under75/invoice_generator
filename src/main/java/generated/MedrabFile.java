//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.14 at 02:10:51 PM GMT+04:00 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medrabFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medrabFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZGLV" type="{}medrabZglv"/&gt;
 *         &lt;element name="PERSV" type="{}medrab" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medrabFile", propOrder = {
    "zglv",
    "persv"
})
public class MedrabFile {

    @XmlElement(name = "ZGLV", required = true)
    protected MedrabZglv zglv;
    @XmlElement(name = "PERSV", required = true)
    protected List<Medrab> persv;

    /**
     * Gets the value of the zglv property.
     * 
     * @return
     *     possible object is
     *     {@link MedrabZglv }
     *     
     */
    public MedrabZglv getZGLV() {
        return zglv;
    }

    /**
     * Sets the value of the zglv property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedrabZglv }
     *     
     */
    public void setZGLV(MedrabZglv value) {
        this.zglv = value;
    }

    /**
     * Gets the value of the persv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the persv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPERSV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Medrab }
     * 
     * 
     */
    public List<Medrab> getPERSV() {
        if (persv == null) {
            persv = new ArrayList<Medrab>();
        }
        return this.persv;
    }

}
