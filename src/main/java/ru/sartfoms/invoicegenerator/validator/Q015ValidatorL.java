package ru.sartfoms.invoicegenerator.validator;

import java.util.Collection;

import org.springframework.stereotype.Component;

import generated.Flk;
import generated.FlkPr;
import generated.MedrabFile;
import generated.Pacient;
import generated.Person;
import generated.PersonFile;
import generated.SvedMedpom;
import reactor.util.function.Tuple4;
import ru.sartfoms.invoicegenerator.service.F011Service;

@Component
public class Q015ValidatorL {
	private final F011Service f011Service;

	public Q015ValidatorL(F011Service f011Service) {
		this.f011Service = f011Service;
	}

	public void validate(Tuple4<PersonFile, MedrabFile, SvedMedpom, Flk> tuple4) {
		Collection<FlkPr> prs = tuple4.getT4().getPR();
		tuple4.getT1().getPERS().forEach(p -> {

			Pacient pacient = tuple4.getT3().getZAP().stream()
					.filter(z -> z.getPACIENT().getIDPAC().equals(p.getIDPAC())).map(t -> t.getPACIENT()).findAny()
					.get();

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
			
			//003F.00.0330
			_003F_00_0330(p, prs, pacient);
			
		});

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
				if (f011Service.findOne(Integer.valueOf(p.getDOCTYPE())) == null) {
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
}
