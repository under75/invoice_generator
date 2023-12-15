//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.14 at 02:16:38 PM GMT+04:00 
//


package generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for B_DIAG complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B_DIAG"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DIAG_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DIAG_TIP" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="DIAG_CODE" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="DIAG_RSLT" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="REC_RSLT" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B_DIAG", propOrder = {
    "diagdate",
    "diagtip",
    "diagcode",
    "diagrslt",
    "recrslt"
})
public class BDIAG {

    @XmlElement(name = "DIAG_DATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar diagdate;
    @XmlElement(name = "DIAG_TIP")
    protected short diagtip;
    @XmlElement(name = "DIAG_CODE")
    protected short diagcode;
    @XmlElement(name = "DIAG_RSLT")
    protected Short diagrslt;
    @XmlElement(name = "REC_RSLT")
    protected Short recrslt;

    /**
     * Gets the value of the diagdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDIAGDATE() {
        return diagdate;
    }

    /**
     * Sets the value of the diagdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDIAGDATE(XMLGregorianCalendar value) {
        this.diagdate = value;
    }

    /**
     * Gets the value of the diagtip property.
     * 
     */
    public short getDIAGTIP() {
        return diagtip;
    }

    /**
     * Sets the value of the diagtip property.
     * 
     */
    public void setDIAGTIP(short value) {
        this.diagtip = value;
    }

    /**
     * Gets the value of the diagcode property.
     * 
     */
    public short getDIAGCODE() {
        return diagcode;
    }

    /**
     * Sets the value of the diagcode property.
     * 
     */
    public void setDIAGCODE(short value) {
        this.diagcode = value;
    }

    /**
     * Gets the value of the diagrslt property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDIAGRSLT() {
        return diagrslt;
    }

    /**
     * Sets the value of the diagrslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDIAGRSLT(Short value) {
        this.diagrslt = value;
    }

    /**
     * Gets the value of the recrslt property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRECRSLT() {
        return recrslt;
    }

    /**
     * Sets the value of the recrslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRECRSLT(Short value) {
        this.recrslt = value;
    }

}
