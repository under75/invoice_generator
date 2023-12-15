//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.14 at 02:10:51 PM GMT+04:00 
//


package generated;

import javax.xml.namespace.QName;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FLKP_QNAME = new QName("", "FLK_P");
    private final static QName _VRLIST_QNAME = new QName("", "VR_LIST");
    private final static QName _PERSLIST_QNAME = new QName("", "PERS_LIST");
    private final static QName _ZLLIST_QNAME = new QName("", "ZL_LIST");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Flk }
     * 
     */
    public Flk createFlk() {
        return new Flk();
    }

    /**
     * Create an instance of {@link MedrabFile }
     * 
     */
    public MedrabFile createMedrabFile() {
        return new MedrabFile();
    }

    /**
     * Create an instance of {@link PersonFile }
     * 
     */
    public PersonFile createPersonFile() {
        return new PersonFile();
    }

    /**
     * Create an instance of {@link FlkPr }
     * 
     */
    public FlkPr createFlkPr() {
        return new FlkPr();
    }

    /**
     * Create an instance of {@link MedrabZglv }
     * 
     */
    public MedrabZglv createMedrabZglv() {
        return new MedrabZglv();
    }

    /**
     * Create an instance of {@link Medrab }
     * 
     */
    public Medrab createMedrab() {
        return new Medrab();
    }

    /**
     * Create an instance of {@link PersonZglv }
     * 
     */
    public PersonZglv createPersonZglv() {
        return new PersonZglv();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Flk }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Flk }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "FLK_P")
    public JAXBElement<Flk> createFLKP(Flk value) {
        return new JAXBElement<Flk>(_FLKP_QNAME, Flk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedrabFile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MedrabFile }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "VR_LIST")
    public JAXBElement<MedrabFile> createVRLIST(MedrabFile value) {
        return new JAXBElement<MedrabFile>(_VRLIST_QNAME, MedrabFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonFile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonFile }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PERS_LIST")
    public JAXBElement<PersonFile> createPERSLIST(PersonFile value) {
        return new JAXBElement<PersonFile>(_PERSLIST_QNAME, PersonFile.class, null, value);
    }
    
    /**
     * Create an instance of {@link SchetZap }
     * 
     */
    public SchetZap createSchetZap() {
        return new SchetZap();
    }

    /**
     * Create an instance of {@link SvedMedpom }
     * 
     */
    public SvedMedpom createSvedMedpom() {
        return new SvedMedpom();
    }

    /**
     * Create an instance of {@link Schet }
     * 
     */
	public Schet createSchet() {
        return new Schet();
    }

    /**
     * Create an instance of {@link Pacient }
     * 
     */
    public Pacient createPacient() {
        return new Pacient();
    }

    /**
     * Create an instance of {@link Sluch }
     * 
     */
    public Sluch createSluch() {
        return new Sluch();
    }

    /**
     * Create an instance of {@link Uslug }
     * 
     */
    public Uslug createUslug() {
        return new Uslug();
    }

    /**
     * Create an instance of {@link NAPR }
     * 
     */
    public NAPR createNAPR() {
        return new NAPR();
    }

    /**
     * Create an instance of {@link CONS }
     * 
     */
    public CONS createCONS() {
        return new CONS();
    }

    /**
     * Create an instance of {@link OnkSl }
     * 
     */
    public OnkSl createOnkSl() {
        return new OnkSl();
    }

    /**
     * Create an instance of {@link BDIAG }
     * 
     */
    public BDIAG createBDIAG() {
        return new BDIAG();
    }

    /**
     * Create an instance of {@link BPROT }
     * 
     */
    public BPROT createBPROT() {
        return new BPROT();
    }

    /**
     * Create an instance of {@link ONKUSL }
     * 
     */
    public ONKUSL createONKUSL() {
        return new ONKUSL();
    }

    /**
     * Create an instance of {@link LEKPR }
     * 
     */
    public LEKPR createLEKPR() {
        return new LEKPR();
    }

    /**
     * Create an instance of {@link KSGKPG }
     * 
     */
    public KSGKPG createKSGKPG() {
        return new KSGKPG();
    }

    /**
     * Create an instance of {@link SLKOEF }
     * 
     */
    public SLKOEF createSLKOEF() {
        return new SLKOEF();
    }

    /**
     * Create an instance of {@link LEK }
     * 
     */
    public LEK createLEK() {
        return new LEK();
    }

    /**
     * Create an instance of {@link Zglv }
     * 
     */
    public Zglv createZglv() {
        return new Zglv();
    }

    /**
     * Create an instance of {@link SchetZap.ZSL }
     * 
     */
    public SchetZap.ZSL createSchetZapZSL() {
        return new SchetZap.ZSL();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvedMedpom }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SvedMedpom }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ZL_LIST")
    public JAXBElement<SvedMedpom> createZLLIST(SvedMedpom value) {
        return new JAXBElement<SvedMedpom>(_ZLLIST_QNAME, SvedMedpom.class, null, value);
    }


}
