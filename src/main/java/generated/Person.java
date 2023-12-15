//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.14 at 02:10:51 PM GMT+04:00 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_PAC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="W" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="DR" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DOST" type="{http://www.w3.org/2001/XMLSchema}short" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FAM_P" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IM_P" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OT_P" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="W_P" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="DR_P" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DOST_P" type="{http://www.w3.org/2001/XMLSchema}short" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DOCORG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SNILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OKATOG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OKATOP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMENTP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GRZ1" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="SRB" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
    "idpac",
    "fam",
    "im",
    "ot",
    "w",
    "dr",
    "dost",
    "tel",
    "famp",
    "imp",
    "otp",
    "wp",
    "drp",
    "dostp",
    "mr",
    "doctype",
    "docser",
    "docnum",
    "docdate",
    "docorg",
    "snils",
    "okatog",
    "okatop",
    "comentp",
    "grz1",
    "srb"
})
public class Person {

    @XmlElement(name = "ID_PAC", required = true)
    protected String idpac;
    @XmlElement(name = "FAM")
    protected String fam;
    @XmlElement(name = "IM")
    protected String im;
    @XmlElement(name = "OT")
    protected String ot;
    @XmlElement(name = "W")
    protected short w;
    @XmlElement(name = "DR", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dr;
    @XmlElement(name = "DOST", type = Short.class)
    protected List<Short> dost;
    @XmlElement(name = "TEL")
    protected String tel;
    @XmlElement(name = "FAM_P")
    protected String famp;
    @XmlElement(name = "IM_P")
    protected String imp;
    @XmlElement(name = "OT_P")
    protected String otp;
    @XmlElement(name = "W_P")
    protected Short wp;
    @XmlElement(name = "DR_P")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar drp;
    @XmlElement(name = "DOST_P", type = Short.class)
    protected List<Short> dostp;
    @XmlElement(name = "MR")
    protected String mr;
    @XmlElement(name = "DOCTYPE")
    protected String doctype;
    @XmlElement(name = "DOCSER")
    protected String docser;
    @XmlElement(name = "DOCNUM")
    protected String docnum;
    @XmlElement(name = "DOCDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docdate;
    @XmlElement(name = "DOCORG")
    protected String docorg;
    @XmlElement(name = "SNILS")
    protected String snils;
    @XmlElement(name = "OKATOG")
    protected String okatog;
    @XmlElement(name = "OKATOP")
    protected String okatop;
    @XmlElement(name = "COMENTP")
    protected String comentp;
    @XmlElement(name = "GRZ1")
    protected Short grz1;
    @XmlElement(name = "SRB")
    protected Short srb;

    /**
     * Gets the value of the idpac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPAC() {
        return idpac;
    }

    /**
     * Sets the value of the idpac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPAC(String value) {
        this.idpac = value;
    }

    /**
     * Gets the value of the fam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAM() {
        return fam;
    }

    /**
     * Sets the value of the fam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAM(String value) {
        this.fam = value;
    }

    /**
     * Gets the value of the im property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIM() {
        return im;
    }

    /**
     * Sets the value of the im property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIM(String value) {
        this.im = value;
    }

    /**
     * Gets the value of the ot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOT() {
        return ot;
    }

    /**
     * Sets the value of the ot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOT(String value) {
        this.ot = value;
    }

    /**
     * Gets the value of the w property.
     * 
     */
    public short getW() {
        return w;
    }

    /**
     * Sets the value of the w property.
     * 
     */
    public void setW(short value) {
        this.w = value;
    }

    /**
     * Gets the value of the dr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDR() {
        return dr;
    }

    /**
     * Sets the value of the dr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDR(XMLGregorianCalendar value) {
        this.dr = value;
    }

    /**
     * Gets the value of the dost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Short }
     * 
     * 
     */
    public List<Short> getDOST() {
        if (dost == null) {
            dost = new ArrayList<Short>();
        }
        return this.dost;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEL() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEL(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the famp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAMP() {
        return famp;
    }

    /**
     * Sets the value of the famp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAMP(String value) {
        this.famp = value;
    }

    /**
     * Gets the value of the imp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMP() {
        return imp;
    }

    /**
     * Sets the value of the imp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMP(String value) {
        this.imp = value;
    }

    /**
     * Gets the value of the otp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTP() {
        return otp;
    }

    /**
     * Sets the value of the otp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTP(String value) {
        this.otp = value;
    }

    /**
     * Gets the value of the wp property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWP() {
        return wp;
    }

    /**
     * Sets the value of the wp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWP(Short value) {
        this.wp = value;
    }

    /**
     * Gets the value of the drp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDRP() {
        return drp;
    }

    /**
     * Sets the value of the drp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDRP(XMLGregorianCalendar value) {
        this.drp = value;
    }

    /**
     * Gets the value of the dostp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dostp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOSTP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Short }
     * 
     * 
     */
    public List<Short> getDOSTP() {
        if (dostp == null) {
            dostp = new ArrayList<Short>();
        }
        return this.dostp;
    }

    /**
     * Gets the value of the mr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMR() {
        return mr;
    }

    /**
     * Sets the value of the mr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMR(String value) {
        this.mr = value;
    }

    /**
     * Gets the value of the doctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCTYPE() {
        return doctype;
    }

    /**
     * Sets the value of the doctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCTYPE(String value) {
        this.doctype = value;
    }

    /**
     * Gets the value of the docser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCSER() {
        return docser;
    }

    /**
     * Sets the value of the docser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCSER(String value) {
        this.docser = value;
    }

    /**
     * Gets the value of the docnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCNUM() {
        return docnum;
    }

    /**
     * Sets the value of the docnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCNUM(String value) {
        this.docnum = value;
    }

    /**
     * Gets the value of the docdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOCDATE() {
        return docdate;
    }

    /**
     * Sets the value of the docdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOCDATE(XMLGregorianCalendar value) {
        this.docdate = value;
    }

    /**
     * Gets the value of the docorg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCORG() {
        return docorg;
    }

    /**
     * Sets the value of the docorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCORG(String value) {
        this.docorg = value;
    }

    /**
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNILS() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNILS(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the okatog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKATOG() {
        return okatog;
    }

    /**
     * Sets the value of the okatog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKATOG(String value) {
        this.okatog = value;
    }

    /**
     * Gets the value of the okatop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKATOP() {
        return okatop;
    }

    /**
     * Sets the value of the okatop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKATOP(String value) {
        this.okatop = value;
    }

    /**
     * Gets the value of the comentp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMENTP() {
        return comentp;
    }

    /**
     * Sets the value of the comentp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMENTP(String value) {
        this.comentp = value;
    }

    /**
     * Gets the value of the grz1 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGRZ1() {
        return grz1;
    }

    /**
     * Sets the value of the grz1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGRZ1(Short value) {
        this.grz1 = value;
    }

    /**
     * Gets the value of the srb property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSRB() {
        return srb;
    }

    /**
     * Sets the value of the srb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSRB(Short value) {
        this.srb = value;
    }

}
