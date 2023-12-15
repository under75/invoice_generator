//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.14 at 02:42:27 PM GMT+04:00 
//


package generated;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LEK_DOSE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LEK_DOSE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ED_IZM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DOSE_INJ" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="METHOD_INJ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="COL_INJ" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LEK_DOSE", propOrder = {
    "edizm",
    "doseinj",
    "methodinj",
    "colinj"
})
public class LEKDOSE {

    @XmlElement(name = "ED_IZM", required = true)
    protected String edizm;
    @XmlElement(name = "DOSE_INJ", required = true)
    protected BigDecimal doseinj;
    @XmlElement(name = "METHOD_INJ", required = true)
    protected String methodinj;
    @XmlElement(name = "COL_INJ")
    protected int colinj;

    /**
     * Gets the value of the edizm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDIZM() {
        return edizm;
    }

    /**
     * Sets the value of the edizm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDIZM(String value) {
        this.edizm = value;
    }

    /**
     * Gets the value of the doseinj property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDOSEINJ() {
        return doseinj;
    }

    /**
     * Sets the value of the doseinj property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDOSEINJ(BigDecimal value) {
        this.doseinj = value;
    }

    /**
     * Gets the value of the methodinj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMETHODINJ() {
        return methodinj;
    }

    /**
     * Sets the value of the methodinj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMETHODINJ(String value) {
        this.methodinj = value;
    }

    /**
     * Gets the value of the colinj property.
     * 
     */
    public int getCOLINJ() {
        return colinj;
    }

    /**
     * Sets the value of the colinj property.
     * 
     */
    public void setCOLINJ(int value) {
        this.colinj = value;
    }

}