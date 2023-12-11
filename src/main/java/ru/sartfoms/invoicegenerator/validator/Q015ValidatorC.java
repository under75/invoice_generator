package ru.sartfoms.invoicegenerator.validator;

import java.util.Collection;

import org.springframework.stereotype.Component;

import generated.Flk;
import generated.FlkPr;
import generated.MedrabFile;
import generated.Pacient;
import generated.PersonFile;
import generated.Schet;
import generated.Sluch;
import generated.SvedMedpom;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuple4;
import ru.sartfoms.invoicegenerator.service.F002Service;
import ru.sartfoms.invoicegenerator.service.F003Service;
import ru.sartfoms.invoicegenerator.service.F010Service;
import ru.sartfoms.invoicegenerator.service.F032Service;
import ru.sartfoms.invoicegenerator.service.V002Service;
import ru.sartfoms.invoicegenerator.service.V008Service;
import ru.sartfoms.invoicegenerator.service.V009Service;
import ru.sartfoms.invoicegenerator.service.V010Service;
import ru.sartfoms.invoicegenerator.service.V012Service;
import ru.sartfoms.invoicegenerator.service.V014Service;
import static ru.sartfoms.invoicegenerator.util.Constants.*;

@Component
public class Q015ValidatorC {
	private final F003Service f003Service;
	private final F032Service f032Service;
	private final F002Service f002Service;
	private final F010Service f010Service;
	private final V008Service v008Service;
	private final V014Service v014Service;
	private final V009Service v009Service;
	private final V012Service v012Service;
	private final V010Service v010Service;
	private final V002Service v002Service;

	public Q015ValidatorC(F003Service f003Service, F032Service f032Service, F002Service f002Service,
			F010Service f010Service, V008Service v008Service, V014Service v014Service, V009Service v009Service, V012Service v012Service, V010Service v010Service, V002Service v002Service) {
		this.f003Service = f003Service;
		this.f032Service = f032Service;
		this.f002Service = f002Service;
		this.f010Service = f010Service;
		this.v008Service = v008Service;
		this.v014Service = v014Service;
		this.v009Service = v009Service;
		this.v012Service = v012Service;
		this.v010Service = v010Service;
		this.v002Service = v002Service;
	}

	public void validate(
			Tuple4<Tuple2<PersonFile, String>, Tuple2<MedrabFile, String>, Tuple2<SvedMedpom, String>, Flk> m) {

		Collection<FlkPr> prs = m.getT4().getPR();
		Schet schet = m.getT3().getT1().getSCHET();

		m.getT3().getT1().getZAP().forEach(zap -> {

			// 001F.00.0070
			_001F_00_0070(schet.getPLAT(), zap.getPACIENT(), prs);

			// 001F.00.0080
			_001F_00_0080(schet.getPLAT(), zap.getPACIENT(), prs);

			// 001F.00.0100
			_001F_00_0100(zap.getPACIENT(), prs);

			// 001F.00.0160
			_001F_00_0160(zap.getZSL().getUSLOK(), prs);

			// 001F.00.0170
			_001F_00_0170(zap.getZSL().getVIDPOM(), prs);

			// 001F.00.0180
			_001F_00_0180(zap.getZSL().getFORPOM(), prs);

			// 001F.00.0201
			_001F_00_0201(zap.getZSL().getLPU(), prs);
			
			//001F.00.0210
			_001F_00_0210(zap.getZSL().getRSLT(), prs);
			
			//001F.00.0220
			_001F_00_0220(zap.getZSL().getISHOD(), prs);
			
			//001F.00.0230
//			_001F_00_0230(zap.getZSL().getIDSP(), prs);
			
			zap.getZSL().getSL().forEach(sluch -> {
				//001F.00.0270
				_001F_00_0270(sluch, prs);
			});
		
			
		});

		// 001F.00.0030
		_001F_00_0030(schet.getCODEMO(), prs);

		// 001F.00.0031
		_001F_00_0031(schet.getCODEMO(), prs);

		// 001F.00.0040
		_001F_00_0040(schet.getPLAT(), prs);

	}

	private void _001F_00_0030(String codeMo, Collection<FlkPr> prs) {
		if (!f003Service.existsById(Integer.valueOf(codeMo) - LPU_EXTRA_CODE)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("SCHET");
			flkPr.setCOMMENT("001F.00.0030");
			flkPr.setIMPOL("CODE_MO");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(codeMo);
			prs.add(flkPr);
		}
	}

	private void _001F_00_0031(String codeMo, Collection<FlkPr> prs) {
		if (!f032Service.existsById(Integer.valueOf(codeMo) - LPU_EXTRA_CODE)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("SCHET");
			flkPr.setCOMMENT("001F.00.0031");
			flkPr.setIMPOL("CODE_MO");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(codeMo);
			prs.add(flkPr);
		}
	}

	private void _001F_00_0040(String codeSmo, Collection<FlkPr> prs) {
		if (codeSmo != null && !codeSmo.equals(SARTFOMS_CODE) && !f002Service.existsById(codeSmo)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("SCHET");
			flkPr.setCOMMENT("001F.00.0040");
			flkPr.setIMPOL("PLAT");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(codeSmo);
			prs.add(flkPr);
		}
	}

	private void _001F_00_0070(String codeSmo, Pacient pacient, Collection<FlkPr> prs) {
		if (codeSmo != null && pacient.getVPOLIS() == 1 && !f010Service.existsById(pacient.getSTOKATO().trim())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PACIENT");
			flkPr.setCOMMENT("001F.00.0070");
			flkPr.setIMPOL("ST_OKATO");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(pacient.getSTOKATO());
			prs.add(flkPr);
		}
	}

	private void _001F_00_0080(String codeSmo, Pacient pacient, Collection<FlkPr> prs) {
		if (codeSmo != null && !f002Service.existsById(pacient.getSMO().trim())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PACIENT");
			flkPr.setCOMMENT("001F.00.0080");
			flkPr.setIMPOL("SMO");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(pacient.getSMO());
			prs.add(flkPr);
		}
	}

	private void _001F_00_0100(Pacient pacient, Collection<FlkPr> prs) {
		if (pacient.getSMOOK() != null && !f010Service.existsById(pacient.getSMOOK())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("PACIENT");
			flkPr.setCOMMENT("001F.00.0100");
			flkPr.setIMPOL("SMO_OK");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(pacient.getSMOOK());
			prs.add(flkPr);
		}
	}

	private void _001F_00_0160(short uslOk, Collection<FlkPr> prs) {
		if (uslOk < 1 || uslOk > 4) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("Z_SL");
			flkPr.setCOMMENT("001F.00.0160");
			flkPr.setIMPOL("USL_OK");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(uslOk));
			prs.add(flkPr);
		}
	}

	private void _001F_00_0170(short vidpom, Collection<FlkPr> prs) {
		if (!v008Service.existsById(Integer.valueOf(vidpom))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("Z_SL");
			flkPr.setCOMMENT("001F.00.0170");
			flkPr.setIMPOL("VIDPOM");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(vidpom));
			prs.add(flkPr);
		}
	}

	private void _001F_00_0180(short forpom, Collection<FlkPr> prs) {
		if (!v014Service.existsById(Integer.valueOf(forpom))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("Z_SL");
			flkPr.setCOMMENT("001F.00.0180");
			flkPr.setIMPOL("FOR_POM");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(forpom));
			prs.add(flkPr);
		}
	}

	private void _001F_00_0201(String lpu, Collection<FlkPr> prs) {
		if (!f032Service.existsById(Integer.valueOf(lpu))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("Z_SL");
			flkPr.setCOMMENT("001F.00.0201");
			flkPr.setIMPOL("LPU");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(lpu);
			prs.add(flkPr);
		}
	}
	
	private void _001F_00_0210(short rslt, Collection<FlkPr> prs) {
		if (!v009Service.existsById(String.valueOf(rslt))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("Z_SL");
			flkPr.setCOMMENT("001F.00.0210");
			flkPr.setIMPOL("RSLT");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(rslt));
			prs.add(flkPr);
		}
	}
	
	private void _001F_00_0220(short ishod, Collection<FlkPr> prs) {
		if (!v012Service.existsById(String.valueOf(ishod))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("Z_SL");
			flkPr.setCOMMENT("001F.00.0220");
			flkPr.setIMPOL("ISHOD");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(ishod));
			prs.add(flkPr);
		}
	}
	
	private void _001F_00_0230(Short idsp, Collection<FlkPr> prs) {
		if (!v010Service.existsById(Integer.valueOf(idsp))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("Z_SL");
			flkPr.setCOMMENT("001F.00.0230");
			flkPr.setIMPOL("IDSP");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(idsp));
			prs.add(flkPr);
		}
	}
	
	private void _001F_00_0270(Sluch sluch, Collection<FlkPr> prs) {
		if (!v002Service.existsByIdpr(Integer.valueOf(sluch.getPROFIL()))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("SL");
			flkPr.setCOMMENT("001F.00.0270");
			flkPr.setIMPOL("PROFIL");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(sluch.getPROFIL()));
			prs.add(flkPr);
		}
	}
}
