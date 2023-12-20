package ru.sartfoms.invoicegenerator.validator;

import static ru.sartfoms.invoicegenerator.util.Constants.LPU_EXTRA_CODE;
import static ru.sartfoms.invoicegenerator.util.Constants.SARTFOMS_CODE;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Component;

import generated.BDIAG;
import generated.BPROT;
import generated.CONS;
import generated.FlkPr;
import generated.LEKPR;
import generated.NAPR;
import generated.ONKUSL;
import generated.OnkSl;
import generated.Pacient;
import generated.Person;
import generated.Schet;
import generated.Sluch;
import ru.sartfoms.invoicegenerator.model.Cortege;
import ru.sartfoms.invoicegenerator.service.F002Service;
import ru.sartfoms.invoicegenerator.service.F003Service;
import ru.sartfoms.invoicegenerator.service.F010Service;
import ru.sartfoms.invoicegenerator.service.F032Service;
import ru.sartfoms.invoicegenerator.service.MkbService;
import ru.sartfoms.invoicegenerator.service.N001Service;
import ru.sartfoms.invoicegenerator.service.N002Service;
import ru.sartfoms.invoicegenerator.service.N003Service;
import ru.sartfoms.invoicegenerator.service.N004Service;
import ru.sartfoms.invoicegenerator.service.N005Service;
import ru.sartfoms.invoicegenerator.service.N007Service;
import ru.sartfoms.invoicegenerator.service.N008Service;
import ru.sartfoms.invoicegenerator.service.N011Service;
import ru.sartfoms.invoicegenerator.service.N013Service;
import ru.sartfoms.invoicegenerator.service.N014Service;
import ru.sartfoms.invoicegenerator.service.N015Service;
import ru.sartfoms.invoicegenerator.service.N016Service;
import ru.sartfoms.invoicegenerator.service.N017Service;
import ru.sartfoms.invoicegenerator.service.N018Service;
import ru.sartfoms.invoicegenerator.service.N019Service;
import ru.sartfoms.invoicegenerator.service.N020Service;
import ru.sartfoms.invoicegenerator.service.V002Service;
import ru.sartfoms.invoicegenerator.service.V008Service;
import ru.sartfoms.invoicegenerator.service.V009Service;
import ru.sartfoms.invoicegenerator.service.V010Service;
import ru.sartfoms.invoicegenerator.service.V012Service;
import ru.sartfoms.invoicegenerator.service.V014Service;
import ru.sartfoms.invoicegenerator.service.V020Service;
import ru.sartfoms.invoicegenerator.service.V021Service;
import ru.sartfoms.invoicegenerator.service.V023Service;
import ru.sartfoms.invoicegenerator.service.V024Service;
import ru.sartfoms.invoicegenerator.service.V025Service;
import ru.sartfoms.invoicegenerator.service.V027Service;
import ru.sartfoms.invoicegenerator.service.V028Service;
import ru.sartfoms.invoicegenerator.service.V029Service;

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
	private final V020Service v020Service;
	private final V025Service v025Service;
	private final V027Service v027Service;
	private final V021Service v021Service;
	private final V028Service v028Service;
	private final V029Service v029Service;
	private final N019Service n019Service;
	private final N018Service n018Service;
	private final N002Service n002Service;
	private final N003Service n003Service;
	private final N004Service n004Service;
	private final N005Service n005Service;
	private final N007Service n007Service;
	private final N011Service n011Service;
	private final N008Service n008Service;
	private final N001Service n001Service;
	private final N013Service n013Service;
	private final N014Service n014Service;
	private final N015Service n015Service;
	private final N016Service n016Service;
	private final N017Service n017Service;
	private final N020Service n020Service;
	private final MkbService mkbService;
	private final V024Service v024Service;
	private final V023Service v023Service;

	public Q015ValidatorC(F003Service f003Service, F032Service f032Service, F002Service f002Service,
			F010Service f010Service, V008Service v008Service, V014Service v014Service, V009Service v009Service,
			V012Service v012Service, V010Service v010Service, V002Service v002Service, V020Service v020Service,
			V025Service v025Service, V027Service v027Service, V021Service v021Service, V028Service v028Service,
			V029Service v029Service, N019Service n019Service, N018Service n018Service, N002Service n002Service,
			N003Service n003Service, N004Service n004Service, N005Service n005Service, N007Service n007Service,
			N011Service n011Service, N008Service n008Service, N001Service n001Service, N013Service n013Service,
			N014Service n014Service, N015Service n015Service, N016Service n016Service, N017Service n017Service,
			N020Service n020Service, MkbService mkbService, V024Service v024Service, V023Service v023Service) {
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
		this.v020Service = v020Service;
		this.v025Service = v025Service;
		this.v027Service = v027Service;
		this.v021Service = v021Service;
		this.v028Service = v028Service;
		this.v029Service = v029Service;
		this.n019Service = n019Service;
		this.n018Service = n018Service;
		this.n002Service = n002Service;
		this.n003Service = n003Service;
		this.n004Service = n004Service;
		this.n005Service = n005Service;
		this.n007Service = n007Service;
		this.n011Service = n011Service;
		this.n008Service = n008Service;
		this.n001Service = n001Service;
		this.n013Service = n013Service;
		this.n014Service = n014Service;
		this.n015Service = n015Service;
		this.n016Service = n016Service;
		this.n017Service = n017Service;
		this.n020Service = n020Service;
		this.mkbService = mkbService;
		this.v024Service = v024Service;
		this.v023Service = v023Service;
	}

	public void validate(Cortege cortege) {
		Collection<FlkPr> prs = cortege.getFlk().getPR();
		Schet schet = cortege.getSvedMedpom().getSCHET();

		cortege.getSvedMedpom().getZAP().parallelStream().peek(zap -> {
			Person person = cortege.getPersonFile().getPERS().stream()
					.filter(t -> t.getIDPAC().equals(zap.getPACIENT().getIDPAC())).findAny().get();

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

			// 001F.00.0210
			_001F_00_0210(zap.getZSL().getRSLT(), prs);

			// 001F.00.0220
			_001F_00_0220(zap.getZSL().getISHOD(), prs);

			// 001F.00.0230
			_001F_00_0230(zap.getZSL().getIDSP(), prs);

			zap.getZSL().getSL().forEach(sluch -> {

				// 001F.00.0270
				_001F_00_0270(sluch, prs);

				// 001F.00.0280
				if (zap.getZSL().getUSLOK() == 1 || zap.getZSL().getUSLOK() == 2) {
					_001F_00_0280(sluch, prs);
				}

				// 001F.00.0290
				if (zap.getZSL().getUSLOK() == 3) {
					_001F_00_0290(sluch, prs);
				}

				// 001F.00.0300
				_001F_00_0300(sluch, prs);

				// 001F.00.0310
				_001F_00_0310(sluch, prs, cortege.getMedrabFile().getZGLV().getVERSION());

				// 001F.00.0371
				if (sluch.getNAPR() != null && !sluch.getNAPR().isEmpty()) {
					_001F_00_0371(sluch.getNAPR(), prs);
				}

				// 001F.00.0380
				_001F_00_0380(sluch.getNAPR(), prs);

				// 001F.00.0390
				_001F_00_0390(sluch.getNAPR(), prs);

				// 001F.00.0400
				_001F_00_0400(sluch.getCONS(), prs);

				// 001F.00.0410
				_001F_00_0410(sluch.getONKSL(), prs);

				// 001F.00.0420
				_001F_00_0420(sluch.getONKSL(), prs);

				// 001F.00.0430
				_001F_00_0430(sluch.getONKSL(), prs, person.getDR());

				// 001F.00.0440
				_001F_00_0440(sluch.getONKSL(), prs, person.getDR());

				// 001F.00.0450
				_001F_00_0450(sluch.getONKSL(), prs, person.getDR());

				if (sluch.getONKSL() != null) {
					sluch.getONKSL().getBDIAG().forEach(diag -> {
						// 001F.00.0460
						_001F_00_0460(diag, prs);

						// 001F.00.0470
						_001F_00_0470(diag, prs);

						// 001F.00.0480
						_001F_00_0480(diag, prs);

						// 001F.00.0490
						_001F_00_0490(diag, prs);
					});
					sluch.getONKSL().getBPROT().forEach(prot -> {
						// 001F.00.0500
						_001F_00_0500(prot, prs);
					});
					sluch.getONKSL().getONKUSL().forEach(usl -> {
						// 001F.00.0510
						_001F_00_0510(usl, prs);

						// 001F.00.0520
						_001F_00_0520(usl, prs);

						// 001F.00.0530
						_001F_00_0530(usl, prs);

						// 001F.00.0540
						_001F_00_0540(usl, prs);

						// 001F.00.0550
						_001F_00_0550(usl, prs);

						usl.getLEKPR().forEach(lekpr -> {
							// 001F.00.0560
							_001F_00_0560(lekpr, prs);

							// 001F.00.0571
							_001F_00_0571(usl.getUSLTIP(), lekpr, prs, person.getDR(), sluch.getDS1());
						});
					});
				}
				// 001F.00.0580
				_001F_00_0580(prs, sluch);

			});

		}).count();

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

	private void _001F_00_0280(Sluch sluch, Collection<FlkPr> prs) {
		if (!v020Service.existsById(Integer.valueOf(sluch.getPROFILK()))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("SL");
			flkPr.setCOMMENT("001F.00.0280");
			flkPr.setIMPOL("PROFIL_K");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(sluch.getPROFIL()));
			prs.add(flkPr);
		}
	}

	private void _001F_00_0290(Sluch sluch, Collection<FlkPr> prs) {
		if (!v025Service.existsById(sluch.getPCEL())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("SL");
			flkPr.setCOMMENT("001F.00.0290");
			flkPr.setIMPOL("P_CEL");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(sluch.getPCEL());
			prs.add(flkPr);
		}
	}

	private void _001F_00_0300(Sluch sluch, Collection<FlkPr> prs) {
		if (sluch.getDS1().matches("^(?:D0\\d{1})|(?:C.+)$")
				&& !v027Service.existsById(Integer.valueOf(sluch.getCZAB()))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("SL");
			flkPr.setCOMMENT("001F.00.0300");
			flkPr.setIMPOL("C_ZAB");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(sluch.getCZAB()));
			prs.add(flkPr);
		}
	}

	private void _001F_00_0310(Sluch sluch, Collection<FlkPr> prs, String version) {
		if (!version.equals("3.0") || !v021Service.existsById(Integer.valueOf(sluch.getPRVS()))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("SL");
			flkPr.setCOMMENT("001F.00.0310");
			flkPr.setIMPOL("PRVS");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(sluch.getPRVS()));
			prs.add(flkPr);
		}
	}

	private void _001F_00_0371(List<NAPR> napr, Collection<FlkPr> prs) {
		napr.forEach(t -> {
			if (t.getNAPRMO() != null && !f032Service.existsById(Integer.valueOf(t.getNAPRMO()))) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("NAPR");
				flkPr.setCOMMENT("001F.00.0371");
				flkPr.setIMPOL("NAPR_MO");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(t.getNAPRMO());
				prs.add(flkPr);
			}
		});
	}

	private void _001F_00_0380(List<NAPR> napr, Collection<FlkPr> prs) {
		napr.forEach(t -> {
			if (!v028Service.isValid(Integer.valueOf(t.getNAPRV()))) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("NAPR");
				flkPr.setCOMMENT("001F.00.0380");
				flkPr.setIMPOL("NAPR_V");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(String.valueOf(t.getNAPRV()));
				prs.add(flkPr);
			}
		});
	}

	private void _001F_00_0390(List<NAPR> napr, Collection<FlkPr> prs) {
		napr.forEach(t -> {
			if (t.getNAPRV() == 3 && !v029Service.isValid(Integer.valueOf(t.getMETISSL()))) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("NAPR");
				flkPr.setCOMMENT("001F.00.0390");
				flkPr.setIMPOL("MET_ISSL");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(String.valueOf(t.getMETISSL()));
				prs.add(flkPr);
			}
		});
	}

	private void _001F_00_0400(List<CONS> cons, Collection<FlkPr> prs) {
		cons.forEach(t -> {
			if (!n019Service.isValid(Integer.valueOf(t.getPRCONS()))) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("CONS");
				flkPr.setCOMMENT("001F.00.0390");
				flkPr.setIMPOL("PR_CONS");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(String.valueOf(t.getPRCONS()));
				prs.add(flkPr);
			}
		});
	}

	// Не выяснил какой диапазон 0..6 или 1..7
	private void _001F_00_0410(OnkSl onksl, Collection<FlkPr> prs) {
		if (onksl != null && /** !n018Service.isValid(Integer.valueOf(onksl.getDS1T())) **/
				!(onksl.getDS1T() >= 1 && onksl.getDS1T() <= 7)) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ONK_SL");
			flkPr.setCOMMENT("001F.00.0410");
			flkPr.setIMPOL("DS1_T");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(onksl.getDS1T()));
			prs.add(flkPr);
		}
	}

	private void _001F_00_0420(OnkSl onksl, Collection<FlkPr> prs) {
		if (onksl != null && onksl.getDS1T() >= 1 && onksl.getDS1T() <= 5
				&& !n002Service.isValid(Integer.valueOf(onksl.getSTAD()))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ONK_SL");
			flkPr.setCOMMENT("001F.00.0420");
			flkPr.setIMPOL("STAD");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(onksl.getSTAD()));
			prs.add(flkPr);
		}

	}

	private void _001F_00_0430(OnkSl onksl, Collection<FlkPr> prs, XMLGregorianCalendar persDr) {
		if (onksl != null && onksl.getDS1T() == 3) {
			LocalDate dr = LocalDate.of(persDr.getYear(), persDr.getMonth(), persDr.getDay());
			if (dr.plusYears(18).isBefore(LocalDate.now()) && !n003Service.isValid(Integer.valueOf(onksl.getONKT()))) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("ONK_SL");
				flkPr.setCOMMENT("001F.00.0430");
				flkPr.setIMPOL("ONK_T");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(String.valueOf(onksl.getONKT()));
				prs.add(flkPr);
			}
		}
	}

	private void _001F_00_0440(OnkSl onksl, Collection<FlkPr> prs, XMLGregorianCalendar persDr) {
		if (onksl != null && onksl.getDS1T() == 3) {
			LocalDate dr = LocalDate.of(persDr.getYear(), persDr.getMonth(), persDr.getDay());
			if (dr.plusYears(18).isBefore(LocalDate.now()) && !n004Service.isValid(Integer.valueOf(onksl.getONKN()))) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("ONK_SL");
				flkPr.setCOMMENT("001F.00.0440");
				flkPr.setIMPOL("ONK_N");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(String.valueOf(onksl.getONKN()));
				prs.add(flkPr);
			}
		}
	}

	private void _001F_00_0450(OnkSl onksl, Collection<FlkPr> prs, XMLGregorianCalendar persDr) {
		if (onksl != null && onksl.getDS1T() == 3) {
			LocalDate dr = LocalDate.of(persDr.getYear(), persDr.getMonth(), persDr.getDay());
			if (dr.plusYears(18).isBefore(LocalDate.now()) && !n005Service.isValid(Integer.valueOf(onksl.getONKM()))) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("ONK_SL");
				flkPr.setCOMMENT("001F.00.0450");
				flkPr.setIMPOL("ONK_M");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(String.valueOf(onksl.getONKN()));
				prs.add(flkPr);
			}
		}
	}

	private void _001F_00_0460(BDIAG diag, Collection<FlkPr> prs) {
		if (diag.getDIAGDATE() == null || diag.getDIAGTIP() != 0) {
			if (diag.getDIAGTIP() == 1 && !n007Service.isValid(Integer.valueOf(diag.getDIAGCODE()))) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("B_DIAG");
				flkPr.setCOMMENT("001F.00.0460");
				flkPr.setIMPOL("DIAG_CODE");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(String.valueOf(diag.getDIAGCODE()));
				prs.add(flkPr);
			}
		}
	}

	private void _001F_00_0470(BDIAG diag, Collection<FlkPr> prs) {
		if (diag.getDIAGDATE() == null || diag.getDIAGTIP() != 0) {
			if (diag.getDIAGTIP() == 2 && !n011Service.isValid(Integer.valueOf(diag.getDIAGCODE()))) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("B_DIAG");
				flkPr.setCOMMENT("001F.00.0470");
				flkPr.setIMPOL("DIAG_CODE");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(String.valueOf(diag.getDIAGCODE()));
				prs.add(flkPr);
			}
		}
	}

	private void _001F_00_0480(BDIAG diag, Collection<FlkPr> prs) {
		if (diag.getRECRSLT() == 1) {
			if (diag.getDIAGTIP() == 1 && !n008Service.isValid(Integer.valueOf(diag.getDIAGRSLT()))) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("B_DIAG");
				flkPr.setCOMMENT("001F.00.0480");
				flkPr.setIMPOL("DIAG_RSLT");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(String.valueOf(diag.getDIAGRSLT()));
				prs.add(flkPr);
			}
		}
	}

	private void _001F_00_0490(BDIAG diag, Collection<FlkPr> prs) {
		if (diag.getRECRSLT() == 1) {
			if (diag.getDIAGTIP() == 2 && !n011Service.isValid(Integer.valueOf(diag.getDIAGRSLT()))) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("B_DIAG");
				flkPr.setCOMMENT("001F.00.0480");
				flkPr.setIMPOL("DIAG_RSLT");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(String.valueOf(diag.getDIAGRSLT()));
				prs.add(flkPr);
			}
		}
	}

	private void _001F_00_0500(BPROT prot, Collection<FlkPr> prs) {
		if (!n001Service.isValid(Integer.valueOf(prot.getPROT()))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("B_PROT");
			flkPr.setCOMMENT("001F.00.0500");
			flkPr.setIMPOL("PROT");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(prot.getPROT()));
			prs.add(flkPr);
		}

	}

	private void _001F_00_0510(ONKUSL usl, Collection<FlkPr> prs) {
		if (!n013Service.isValid(Integer.valueOf(usl.getUSLTIP()))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ONK_USL");
			flkPr.setCOMMENT("001F.00.0510");
			flkPr.setIMPOL("USL_TIP");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(usl.getUSLTIP()));
			prs.add(flkPr);
		}

	}

	private void _001F_00_0520(ONKUSL usl, Collection<FlkPr> prs) {
		if (usl.getUSLTIP() == 1 && !n014Service.isValid(Integer.valueOf(usl.getHIRTIP()))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ONK_USL");
			flkPr.setCOMMENT("001F.00.0520");
			flkPr.setIMPOL("HIR_TIP");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(usl.getHIRTIP()));
			prs.add(flkPr);
		}
	}

	private void _001F_00_0530(ONKUSL usl, Collection<FlkPr> prs) {
		if (usl.getUSLTIP() == 2 && !n015Service.isValid(Integer.valueOf(usl.getLEKTIPL()))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ONK_USL");
			flkPr.setCOMMENT("001F.00.0530");
			flkPr.setIMPOL("LEK_TIP_L");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(usl.getLEKTIPL()));
			prs.add(flkPr);
		}
	}

	private void _001F_00_0540(ONKUSL usl, Collection<FlkPr> prs) {
		if (usl.getUSLTIP() == 2 && !n016Service.isValid(Integer.valueOf(usl.getLEKTIPV()))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ONK_USL");
			flkPr.setCOMMENT("001F.00.0540");
			flkPr.setIMPOL("LEK_TIP_V");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(usl.getLEKTIPV()));
			prs.add(flkPr);
		}
	}

	private void _001F_00_0550(ONKUSL usl, Collection<FlkPr> prs) {
		if ((usl.getUSLTIP() == 3 || usl.getUSLTIP() == 4) && !n017Service.isValid(Integer.valueOf(usl.getLUCHTIP()))) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("ONK_USL");
			flkPr.setCOMMENT("001F.00.0550");
			flkPr.setIMPOL("LUCH_TIP");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(String.valueOf(usl.getLUCHTIP()));
			prs.add(flkPr);
		}
	}

	private void _001F_00_0560(LEKPR lekpr, Collection<FlkPr> prs) {
		if (!n020Service.isValid(lekpr.getREGNUM())) {
			FlkPr flkPr = new FlkPr();
			flkPr.setBASEL("LEK_PR");
			flkPr.setCOMMENT("001F.00.0560");
			flkPr.setIMPOL("REGNUM");
			flkPr.setOSHIB((short) 904);
			flkPr.setZNPOL(lekpr.getREGNUM());
			prs.add(flkPr);
		}
	}

	private void _001F_00_0571(Short usltip, LEKPR lekpr, Collection<FlkPr> prs, XMLGregorianCalendar persDr,
			String ds1) {
		LocalDate dr = LocalDate.of(persDr.getYear(), persDr.getMonth(), persDr.getDay());
		if (dr.plusYears(18).isBefore(LocalDate.now())
				&& (mkbService.isBetweenExcludingTo(ds1, "C00.0", "C81")
						|| (mkbService.isBetweenExcludingTo(ds1, "C81.0", "C97") && usltip == 2)
						|| mkbService.isBetweenExcludingFromAndTo(ds1, "C96", "D10")
						|| (mkbService.isBetweenExcludingTo(ds1, "D45", "D48") && usltip == 2))) {
			if (!v024Service.isValid(lekpr.getCODESH())) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("LEK_PR");
				flkPr.setCOMMENT("001F.00.0571");
				flkPr.setIMPOL("CODE_SH");
				flkPr.setOSHIB((short) 904);
				flkPr.setZNPOL(lekpr.getCODESH());
				prs.add(flkPr);
			}
		}
	}
	
	private void _001F_00_0580(Collection<FlkPr> prs, Sluch sluch) {
		if (sluch.getKSGKPG() != null && sluch.getKSGKPG().getNKPG() == null && sluch.getKSGKPG().getKSGPG() == 0) {
			String nksg = sluch.getKSGKPG().getNKSG();
			if (nksg == null || !v023Service.isValid(nksg)) {
				FlkPr flkPr = new FlkPr();
				flkPr.setBASEL("KSG_KPG");
				flkPr.setCOMMENT("001F.00.0580");
				flkPr.setIMPOL("N_KSG");
				flkPr.setOSHIB(nksg == null ? (short) 902 : (short) 904);
				flkPr.setZNPOL(nksg);
				prs.add(flkPr);
			}
		}
	}

}
