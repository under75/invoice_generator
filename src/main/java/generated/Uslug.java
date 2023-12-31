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
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uslug complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uslug"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDSERV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="N_s" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LPU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LPU_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PODR" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PROFIL" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="VID_VME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DET" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="DATE_IN" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DATE_OUT" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CODE_USL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KOL_USL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TARIF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SUMV_USL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MED_DEV" type="{}MED_DEV" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MR_USL_N" type="{}MR_USL_N" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PRVS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CODE_MD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NPL" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="COMENTU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LEK" type="{}LEK" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VBI" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="GILL" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="PR_UM" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="VID_TARIF" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="SUM_VIRT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="POS_DOM" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="KOL_ANEST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="KOL_DN_RE" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="SOV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOV2" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CNA_DOZ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TM_SMP" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="AIM_SMP" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="EKO" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uslug", propOrder = {
    "idserv",
    "ns",
    "lpu",
    "lpu1",
    "podr",
    "profil",
    "vidvme",
    "det",
    "datein",
    "dateout",
    "ds",
    "codeusl",
    "kolusl",
    "tarif",
    "sumvusl",
    "meddev",
    "mrusln",
    "prvs",
    "codemd",
    "npl",
    "comentu",
    "lek",
    "vbi",
    "gill",
    "prum",
    "vidtarif",
    "sumvirt",
    "posdom",
    "kolanest",
    "koldnre",
    "sov2",
    "dov2",
    "cnadoz",
    "tmsmp",
    "aimsmp",
    "eko"
})
public class Uslug {

    @XmlElement(name = "IDSERV", required = true)
    protected String idserv;
    @XmlElement(name = "N_s")
    protected Integer ns;
    @XmlElement(name = "LPU", required = true)
    protected String lpu;
    @XmlElement(name = "LPU_1")
    protected String lpu1;
    @XmlElement(name = "PODR")
    protected Long podr;
    @XmlElement(name = "PROFIL")
    protected short profil;
    @XmlElement(name = "VID_VME")
    protected String vidvme;
    @XmlElement(name = "DET")
    protected short det;
    @XmlElement(name = "DATE_IN", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datein;
    @XmlElement(name = "DATE_OUT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateout;
    @XmlElement(name = "DS", required = true)
    protected String ds;
    @XmlElement(name = "CODE_USL", required = true)
    protected String codeusl;
    @XmlElement(name = "KOL_USL", required = true)
    protected BigDecimal kolusl;
    @XmlElement(name = "TARIF")
    protected BigDecimal tarif;
    @XmlElement(name = "SUMV_USL")
    protected BigDecimal sumvusl;
    @XmlElement(name = "MED_DEV")
    protected List<MEDDEV> meddev;
    @XmlElement(name = "MR_USL_N")
    protected List<MRUSLN> mrusln;
    @XmlElement(name = "PRVS")
    protected int prvs;
    @XmlElement(name = "CODE_MD", required = true)
    protected String codemd;
    @XmlElement(name = "NPL")
    protected Short npl;
    @XmlElement(name = "COMENTU")
    protected String comentu;
    @XmlElement(name = "LEK")
    protected List<LEK> lek;
    @XmlElement(name = "VBI")
    protected Short vbi;
    @XmlElement(name = "GILL")
    protected Short gill;
    @XmlElement(name = "PR_UM")
    protected Short prum;
    @XmlElement(name = "VID_TARIF")
    protected Short vidtarif;
    @XmlElement(name = "SUM_VIRT")
    protected BigDecimal sumvirt;
    @XmlElement(name = "POS_DOM")
    protected Short posdom;
    @XmlElement(name = "KOL_ANEST")
    protected BigDecimal kolanest;
    @XmlElement(name = "KOL_DN_RE")
    protected Short koldnre;
    @XmlElement(name = "SOV2")
    protected String sov2;
    @XmlElement(name = "DOV2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dov2;
    @XmlElement(name = "CNA_DOZ")
    protected BigDecimal cnadoz;
    @XmlElement(name = "TM_SMP")
    protected Short tmsmp;
    @XmlElement(name = "AIM_SMP")
    protected Short aimsmp;
    @XmlElement(name = "EKO")
    protected Short eko;

    /**
     * Gets the value of the idserv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDSERV() {
        return idserv;
    }

    /**
     * Sets the value of the idserv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDSERV(String value) {
        this.idserv = value;
    }

    /**
     * Gets the value of the ns property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNS() {
        return ns;
    }

    /**
     * Sets the value of the ns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNS(Integer value) {
        this.ns = value;
    }

    /**
     * Gets the value of the lpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPU() {
        return lpu;
    }

    /**
     * Sets the value of the lpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPU(String value) {
        this.lpu = value;
    }

    /**
     * Gets the value of the lpu1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPU1() {
        return lpu1;
    }

    /**
     * Sets the value of the lpu1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPU1(String value) {
        this.lpu1 = value;
    }

    /**
     * Gets the value of the podr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPODR() {
        return podr;
    }

    /**
     * Sets the value of the podr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPODR(Long value) {
        this.podr = value;
    }

    /**
     * Gets the value of the profil property.
     * 
     */
    public short getPROFIL() {
        return profil;
    }

    /**
     * Sets the value of the profil property.
     * 
     */
    public void setPROFIL(short value) {
        this.profil = value;
    }

    /**
     * Gets the value of the vidvme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIDVME() {
        return vidvme;
    }

    /**
     * Sets the value of the vidvme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIDVME(String value) {
        this.vidvme = value;
    }

    /**
     * Gets the value of the det property.
     * 
     */
    public short getDET() {
        return det;
    }

    /**
     * Sets the value of the det property.
     * 
     */
    public void setDET(short value) {
        this.det = value;
    }

    /**
     * Gets the value of the datein property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEIN() {
        return datein;
    }

    /**
     * Sets the value of the datein property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEIN(XMLGregorianCalendar value) {
        this.datein = value;
    }

    /**
     * Gets the value of the dateout property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEOUT() {
        return dateout;
    }

    /**
     * Sets the value of the dateout property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEOUT(XMLGregorianCalendar value) {
        this.dateout = value;
    }

    /**
     * Gets the value of the ds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS() {
        return ds;
    }

    /**
     * Sets the value of the ds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS(String value) {
        this.ds = value;
    }

    /**
     * Gets the value of the codeusl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODEUSL() {
        return codeusl;
    }

    /**
     * Sets the value of the codeusl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODEUSL(String value) {
        this.codeusl = value;
    }

    /**
     * Gets the value of the kolusl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKOLUSL() {
        return kolusl;
    }

    /**
     * Sets the value of the kolusl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKOLUSL(BigDecimal value) {
        this.kolusl = value;
    }

    /**
     * Gets the value of the tarif property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTARIF() {
        return tarif;
    }

    /**
     * Sets the value of the tarif property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTARIF(BigDecimal value) {
        this.tarif = value;
    }

    /**
     * Gets the value of the sumvusl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSUMVUSL() {
        return sumvusl;
    }

    /**
     * Sets the value of the sumvusl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSUMVUSL(BigDecimal value) {
        this.sumvusl = value;
    }

    /**
     * Gets the value of the meddev property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the meddev property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMEDDEV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MEDDEV }
     * 
     * 
     */
    public List<MEDDEV> getMEDDEV() {
        if (meddev == null) {
            meddev = new ArrayList<MEDDEV>();
        }
        return this.meddev;
    }

    /**
     * Gets the value of the mrusln property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mrusln property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMRUSLN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MRUSLN }
     * 
     * 
     */
    public List<MRUSLN> getMRUSLN() {
        if (mrusln == null) {
            mrusln = new ArrayList<MRUSLN>();
        }
        return this.mrusln;
    }

    /**
     * Gets the value of the prvs property.
     * 
     */
    public int getPRVS() {
        return prvs;
    }

    /**
     * Sets the value of the prvs property.
     * 
     */
    public void setPRVS(int value) {
        this.prvs = value;
    }

    /**
     * Gets the value of the codemd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODEMD() {
        return codemd;
    }

    /**
     * Sets the value of the codemd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODEMD(String value) {
        this.codemd = value;
    }

    /**
     * Gets the value of the npl property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNPL() {
        return npl;
    }

    /**
     * Sets the value of the npl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNPL(Short value) {
        this.npl = value;
    }

    /**
     * Gets the value of the comentu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMENTU() {
        return comentu;
    }

    /**
     * Sets the value of the comentu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMENTU(String value) {
        this.comentu = value;
    }

    /**
     * Gets the value of the lek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLEK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LEK }
     * 
     * 
     */
    public List<LEK> getLEK() {
        if (lek == null) {
            lek = new ArrayList<LEK>();
        }
        return this.lek;
    }

    /**
     * Gets the value of the vbi property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVBI() {
        return vbi;
    }

    /**
     * Sets the value of the vbi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVBI(Short value) {
        this.vbi = value;
    }

    /**
     * Gets the value of the gill property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGILL() {
        return gill;
    }

    /**
     * Sets the value of the gill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGILL(Short value) {
        this.gill = value;
    }

    /**
     * Gets the value of the prum property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPRUM() {
        return prum;
    }

    /**
     * Sets the value of the prum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPRUM(Short value) {
        this.prum = value;
    }

    /**
     * Gets the value of the vidtarif property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVIDTARIF() {
        return vidtarif;
    }

    /**
     * Sets the value of the vidtarif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVIDTARIF(Short value) {
        this.vidtarif = value;
    }

    /**
     * Gets the value of the sumvirt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSUMVIRT() {
        return sumvirt;
    }

    /**
     * Sets the value of the sumvirt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSUMVIRT(BigDecimal value) {
        this.sumvirt = value;
    }

    /**
     * Gets the value of the posdom property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPOSDOM() {
        return posdom;
    }

    /**
     * Sets the value of the posdom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPOSDOM(Short value) {
        this.posdom = value;
    }

    /**
     * Gets the value of the kolanest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKOLANEST() {
        return kolanest;
    }

    /**
     * Sets the value of the kolanest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKOLANEST(BigDecimal value) {
        this.kolanest = value;
    }

    /**
     * Gets the value of the koldnre property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKOLDNRE() {
        return koldnre;
    }

    /**
     * Sets the value of the koldnre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKOLDNRE(Short value) {
        this.koldnre = value;
    }

    /**
     * Gets the value of the sov2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOV2() {
        return sov2;
    }

    /**
     * Sets the value of the sov2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOV2(String value) {
        this.sov2 = value;
    }

    /**
     * Gets the value of the dov2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOV2() {
        return dov2;
    }

    /**
     * Sets the value of the dov2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOV2(XMLGregorianCalendar value) {
        this.dov2 = value;
    }

    /**
     * Gets the value of the cnadoz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCNADOZ() {
        return cnadoz;
    }

    /**
     * Sets the value of the cnadoz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCNADOZ(BigDecimal value) {
        this.cnadoz = value;
    }

    /**
     * Gets the value of the tmsmp property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTMSMP() {
        return tmsmp;
    }

    /**
     * Sets the value of the tmsmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTMSMP(Short value) {
        this.tmsmp = value;
    }

    /**
     * Gets the value of the aimsmp property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAIMSMP() {
        return aimsmp;
    }

    /**
     * Sets the value of the aimsmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAIMSMP(Short value) {
        this.aimsmp = value;
    }

    /**
     * Gets the value of the eko property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEKO() {
        return eko;
    }

    /**
     * Sets the value of the eko property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEKO(Short value) {
        this.eko = value;
    }

}
