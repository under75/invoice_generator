//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.14 at 02:16:38 PM GMT+04:00 
//


package generated;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SL_KOEF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SL_KOEF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDSL" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Z_SL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SL_KOEF", propOrder = {
    "idsl",
    "zsl"
})
public class SLKOEF {

    @XmlElement(name = "IDSL")
    protected short idsl;
    @XmlElement(name = "Z_SL")
    protected BigDecimal zsl;

    /**
     * Gets the value of the idsl property.
     * 
     */
    public short getIDSL() {
        return idsl;
    }

    /**
     * Sets the value of the idsl property.
     * 
     */
    public void setIDSL(short value) {
        this.idsl = value;
    }

    /**
     * Gets the value of the zsl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZSL() {
        return zsl;
    }

    /**
     * Sets the value of the zsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZSL(BigDecimal value) {
        this.zsl = value;
    }

}
