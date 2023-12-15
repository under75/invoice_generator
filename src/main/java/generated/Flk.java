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
 * <p>Java class for flk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flk"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FNAME_I" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PR" type="{}flkPr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flk", propOrder = {
    "fname",
    "fnamei",
    "pr"
})
public class Flk {

    @XmlElement(name = "FNAME", required = true)
    protected String fname;
    @XmlElement(name = "FNAME_I", required = true)
    protected String fnamei;
    @XmlElement(name = "PR")
    protected List<FlkPr> pr;

    /**
     * Gets the value of the fname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNAME() {
        return fname;
    }

    /**
     * Sets the value of the fname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNAME(String value) {
        this.fname = value;
    }

    /**
     * Gets the value of the fnamei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNAMEI() {
        return fnamei;
    }

    /**
     * Sets the value of the fnamei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNAMEI(String value) {
        this.fnamei = value;
    }

    /**
     * Gets the value of the pr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlkPr }
     * 
     * 
     */
    public List<FlkPr> getPR() {
        if (pr == null) {
            pr = new ArrayList<FlkPr>();
        }
        return this.pr;
    }

}