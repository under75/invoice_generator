//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.14 at 02:16:38 PM GMT+04:00 
//


package generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KSG_KPG complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KSG_KPG"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="N_KSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VER_KSG" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="KSG_PG" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="N_KPG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KOEF_Z" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="KOEF_UP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BZTSZ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="KOEF_D" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="KOEF_U" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CRIT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SL_K" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="IT_SL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SL_KOEF" type="{}SL_KOEF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KSG_KPG", propOrder = {
    "nksg",
    "verksg",
    "ksgpg",
    "nkpg",
    "koefz",
    "koefup",
    "bztsz",
    "koefd",
    "koefu",
    "crit",
    "slk",
    "itsl",
    "slkoef"
})
public class KSGKPG {

    @XmlElement(name = "N_KSG")
    protected String nksg;
    @XmlElement(name = "VER_KSG")
    protected Short verksg;
    @XmlElement(name = "KSG_PG")
    protected Short ksgpg;
    @XmlElement(name = "N_KPG")
    protected String nkpg;
    @XmlElement(name = "KOEF_Z")
    protected BigDecimal koefz;
    @XmlElement(name = "KOEF_UP")
    protected BigDecimal koefup;
    @XmlElement(name = "BZTSZ")
    protected BigDecimal bztsz;
    @XmlElement(name = "KOEF_D")
    protected BigDecimal koefd;
    @XmlElement(name = "KOEF_U")
    protected BigDecimal koefu;
    @XmlElement(name = "CRIT")
    protected List<String> crit;
    @XmlElement(name = "SL_K")
    protected short slk;
    @XmlElement(name = "IT_SL")
    protected BigDecimal itsl;
    @XmlElement(name = "SL_KOEF")
    protected List<SLKOEF> slkoef;

    /**
     * Gets the value of the nksg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNKSG() {
        return nksg;
    }

    /**
     * Sets the value of the nksg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNKSG(String value) {
        this.nksg = value;
    }

    /**
     * Gets the value of the verksg property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVERKSG() {
        return verksg;
    }

    /**
     * Sets the value of the verksg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVERKSG(Short value) {
        this.verksg = value;
    }

    /**
     * Gets the value of the ksgpg property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKSGPG() {
        return ksgpg;
    }

    /**
     * Sets the value of the ksgpg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKSGPG(Short value) {
        this.ksgpg = value;
    }

    /**
     * Gets the value of the nkpg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNKPG() {
        return nkpg;
    }

    /**
     * Sets the value of the nkpg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNKPG(String value) {
        this.nkpg = value;
    }

    /**
     * Gets the value of the koefz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKOEFZ() {
        return koefz;
    }

    /**
     * Sets the value of the koefz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKOEFZ(BigDecimal value) {
        this.koefz = value;
    }

    /**
     * Gets the value of the koefup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKOEFUP() {
        return koefup;
    }

    /**
     * Sets the value of the koefup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKOEFUP(BigDecimal value) {
        this.koefup = value;
    }

    /**
     * Gets the value of the bztsz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBZTSZ() {
        return bztsz;
    }

    /**
     * Sets the value of the bztsz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBZTSZ(BigDecimal value) {
        this.bztsz = value;
    }

    /**
     * Gets the value of the koefd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKOEFD() {
        return koefd;
    }

    /**
     * Sets the value of the koefd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKOEFD(BigDecimal value) {
        this.koefd = value;
    }

    /**
     * Gets the value of the koefu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKOEFU() {
        return koefu;
    }

    /**
     * Sets the value of the koefu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKOEFU(BigDecimal value) {
        this.koefu = value;
    }

    /**
     * Gets the value of the crit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the crit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCRIT() {
        if (crit == null) {
            crit = new ArrayList<String>();
        }
        return this.crit;
    }

    /**
     * Gets the value of the slk property.
     * 
     */
    public short getSLK() {
        return slk;
    }

    /**
     * Sets the value of the slk property.
     * 
     */
    public void setSLK(short value) {
        this.slk = value;
    }

    /**
     * Gets the value of the itsl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getITSL() {
        return itsl;
    }

    /**
     * Sets the value of the itsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setITSL(BigDecimal value) {
        this.itsl = value;
    }

    /**
     * Gets the value of the slkoef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the slkoef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSLKOEF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SLKOEF }
     * 
     * 
     */
    public List<SLKOEF> getSLKOEF() {
        if (slkoef == null) {
            slkoef = new ArrayList<SLKOEF>();
        }
        return this.slkoef;
    }

}
