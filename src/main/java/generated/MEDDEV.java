//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.14 at 02:42:27 PM GMT+04:00 
//


package generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MED_DEV complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MED_DEV"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATE_MED" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CODE_MEDDEV" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NUMBER_SER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MED_DEV", propOrder = {
    "datemed",
    "codemeddev",
    "numberser"
})
public class MEDDEV {

    @XmlElement(name = "DATE_MED", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datemed;
    @XmlElement(name = "CODE_MEDDEV")
    protected int codemeddev;
    @XmlElement(name = "NUMBER_SER", required = true)
    protected String numberser;

    /**
     * Gets the value of the datemed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEMED() {
        return datemed;
    }

    /**
     * Sets the value of the datemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEMED(XMLGregorianCalendar value) {
        this.datemed = value;
    }

    /**
     * Gets the value of the codemeddev property.
     * 
     */
    public int getCODEMEDDEV() {
        return codemeddev;
    }

    /**
     * Sets the value of the codemeddev property.
     * 
     */
    public void setCODEMEDDEV(int value) {
        this.codemeddev = value;
    }

    /**
     * Gets the value of the numberser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMBERSER() {
        return numberser;
    }

    /**
     * Sets the value of the numberser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMBERSER(String value) {
        this.numberser = value;
    }

}
