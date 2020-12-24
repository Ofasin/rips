/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistema.rips.pyp.utils;

import com.sistema.rips.pyp.entities.Frt4505;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import com.sistema.rips.pyp.entities.RipsAc;
import com.sistema.rips.pyp.entities.RipsAf;
import com.sistema.rips.pyp.entities.RipsAp;
import com.sistema.rips.pyp.entities.RipsAt;
import com.sistema.rips.pyp.entities.RipsUs;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {
    
    
    /**
     * Este método copia todas las propiedades en cascada que sean identicas en nombre  y tipo de retorno de un bean a un entity o viceversa
     * @param to
     * @param from
     */
    public static void copyProperties(Object to, Object from) {
        Method[] metodos = from.getClass().getMethods();
        Class<?>[] types = new Class[]{};
        Object[] args = new Object[]{};
        for(Method metodo: metodos) {
            String name = metodo.getName();
            Method metodoGetTo = null;
            Method metodoSetTo = null;
            Method metodoGetFrom = null;
            Object objFrom = null;
            Object objAux = null;
            String get = null;
            if(name.startsWith("set")) {
                try {
                    get = name.replaceFirst("set", "get");
                    metodoGetTo = to.getClass().getMethod(get, types);
                    metodoSetTo = to.getClass().getMethod(name, metodoGetTo.getReturnType());
                    metodoGetFrom = from.getClass().getMethod(get, types);
                    objFrom = metodoGetFrom.invoke(from, args);
                    metodoSetTo.invoke(to, objFrom);
                } catch(NoSuchMethodException nsme) {
                } catch(IllegalArgumentException ilegal) {
                    try {
                        objAux = metodoGetTo.getReturnType().newInstance();
                        copyProperties(objAux, objFrom);
                        metodoSetTo.invoke(to, objAux);
                    } catch(Exception ex) {
                    }
                } catch(Exception e) {
                }
            }
        }
    }

    public static RipsAc getAc(String Cups,String Cie,RipsUs ripsUs,Date Fec,String finConsl,RipsAf Fact) {
        RipsAc ripsAc =new RipsAc();
                   ripsAc.setCauextcons("15");
                   ripsAc.setCodcons(Cups);
                   ripsAc.setCodipsi("444300068301");
                   ripsAc.setCoopag("0");
                   ripsAc.setDiag1("");
                   ripsAc.setDiag2("");
                   ripsAc.setDiag3("");
                   ripsAc.setDiagppal(Cie);
                   ripsAc.setDocumento(ripsUs);
                   ripsAc.setFeccons(Fec);
                   ripsAc.setFincons(finConsl);
                   ripsAc.setNumaut("");
                   ripsAc.setNumfac(Fact);
                   ripsAc.setTipdiag("1");
                   ripsAc.setTipdoc(ripsUs.getTipdoc());
                   ripsAc.setValor("32000");
                   ripsAc.setVneto("32000");
        
        return ripsAc;
    }

   public static RipsAp getAP(String Cups1,String Cie1,RipsUs ripsUs,Date Fec,String finProced,RipsAf Fact){
   RipsAp ripsAp =new RipsAp();
   ripsAp.setActoqr("");
                   ripsAp.setAmbproc("1");
                   ripsAp.setCodipsi("444300068301");
                   ripsAp.setCodproc(Cups1);
                   ripsAp.setCompl("");
                   ripsAp.setDiag1("");
                   ripsAp.setDiagpp(Cie1);
                   ripsAp.setDocumento(ripsUs);
                   ripsAp.setFeccons(Fec);
                   ripsAp.setFinproc(finProced);
                   ripsAp.setNumaut("");
                   ripsAp.setNumfac(Fact);
                   ripsAp.setPersnprocd("");
                   ripsAp.setTipdoc(ripsUs.getTipdoc());
                   ripsAp.setVneto("15000");
   return ripsAp;
   }
   
   
   public static RipsAt getAT(String Cups1,String descrp,RipsUs ripsUs,RipsAf Fact){
   RipsAt ripsAt =new RipsAt();
   ripsAt.setCantd("15");
                   ripsAt.setCodipsi("444300068301");                   
                   ripsAt.setCodserv(Cups1);
                   ripsAt.setDocumento(ripsUs);
                   ripsAt.setNombserv(descrp);
                   ripsAt.setNumaut("");
                   ripsAt.setNumfac(Fact);
                   ripsAt.setTipdoc(ripsUs.getTipdoc());
                   ripsAt.setTipserv("1");
                   ripsAt.setValorund("100");
                   ripsAt.setVneto("1500");
                   ripsAt.setVneto("15000");
                   
   return ripsAt;
   }
   
   public static Frt4505 get4505(){
   Frt4505 frt4505 = new Frt4505();
           
 frt4505.setC0TipoDeRegistro(2);
   frt4505.setC2CodigoDeHabilitacionIpsPrimaria("444300068301");
   frt4505.setC11CodigoPertenenciaEtnica("6");
   frt4505.setC12CodigoDeOcupacion("9999");
   frt4505.setC13CodigoDeNivelEducativo(13);
   frt4505.setC14Gestacion(0);
   frt4505.setC15SifilisGestacionalOCongenita(0);
   frt4505.setC16HipertensionInducidaPorLaGestacion(0);
   frt4505.setC17HipotiroidismoCongenito(0);
   frt4505.setC18SintomaticoRespiratorio(2);
   frt4505.setC19TuberculosisMultidrogoresistente(0);
   frt4505.setC20Lepra(3);
   frt4505.setC21ObesidadODesnutricionProteicoCalorica(3);
   frt4505.setC22VictimaDeMaltrato(3);
   frt4505.setC23VictimaDeViolenciaSexual(2);
   frt4505.setC24InfeccionesDeTrasmisionSexual(2);
   frt4505.setC25EnfermedadMental(7);
   frt4505.setC26CancerDeCervix(0);
   frt4505.setC27CancerDeSeno(2);
   frt4505.setC28FluorosisDental(2);
   frt4505.setC29FechaDelPeso(generaData1());
   frt4505.setC30PesoEnKilogramos("999");
   frt4505.setC31FechaDeLaTalla(generaData1());
   frt4505.setC32TallaEnCentimetros(999 );
   frt4505.setC33FechaProbableDeParto(generaData());
   frt4505.setC34EdadGestacionalAlNacer(0);
   frt4505.setC35Bcg(0);
   frt4505.setC36HepatitisBMenoresDe1Ano(0);
   frt4505.setC37Pentavalente(0);
   frt4505.setC38Polio(0);
   frt4505.setC39DptMenoresDe5Anos(0);
   frt4505.setC40Rotavirus(0);
   frt4505.setC41Neumococo(0);
   frt4505.setC42InfluenzaNinos(0);
   frt4505.setC43FiebreAmarillaNinosDe1Ano(0);
   frt4505.setC44HepatitisA(0);
   frt4505.setC45TripleViralNinos(0);
   frt4505.setC46VirusDelPapilomaHumanoVph(0);
   frt4505.setC47TdOTtMujeresEnEdadFertil15A49Anos(0);
   frt4505.setC48ControlDePlacaBacteriana(0);
   frt4505.setC49FechaAtencionPartoOCesarea(generaData());
   frt4505.setC50FechaSalidaDeLaAtencionDelPartoOCesarea(generaData());
   frt4505.setC51FechaDeConsejeriaEnLactanciaMaterna(generaData());
   frt4505.setC52ControlDelRecienNacido(generaData());
   frt4505.setC53PlanificacionFamiliarPrimeraVez(generaData());
   frt4505.setC54SuministroDeMetodoAnticonceptivo(0);
   frt4505.setC55FechaSuministroDeMetodoAnticonceptivo(generaData());
   frt4505.setC56ControlPrenatalDePrimeraVez(generaData());
   frt4505.setC57ControlPrenatal(0);
   frt4505.setC58UltimoControlPrenatal(generaData());
   frt4505.setC59SuministroDeAcidoFolicoEnElUltimoControlPrenatal(0);
   frt4505.setC60SuministroDeSulfatoFerrosoEnElUltimoControlPrenatal(0);
   frt4505.setC61SuministroDeCarbonatoDeCalcioEnElUltimoControlPren(0);
   frt4505.setC62ValoracionDeLaAgudezaVisual(generaData());
   frt4505.setC63ConsultaPorOftalmologia(generaData());
   frt4505.setC64FechaDiagnosticoDesnutricionProteicoCalorica(generaData());
   frt4505.setC65ConsultaMujerOMenorVictimaDelMaltrato(generaData());
   frt4505.setC66ConsultaVictimasDeViolenciaSexual(generaData());
   frt4505.setC67ConsultaNutricion(generaData());
   frt4505.setC68ConsultaDePsicologia(generaData());
   frt4505.setC69ConsultaDeCrecimientoYDesarrolloPrimeraVez(generaData());
   frt4505.setC70SuministroDeSulfatoFerrosoEnLaUltimaConsultaDelMen(0);
   frt4505.setC71SuministroDeVitaminaAEnLaUltimaConsultaDelMenorDe(0);
   frt4505.setC72ConsultaDeJovenPrimeraVez(generaData());
   frt4505.setC73ConsultaDeAdultoPrimeraVez(generaData());
   frt4505.setC74PreservativosEntregadosAPacientesConIts(0);
   frt4505.setC75AsesoriaPreTestElisaParaVih(generaData());
   frt4505.setC76AsesoriaPosTestElisaParaVih(generaData());
   frt4505.setC77PacienteConDiagnosticoDeAnsiedadDepresionEsquizofreni(0);
   frt4505.setC78FechaAntigenoDeSuperficieHepatitisBEnGestantes(generaData());
   frt4505.setC79ResultadoAntigenoDeSuperficieHepatitisBEnGestantes(0);
   frt4505.setC80FechaSerologiaParaSifilis(generaData());
   frt4505.setC81ResultadoSerologiaParaSifilis(0);
   frt4505.setC82FechaDeTomaDeElisaParaVih(generaData());
   frt4505.setC83ResultadoElisaParaVih(0);
   frt4505.setC84FechaTshNeonatal(generaData());
   frt4505.setC85ResultadoDeTshNeonatal(0);
   frt4505.setC86TamizajeCancerDeCuelloUterino(0);
   frt4505.setC87CitologiaCervicouterina(generaData());
   frt4505.setC88CitologiaCervicouterinaResultadosSegunBethesda(0);
   frt4505.setC89CalidadEnLaMuestraDeCitologiaCervicouterina(0);
   frt4505.setC90CodigoDeHabilitacionIpsDondeSeTomaCitologiaCervicou("0");
   frt4505.setC91FechaColposcopia(generaData());
   frt4505.setC92CodigoDeHabilitacionIpsDondeSeTomaColposcopia("0");
   frt4505.setC93FechaBiopsiaCervical(generaData());
   frt4505.setC94ResultadoDeBiopsiaCervical(0);
   frt4505.setC95CodigoDeHabilitacionIpsDondeSeTomaBiopsiaCervical("0");
   frt4505.setC96FechaMamografia(generaData());
   frt4505.setC97ResultadoMamografia(0);
   frt4505.setC98CodigoDeHabilitacionIpsDondeSeTomaMamografia("0");
   frt4505.setC99FechaTomaBiopsiaSenoPorBacaf(generaData());
   frt4505.setC100FechaResultadoBiopsiaSenoPorBacaf(generaData());
   frt4505.setC101BiopsiaSenoPorBacaf(0);
   frt4505.setC102CodigoDeHabilitacionIpsDondeSeTomaBiopsiaSenoPor("0");
   frt4505.setC103FechaTomaDeHemoglobina(generaData());
   frt4505.setC104Hemoglobina("0");
   frt4505.setC105FechaDeLaTomaDeGlicemiaBasal(generaData());
   frt4505.setC106FechaCreatinina(generaData());
   frt4505.setC107Creatinina("0");
   frt4505.setC108FechaHemoglobinaGlicosilada(generaData());
   frt4505.setC109HemoglobinaGlicosilada(0);
   frt4505.setC110FechaTomaDeMicroalbuminuria(generaData());
   frt4505.setC111FechaTomaDeHdl(generaData());
   frt4505.setC112FechaTomaDeBaciloscopiaDeDiagnostico(generaData());
   frt4505.setC113BaciloscopiaDeDiagnostico(4);
   frt4505.setC114TratamientoParaHipotiroidismoCongenito(0);
   frt4505.setC115TratamientoParaSifilisGestacional(0);
   frt4505.setC116TratamientoParaSifilisCongenita(0);
   frt4505.setC117TratamientoParaLepra(0);
   frt4505.setC118FechaDeTerminacionTratamientoParaLeishmaniasis(generaData());
           
           return frt4505;
   
   }
   
   private static Date generaData() {
		Calendar dataFinal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fecFin = "1845-01-01";
                
                try {
             Date FecFin = sdf.parse(fecFin);
             dataFinal.setTime(FecFin);
		dataFinal.set(Calendar.HOUR_OF_DAY, 23);
		dataFinal.set(Calendar.MINUTE, 59);
		dataFinal.set(Calendar.SECOND, 59);
         } catch (ParseException ex) {
             Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
         }
                
		
		
		return dataFinal.getTime();
	}
   
   private static Date generaData1() {
		Calendar dataFinal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fecFin = "1800-01-01";
                
                try {
             Date FecFin = sdf.parse(fecFin);
             dataFinal.setTime(FecFin);
		dataFinal.set(Calendar.HOUR_OF_DAY, 23);
		dataFinal.set(Calendar.MINUTE, 59);
		dataFinal.set(Calendar.SECOND, 59);
         } catch (ParseException ex) {
             Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
         }
                
		
		
		return dataFinal.getTime();
	}
}
