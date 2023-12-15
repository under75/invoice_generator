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
 * <p>Java class for schetZap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="schetZap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="N_ZAP" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PR_NOV" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="PACIENT" type="{}pacient"/&gt;
 *         &lt;element name="Z_SL"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IDCASE" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="USL_OK" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *                   &lt;element name="VIDPOM" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *                   &lt;element name="FOR_POM" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *                   &lt;element name="NPR_MO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EXTR" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="NPR_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="LPU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DATE_Z_1" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="DATE_Z_2" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="KD_Z" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="VNOV_M" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="RSLT" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *                   &lt;element name="ISHOD" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *                   &lt;element name="OS_SLUCH" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="VB_P" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="SL" type="{}sluch" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="IDSP" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="SUMV" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="OPLATA" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="SUMP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="SANK_IT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schetZap", propOrder = {
    "nzap",
    "prnov",
    "pacient",
    "zsl"
})
public class SchetZap {

    @XmlElement(name = "N_ZAP")
    protected int nzap;
    @XmlElement(name = "PR_NOV")
    protected short prnov;
    @XmlElement(name = "PACIENT", required = true)
    protected Pacient pacient;
    @XmlElement(name = "Z_SL", required = true)
    protected SchetZap.ZSL zsl;

    /**
     * Gets the value of the nzap property.
     * 
     */
    public int getNZAP() {
        return nzap;
    }

    /**
     * Sets the value of the nzap property.
     * 
     */
    public void setNZAP(int value) {
        this.nzap = value;
    }

    /**
     * Gets the value of the prnov property.
     * 
     */
    public short getPRNOV() {
        return prnov;
    }

    /**
     * Sets the value of the prnov property.
     * 
     */
    public void setPRNOV(short value) {
        this.prnov = value;
    }

    /**
     * Gets the value of the pacient property.
     * 
     * @return
     *     possible object is
     *     {@link Pacient }
     *     
     */
    public Pacient getPACIENT() {
        return pacient;
    }

    /**
     * Sets the value of the pacient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacient }
     *     
     */
    public void setPACIENT(Pacient value) {
        this.pacient = value;
    }

    /**
     * Gets the value of the zsl property.
     * 
     * @return
     *     possible object is
     *     {@link SchetZap.ZSL }
     *     
     */
    public SchetZap.ZSL getZSL() {
        return zsl;
    }

    /**
     * Sets the value of the zsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchetZap.ZSL }
     *     
     */
    public void setZSL(SchetZap.ZSL value) {
        this.zsl = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="IDCASE" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="USL_OK" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
     *         &lt;element name="VIDPOM" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
     *         &lt;element name="FOR_POM" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
     *         &lt;element name="NPR_MO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EXTR" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="NPR_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="LPU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="VBR" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
     *         &lt;element name="DATE_Z_1" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="DATE_Z_2" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="KD_Z" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="VNOV_M" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="RSLT" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
     *         &lt;element name="ISHOD" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
     *         &lt;element name="OS_SLUCH" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="VB_P" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="SL" type="{}sluch" maxOccurs="unbounded"/&gt;
     *         &lt;element name="IDSP" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="SUMV" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="OPLATA" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="SUMP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="SANK_IT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "idcase",
        "uslok",
        "vidpom",
        "forpom",
        "nprmo",
        "extr",
        "nprdate",
        "lpu",
        "vbr",
        "datez1",
        "datez2",
        "kdz",
        "vnovm",
        "rslt",
        "ishod",
        "ossluch",
        "vbp",
        "sl",
        "idsp",
        "sumv",
        "oplata",
        "sump",
        "sankit"
    })
    public static class ZSL {

        @XmlElement(name = "IDCASE")
        protected long idcase;
        @XmlElement(name = "USL_OK")
        protected short uslok;
        @XmlElement(name = "VIDPOM")
        protected short vidpom;
        @XmlElement(name = "FOR_POM")
        protected short forpom;
        @XmlElement(name = "NPR_MO")
        protected String nprmo;
        @XmlElement(name = "EXTR")
        protected Short extr;
        @XmlElement(name = "NPR_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar nprdate;
        @XmlElement(name = "LPU", required = true)
        protected String lpu;
        @XmlElement(name = "VBR")
        protected short vbr;
        @XmlElement(name = "DATE_Z_1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datez1;
        @XmlElement(name = "DATE_Z_2", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datez2;
        @XmlElement(name = "KD_Z")
        protected Short kdz;
        @XmlElement(name = "VNOV_M", type = Integer.class)
        protected List<Integer> vnovm;
        @XmlElement(name = "RSLT")
        protected short rslt;
        @XmlElement(name = "ISHOD")
        protected short ishod;
        @XmlElement(name = "OS_SLUCH", type = Integer.class)
        protected List<Integer> ossluch;
        @XmlElement(name = "VB_P")
        protected Short vbp;
        @XmlElement(name = "SL", required = true)
        protected List<Sluch> sl;
        @XmlElement(name = "IDSP")
        protected Short idsp;
        @XmlElement(name = "SUMV")
        protected BigDecimal sumv;
        @XmlElement(name = "OPLATA")
        protected Short oplata;
        @XmlElement(name = "SUMP")
        protected BigDecimal sump;
        @XmlElement(name = "SANK_IT")
        protected BigDecimal sankit;

        /**
         * Gets the value of the idcase property.
         * 
         */
        public long getIDCASE() {
            return idcase;
        }

        /**
         * Sets the value of the idcase property.
         * 
         */
        public void setIDCASE(long value) {
            this.idcase = value;
        }

        /**
         * Gets the value of the uslok property.
         * 
         */
        public short getUSLOK() {
            return uslok;
        }

        /**
         * Sets the value of the uslok property.
         * 
         */
        public void setUSLOK(short value) {
            this.uslok = value;
        }

        /**
         * Gets the value of the vidpom property.
         * 
         */
        public short getVIDPOM() {
            return vidpom;
        }

        /**
         * Sets the value of the vidpom property.
         * 
         */
        public void setVIDPOM(short value) {
            this.vidpom = value;
        }

        /**
         * Gets the value of the forpom property.
         * 
         */
        public short getFORPOM() {
            return forpom;
        }

        /**
         * Sets the value of the forpom property.
         * 
         */
        public void setFORPOM(short value) {
            this.forpom = value;
        }

        /**
         * Gets the value of the nprmo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNPRMO() {
            return nprmo;
        }

        /**
         * Sets the value of the nprmo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNPRMO(String value) {
            this.nprmo = value;
        }

        /**
         * Gets the value of the extr property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getEXTR() {
            return extr;
        }

        /**
         * Sets the value of the extr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setEXTR(Short value) {
            this.extr = value;
        }

        /**
         * Gets the value of the nprdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNPRDATE() {
            return nprdate;
        }

        /**
         * Sets the value of the nprdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNPRDATE(XMLGregorianCalendar value) {
            this.nprdate = value;
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
         * Gets the value of the datez1 property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATEZ1() {
            return datez1;
        }

        /**
         * Sets the value of the datez1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATEZ1(XMLGregorianCalendar value) {
            this.datez1 = value;
        }

        /**
         * Gets the value of the datez2 property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATEZ2() {
            return datez2;
        }

        /**
         * Sets the value of the datez2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATEZ2(XMLGregorianCalendar value) {
            this.datez2 = value;
        }

        /**
         * Gets the value of the kdz property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getKDZ() {
            return kdz;
        }

        /**
         * Sets the value of the kdz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setKDZ(Short value) {
            this.kdz = value;
        }

        /**
         * Gets the value of the vnovm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the vnovm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVNOVM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getVNOVM() {
            if (vnovm == null) {
                vnovm = new ArrayList<Integer>();
            }
            return this.vnovm;
        }

        /**
         * Gets the value of the rslt property.
         * 
         */
        public short getRSLT() {
            return rslt;
        }

        /**
         * Sets the value of the rslt property.
         * 
         */
        public void setRSLT(short value) {
            this.rslt = value;
        }

        /**
         * Gets the value of the ishod property.
         * 
         */
        public short getISHOD() {
            return ishod;
        }

        /**
         * Sets the value of the ishod property.
         * 
         */
        public void setISHOD(short value) {
            this.ishod = value;
        }

        /**
         * Gets the value of the ossluch property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the ossluch property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOSSLUCH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getOSSLUCH() {
            if (ossluch == null) {
                ossluch = new ArrayList<Integer>();
            }
            return this.ossluch;
        }

        /**
         * Gets the value of the vbp property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getVBP() {
            return vbp;
        }

        /**
         * Sets the value of the vbp property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setVBP(Short value) {
            this.vbp = value;
        }

        /**
         * Gets the value of the sl property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the sl property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Sluch }
         * 
         * 
         */
        public List<Sluch> getSL() {
            if (sl == null) {
                sl = new ArrayList<Sluch>();
            }
            return this.sl;
        }

        /**
         * Gets the value of the idsp property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getIDSP() {
            return idsp;
        }

        /**
         * Sets the value of the idsp property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setIDSP(Short value) {
            this.idsp = value;
        }

        /**
         * Gets the value of the sumv property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSUMV() {
            return sumv;
        }

        /**
         * Sets the value of the sumv property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSUMV(BigDecimal value) {
            this.sumv = value;
        }

        /**
         * Gets the value of the oplata property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getOPLATA() {
            return oplata;
        }

        /**
         * Sets the value of the oplata property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setOPLATA(Short value) {
            this.oplata = value;
        }

        /**
         * Gets the value of the sump property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSUMP() {
            return sump;
        }

        /**
         * Sets the value of the sump property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSUMP(BigDecimal value) {
            this.sump = value;
        }

        /**
         * Gets the value of the sankit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSANKIT() {
            return sankit;
        }

        /**
         * Sets the value of the sankit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSANKIT(BigDecimal value) {
            this.sankit = value;
        }

    }

}
