package ru.sartfoms.invoicegenerator.validator;

import java.time.LocalDate;
import java.util.Collection;

import javax.xml.datatype.DatatypeConstants;

import org.springframework.stereotype.Component;

import generated.Flk;
import generated.FlkPr;
import generated.MedrabFile;
import generated.Pacient;
import generated.Person;
import generated.PersonFile;
import generated.SchetZap;
import generated.SvedMedpom;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuple4;
import ru.sartfoms.invoicegenerator.entity.F011;
import ru.sartfoms.invoicegenerator.service.F011Service;

@Component
public class Q015ValidatorL {
	private final F011Service f011Service;

	public Q015ValidatorL(F011Service f011Service) {
		this.f011Service = f011Service;
	}

	public void validate(
			Tuple4<Tuple2<PersonFile, String>, Tuple2<MedrabFile, String>, Tuple2<SvedMedpom, String>, Flk> m) {

		Collection<FlkPr> prs = m.getT4().getPR();
		PersonFile personFile = m.getT1().getT1();
		
		m.getT1().getT1().getPERS().forEach(p -> {
			
			SchetZap schetZap = m.getT3().getT1().getZAP().stream()
					.filter(z -> z.getPACIENT().getIDPAC().equals(p.getIDPAC())).findAny().get();
			Pacient pacient = schetZap.getPACIENT();
			
			// 001F.00.0700
			_001F_00_0700(p, prs);

			// 001F.00.0710
			_001F_00_0710(p, prs, pacient);

			// 001F.00.0720
			_001F_00_0720(p, prs, pacient);

			// 002F.00.0540
			_002F_00_0540(p, prs, pacient);

			// 002F.00.0550
			_002F_00_0550(p, prs, pacient);

			// 003F.00.0330
			_003F_00_0330(p, prs, pacient);

			// 003F.00.0340
			_003F_00_0340(p, prs, pacient);

			// 003F.00.1530
			_003F_00_1530(p, prs, pacient);

			// 003F.00.1540
			_003F_00_1540(p, prs, pacient);

			// 003F.00.1550
			_003F_00_1550(p, prs, pacient);

			// 003F.00.1560
			_003F_00_1560(p, prs, pacient);

			// 003F.00.1570
			_003F_00_1570(p, prs, pacient);

			// 003F.00.1580
			_003F_00_1580(p, prs, pacient);

			// 003F.00.1590
			_003F_00_1590(p, prs, pacient);

			// 003F.00.1600
			_003F_00_1600(p, prs, pacient);

			// 003F.00.1610
			_003F_00_1610(p, prs, pacient);

			// 003F.00.1620
			_003F_00_1620(p, prs, pacient);

			// 003F.00.1630
			_003F_00_1630(p, prs, pacient);

			// 003F.00.1640
			_003F_00_1640(p, prs, pacient);

			// 003F.00.1650
			_003F_00_1650(p, prs, pacient);

			// 003F.00.1660
			_003F_00_1660(p, prs, pacient);

			// 003F.00.1670
			_003F_00_1670(p, prs, pacient);

			// 003F.00.1680
			_003F_00_1680(p, prs, pacient);

			// 003F.00.1690
			_003F_00_1690(p, prs, pacient);

			// 003F.00.1700
			_003F_00_1700(p, prs, pacient);

			// 003F.00.1710
			_003F_00_1710(p, prs, m.getT3().getT2());

			// 003F.00.1720
			_003F_00_1720(p, prs, pacient);

			// 003F.00.1730
			_003F_00_1730(p, prs, pacient);

			// 003F.00.1740
			_003F_00_1740(p, prs, pacient);
			
			// 003F.00.1970
			_003F_00_1970(m.getT1(), prs, pacient);

			// 003F.00.3080
			_003F_00_3080(p, prs);

			// 003F.00.3090
			_003F_00_3090(p, prs);

			// 003F.00.3100
			_003F_00_3100(p, prs);

			// 004F.00.1570
			_004F_00_1570(p, prs);

			// 004F.00.1580
			_004F_00_1580(p, prs);

			// 004F.00.1590
			_004F_00_1590(p, prs);

			// 004F.00.1600
			_004F_00_1600(p, prs);

			// 004F.00.1610
			_004F_00_1610(p, prs);

			// 004F.00.1620
			_004F_00_1620(p, prs);

			// 004F.00.1630
			_004F_00_1630(p, prs);

			// 004F.00.1640
			_004F_00_1640(p, prs);

			// 004F.00.1650
			_004F_00_1650(p, prs);

			// 004F.00.1660
			_004F_00_1660(p, prs);

			// 004F.00.1670
			_004F_00_1670(p, prs);

			// 004F.00.1680
			_004F_00_1680(p, prs);

			// 004F.00.1690
			_004F_00_1690(p, prs);

			// 004F.00.1700
			_004F_00_1700(p, prs, pacient);

			// 004F.00.1710
			_004F_00_1710(p, prs, pacient);

			// 004F.00.1720
			_004F_00_1720(p, prs);

			// 004F.00.1730
			_004F_00_1730(p, prs);

			// 004F.00.1740
			_004F_00_1740(p, prs);

			// 004F.00.1750
			_004F_00_1750(p, prs);

			//006F.00.0040
			
			//006F.00.0060
			
			//006F.00.0670
			_006F_00_0670(personFile, prs, p);
			
			//006F.00.0680
			_006F_00_0680(schetZap, prs, p);
			
			//006F.00.0690
			_006F_00_0690(prs, p);
		});
		
		// 003F.00.1990
		_003F_00_1990(personFile, prs, m.getT3().getT1());

		// 003F.00.3060
		_003F_00_3060(personFile, prs);

		// 003F.00.3070
		_003F_00_3070(personFile, prs);
		
		// 004F.00.0030
		_004F_00_0030(personFile, prs);
		
		// 004F.00.1760
		_004F_00_1760(personFile, prs);

		// 004F.00.1770
		_004F_00_1770(personFile, prs);

		// 004F.00.1780
		_004F_00_1780(personFile, prs);

		// 006F.00.0020
		_006F_00_0020(personFile, prs);
		
		//006F.00.0080
		_006F_00_0080(personFile, prs, m.getT3().getT1().getSCHET().getYEAR());
		
		//006F.00.0100
		_006F_00_0100(personFile, prs, m.getT3().getT1().getSCHET().getMONTH());

	}

	private void _001F_00_0700(Person p, Collection<FlkPr> prs) {
		if (!String.valueOf(p.getW()).matches("1|2")) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("001F.00.0700");
			flkPr.setIMPOL("W");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(p.getW()));
			prs.add(flkPr);
		}
	}

	private void _001F_00_0710(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (!pacient.getNOVOR().equals("0") && !String.valueOf(p.getWP()).matches("1|2")) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("001F.00.0710");
			flkPr.setIMPOL("W_P");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(p.getWP()));
			prs.add(flkPr);
		}
	}

	private void _001F_00_0720(Person p, Collection<FlkPr> prs, Pacient pacient) {
		// При указании ЕНП в соответствующем основном файле, поле может не заполняться.
		if (pacient.getNPOLIS() == null || pacient.getNPOLIS().isEmpty()) {
			boolean err = false;
			try {
				if (!f011Service.existsById(Integer.valueOf(p.getDOCTYPE()))) {
					err = true;
				}
			} catch (NumberFormatException e) {
				err = true;
			}
			if (err) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("PERS");
				flkPr.setCOMMENT("001F.00.0720");
				flkPr.setIMPOL("DOCTYPE");
				flkPr.setNZAP(p.getIDPAC());
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(p.getDOCTYPE());
				prs.add(flkPr);
			}
		}
	}

	private void _002F_00_0540(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (pacient.getNOVOR().equals("0") && ((p.getOT() == null && !p.getDOST().contains((short) 1))
				|| (p.getFAM() == null && !p.getDOST().contains((short) 2))
				|| (p.getIM() == null && !p.getDOST().contains((short) 3)))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("002F.00.0540");
			flkPr.setIMPOL("DOST");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			prs.add(flkPr);
		}
	}

	private void _002F_00_0550(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (!pacient.getNOVOR().equals("0") && ((p.getOTP() == null && !p.getDOSTP().contains((short) 1))
				|| (p.getFAMP() == null && !p.getDOSTP().contains((short) 2))
				|| (p.getIMP() == null && !p.getDOSTP().contains((short) 3)))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("002F.00.0550");
			flkPr.setIMPOL("DOSTP");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			prs.add(flkPr);
		}
	}

	private void _003F_00_0330(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (pacient.getVPOLIS() != 3 && (p.getDOCDATE() == null || !p.getDOCDATE().isValid())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.0330");
			flkPr.setIMPOL("DOCDATE");
			flkPr.setNZAP(p.getIDPAC());
			if (p.getDOCDATE() == null) {
				flkPr.setOSHIB((short) 902);
			} else {
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(p.getDOCDATE().toGregorianCalendar().toString());
			}
			prs.add(flkPr);
		}
	}

	private void _003F_00_0340(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (pacient.getVPOLIS() != 3 && (p.getDOCORG() == null || p.getDOCORG().isEmpty())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.0340");
			flkPr.setIMPOL("DOCORG");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			flkPr.setZNPOL(p.getDOCORG());
			prs.add(flkPr);
		}
	}

	private void _003F_00_1530(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (pacient.getNOVOR().equals("0") && !p.getDOST().contains((short) 2) && p.getFAM().isEmpty()) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1530");
			flkPr.setIMPOL("FAM");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			flkPr.setZNPOL(p.getFAM());
			prs.add(flkPr);
		}
	}

	private void _003F_00_1540(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if ((!pacient.getNOVOR().equals("0") || p.getDOST().contains((short) 2)) && p.getFAM() != null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1540");
			flkPr.setIMPOL("FAM");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 901);
			flkPr.setZNPOL(p.getFAM());
			prs.add(flkPr);
		}
	}

	private void _003F_00_1550(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (!pacient.getNOVOR().equals("0") && !p.getDOST().contains((short) 2) && (p.getFAMP() == null || p.getFAMP().isEmpty())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1550");
			flkPr.setIMPOL("FAM_P");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			flkPr.setZNPOL(p.getFAMP());
			prs.add(flkPr);
		}
	}

	private void _003F_00_1560(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if ((pacient.getNOVOR().equals("0") || p.getDOSTP().contains((short) 2)) && p.getFAMP() != null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1560");
			flkPr.setIMPOL("FAM_P");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 901);
			flkPr.setZNPOL(p.getFAMP());
			prs.add(flkPr);
		}
	}

	private void _003F_00_1570(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (pacient.getNOVOR().equals("0") && !p.getDOST().contains((short) 3) && p.getIM().isEmpty()) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1570");
			flkPr.setIMPOL("IM");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			flkPr.setZNPOL(p.getIM());
			prs.add(flkPr);
		}
	}

	private void _003F_00_1580(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if ((!pacient.getNOVOR().equals("0") || p.getDOST().contains((short) 3)) && p.getIM() != null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1580");
			flkPr.setIMPOL("IM");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 901);
			flkPr.setZNPOL(p.getIM());
			prs.add(flkPr);
		}
	}

	private void _003F_00_1590(Person p, Collection<FlkPr> prs, Pacient pacient) {
		try {
		if (!pacient.getNOVOR().equals("0") && !p.getDOSTP().contains((short) 3) && (p.getIMP() == null || p.getIMP().isEmpty())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1590");
			flkPr.setIMPOL("IM_P");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			flkPr.setZNPOL(p.getIMP());
			prs.add(flkPr);
		}
		} catch (Exception e) {
			System.out.println();
		}
	}

	private void _003F_00_1600(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if ((pacient.getNOVOR().equals("0") || p.getDOSTP().contains((short) 3)) && p.getIMP() != null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1600");
			flkPr.setIMPOL("IM_P");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 901);
			flkPr.setZNPOL(p.getIMP());
			prs.add(flkPr);
		}
	}

	private void _003F_00_1610(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if ((!pacient.getNOVOR().equals("0") || p.getDOST().contains((short) 1)) && p.getOT() != null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1610");
			flkPr.setIMPOL("OT");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 901);
			flkPr.setZNPOL(p.getOT());
			prs.add(flkPr);
		}
	}

	private void _003F_00_1620(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if ((pacient.getNOVOR().equals("0") || p.getDOSTP().contains((short) 1)) && p.getIMP() != null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1620");
			flkPr.setIMPOL("OT_P");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 901);
			flkPr.setZNPOL(p.getOTP());
			prs.add(flkPr);
		}
	}

	private void _003F_00_1630(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (pacient.getNOVOR().equals("0") && (p.getIM() == null || p.getIM().isEmpty()) && !p.getDOST().contains((short) 3)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1630");
			flkPr.setIMPOL("DOST");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			prs.add(flkPr);
		}
	}

	private void _003F_00_1640(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (pacient.getNOVOR().equals("0") && (p.getFAM() == null || p.getFAM().isEmpty()) && !p.getDOST().contains((short) 2)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1640");
			flkPr.setIMPOL("DOST");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			prs.add(flkPr);
		}
	}

	private void _003F_00_1650(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (!pacient.getNOVOR().equals("0") && (p.getIMP() == null || p.getIMP().isEmpty()) && !p.getDOSTP().contains((short) 3)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1650");
			flkPr.setIMPOL("DOST_P");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			prs.add(flkPr);
		}
	}

	private void _003F_00_1660(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (!pacient.getNOVOR().equals("0") && (p.getFAMP() == null || p.getFAMP().isEmpty()) && !p.getDOSTP().contains((short) 2)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1660");
			flkPr.setIMPOL("DOST_P");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			prs.add(flkPr);
		}
	}

	private void _003F_00_1670(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (!pacient.getNOVOR().equals("0") && (p.getWP() == null || !String.valueOf(p.getWP()).matches("1|2"))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1670");
			flkPr.setIMPOL("W_P");
			flkPr.setNZAP(p.getIDPAC());
			if (p.getWP() != null) {
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(String.valueOf(p.getWP()));
			} else {
				flkPr.setOSHIB((short) 902);
			}
			prs.add(flkPr);
		}
	}

	private void _003F_00_1680(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (pacient.getNOVOR().equals("0") && p.getWP() != null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1680");
			flkPr.setIMPOL("W_P");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 901);
			flkPr.setZNPOL(String.valueOf(p.getWP()));
			prs.add(flkPr);
		}
	}

	private void _003F_00_1690(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (!pacient.getNOVOR().equals("0") && p.getDRP() == null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1690");
			flkPr.setIMPOL("DR_P");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			prs.add(flkPr);
		}
	}

	private void _003F_00_1700(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (pacient.getNOVOR().equals("0") && p.getDRP() != null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1700");
			flkPr.setIMPOL("DR_P");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 901);
			flkPr.setZNPOL(p.getDRP().toString());
			prs.add(flkPr);
		}
	}

	private void _003F_00_1710(Person p, Collection<FlkPr> prs, String mainFileName) {
		if (mainFileName.toUpperCase().matches("^[HCT]{1}.*") && p.getTEL() != null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1710");
			flkPr.setIMPOL("TEL");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 901);
			flkPr.setZNPOL(p.getTEL());
			prs.add(flkPr);
		}
	}

	private void _003F_00_1720(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (pacient.getVPOLIS() != 3 && p.getDOCTYPE() == null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1720");
			flkPr.setIMPOL("DOCTYPE");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			prs.add(flkPr);
		}
	}

	private void _003F_00_1730(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (pacient.getVPOLIS() != 3 && p.getDOCSER() == null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1730");
			flkPr.setIMPOL("DOCSER");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			prs.add(flkPr);
		}
	}

	private void _003F_00_1740(Person p, Collection<FlkPr> prs, Pacient pacient) {
		if (pacient.getVPOLIS() != 3 && p.getDOCNUM() == null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.1740");
			flkPr.setIMPOL("DOCNUM");
			flkPr.setNZAP(p.getIDPAC());
			flkPr.setOSHIB((short) 902);
			prs.add(flkPr);
		}
	}

	private void _003F_00_1970(Tuple2<PersonFile, String> tuple2, Collection<FlkPr> prs, Pacient pacient) {
		if (!tuple2.getT2().replaceFirst(".xml", "").equals(tuple2.getT1().getZGLV().getFILENAME())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ZGLV");
			flkPr.setCOMMENT("003F.00.1970");
			flkPr.setIMPOL("FILENAME");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(tuple2.getT1().getZGLV().getFILENAME());
			prs.add(flkPr);
		}
	}

	private void _003F_00_1990(PersonFile personFile, Collection<FlkPr> prs, SvedMedpom svedMedpom) {
		if (!personFile.getZGLV().getFILENAME1().equals(svedMedpom.getZGLV().getFILENAME())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ZGLV");
			flkPr.setCOMMENT("003F.00.1990");
			flkPr.setIMPOL("FILENAME1");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(personFile.getZGLV().getFILENAME1());
			prs.add(flkPr);
		}
	}

	private void _003F_00_3060(PersonFile personFile, Collection<FlkPr> prs) {
		if (personFile.getZGLV() == null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS_LIST");
			flkPr.setCOMMENT("003F.00.3060");
			flkPr.setIMPOL("ZGLV");
			flkPr.setOSHIB((short) 902);
			prs.add(flkPr);
		}
	}

	private void _003F_00_3070(PersonFile personFile, Collection<FlkPr> prs) {
		if (personFile.getPERS() == null) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS_LIST");
			flkPr.setCOMMENT("003F.00.3070");
			flkPr.setIMPOL("PERS");
			flkPr.setOSHIB((short) 902);
			prs.add(flkPr);
		}
	}

	private void _003F_00_3080(Person p, Collection<FlkPr> prs) {
		if (p.getIDPAC() == null || p.getIDPAC().isEmpty()) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.3080");
			flkPr.setIMPOL("ID_PAC");
			flkPr.setOSHIB((short) 902);
			prs.add(flkPr);
		}
	}

	private void _003F_00_3090(Person p, Collection<FlkPr> prs) {
		if (!String.valueOf(p.getW()).matches("1|2")) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.3090");
			flkPr.setIMPOL("W");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(p.getW()));
			prs.add(flkPr);
		}
	}

	private void _003F_00_3100(Person p, Collection<FlkPr> prs) {
		if (!p.getDR().isValid()) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("003F.00.3100");
			flkPr.setIMPOL("DR");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(p.getDR().toString());
			prs.add(flkPr);
		}
	}

	private void _004F_00_0030(PersonFile personFile, Collection<FlkPr> prs) {
		String filename1 = personFile.getZGLV().getFILENAME1();
		if (!filename1.matches("^[\\w]{13,}$")) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ZGLV");
			flkPr.setCOMMENT("004F.00.0030");
			flkPr.setIMPOL("FILENAME1");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(filename1);
			prs.add(flkPr);
		}
	}

	@SuppressWarnings("unused")
	private void _004F_00_1570(Person p, Collection<FlkPr> prs) {
		String idpac = p.getIDPAC();
		if (idpac.length() < 1 || idpac.length() > 36 || !idpac.matches("^[\\w-—–]+$")) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1570");
			flkPr.setIMPOL("ID_PAC");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(idpac);
			prs.add(flkPr);
		}
	}

	private void _004F_00_1580(Person p, Collection<FlkPr> prs) {
		String fam = p.getFAM();
		if (fam != null && (!fam.matches("^[\\sёЁА-Яа-я0-9.—–-]+$") || fam.length() < 1 || fam.length() > 40)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1580");
			flkPr.setIMPOL("FAM");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(fam);
			prs.add(flkPr);
		}
	}

	private void _004F_00_1590(Person p, Collection<FlkPr> prs) {
		String im = p.getIM();
		if (im != null && (!im.matches("^[\\sёЁА-Яа-я0-9.—–-]+$") || im.length() < 1 || im.length() > 40)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1590");
			flkPr.setIMPOL("IM");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(im);
			prs.add(flkPr);
		}
	}

	private void _004F_00_1600(Person p, Collection<FlkPr> prs) {
		String ot = p.getOT();
		if (ot != null && (!ot.matches("^[\\sёЁА-Яа-я0-9.—–-]+$") || ot.length() < 1 || ot.length() > 40)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1600");
			flkPr.setIMPOL("OT");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(ot);
			prs.add(flkPr);
		}
	}

	private void _004F_00_1610(Person p, Collection<FlkPr> prs) {
		if (!DateValidator.isValid(p.getDR().toString())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1610");
			flkPr.setIMPOL("DR");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(p.getDR().toString());
			prs.add(flkPr);
		}
	}

	private void _004F_00_1620(Person p, Collection<FlkPr> prs) {
		if (!p.getDOST().stream().allMatch(t -> String.valueOf(t).matches("^[\\d]{1}$"))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1620");
			flkPr.setIMPOL("DOST");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(p.getDOST().stream().filter(t -> !String.valueOf(t).matches("^[\\d]{1}$")).findAny().get()
					.toString());
			prs.add(flkPr);
		}
	}

	private void _004F_00_1630(Person p, Collection<FlkPr> prs) {
		String tel = p.getTEL();
		if (tel != null && (tel.length() < 6 || tel.length() > 100 || !tel.matches("^[\\sёЁА-Яа-я0-9—–-]+$"))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1630");
			flkPr.setIMPOL("TEL");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(tel);
			prs.add(flkPr);
		}
	}

	private void _004F_00_1640(Person p, Collection<FlkPr> prs) {
		String famp = p.getFAMP();
		if (famp != null && (!famp.matches("^[\\sёЁА-Яа-я0-9.—–-]+$") || famp.length() < 1 || famp.length() > 40)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1640");
			flkPr.setIMPOL("FAMP");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(famp);
			prs.add(flkPr);
		}
	}

	private void _004F_00_1650(Person p, Collection<FlkPr> prs) {
		String imp = p.getIMP();
		if (imp != null && (!imp.matches("^[\\sёЁА-Яа-я0-9.—–-]+$") || imp.length() < 1 || imp.length() > 40)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1650");
			flkPr.setIMPOL("IMP");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(imp);
			prs.add(flkPr);
		}
	}

	private void _004F_00_1660(Person p, Collection<FlkPr> prs) {
		String otp = p.getOTP();
		if (otp != null && (!otp.matches("^[\\sёЁА-Яа-я0-9.—–-]+$") || otp.length() < 1 || otp.length() > 40)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1650");
			flkPr.setIMPOL("OTP");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(otp);
			prs.add(flkPr);
		}
	}

	private void _004F_00_1670(Person p, Collection<FlkPr> prs) {
		if (p.getDRP() != null && !DateValidator.isValid(p.getDRP().toString())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1670");
			flkPr.setIMPOL("DRP");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(p.getDRP().toString());
			prs.add(flkPr);
		}
	}

	private void _004F_00_1680(Person p, Collection<FlkPr> prs) {
		if (!p.getDOSTP().stream().allMatch(t -> String.valueOf(t).matches("^[\\d]{1}$"))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1680");
			flkPr.setIMPOL("DOSTP");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(p.getDOSTP().stream().filter(t -> !String.valueOf(t).matches("^[\\d]{1}$")).findAny().get()
					.toString());
			prs.add(flkPr);
		}
	}

	private void _004F_00_1690(Person p, Collection<FlkPr> prs) {
		String mr = p.getMR();
		if (mr != null && (mr.length() < 1 || mr.length() > 100)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1690");
			flkPr.setIMPOL("MR");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(mr);
			prs.add(flkPr);
		}
	}

	private void _004F_00_1700(Person p, Collection<FlkPr> prs, Pacient pacient) {
		// При указании ЕНП в соответствующем основном файле, поле может не заполняться.
		if (pacient.getNPOLIS() == null || pacient.getNPOLIS().isEmpty()) {
			F011 f011 = f011Service.findOne(Integer.valueOf(p.getDOCTYPE()));
			if (!p.getDOCSER().matches(f011.getReser())) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("PERS");
				flkPr.setCOMMENT("004F.00.1700");
				flkPr.setIMPOL("DOCSER");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(p.getDOCSER());
				prs.add(flkPr);
			}
		}
	}

	private void _004F_00_1710(Person p, Collection<FlkPr> prs, Pacient pacient) {
		// При указании ЕНП в соответствующем основном файле, поле может не заполняться.
		if (pacient.getNPOLIS() == null || pacient.getNPOLIS().isEmpty()) {
			F011 f011 = f011Service.findOne(Integer.valueOf(p.getDOCTYPE()));
			if (!p.getDOCNUM().matches(f011.getRenum())) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("PERS");
				flkPr.setCOMMENT("004F.00.1710");
				flkPr.setIMPOL("DOCNUM");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(p.getDOCNUM());
				prs.add(flkPr);
			}
		}
	}

	private void _004F_00_1720(Person p, Collection<FlkPr> prs) {
		if (p.getSNILS() != null && !p.getSNILS().matches("^[\\d]{3}-[\\d]{3}-[\\d]{3}\\s[\\d]{2}$")) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1720");
			flkPr.setIMPOL("SNILS");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(p.getSNILS());
			prs.add(flkPr);
		}
	}

	private void _004F_00_1730(Person p, Collection<FlkPr> prs) {
		if (p.getOKATOG() != null && !p.getOKATOG().matches("^[\\d]{11}$")) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1730");
			flkPr.setIMPOL("OKATOG");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(p.getOKATOG());
			prs.add(flkPr);
		}
	}

	private void _004F_00_1740(Person p, Collection<FlkPr> prs) {
		if (p.getOKATOP() != null && !p.getOKATOP().matches("^[\\d]{11}$")) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1740");
			flkPr.setIMPOL("OKATOP");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(p.getOKATOP());
			prs.add(flkPr);
		}
	}

	private void _004F_00_1750(Person p, Collection<FlkPr> prs) {
		String comentp = p.getCOMENTP();
		if (comentp != null && (comentp.length() < 1 || comentp.length() > 250)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("004F.00.1750");
			flkPr.setIMPOL("COMENTP");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(comentp);
			prs.add(flkPr);
		}
	}

	private void _004F_00_1760(PersonFile personFile, Collection<FlkPr> prs) {
		String version = personFile.getZGLV().getVERSION();
		if (version.matches("[^[\\d.]{3,5}$]")) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ZGLV");
			flkPr.setCOMMENT("004F.00.1750");
			flkPr.setIMPOL("VERSION");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(version);
			prs.add(flkPr);
		}
	}

	private void _004F_00_1770(PersonFile personFile, Collection<FlkPr> prs) {
		String filename = personFile.getZGLV().getFILENAME();
		if (!filename.matches("^[\\w]{13,}$")) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ZGLV");
			flkPr.setCOMMENT("004F.00.1770");
			flkPr.setIMPOL("FILENAME");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(filename);
			prs.add(flkPr);
		}
	}

	private void _004F_00_1780(PersonFile personFile, Collection<FlkPr> prs) {
		if (!personFile.getZGLV().getDATA().isValid()) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ZGLV");
			flkPr.setCOMMENT("004F.00.1780");
			flkPr.setIMPOL("DATA");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(personFile.getZGLV().getDATA().toString());
			prs.add(flkPr);
		}
	}

	private void _006F_00_0020(PersonFile personFile, Collection<FlkPr> prs) {
		if (personFile.getZGLV().getDATA().toGregorianCalendar().toZonedDateTime().toLocalDate()
				.isAfter(LocalDate.now())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ZGLV");
			flkPr.setCOMMENT("006F.00.0020");
			flkPr.setIMPOL("DATA");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(personFile.getZGLV().getDATA().toString());
			prs.add(flkPr);
		}
	}
	
	private void _006F_00_0080(PersonFile personFile, Collection<FlkPr> prs, Short year) {
		String filename = personFile.getZGLV().getFILENAME();
		String yy = filename.replaceFirst("^\\w+_(\\d{2})\\w+$", "$1");
		if (!String.valueOf(year).matches("20" + yy)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ZGLV");
			flkPr.setCOMMENT("006F.00.0080");
			flkPr.setIMPOL("FILENAME");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(filename);
			prs.add(flkPr);
		}
	}
	
	private void _006F_00_0100(PersonFile personFile, Collection<FlkPr> prs, Short month) {
		String filename = personFile.getZGLV().getFILENAME();
		String mm = filename.replaceFirst("^\\w+_\\d{2}(\\d{2})\\w+$", "$1");
		if (month.shortValue() != new Short(mm).shortValue()) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ZGLV");
			flkPr.setCOMMENT("006F.00.0100");
			flkPr.setIMPOL("FILENAME");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(filename);
			prs.add(flkPr);
		}
	}

	private void _006F_00_0670(PersonFile personFile, Collection<FlkPr> prs, Person p) {
		if (p.getDR().compare(personFile.getZGLV().getDATA()) == DatatypeConstants.GREATER) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("006F.00.0670");
			flkPr.setIMPOL("DR");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(p.getDR().toString());
			prs.add(flkPr);
		}
	}
	
	private void _006F_00_0680(SchetZap schetZap, Collection<FlkPr> prs, Person p) {
		if (p.getDR().compare(schetZap.getZSL().getDATEZ1()) == DatatypeConstants.GREATER) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("006F.00.0680");
			flkPr.setIMPOL("DR");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(p.getDR().toString());
			prs.add(flkPr);
		}
	}
	
	private void _006F_00_0690(Collection<FlkPr> prs, Person p) {
		if (p.getDRP() == null) return;
		LocalDate drP = p.getDRP().toGregorianCalendar().toZonedDateTime().toLocalDate();
		LocalDate dr = p.getDR().toGregorianCalendar().toZonedDateTime().toLocalDate();
		if (dr.minusYears(14).isBefore(drP)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PERS");
			flkPr.setCOMMENT("006F.00.0690");
			flkPr.setIMPOL("DR_P");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(drP.toString());
			prs.add(flkPr);
		}
	}
}
