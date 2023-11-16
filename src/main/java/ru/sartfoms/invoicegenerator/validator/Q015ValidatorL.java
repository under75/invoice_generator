package ru.sartfoms.invoicegenerator.validator;

import org.springframework.stereotype.Component;

import generated.Flk;
import generated.FlkPr;
import generated.MedrabFile;
import generated.Pacient;
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
		tuple4.getT1().getPERS().forEach(p -> {

			// 001F.00.0700
			if (!String.valueOf(p.getW()).matches("1|2")) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("PERS");
				flkPr.setCOMMENT("001F.00.0700");
				flkPr.setIMPOL("W");
				flkPr.setNZAP(p.getIDPAC());
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(String.valueOf(p.getW()));
				tuple4.getT4().getPR().add(flkPr);
			}

			// 001F.00.0710
			Pacient pacient = tuple4.getT3().getZAP().stream()
					.filter(z -> z.getPACIENT().getIDPAC().equals(p.getIDPAC())).map(t -> t.getPACIENT()).findAny()
					.get();
			if (pacient.getNOVOR().equals("1") && !String.valueOf(p.getWP()).matches("1|2")) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("PERS");
				flkPr.setCOMMENT("001F.00.0710");
				flkPr.setIMPOL("W_P");
				flkPr.setNZAP(p.getIDPAC());
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(String.valueOf(p.getWP()));
				tuple4.getT4().getPR().add(flkPr);
			}

			// 001F.00.0720
			//to do При указании ЕНП в соответствующем основном файле, поле может не заполняться.
			try {
				if (f011Service.findOne(Integer.valueOf(p.getDOCTYPE())) == null) {
					FlkPr flkPr = new FlkPr();
					flkPr.setBASEL("PERS");
					flkPr.setCOMMENT("001F.00.0720");
					flkPr.setIMPOL("DOCTYPE");
					flkPr.setNZAP(p.getIDPAC());
					flkPr.setOSHIB((short) 904);
					flkPr.setZNPOL(p.getDOCTYPE());
					tuple4.getT4().getPR().add(flkPr);
				}
			} catch (NumberFormatException e) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("PERS");
				flkPr.setCOMMENT("001F.00.0720");
				flkPr.setIMPOL("DOCTYPE");
				flkPr.setNZAP(p.getIDPAC());
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(p.getDOCTYPE());
				tuple4.getT4().getPR().add(flkPr);
			} 
			

			// 002F.00.0540
			if (p.getFAM() == null || p.getIM() == null || p.getOT() == null) {

			}
		});

	}
}
