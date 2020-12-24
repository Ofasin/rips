/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HeidelberNiwmanGonzalezIguaran */
@Entity
@Table(name = "frt_4505", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Frt4505.findAll", query = "SELECT f FROM Frt4505 f")
    , @NamedQuery(name = "Frt4505.findByCProgramaPyp", query = "SELECT f FROM Frt4505 f WHERE f.cProgramaPyp = :cProgramaPyp")
    , @NamedQuery(name = "Frt4505.findByCCodEps", query = "SELECT f FROM Frt4505 f WHERE f.cCodEps = :cCodEps")
    , @NamedQuery(name = "Frt4505.findByC0TipoDeRegistro", query = "SELECT f FROM Frt4505 f WHERE f.c0TipoDeRegistro = :c0TipoDeRegistro")
    , @NamedQuery(name = "Frt4505.findByC1ConsecutivoDeRegistro", query = "SELECT f FROM Frt4505 f WHERE f.c1ConsecutivoDeRegistro = :c1ConsecutivoDeRegistro")
    , @NamedQuery(name = "Frt4505.findByC2CodigoDeHabilitacionIpsPrimaria", query = "SELECT f FROM Frt4505 f WHERE f.c2CodigoDeHabilitacionIpsPrimaria = :c2CodigoDeHabilitacionIpsPrimaria")
    , @NamedQuery(name = "Frt4505.findByC3TipoDeIdentificacionDelUsuario", query = "SELECT f FROM Frt4505 f WHERE f.c3TipoDeIdentificacionDelUsuario = :c3TipoDeIdentificacionDelUsuario")
    , @NamedQuery(name = "Frt4505.findByC4NumeroDeIdentificacionDelUsuario", query = "SELECT f FROM Frt4505 f WHERE f.c4NumeroDeIdentificacionDelUsuario = :c4NumeroDeIdentificacionDelUsuario")
    , @NamedQuery(name = "Frt4505.findByC5PrimerApellidoDelUsuario", query = "SELECT f FROM Frt4505 f WHERE f.c5PrimerApellidoDelUsuario = :c5PrimerApellidoDelUsuario")
    , @NamedQuery(name = "Frt4505.findByC6SegundoApellidoDelUsuario", query = "SELECT f FROM Frt4505 f WHERE f.c6SegundoApellidoDelUsuario = :c6SegundoApellidoDelUsuario")
    , @NamedQuery(name = "Frt4505.findByC7PrimerNombreDelUsuario", query = "SELECT f FROM Frt4505 f WHERE f.c7PrimerNombreDelUsuario = :c7PrimerNombreDelUsuario")
    , @NamedQuery(name = "Frt4505.findByC8SegundoNombreDelUsuario", query = "SELECT f FROM Frt4505 f WHERE f.c8SegundoNombreDelUsuario = :c8SegundoNombreDelUsuario")
    , @NamedQuery(name = "Frt4505.findByC9FechaDeNacimiento", query = "SELECT f FROM Frt4505 f WHERE f.c9FechaDeNacimiento = :c9FechaDeNacimiento")
    , @NamedQuery(name = "Frt4505.findByC10Sexo", query = "SELECT f FROM Frt4505 f WHERE f.c10Sexo = :c10Sexo")
    , @NamedQuery(name = "Frt4505.findByC11CodigoPertenenciaEtnica", query = "SELECT f FROM Frt4505 f WHERE f.c11CodigoPertenenciaEtnica = :c11CodigoPertenenciaEtnica")
    , @NamedQuery(name = "Frt4505.findByC12CodigoDeOcupacion", query = "SELECT f FROM Frt4505 f WHERE f.c12CodigoDeOcupacion = :c12CodigoDeOcupacion")
    , @NamedQuery(name = "Frt4505.findByC13CodigoDeNivelEducativo", query = "SELECT f FROM Frt4505 f WHERE f.c13CodigoDeNivelEducativo = :c13CodigoDeNivelEducativo")
    , @NamedQuery(name = "Frt4505.findByC14Gestacion", query = "SELECT f FROM Frt4505 f WHERE f.c14Gestacion = :c14Gestacion")
    , @NamedQuery(name = "Frt4505.findByC15SifilisGestacionalOCongenita", query = "SELECT f FROM Frt4505 f WHERE f.c15SifilisGestacionalOCongenita = :c15SifilisGestacionalOCongenita")
    , @NamedQuery(name = "Frt4505.findByC16HipertensionInducidaPorLaGestacion", query = "SELECT f FROM Frt4505 f WHERE f.c16HipertensionInducidaPorLaGestacion = :c16HipertensionInducidaPorLaGestacion")
    , @NamedQuery(name = "Frt4505.findByC17HipotiroidismoCongenito", query = "SELECT f FROM Frt4505 f WHERE f.c17HipotiroidismoCongenito = :c17HipotiroidismoCongenito")
    , @NamedQuery(name = "Frt4505.findByC18SintomaticoRespiratorio", query = "SELECT f FROM Frt4505 f WHERE f.c18SintomaticoRespiratorio = :c18SintomaticoRespiratorio")
    , @NamedQuery(name = "Frt4505.findByC19TuberculosisMultidrogoresistente", query = "SELECT f FROM Frt4505 f WHERE f.c19TuberculosisMultidrogoresistente = :c19TuberculosisMultidrogoresistente")
    , @NamedQuery(name = "Frt4505.findByC20Lepra", query = "SELECT f FROM Frt4505 f WHERE f.c20Lepra = :c20Lepra")
    , @NamedQuery(name = "Frt4505.findByC21ObesidadODesnutricionProteicoCalorica", query = "SELECT f FROM Frt4505 f WHERE f.c21ObesidadODesnutricionProteicoCalorica = :c21ObesidadODesnutricionProteicoCalorica")
    , @NamedQuery(name = "Frt4505.findByC22VictimaDeMaltrato", query = "SELECT f FROM Frt4505 f WHERE f.c22VictimaDeMaltrato = :c22VictimaDeMaltrato")
    , @NamedQuery(name = "Frt4505.findByC23VictimaDeViolenciaSexual", query = "SELECT f FROM Frt4505 f WHERE f.c23VictimaDeViolenciaSexual = :c23VictimaDeViolenciaSexual")
    , @NamedQuery(name = "Frt4505.findByC24InfeccionesDeTrasmisionSexual", query = "SELECT f FROM Frt4505 f WHERE f.c24InfeccionesDeTrasmisionSexual = :c24InfeccionesDeTrasmisionSexual")
    , @NamedQuery(name = "Frt4505.findByC25EnfermedadMental", query = "SELECT f FROM Frt4505 f WHERE f.c25EnfermedadMental = :c25EnfermedadMental")
    , @NamedQuery(name = "Frt4505.findByC26CancerDeCervix", query = "SELECT f FROM Frt4505 f WHERE f.c26CancerDeCervix = :c26CancerDeCervix")
    , @NamedQuery(name = "Frt4505.findByC27CancerDeSeno", query = "SELECT f FROM Frt4505 f WHERE f.c27CancerDeSeno = :c27CancerDeSeno")
    , @NamedQuery(name = "Frt4505.findByC28FluorosisDental", query = "SELECT f FROM Frt4505 f WHERE f.c28FluorosisDental = :c28FluorosisDental")
    , @NamedQuery(name = "Frt4505.findByC29FechaDelPeso", query = "SELECT f FROM Frt4505 f WHERE f.c29FechaDelPeso = :c29FechaDelPeso")
    , @NamedQuery(name = "Frt4505.findByC30PesoEnKilogramos", query = "SELECT f FROM Frt4505 f WHERE f.c30PesoEnKilogramos = :c30PesoEnKilogramos")
    , @NamedQuery(name = "Frt4505.findByC31FechaDeLaTalla", query = "SELECT f FROM Frt4505 f WHERE f.c31FechaDeLaTalla = :c31FechaDeLaTalla")
    , @NamedQuery(name = "Frt4505.findByC32TallaEnCentimetros", query = "SELECT f FROM Frt4505 f WHERE f.c32TallaEnCentimetros = :c32TallaEnCentimetros")
    , @NamedQuery(name = "Frt4505.findByC33FechaProbableDeParto", query = "SELECT f FROM Frt4505 f WHERE f.c33FechaProbableDeParto = :c33FechaProbableDeParto")
    , @NamedQuery(name = "Frt4505.findByC34EdadGestacionalAlNacer", query = "SELECT f FROM Frt4505 f WHERE f.c34EdadGestacionalAlNacer = :c34EdadGestacionalAlNacer")
    , @NamedQuery(name = "Frt4505.findByC35Bcg", query = "SELECT f FROM Frt4505 f WHERE f.c35Bcg = :c35Bcg")
    , @NamedQuery(name = "Frt4505.findByC36HepatitisBMenoresDe1Ano", query = "SELECT f FROM Frt4505 f WHERE f.c36HepatitisBMenoresDe1Ano = :c36HepatitisBMenoresDe1Ano")
    , @NamedQuery(name = "Frt4505.findByC37Pentavalente", query = "SELECT f FROM Frt4505 f WHERE f.c37Pentavalente = :c37Pentavalente")
    , @NamedQuery(name = "Frt4505.findByC38Polio", query = "SELECT f FROM Frt4505 f WHERE f.c38Polio = :c38Polio")
    , @NamedQuery(name = "Frt4505.findByC39DptMenoresDe5Anos", query = "SELECT f FROM Frt4505 f WHERE f.c39DptMenoresDe5Anos = :c39DptMenoresDe5Anos")
    , @NamedQuery(name = "Frt4505.findByC40Rotavirus", query = "SELECT f FROM Frt4505 f WHERE f.c40Rotavirus = :c40Rotavirus")
    , @NamedQuery(name = "Frt4505.findByC41Neumococo", query = "SELECT f FROM Frt4505 f WHERE f.c41Neumococo = :c41Neumococo")
    , @NamedQuery(name = "Frt4505.findByC42InfluenzaNinos", query = "SELECT f FROM Frt4505 f WHERE f.c42InfluenzaNinos = :c42InfluenzaNinos")
    , @NamedQuery(name = "Frt4505.findByC43FiebreAmarillaNinosDe1Ano", query = "SELECT f FROM Frt4505 f WHERE f.c43FiebreAmarillaNinosDe1Ano = :c43FiebreAmarillaNinosDe1Ano")
    , @NamedQuery(name = "Frt4505.findByC44HepatitisA", query = "SELECT f FROM Frt4505 f WHERE f.c44HepatitisA = :c44HepatitisA")
    , @NamedQuery(name = "Frt4505.findByC45TripleViralNinos", query = "SELECT f FROM Frt4505 f WHERE f.c45TripleViralNinos = :c45TripleViralNinos")
    , @NamedQuery(name = "Frt4505.findByC46VirusDelPapilomaHumanoVph", query = "SELECT f FROM Frt4505 f WHERE f.c46VirusDelPapilomaHumanoVph = :c46VirusDelPapilomaHumanoVph")
    , @NamedQuery(name = "Frt4505.findByC47TdOTtMujeresEnEdadFertil15A49Anos", query = "SELECT f FROM Frt4505 f WHERE f.c47TdOTtMujeresEnEdadFertil15A49Anos = :c47TdOTtMujeresEnEdadFertil15A49Anos")
    , @NamedQuery(name = "Frt4505.findByC48ControlDePlacaBacteriana", query = "SELECT f FROM Frt4505 f WHERE f.c48ControlDePlacaBacteriana = :c48ControlDePlacaBacteriana")
    , @NamedQuery(name = "Frt4505.findByC49FechaAtencionPartoOCesarea", query = "SELECT f FROM Frt4505 f WHERE f.c49FechaAtencionPartoOCesarea = :c49FechaAtencionPartoOCesarea")
    , @NamedQuery(name = "Frt4505.findByC50FechaSalidaDeLaAtencionDelPartoOCesarea", query = "SELECT f FROM Frt4505 f WHERE f.c50FechaSalidaDeLaAtencionDelPartoOCesarea = :c50FechaSalidaDeLaAtencionDelPartoOCesarea")
    , @NamedQuery(name = "Frt4505.findByC51FechaDeConsejeriaEnLactanciaMaterna", query = "SELECT f FROM Frt4505 f WHERE f.c51FechaDeConsejeriaEnLactanciaMaterna = :c51FechaDeConsejeriaEnLactanciaMaterna")
    , @NamedQuery(name = "Frt4505.findByC52ControlDelRecienNacido", query = "SELECT f FROM Frt4505 f WHERE f.c52ControlDelRecienNacido = :c52ControlDelRecienNacido")
    , @NamedQuery(name = "Frt4505.findByC53PlanificacionFamiliarPrimeraVez", query = "SELECT f FROM Frt4505 f WHERE f.c53PlanificacionFamiliarPrimeraVez = :c53PlanificacionFamiliarPrimeraVez")
    , @NamedQuery(name = "Frt4505.findByC54SuministroDeMetodoAnticonceptivo", query = "SELECT f FROM Frt4505 f WHERE f.c54SuministroDeMetodoAnticonceptivo = :c54SuministroDeMetodoAnticonceptivo")
    , @NamedQuery(name = "Frt4505.findByC55FechaSuministroDeMetodoAnticonceptivo", query = "SELECT f FROM Frt4505 f WHERE f.c55FechaSuministroDeMetodoAnticonceptivo = :c55FechaSuministroDeMetodoAnticonceptivo")
    , @NamedQuery(name = "Frt4505.findByC56ControlPrenatalDePrimeraVez", query = "SELECT f FROM Frt4505 f WHERE f.c56ControlPrenatalDePrimeraVez = :c56ControlPrenatalDePrimeraVez")
    , @NamedQuery(name = "Frt4505.findByC57ControlPrenatal", query = "SELECT f FROM Frt4505 f WHERE f.c57ControlPrenatal = :c57ControlPrenatal")
    , @NamedQuery(name = "Frt4505.findByC58UltimoControlPrenatal", query = "SELECT f FROM Frt4505 f WHERE f.c58UltimoControlPrenatal = :c58UltimoControlPrenatal")
    , @NamedQuery(name = "Frt4505.findByC59SuministroDeAcidoFolicoEnElUltimoControlPrenatal", query = "SELECT f FROM Frt4505 f WHERE f.c59SuministroDeAcidoFolicoEnElUltimoControlPrenatal = :c59SuministroDeAcidoFolicoEnElUltimoControlPrenatal")
    , @NamedQuery(name = "Frt4505.findByC60SuministroDeSulfatoFerrosoEnElUltimoControlPrenatal", query = "SELECT f FROM Frt4505 f WHERE f.c60SuministroDeSulfatoFerrosoEnElUltimoControlPrenatal = :c60SuministroDeSulfatoFerrosoEnElUltimoControlPrenatal")
    , @NamedQuery(name = "Frt4505.findByC61SuministroDeCarbonatoDeCalcioEnElUltimoControlPren", query = "SELECT f FROM Frt4505 f WHERE f.c61SuministroDeCarbonatoDeCalcioEnElUltimoControlPren = :c61SuministroDeCarbonatoDeCalcioEnElUltimoControlPren")
    , @NamedQuery(name = "Frt4505.findByC62ValoracionDeLaAgudezaVisual", query = "SELECT f FROM Frt4505 f WHERE f.c62ValoracionDeLaAgudezaVisual = :c62ValoracionDeLaAgudezaVisual")
    , @NamedQuery(name = "Frt4505.findByC63ConsultaPorOftalmologia", query = "SELECT f FROM Frt4505 f WHERE f.c63ConsultaPorOftalmologia = :c63ConsultaPorOftalmologia")
    , @NamedQuery(name = "Frt4505.findByC64FechaDiagnosticoDesnutricionProteicoCalorica", query = "SELECT f FROM Frt4505 f WHERE f.c64FechaDiagnosticoDesnutricionProteicoCalorica = :c64FechaDiagnosticoDesnutricionProteicoCalorica")
    , @NamedQuery(name = "Frt4505.findByC65ConsultaMujerOMenorVictimaDelMaltrato", query = "SELECT f FROM Frt4505 f WHERE f.c65ConsultaMujerOMenorVictimaDelMaltrato = :c65ConsultaMujerOMenorVictimaDelMaltrato")
    , @NamedQuery(name = "Frt4505.findByC66ConsultaVictimasDeViolenciaSexual", query = "SELECT f FROM Frt4505 f WHERE f.c66ConsultaVictimasDeViolenciaSexual = :c66ConsultaVictimasDeViolenciaSexual")
    , @NamedQuery(name = "Frt4505.findByC67ConsultaNutricion", query = "SELECT f FROM Frt4505 f WHERE f.c67ConsultaNutricion = :c67ConsultaNutricion")
    , @NamedQuery(name = "Frt4505.findByC68ConsultaDePsicologia", query = "SELECT f FROM Frt4505 f WHERE f.c68ConsultaDePsicologia = :c68ConsultaDePsicologia")
    , @NamedQuery(name = "Frt4505.findByC69ConsultaDeCrecimientoYDesarrolloPrimeraVez", query = "SELECT f FROM Frt4505 f WHERE f.c69ConsultaDeCrecimientoYDesarrolloPrimeraVez = :c69ConsultaDeCrecimientoYDesarrolloPrimeraVez")
    , @NamedQuery(name = "Frt4505.findByC70SuministroDeSulfatoFerrosoEnLaUltimaConsultaDelMen", query = "SELECT f FROM Frt4505 f WHERE f.c70SuministroDeSulfatoFerrosoEnLaUltimaConsultaDelMen = :c70SuministroDeSulfatoFerrosoEnLaUltimaConsultaDelMen")
    , @NamedQuery(name = "Frt4505.findByC71SuministroDeVitaminaAEnLaUltimaConsultaDelMenorDe", query = "SELECT f FROM Frt4505 f WHERE f.c71SuministroDeVitaminaAEnLaUltimaConsultaDelMenorDe = :c71SuministroDeVitaminaAEnLaUltimaConsultaDelMenorDe")
    , @NamedQuery(name = "Frt4505.findByC72ConsultaDeJovenPrimeraVez", query = "SELECT f FROM Frt4505 f WHERE f.c72ConsultaDeJovenPrimeraVez = :c72ConsultaDeJovenPrimeraVez")
    , @NamedQuery(name = "Frt4505.findByC73ConsultaDeAdultoPrimeraVez", query = "SELECT f FROM Frt4505 f WHERE f.c73ConsultaDeAdultoPrimeraVez = :c73ConsultaDeAdultoPrimeraVez")
    , @NamedQuery(name = "Frt4505.findByC74PreservativosEntregadosAPacientesConIts", query = "SELECT f FROM Frt4505 f WHERE f.c74PreservativosEntregadosAPacientesConIts = :c74PreservativosEntregadosAPacientesConIts")
    , @NamedQuery(name = "Frt4505.findByC75AsesoriaPreTestElisaParaVih", query = "SELECT f FROM Frt4505 f WHERE f.c75AsesoriaPreTestElisaParaVih = :c75AsesoriaPreTestElisaParaVih")
    , @NamedQuery(name = "Frt4505.findByC76AsesoriaPosTestElisaParaVih", query = "SELECT f FROM Frt4505 f WHERE f.c76AsesoriaPosTestElisaParaVih = :c76AsesoriaPosTestElisaParaVih")
    , @NamedQuery(name = "Frt4505.findByC77PacienteConDiagnosticoDeAnsiedadDepresionEsquizofreni", query = "SELECT f FROM Frt4505 f WHERE f.c77PacienteConDiagnosticoDeAnsiedadDepresionEsquizofreni = :c77PacienteConDiagnosticoDeAnsiedadDepresionEsquizofreni")
    , @NamedQuery(name = "Frt4505.findByC78FechaAntigenoDeSuperficieHepatitisBEnGestantes", query = "SELECT f FROM Frt4505 f WHERE f.c78FechaAntigenoDeSuperficieHepatitisBEnGestantes = :c78FechaAntigenoDeSuperficieHepatitisBEnGestantes")
    , @NamedQuery(name = "Frt4505.findByC79ResultadoAntigenoDeSuperficieHepatitisBEnGestantes", query = "SELECT f FROM Frt4505 f WHERE f.c79ResultadoAntigenoDeSuperficieHepatitisBEnGestantes = :c79ResultadoAntigenoDeSuperficieHepatitisBEnGestantes")
    , @NamedQuery(name = "Frt4505.findByC80FechaSerologiaParaSifilis", query = "SELECT f FROM Frt4505 f WHERE f.c80FechaSerologiaParaSifilis = :c80FechaSerologiaParaSifilis")
    , @NamedQuery(name = "Frt4505.findByC81ResultadoSerologiaParaSifilis", query = "SELECT f FROM Frt4505 f WHERE f.c81ResultadoSerologiaParaSifilis = :c81ResultadoSerologiaParaSifilis")
    , @NamedQuery(name = "Frt4505.findByC82FechaDeTomaDeElisaParaVih", query = "SELECT f FROM Frt4505 f WHERE f.c82FechaDeTomaDeElisaParaVih = :c82FechaDeTomaDeElisaParaVih")
    , @NamedQuery(name = "Frt4505.findByC83ResultadoElisaParaVih", query = "SELECT f FROM Frt4505 f WHERE f.c83ResultadoElisaParaVih = :c83ResultadoElisaParaVih")
    , @NamedQuery(name = "Frt4505.findByC84FechaTshNeonatal", query = "SELECT f FROM Frt4505 f WHERE f.c84FechaTshNeonatal = :c84FechaTshNeonatal")
    , @NamedQuery(name = "Frt4505.findByC85ResultadoDeTshNeonatal", query = "SELECT f FROM Frt4505 f WHERE f.c85ResultadoDeTshNeonatal = :c85ResultadoDeTshNeonatal")
    , @NamedQuery(name = "Frt4505.findByC86TamizajeCancerDeCuelloUterino", query = "SELECT f FROM Frt4505 f WHERE f.c86TamizajeCancerDeCuelloUterino = :c86TamizajeCancerDeCuelloUterino")
    , @NamedQuery(name = "Frt4505.findByC87CitologiaCervicouterina", query = "SELECT f FROM Frt4505 f WHERE f.c87CitologiaCervicouterina = :c87CitologiaCervicouterina")
    , @NamedQuery(name = "Frt4505.findByC88CitologiaCervicouterinaResultadosSegunBethesda", query = "SELECT f FROM Frt4505 f WHERE f.c88CitologiaCervicouterinaResultadosSegunBethesda = :c88CitologiaCervicouterinaResultadosSegunBethesda")
    , @NamedQuery(name = "Frt4505.findByC89CalidadEnLaMuestraDeCitologiaCervicouterina", query = "SELECT f FROM Frt4505 f WHERE f.c89CalidadEnLaMuestraDeCitologiaCervicouterina = :c89CalidadEnLaMuestraDeCitologiaCervicouterina")
    , @NamedQuery(name = "Frt4505.findByC90CodigoDeHabilitacionIpsDondeSeTomaCitologiaCervicou", query = "SELECT f FROM Frt4505 f WHERE f.c90CodigoDeHabilitacionIpsDondeSeTomaCitologiaCervicou = :c90CodigoDeHabilitacionIpsDondeSeTomaCitologiaCervicou")
    , @NamedQuery(name = "Frt4505.findByC91FechaColposcopia", query = "SELECT f FROM Frt4505 f WHERE f.c91FechaColposcopia = :c91FechaColposcopia")
    , @NamedQuery(name = "Frt4505.findByC92CodigoDeHabilitacionIpsDondeSeTomaColposcopia", query = "SELECT f FROM Frt4505 f WHERE f.c92CodigoDeHabilitacionIpsDondeSeTomaColposcopia = :c92CodigoDeHabilitacionIpsDondeSeTomaColposcopia")
    , @NamedQuery(name = "Frt4505.findByC93FechaBiopsiaCervical", query = "SELECT f FROM Frt4505 f WHERE f.c93FechaBiopsiaCervical = :c93FechaBiopsiaCervical")
    , @NamedQuery(name = "Frt4505.findByC94ResultadoDeBiopsiaCervical", query = "SELECT f FROM Frt4505 f WHERE f.c94ResultadoDeBiopsiaCervical = :c94ResultadoDeBiopsiaCervical")
    , @NamedQuery(name = "Frt4505.findByC95CodigoDeHabilitacionIpsDondeSeTomaBiopsiaCervical", query = "SELECT f FROM Frt4505 f WHERE f.c95CodigoDeHabilitacionIpsDondeSeTomaBiopsiaCervical = :c95CodigoDeHabilitacionIpsDondeSeTomaBiopsiaCervical")
    , @NamedQuery(name = "Frt4505.findByC96FechaMamografia", query = "SELECT f FROM Frt4505 f WHERE f.c96FechaMamografia = :c96FechaMamografia")
    , @NamedQuery(name = "Frt4505.findByC97ResultadoMamografia", query = "SELECT f FROM Frt4505 f WHERE f.c97ResultadoMamografia = :c97ResultadoMamografia")
    , @NamedQuery(name = "Frt4505.findByC98CodigoDeHabilitacionIpsDondeSeTomaMamografia", query = "SELECT f FROM Frt4505 f WHERE f.c98CodigoDeHabilitacionIpsDondeSeTomaMamografia = :c98CodigoDeHabilitacionIpsDondeSeTomaMamografia")
    , @NamedQuery(name = "Frt4505.findByC99FechaTomaBiopsiaSenoPorBacaf", query = "SELECT f FROM Frt4505 f WHERE f.c99FechaTomaBiopsiaSenoPorBacaf = :c99FechaTomaBiopsiaSenoPorBacaf")
    , @NamedQuery(name = "Frt4505.findByC100FechaResultadoBiopsiaSenoPorBacaf", query = "SELECT f FROM Frt4505 f WHERE f.c100FechaResultadoBiopsiaSenoPorBacaf = :c100FechaResultadoBiopsiaSenoPorBacaf")
    , @NamedQuery(name = "Frt4505.findByC101BiopsiaSenoPorBacaf", query = "SELECT f FROM Frt4505 f WHERE f.c101BiopsiaSenoPorBacaf = :c101BiopsiaSenoPorBacaf")
    , @NamedQuery(name = "Frt4505.findByC102CodigoDeHabilitacionIpsDondeSeTomaBiopsiaSenoPor", query = "SELECT f FROM Frt4505 f WHERE f.c102CodigoDeHabilitacionIpsDondeSeTomaBiopsiaSenoPor = :c102CodigoDeHabilitacionIpsDondeSeTomaBiopsiaSenoPor")
    , @NamedQuery(name = "Frt4505.findByC103FechaTomaDeHemoglobina", query = "SELECT f FROM Frt4505 f WHERE f.c103FechaTomaDeHemoglobina = :c103FechaTomaDeHemoglobina")
    , @NamedQuery(name = "Frt4505.findByC104Hemoglobina", query = "SELECT f FROM Frt4505 f WHERE f.c104Hemoglobina = :c104Hemoglobina")
    , @NamedQuery(name = "Frt4505.findByC105FechaDeLaTomaDeGlicemiaBasal", query = "SELECT f FROM Frt4505 f WHERE f.c105FechaDeLaTomaDeGlicemiaBasal = :c105FechaDeLaTomaDeGlicemiaBasal")
    , @NamedQuery(name = "Frt4505.findByC106FechaCreatinina", query = "SELECT f FROM Frt4505 f WHERE f.c106FechaCreatinina = :c106FechaCreatinina")
    , @NamedQuery(name = "Frt4505.findByC107Creatinina", query = "SELECT f FROM Frt4505 f WHERE f.c107Creatinina = :c107Creatinina")
    , @NamedQuery(name = "Frt4505.findByC108FechaHemoglobinaGlicosilada", query = "SELECT f FROM Frt4505 f WHERE f.c108FechaHemoglobinaGlicosilada = :c108FechaHemoglobinaGlicosilada")
    , @NamedQuery(name = "Frt4505.findByC109HemoglobinaGlicosilada", query = "SELECT f FROM Frt4505 f WHERE f.c109HemoglobinaGlicosilada = :c109HemoglobinaGlicosilada")
    , @NamedQuery(name = "Frt4505.findByC110FechaTomaDeMicroalbuminuria", query = "SELECT f FROM Frt4505 f WHERE f.c110FechaTomaDeMicroalbuminuria = :c110FechaTomaDeMicroalbuminuria")
    , @NamedQuery(name = "Frt4505.findByC111FechaTomaDeHdl", query = "SELECT f FROM Frt4505 f WHERE f.c111FechaTomaDeHdl = :c111FechaTomaDeHdl")
    , @NamedQuery(name = "Frt4505.findByC112FechaTomaDeBaciloscopiaDeDiagnostico", query = "SELECT f FROM Frt4505 f WHERE f.c112FechaTomaDeBaciloscopiaDeDiagnostico = :c112FechaTomaDeBaciloscopiaDeDiagnostico")
    , @NamedQuery(name = "Frt4505.findByC113BaciloscopiaDeDiagnostico", query = "SELECT f FROM Frt4505 f WHERE f.c113BaciloscopiaDeDiagnostico = :c113BaciloscopiaDeDiagnostico")
    , @NamedQuery(name = "Frt4505.findByC114TratamientoParaHipotiroidismoCongenito", query = "SELECT f FROM Frt4505 f WHERE f.c114TratamientoParaHipotiroidismoCongenito = :c114TratamientoParaHipotiroidismoCongenito")
    , @NamedQuery(name = "Frt4505.findByC115TratamientoParaSifilisGestacional", query = "SELECT f FROM Frt4505 f WHERE f.c115TratamientoParaSifilisGestacional = :c115TratamientoParaSifilisGestacional")
    , @NamedQuery(name = "Frt4505.findByC116TratamientoParaSifilisCongenita", query = "SELECT f FROM Frt4505 f WHERE f.c116TratamientoParaSifilisCongenita = :c116TratamientoParaSifilisCongenita")
    , @NamedQuery(name = "Frt4505.findByC117TratamientoParaLepra", query = "SELECT f FROM Frt4505 f WHERE f.c117TratamientoParaLepra = :c117TratamientoParaLepra")
    , @NamedQuery(name = "Frt4505.findByC118FechaDeTerminacionTratamientoParaLeishmaniasis", query = "SELECT f FROM Frt4505 f WHERE f.c118FechaDeTerminacionTratamientoParaLeishmaniasis = :c118FechaDeTerminacionTratamientoParaLeishmaniasis")})
public class Frt4505 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "c_programa_pyp")
    private String cProgramaPyp;
    @Size(max = 255)
    @Column(name = "c_cod_eps")
    private String cCodEps;
    @Column(name = "c0_tipo_de_registro")
    private Integer c0TipoDeRegistro;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ress_generator")
    @SequenceGenerator(name="ress_generator", sequenceName = "sec_ress", allocationSize=1)
    @Basic(optional = false)
    @NotNull
    @Column(name = "c1_consecutivo_de_registro")
    private Integer c1ConsecutivoDeRegistro;
    
    @Size(max = 255)
    @Column(name = "c2_codigo_de_habilitacion_ips_primaria")
    private String c2CodigoDeHabilitacionIpsPrimaria;
    @Size(max = 255)
    @Column(name = "c3_tipo_de_identificacion_del_usuario")
    private String c3TipoDeIdentificacionDelUsuario;
    @Size(max = 255)
    @Column(name = "c4_numero_de_identificacion_del_usuario")
    private String c4NumeroDeIdentificacionDelUsuario;
    @Size(max = 255)
    @Column(name = "c5_primer_apellido_del_usuario")
    private String c5PrimerApellidoDelUsuario;
    @Size(max = 255)
    @Column(name = "c6_segundo_apellido_del_usuario")
    private String c6SegundoApellidoDelUsuario;
    @Size(max = 255)
    @Column(name = "c7_primer_nombre_del_usuario")
    private String c7PrimerNombreDelUsuario;
    @Size(max = 255)
    @Column(name = "c8_segundo_nombre_del_usuario")
    private String c8SegundoNombreDelUsuario;
    @Column(name = "c9_fecha_de_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date c9FechaDeNacimiento;
    @Size(max = 255)
    @Column(name = "c10_sexo")
    private String c10Sexo;
    @Size(max = 255)
    @Column(name = "c11_codigo_pertenencia_etnica")
    private String c11CodigoPertenenciaEtnica;
    @Size(max = 255)
    @Column(name = "c12_codigo_de_ocupacion")
    private String c12CodigoDeOcupacion;
    @Column(name = "c13_codigo_de_nivel_educativo")
    private Integer c13CodigoDeNivelEducativo;
    @Column(name = "c14_gestacion")
    private Integer c14Gestacion;
    @Column(name = "c15_sifilis_gestacional_o_congenita")
    private Integer c15SifilisGestacionalOCongenita;
    @Column(name = "c16_hipertension_inducida_por_la_gestacion")
    private Integer c16HipertensionInducidaPorLaGestacion;
    @Column(name = "c17_hipotiroidismo_congenito")
    private Integer c17HipotiroidismoCongenito;
    @Column(name = "c18_sintomatico_respiratorio")
    private Integer c18SintomaticoRespiratorio;
    @Column(name = "c19_tuberculosis_multidrogoresistente")
    private Integer c19TuberculosisMultidrogoresistente;
    @Column(name = "c20_lepra")
    private Integer c20Lepra;
    @Column(name = "c21_obesidad_o_desnutricion_proteico_calorica")
    private Integer c21ObesidadODesnutricionProteicoCalorica;
    @Column(name = "c22_victima_de_maltrato")
    private Integer c22VictimaDeMaltrato;
    @Column(name = "c23_victima_de_violencia_sexual")
    private Integer c23VictimaDeViolenciaSexual;
    @Column(name = "c24_infecciones_de_trasmision_sexual")
    private Integer c24InfeccionesDeTrasmisionSexual;
    @Column(name = "c25_enfermedad_mental")
    private Integer c25EnfermedadMental;
    @Column(name = "c26_cancer_de_cervix")
    private Integer c26CancerDeCervix;
    @Column(name = "c27_cancer_de_seno")
    private Integer c27CancerDeSeno;
    @Column(name = "c28_fluorosis_dental")
    private Integer c28FluorosisDental;
    @Column(name = "c29_fecha_del_peso")
    @Temporal(TemporalType.DATE)
    private Date c29FechaDelPeso;
    @Size(max = 11)
    @Column(name = "c30_peso_en_kilogramos")
    private String c30PesoEnKilogramos;
    @Column(name = "c31_fecha_de_la_talla")
    @Temporal(TemporalType.DATE)
    private Date c31FechaDeLaTalla;
    @Column(name = "c32_talla_en_centimetros")
    private Integer c32TallaEnCentimetros;
    @Column(name = "c33_fecha_probable_de_parto")
    @Temporal(TemporalType.DATE)
    private Date c33FechaProbableDeParto;
    @Column(name = "c34_edad_gestacional_al_nacer")
    private Integer c34EdadGestacionalAlNacer;
    @Column(name = "c35_bcg")
    private Integer c35Bcg;
    @Column(name = "c36_hepatitis_b_menores_de_1_ano")
    private Integer c36HepatitisBMenoresDe1Ano;
    @Column(name = "c37_pentavalente")
    private Integer c37Pentavalente;
    @Column(name = "c38_polio")
    private Integer c38Polio;
    @Column(name = "c39_dpt_menores_de_5_anos")
    private Integer c39DptMenoresDe5Anos;
    @Column(name = "c40_rotavirus")
    private Integer c40Rotavirus;
    @Column(name = "c41_neumococo")
    private Integer c41Neumococo;
    @Column(name = "c42_influenza_ninos")
    private Integer c42InfluenzaNinos;
    @Column(name = "c43_fiebre_amarilla_ninos_de_1_ano")
    private Integer c43FiebreAmarillaNinosDe1Ano;
    @Column(name = "c44_hepatitis_a")
    private Integer c44HepatitisA;
    @Column(name = "c45_triple_viral_ninos")
    private Integer c45TripleViralNinos;
    @Column(name = "c46_virus_del_papiloma_humano_vph")
    private Integer c46VirusDelPapilomaHumanoVph;
    @Column(name = "c47_td_o_tt_mujeres_en_edad_fertil_15_a_49_anos")
    private Integer c47TdOTtMujeresEnEdadFertil15A49Anos;
    @Column(name = "c48_control_de_placa_bacteriana")
    private Integer c48ControlDePlacaBacteriana;
    @Column(name = "c49_fecha_atencion_parto_o_cesarea")
    @Temporal(TemporalType.DATE)
    private Date c49FechaAtencionPartoOCesarea;
    @Column(name = "c50_fecha_salida_de_la_atencion_del_parto_o_cesarea")
    @Temporal(TemporalType.DATE)
    private Date c50FechaSalidaDeLaAtencionDelPartoOCesarea;
    @Column(name = "c51_fecha_de_consejeria_en_lactancia_materna")
    @Temporal(TemporalType.DATE)
    private Date c51FechaDeConsejeriaEnLactanciaMaterna;
    @Column(name = "c52_control_del_recien_nacido")
    @Temporal(TemporalType.DATE)
    private Date c52ControlDelRecienNacido;
    @Column(name = "c53_planificacion_familiar_primera_vez")
    @Temporal(TemporalType.DATE)
    private Date c53PlanificacionFamiliarPrimeraVez;
    @Column(name = "c54_suministro_de_metodo_anticonceptivo")
    private Integer c54SuministroDeMetodoAnticonceptivo;
    @Column(name = "c55_fecha_suministro_de_metodo_anticonceptivo")
    @Temporal(TemporalType.DATE)
    private Date c55FechaSuministroDeMetodoAnticonceptivo;
    @Column(name = "c56_control_prenatal_de_primera_vez")
    @Temporal(TemporalType.DATE)
    private Date c56ControlPrenatalDePrimeraVez;
    @Column(name = "c57_control_prenatal")
    private Integer c57ControlPrenatal;
    @Column(name = "c58_ultimo_control_prenatal")
    @Temporal(TemporalType.DATE)
    private Date c58UltimoControlPrenatal;
    @Column(name = "c59_suministro_de_acido_folico_en_el_ultimo_control_prenatal")
    private Integer c59SuministroDeAcidoFolicoEnElUltimoControlPrenatal;
    @Column(name = "c60_suministro_de_sulfato_ferroso_en_el_ultimo_control_prenatal")
    private Integer c60SuministroDeSulfatoFerrosoEnElUltimoControlPrenatal;
    @Column(name = "c61_suministro_de_carbonato_de_calcio_en_el_ultimo_control_pren")
    private Integer c61SuministroDeCarbonatoDeCalcioEnElUltimoControlPren;
    @Column(name = "c62_valoracion_de_la_agudeza_visual")
    @Temporal(TemporalType.DATE)
    private Date c62ValoracionDeLaAgudezaVisual;
    @Column(name = "c63_consulta_por_oftalmologia")
    @Temporal(TemporalType.DATE)
    private Date c63ConsultaPorOftalmologia;
    @Column(name = "c64_fecha_diagnostico_desnutricion_proteico_calorica")
    @Temporal(TemporalType.DATE)
    private Date c64FechaDiagnosticoDesnutricionProteicoCalorica;
    @Column(name = "c65_consulta_mujer_o_menor_victima_del_maltrato")
    @Temporal(TemporalType.DATE)
    private Date c65ConsultaMujerOMenorVictimaDelMaltrato;
    @Column(name = "c66_consulta_victimas_de_violencia_sexual")
    @Temporal(TemporalType.DATE)
    private Date c66ConsultaVictimasDeViolenciaSexual;
    @Column(name = "c67_consulta_nutricion")
    @Temporal(TemporalType.DATE)
    private Date c67ConsultaNutricion;
    @Column(name = "c68_consulta_de_psicologia")
    @Temporal(TemporalType.DATE)
    private Date c68ConsultaDePsicologia;
    @Column(name = "c69_consulta_de_crecimiento_y_desarrollo_primera_vez")
    @Temporal(TemporalType.DATE)
    private Date c69ConsultaDeCrecimientoYDesarrolloPrimeraVez;
    @Column(name = "c70_suministro_de_sulfato_ferroso_en_la_ultima_consulta_del_men")
    private Integer c70SuministroDeSulfatoFerrosoEnLaUltimaConsultaDelMen;
    @Column(name = "c71_suministro_de_vitamina_a_en_la_ultima_consulta_del_menor_de")
    private Integer c71SuministroDeVitaminaAEnLaUltimaConsultaDelMenorDe;
    @Column(name = "c72_consulta_de_joven_primera_vez")
    @Temporal(TemporalType.DATE)
    private Date c72ConsultaDeJovenPrimeraVez;
    @Column(name = "c73_consulta_de_adulto_primera_vez")
    @Temporal(TemporalType.DATE)
    private Date c73ConsultaDeAdultoPrimeraVez;
    @Column(name = "c74_preservativos_entregados_a_pacientes_con_its")
    private Integer c74PreservativosEntregadosAPacientesConIts;
    @Column(name = "c75_asesoria_pre_test_elisa_para_vih")
    @Temporal(TemporalType.DATE)
    private Date c75AsesoriaPreTestElisaParaVih;
    @Column(name = "c76_asesoria_pos_test_elisa_para_vih")
    @Temporal(TemporalType.DATE)
    private Date c76AsesoriaPosTestElisaParaVih;
    @Column(name = "c77_paciente_con_diagnostico_de_ansiedad_depresion_esquizofreni")
    private Integer c77PacienteConDiagnosticoDeAnsiedadDepresionEsquizofreni;
    @Column(name = "c78_fecha_antigeno_de_superficie_hepatitis_b_en_gestantes")
    @Temporal(TemporalType.DATE)
    private Date c78FechaAntigenoDeSuperficieHepatitisBEnGestantes;
    @Column(name = "c79_resultado_antigeno_de_superficie_hepatitis_b_en_gestantes")
    private Integer c79ResultadoAntigenoDeSuperficieHepatitisBEnGestantes;
    @Column(name = "c80_fecha_serologia_para_sifilis")
    @Temporal(TemporalType.DATE)
    private Date c80FechaSerologiaParaSifilis;
    @Column(name = "c81_resultado_serologia_para_sifilis")
    private Integer c81ResultadoSerologiaParaSifilis;
    @Column(name = "c82_fecha_de_toma_de_elisa_para_vih")
    @Temporal(TemporalType.DATE)
    private Date c82FechaDeTomaDeElisaParaVih;
    @Column(name = "c83_resultado_elisa_para_vih")
    private Integer c83ResultadoElisaParaVih;
    @Column(name = "c84_fecha_tsh_neonatal")
    @Temporal(TemporalType.DATE)
    private Date c84FechaTshNeonatal;
    @Column(name = "c85_resultado_de_tsh_neonatal")
    private Integer c85ResultadoDeTshNeonatal;
    @Column(name = "c86_tamizaje_cancer_de_cuello_uterino")
    private Integer c86TamizajeCancerDeCuelloUterino;
    @Column(name = "c87_citologia_cervicouterina")
    @Temporal(TemporalType.DATE)
    private Date c87CitologiaCervicouterina;
    @Column(name = "c88_citologia_cervicouterina_resultados_segun_bethesda")
    private Integer c88CitologiaCervicouterinaResultadosSegunBethesda;
    @Column(name = "c89_calidad_en_la_muestra_de_citologia_cervicouterina")
    private Integer c89CalidadEnLaMuestraDeCitologiaCervicouterina;
    @Size(max = 255)
    @Column(name = "c90_codigo_de_habilitacion_ips_donde_se_toma_citologia_cervicou")
    private String c90CodigoDeHabilitacionIpsDondeSeTomaCitologiaCervicou;
    @Column(name = "c91_fecha_colposcopia")
    @Temporal(TemporalType.DATE)
    private Date c91FechaColposcopia;
    @Size(max = 255)
    @Column(name = "c92_codigo_de_habilitacion_ips_donde_se_toma_colposcopia")
    private String c92CodigoDeHabilitacionIpsDondeSeTomaColposcopia;
    @Column(name = "c93_fecha_biopsia_cervical")
    @Temporal(TemporalType.DATE)
    private Date c93FechaBiopsiaCervical;
    @Column(name = "c94_resultado_de_biopsia_cervical")
    private Integer c94ResultadoDeBiopsiaCervical;
    @Size(max = 255)
    @Column(name = "c95_codigo_de_habilitacion_ips_donde_se_toma_biopsia_cervical")
    private String c95CodigoDeHabilitacionIpsDondeSeTomaBiopsiaCervical;
    @Column(name = "c96_fecha_mamografia")
    @Temporal(TemporalType.DATE)
    private Date c96FechaMamografia;
    @Column(name = "c97_resultado_mamografia")
    private Integer c97ResultadoMamografia;
    @Size(max = 255)
    @Column(name = "c98_codigo_de_habilitacion_ips_donde_se_toma_mamografia")
    private String c98CodigoDeHabilitacionIpsDondeSeTomaMamografia;
    @Column(name = "c99_fecha_toma_biopsia_seno_por_bacaf")
    @Temporal(TemporalType.DATE)
    private Date c99FechaTomaBiopsiaSenoPorBacaf;
    @Column(name = "c100_fecha_resultado_biopsia_seno_por_bacaf")
    @Temporal(TemporalType.DATE)
    private Date c100FechaResultadoBiopsiaSenoPorBacaf;
    @Column(name = "c101_biopsia_seno_por_bacaf")
    private Integer c101BiopsiaSenoPorBacaf;
    @Size(max = 255)
    @Column(name = "c102_codigo_de_habilitacion_ips_donde_se_toma_biopsia_seno_por_")
    private String c102CodigoDeHabilitacionIpsDondeSeTomaBiopsiaSenoPor;
    @Column(name = "c103_fecha_toma_de_hemoglobina")
    @Temporal(TemporalType.DATE)
    private Date c103FechaTomaDeHemoglobina;
    @Size(max = 11)
    @Column(name = "c104_hemoglobina")
    private String c104Hemoglobina;
    @Column(name = "c105_fecha_de_la_toma_de_glicemia_basal")
    @Temporal(TemporalType.DATE)
    private Date c105FechaDeLaTomaDeGlicemiaBasal;
    @Column(name = "c106_fecha_creatinina")
    @Temporal(TemporalType.DATE)
    private Date c106FechaCreatinina;
    @Size(max = 11)
    @Column(name = "c107_creatinina")
    private String c107Creatinina;
    @Column(name = "c108_fecha_hemoglobina_glicosilada")
    @Temporal(TemporalType.DATE)
    private Date c108FechaHemoglobinaGlicosilada;
    @Column(name = "c109_hemoglobina_glicosilada")
    private Integer c109HemoglobinaGlicosilada;
    @Column(name = "c110_fecha_toma_de_microalbuminuria")
    @Temporal(TemporalType.DATE)
    private Date c110FechaTomaDeMicroalbuminuria;
    @Column(name = "c111_fecha_toma_de_hdl")
    @Temporal(TemporalType.DATE)
    private Date c111FechaTomaDeHdl;
    @Column(name = "c112_fecha_toma_de_baciloscopia_de_diagnostico")
    @Temporal(TemporalType.DATE)
    private Date c112FechaTomaDeBaciloscopiaDeDiagnostico;
    @Column(name = "c113_baciloscopia_de_diagnostico")
    private Integer c113BaciloscopiaDeDiagnostico;
    @Column(name = "c114_tratamiento_para_hipotiroidismo_congenito")
    private Integer c114TratamientoParaHipotiroidismoCongenito;
    @Column(name = "c115_tratamiento_para_sifilis_gestacional")
    private Integer c115TratamientoParaSifilisGestacional;
    @Column(name = "c116_tratamiento_para_sifilis_congenita")
    private Integer c116TratamientoParaSifilisCongenita;
    @Column(name = "c117_tratamiento_para_lepra")
    private Integer c117TratamientoParaLepra;
    @Column(name = "c118_fecha_de_terminacion_tratamiento_para_leishmaniasis")
    @Temporal(TemporalType.DATE)
    private Date c118FechaDeTerminacionTratamientoParaLeishmaniasis;
    @JoinColumn(name = "c_fact", referencedColumnName = "num_fact")
    @ManyToOne
    private RipsAf cFact;

    public Frt4505() {
    }

    public Frt4505(Integer c1ConsecutivoDeRegistro) {
        this.c1ConsecutivoDeRegistro = c1ConsecutivoDeRegistro;
    }

    public String getCProgramaPyp() {
        return cProgramaPyp;
    }

    public void setCProgramaPyp(String cProgramaPyp) {
        this.cProgramaPyp = cProgramaPyp;
    }

    public String getCCodEps() {
        return cCodEps;
    }

    public void setCCodEps(String cCodEps) {
        this.cCodEps = cCodEps;
    }

    public Integer getC0TipoDeRegistro() {
        return c0TipoDeRegistro;
    }

    public void setC0TipoDeRegistro(Integer c0TipoDeRegistro) {
        this.c0TipoDeRegistro = c0TipoDeRegistro;
    }

    public Integer getC1ConsecutivoDeRegistro() {
        return c1ConsecutivoDeRegistro;
    }

    public void setC1ConsecutivoDeRegistro(Integer c1ConsecutivoDeRegistro) {
        this.c1ConsecutivoDeRegistro = c1ConsecutivoDeRegistro;
    }

    public String getC2CodigoDeHabilitacionIpsPrimaria() {
        return c2CodigoDeHabilitacionIpsPrimaria;
    }

    public void setC2CodigoDeHabilitacionIpsPrimaria(String c2CodigoDeHabilitacionIpsPrimaria) {
        this.c2CodigoDeHabilitacionIpsPrimaria = c2CodigoDeHabilitacionIpsPrimaria;
    }

    public String getC3TipoDeIdentificacionDelUsuario() {
        return c3TipoDeIdentificacionDelUsuario;
    }

    public void setC3TipoDeIdentificacionDelUsuario(String c3TipoDeIdentificacionDelUsuario) {
        this.c3TipoDeIdentificacionDelUsuario = c3TipoDeIdentificacionDelUsuario;
    }

    public String getC4NumeroDeIdentificacionDelUsuario() {
        return c4NumeroDeIdentificacionDelUsuario;
    }

    public void setC4NumeroDeIdentificacionDelUsuario(String c4NumeroDeIdentificacionDelUsuario) {
        this.c4NumeroDeIdentificacionDelUsuario = c4NumeroDeIdentificacionDelUsuario;
    }

    public String getC5PrimerApellidoDelUsuario() {
        return c5PrimerApellidoDelUsuario;
    }

    public void setC5PrimerApellidoDelUsuario(String c5PrimerApellidoDelUsuario) {
        this.c5PrimerApellidoDelUsuario = c5PrimerApellidoDelUsuario;
    }

    public String getC6SegundoApellidoDelUsuario() {
        return c6SegundoApellidoDelUsuario;
    }

    public void setC6SegundoApellidoDelUsuario(String c6SegundoApellidoDelUsuario) {
        this.c6SegundoApellidoDelUsuario = c6SegundoApellidoDelUsuario;
    }

    public String getC7PrimerNombreDelUsuario() {
        return c7PrimerNombreDelUsuario;
    }

    public void setC7PrimerNombreDelUsuario(String c7PrimerNombreDelUsuario) {
        this.c7PrimerNombreDelUsuario = c7PrimerNombreDelUsuario;
    }

    public String getC8SegundoNombreDelUsuario() {
        return c8SegundoNombreDelUsuario;
    }

    public void setC8SegundoNombreDelUsuario(String c8SegundoNombreDelUsuario) {
        this.c8SegundoNombreDelUsuario = c8SegundoNombreDelUsuario;
    }

    public Date getC9FechaDeNacimiento() {
        return c9FechaDeNacimiento;
    }

    public void setC9FechaDeNacimiento(Date c9FechaDeNacimiento) {
        this.c9FechaDeNacimiento = c9FechaDeNacimiento;
    }

    public String getC10Sexo() {
        return c10Sexo;
    }

    public void setC10Sexo(String c10Sexo) {
        this.c10Sexo = c10Sexo;
    }

    public String getC11CodigoPertenenciaEtnica() {
        return c11CodigoPertenenciaEtnica;
    }

    public void setC11CodigoPertenenciaEtnica(String c11CodigoPertenenciaEtnica) {
        this.c11CodigoPertenenciaEtnica = c11CodigoPertenenciaEtnica;
    }

    public String getC12CodigoDeOcupacion() {
        return c12CodigoDeOcupacion;
    }

    public void setC12CodigoDeOcupacion(String c12CodigoDeOcupacion) {
        this.c12CodigoDeOcupacion = c12CodigoDeOcupacion;
    }

    public Integer getC13CodigoDeNivelEducativo() {
        return c13CodigoDeNivelEducativo;
    }

    public void setC13CodigoDeNivelEducativo(Integer c13CodigoDeNivelEducativo) {
        this.c13CodigoDeNivelEducativo = c13CodigoDeNivelEducativo;
    }

    public Integer getC14Gestacion() {
        return c14Gestacion;
    }

    public void setC14Gestacion(Integer c14Gestacion) {
        this.c14Gestacion = c14Gestacion;
    }

    public Integer getC15SifilisGestacionalOCongenita() {
        return c15SifilisGestacionalOCongenita;
    }

    public void setC15SifilisGestacionalOCongenita(Integer c15SifilisGestacionalOCongenita) {
        this.c15SifilisGestacionalOCongenita = c15SifilisGestacionalOCongenita;
    }

    public Integer getC16HipertensionInducidaPorLaGestacion() {
        return c16HipertensionInducidaPorLaGestacion;
    }

    public void setC16HipertensionInducidaPorLaGestacion(Integer c16HipertensionInducidaPorLaGestacion) {
        this.c16HipertensionInducidaPorLaGestacion = c16HipertensionInducidaPorLaGestacion;
    }

    public Integer getC17HipotiroidismoCongenito() {
        return c17HipotiroidismoCongenito;
    }

    public void setC17HipotiroidismoCongenito(Integer c17HipotiroidismoCongenito) {
        this.c17HipotiroidismoCongenito = c17HipotiroidismoCongenito;
    }

    public Integer getC18SintomaticoRespiratorio() {
        return c18SintomaticoRespiratorio;
    }

    public void setC18SintomaticoRespiratorio(Integer c18SintomaticoRespiratorio) {
        this.c18SintomaticoRespiratorio = c18SintomaticoRespiratorio;
    }

    public Integer getC19TuberculosisMultidrogoresistente() {
        return c19TuberculosisMultidrogoresistente;
    }

    public void setC19TuberculosisMultidrogoresistente(Integer c19TuberculosisMultidrogoresistente) {
        this.c19TuberculosisMultidrogoresistente = c19TuberculosisMultidrogoresistente;
    }

    public Integer getC20Lepra() {
        return c20Lepra;
    }

    public void setC20Lepra(Integer c20Lepra) {
        this.c20Lepra = c20Lepra;
    }

    public Integer getC21ObesidadODesnutricionProteicoCalorica() {
        return c21ObesidadODesnutricionProteicoCalorica;
    }

    public void setC21ObesidadODesnutricionProteicoCalorica(Integer c21ObesidadODesnutricionProteicoCalorica) {
        this.c21ObesidadODesnutricionProteicoCalorica = c21ObesidadODesnutricionProteicoCalorica;
    }

    public Integer getC22VictimaDeMaltrato() {
        return c22VictimaDeMaltrato;
    }

    public void setC22VictimaDeMaltrato(Integer c22VictimaDeMaltrato) {
        this.c22VictimaDeMaltrato = c22VictimaDeMaltrato;
    }

    public Integer getC23VictimaDeViolenciaSexual() {
        return c23VictimaDeViolenciaSexual;
    }

    public void setC23VictimaDeViolenciaSexual(Integer c23VictimaDeViolenciaSexual) {
        this.c23VictimaDeViolenciaSexual = c23VictimaDeViolenciaSexual;
    }

    public Integer getC24InfeccionesDeTrasmisionSexual() {
        return c24InfeccionesDeTrasmisionSexual;
    }

    public void setC24InfeccionesDeTrasmisionSexual(Integer c24InfeccionesDeTrasmisionSexual) {
        this.c24InfeccionesDeTrasmisionSexual = c24InfeccionesDeTrasmisionSexual;
    }

    public Integer getC25EnfermedadMental() {
        return c25EnfermedadMental;
    }

    public void setC25EnfermedadMental(Integer c25EnfermedadMental) {
        this.c25EnfermedadMental = c25EnfermedadMental;
    }

    public Integer getC26CancerDeCervix() {
        return c26CancerDeCervix;
    }

    public void setC26CancerDeCervix(Integer c26CancerDeCervix) {
        this.c26CancerDeCervix = c26CancerDeCervix;
    }

    public Integer getC27CancerDeSeno() {
        return c27CancerDeSeno;
    }

    public void setC27CancerDeSeno(Integer c27CancerDeSeno) {
        this.c27CancerDeSeno = c27CancerDeSeno;
    }

    public Integer getC28FluorosisDental() {
        return c28FluorosisDental;
    }

    public void setC28FluorosisDental(Integer c28FluorosisDental) {
        this.c28FluorosisDental = c28FluorosisDental;
    }

    public Date getC29FechaDelPeso() {
        return c29FechaDelPeso;
    }

    public void setC29FechaDelPeso(Date c29FechaDelPeso) {
        this.c29FechaDelPeso = c29FechaDelPeso;
    }

    public String getC30PesoEnKilogramos() {
        return c30PesoEnKilogramos;
    }

    public void setC30PesoEnKilogramos(String c30PesoEnKilogramos) {
        this.c30PesoEnKilogramos = c30PesoEnKilogramos;
    }

    public Date getC31FechaDeLaTalla() {
        return c31FechaDeLaTalla;
    }

    public void setC31FechaDeLaTalla(Date c31FechaDeLaTalla) {
        this.c31FechaDeLaTalla = c31FechaDeLaTalla;
    }

    public Integer getC32TallaEnCentimetros() {
        return c32TallaEnCentimetros;
    }

    public void setC32TallaEnCentimetros(Integer c32TallaEnCentimetros) {
        this.c32TallaEnCentimetros = c32TallaEnCentimetros;
    }

    public Date getC33FechaProbableDeParto() {
        return c33FechaProbableDeParto;
    }

    public void setC33FechaProbableDeParto(Date c33FechaProbableDeParto) {
        this.c33FechaProbableDeParto = c33FechaProbableDeParto;
    }

    public Integer getC34EdadGestacionalAlNacer() {
        return c34EdadGestacionalAlNacer;
    }

    public void setC34EdadGestacionalAlNacer(Integer c34EdadGestacionalAlNacer) {
        this.c34EdadGestacionalAlNacer = c34EdadGestacionalAlNacer;
    }

    public Integer getC35Bcg() {
        return c35Bcg;
    }

    public void setC35Bcg(Integer c35Bcg) {
        this.c35Bcg = c35Bcg;
    }

    public Integer getC36HepatitisBMenoresDe1Ano() {
        return c36HepatitisBMenoresDe1Ano;
    }

    public void setC36HepatitisBMenoresDe1Ano(Integer c36HepatitisBMenoresDe1Ano) {
        this.c36HepatitisBMenoresDe1Ano = c36HepatitisBMenoresDe1Ano;
    }

    public Integer getC37Pentavalente() {
        return c37Pentavalente;
    }

    public void setC37Pentavalente(Integer c37Pentavalente) {
        this.c37Pentavalente = c37Pentavalente;
    }

    public Integer getC38Polio() {
        return c38Polio;
    }

    public void setC38Polio(Integer c38Polio) {
        this.c38Polio = c38Polio;
    }

    public Integer getC39DptMenoresDe5Anos() {
        return c39DptMenoresDe5Anos;
    }

    public void setC39DptMenoresDe5Anos(Integer c39DptMenoresDe5Anos) {
        this.c39DptMenoresDe5Anos = c39DptMenoresDe5Anos;
    }

    public Integer getC40Rotavirus() {
        return c40Rotavirus;
    }

    public void setC40Rotavirus(Integer c40Rotavirus) {
        this.c40Rotavirus = c40Rotavirus;
    }

    public Integer getC41Neumococo() {
        return c41Neumococo;
    }

    public void setC41Neumococo(Integer c41Neumococo) {
        this.c41Neumococo = c41Neumococo;
    }

    public Integer getC42InfluenzaNinos() {
        return c42InfluenzaNinos;
    }

    public void setC42InfluenzaNinos(Integer c42InfluenzaNinos) {
        this.c42InfluenzaNinos = c42InfluenzaNinos;
    }

    public Integer getC43FiebreAmarillaNinosDe1Ano() {
        return c43FiebreAmarillaNinosDe1Ano;
    }

    public void setC43FiebreAmarillaNinosDe1Ano(Integer c43FiebreAmarillaNinosDe1Ano) {
        this.c43FiebreAmarillaNinosDe1Ano = c43FiebreAmarillaNinosDe1Ano;
    }

    public Integer getC44HepatitisA() {
        return c44HepatitisA;
    }

    public void setC44HepatitisA(Integer c44HepatitisA) {
        this.c44HepatitisA = c44HepatitisA;
    }

    public Integer getC45TripleViralNinos() {
        return c45TripleViralNinos;
    }

    public void setC45TripleViralNinos(Integer c45TripleViralNinos) {
        this.c45TripleViralNinos = c45TripleViralNinos;
    }

    public Integer getC46VirusDelPapilomaHumanoVph() {
        return c46VirusDelPapilomaHumanoVph;
    }

    public void setC46VirusDelPapilomaHumanoVph(Integer c46VirusDelPapilomaHumanoVph) {
        this.c46VirusDelPapilomaHumanoVph = c46VirusDelPapilomaHumanoVph;
    }

    public Integer getC47TdOTtMujeresEnEdadFertil15A49Anos() {
        return c47TdOTtMujeresEnEdadFertil15A49Anos;
    }

    public void setC47TdOTtMujeresEnEdadFertil15A49Anos(Integer c47TdOTtMujeresEnEdadFertil15A49Anos) {
        this.c47TdOTtMujeresEnEdadFertil15A49Anos = c47TdOTtMujeresEnEdadFertil15A49Anos;
    }

    public Integer getC48ControlDePlacaBacteriana() {
        return c48ControlDePlacaBacteriana;
    }

    public void setC48ControlDePlacaBacteriana(Integer c48ControlDePlacaBacteriana) {
        this.c48ControlDePlacaBacteriana = c48ControlDePlacaBacteriana;
    }

    public Date getC49FechaAtencionPartoOCesarea() {
        return c49FechaAtencionPartoOCesarea;
    }

    public void setC49FechaAtencionPartoOCesarea(Date c49FechaAtencionPartoOCesarea) {
        this.c49FechaAtencionPartoOCesarea = c49FechaAtencionPartoOCesarea;
    }

    public Date getC50FechaSalidaDeLaAtencionDelPartoOCesarea() {
        return c50FechaSalidaDeLaAtencionDelPartoOCesarea;
    }

    public void setC50FechaSalidaDeLaAtencionDelPartoOCesarea(Date c50FechaSalidaDeLaAtencionDelPartoOCesarea) {
        this.c50FechaSalidaDeLaAtencionDelPartoOCesarea = c50FechaSalidaDeLaAtencionDelPartoOCesarea;
    }

    public Date getC51FechaDeConsejeriaEnLactanciaMaterna() {
        return c51FechaDeConsejeriaEnLactanciaMaterna;
    }

    public void setC51FechaDeConsejeriaEnLactanciaMaterna(Date c51FechaDeConsejeriaEnLactanciaMaterna) {
        this.c51FechaDeConsejeriaEnLactanciaMaterna = c51FechaDeConsejeriaEnLactanciaMaterna;
    }

    public Date getC52ControlDelRecienNacido() {
        return c52ControlDelRecienNacido;
    }

    public void setC52ControlDelRecienNacido(Date c52ControlDelRecienNacido) {
        this.c52ControlDelRecienNacido = c52ControlDelRecienNacido;
    }

    public Date getC53PlanificacionFamiliarPrimeraVez() {
        return c53PlanificacionFamiliarPrimeraVez;
    }

    public void setC53PlanificacionFamiliarPrimeraVez(Date c53PlanificacionFamiliarPrimeraVez) {
        this.c53PlanificacionFamiliarPrimeraVez = c53PlanificacionFamiliarPrimeraVez;
    }

    public Integer getC54SuministroDeMetodoAnticonceptivo() {
        return c54SuministroDeMetodoAnticonceptivo;
    }

    public void setC54SuministroDeMetodoAnticonceptivo(Integer c54SuministroDeMetodoAnticonceptivo) {
        this.c54SuministroDeMetodoAnticonceptivo = c54SuministroDeMetodoAnticonceptivo;
    }

    public Date getC55FechaSuministroDeMetodoAnticonceptivo() {
        return c55FechaSuministroDeMetodoAnticonceptivo;
    }

    public void setC55FechaSuministroDeMetodoAnticonceptivo(Date c55FechaSuministroDeMetodoAnticonceptivo) {
        this.c55FechaSuministroDeMetodoAnticonceptivo = c55FechaSuministroDeMetodoAnticonceptivo;
    }

    public Date getC56ControlPrenatalDePrimeraVez() {
        return c56ControlPrenatalDePrimeraVez;
    }

    public void setC56ControlPrenatalDePrimeraVez(Date c56ControlPrenatalDePrimeraVez) {
        this.c56ControlPrenatalDePrimeraVez = c56ControlPrenatalDePrimeraVez;
    }

    public Integer getC57ControlPrenatal() {
        return c57ControlPrenatal;
    }

    public void setC57ControlPrenatal(Integer c57ControlPrenatal) {
        this.c57ControlPrenatal = c57ControlPrenatal;
    }

    public Date getC58UltimoControlPrenatal() {
        return c58UltimoControlPrenatal;
    }

    public void setC58UltimoControlPrenatal(Date c58UltimoControlPrenatal) {
        this.c58UltimoControlPrenatal = c58UltimoControlPrenatal;
    }

    public Integer getC59SuministroDeAcidoFolicoEnElUltimoControlPrenatal() {
        return c59SuministroDeAcidoFolicoEnElUltimoControlPrenatal;
    }

    public void setC59SuministroDeAcidoFolicoEnElUltimoControlPrenatal(Integer c59SuministroDeAcidoFolicoEnElUltimoControlPrenatal) {
        this.c59SuministroDeAcidoFolicoEnElUltimoControlPrenatal = c59SuministroDeAcidoFolicoEnElUltimoControlPrenatal;
    }

    public Integer getC60SuministroDeSulfatoFerrosoEnElUltimoControlPrenatal() {
        return c60SuministroDeSulfatoFerrosoEnElUltimoControlPrenatal;
    }

    public void setC60SuministroDeSulfatoFerrosoEnElUltimoControlPrenatal(Integer c60SuministroDeSulfatoFerrosoEnElUltimoControlPrenatal) {
        this.c60SuministroDeSulfatoFerrosoEnElUltimoControlPrenatal = c60SuministroDeSulfatoFerrosoEnElUltimoControlPrenatal;
    }

    public Integer getC61SuministroDeCarbonatoDeCalcioEnElUltimoControlPren() {
        return c61SuministroDeCarbonatoDeCalcioEnElUltimoControlPren;
    }

    public void setC61SuministroDeCarbonatoDeCalcioEnElUltimoControlPren(Integer c61SuministroDeCarbonatoDeCalcioEnElUltimoControlPren) {
        this.c61SuministroDeCarbonatoDeCalcioEnElUltimoControlPren = c61SuministroDeCarbonatoDeCalcioEnElUltimoControlPren;
    }

    public Date getC62ValoracionDeLaAgudezaVisual() {
        return c62ValoracionDeLaAgudezaVisual;
    }

    public void setC62ValoracionDeLaAgudezaVisual(Date c62ValoracionDeLaAgudezaVisual) {
        this.c62ValoracionDeLaAgudezaVisual = c62ValoracionDeLaAgudezaVisual;
    }

    public Date getC63ConsultaPorOftalmologia() {
        return c63ConsultaPorOftalmologia;
    }

    public void setC63ConsultaPorOftalmologia(Date c63ConsultaPorOftalmologia) {
        this.c63ConsultaPorOftalmologia = c63ConsultaPorOftalmologia;
    }

    public Date getC64FechaDiagnosticoDesnutricionProteicoCalorica() {
        return c64FechaDiagnosticoDesnutricionProteicoCalorica;
    }

    public void setC64FechaDiagnosticoDesnutricionProteicoCalorica(Date c64FechaDiagnosticoDesnutricionProteicoCalorica) {
        this.c64FechaDiagnosticoDesnutricionProteicoCalorica = c64FechaDiagnosticoDesnutricionProteicoCalorica;
    }

    public Date getC65ConsultaMujerOMenorVictimaDelMaltrato() {
        return c65ConsultaMujerOMenorVictimaDelMaltrato;
    }

    public void setC65ConsultaMujerOMenorVictimaDelMaltrato(Date c65ConsultaMujerOMenorVictimaDelMaltrato) {
        this.c65ConsultaMujerOMenorVictimaDelMaltrato = c65ConsultaMujerOMenorVictimaDelMaltrato;
    }

    public Date getC66ConsultaVictimasDeViolenciaSexual() {
        return c66ConsultaVictimasDeViolenciaSexual;
    }

    public void setC66ConsultaVictimasDeViolenciaSexual(Date c66ConsultaVictimasDeViolenciaSexual) {
        this.c66ConsultaVictimasDeViolenciaSexual = c66ConsultaVictimasDeViolenciaSexual;
    }

    public Date getC67ConsultaNutricion() {
        return c67ConsultaNutricion;
    }

    public void setC67ConsultaNutricion(Date c67ConsultaNutricion) {
        this.c67ConsultaNutricion = c67ConsultaNutricion;
    }

    public Date getC68ConsultaDePsicologia() {
        return c68ConsultaDePsicologia;
    }

    public void setC68ConsultaDePsicologia(Date c68ConsultaDePsicologia) {
        this.c68ConsultaDePsicologia = c68ConsultaDePsicologia;
    }

    public Date getC69ConsultaDeCrecimientoYDesarrolloPrimeraVez() {
        return c69ConsultaDeCrecimientoYDesarrolloPrimeraVez;
    }

    public void setC69ConsultaDeCrecimientoYDesarrolloPrimeraVez(Date c69ConsultaDeCrecimientoYDesarrolloPrimeraVez) {
        this.c69ConsultaDeCrecimientoYDesarrolloPrimeraVez = c69ConsultaDeCrecimientoYDesarrolloPrimeraVez;
    }

    public Integer getC70SuministroDeSulfatoFerrosoEnLaUltimaConsultaDelMen() {
        return c70SuministroDeSulfatoFerrosoEnLaUltimaConsultaDelMen;
    }

    public void setC70SuministroDeSulfatoFerrosoEnLaUltimaConsultaDelMen(Integer c70SuministroDeSulfatoFerrosoEnLaUltimaConsultaDelMen) {
        this.c70SuministroDeSulfatoFerrosoEnLaUltimaConsultaDelMen = c70SuministroDeSulfatoFerrosoEnLaUltimaConsultaDelMen;
    }

    public Integer getC71SuministroDeVitaminaAEnLaUltimaConsultaDelMenorDe() {
        return c71SuministroDeVitaminaAEnLaUltimaConsultaDelMenorDe;
    }

    public void setC71SuministroDeVitaminaAEnLaUltimaConsultaDelMenorDe(Integer c71SuministroDeVitaminaAEnLaUltimaConsultaDelMenorDe) {
        this.c71SuministroDeVitaminaAEnLaUltimaConsultaDelMenorDe = c71SuministroDeVitaminaAEnLaUltimaConsultaDelMenorDe;
    }

    public Date getC72ConsultaDeJovenPrimeraVez() {
        return c72ConsultaDeJovenPrimeraVez;
    }

    public void setC72ConsultaDeJovenPrimeraVez(Date c72ConsultaDeJovenPrimeraVez) {
        this.c72ConsultaDeJovenPrimeraVez = c72ConsultaDeJovenPrimeraVez;
    }

    public Date getC73ConsultaDeAdultoPrimeraVez() {
        return c73ConsultaDeAdultoPrimeraVez;
    }

    public void setC73ConsultaDeAdultoPrimeraVez(Date c73ConsultaDeAdultoPrimeraVez) {
        this.c73ConsultaDeAdultoPrimeraVez = c73ConsultaDeAdultoPrimeraVez;
    }

    public Integer getC74PreservativosEntregadosAPacientesConIts() {
        return c74PreservativosEntregadosAPacientesConIts;
    }

    public void setC74PreservativosEntregadosAPacientesConIts(Integer c74PreservativosEntregadosAPacientesConIts) {
        this.c74PreservativosEntregadosAPacientesConIts = c74PreservativosEntregadosAPacientesConIts;
    }

    public Date getC75AsesoriaPreTestElisaParaVih() {
        return c75AsesoriaPreTestElisaParaVih;
    }

    public void setC75AsesoriaPreTestElisaParaVih(Date c75AsesoriaPreTestElisaParaVih) {
        this.c75AsesoriaPreTestElisaParaVih = c75AsesoriaPreTestElisaParaVih;
    }

    public Date getC76AsesoriaPosTestElisaParaVih() {
        return c76AsesoriaPosTestElisaParaVih;
    }

    public void setC76AsesoriaPosTestElisaParaVih(Date c76AsesoriaPosTestElisaParaVih) {
        this.c76AsesoriaPosTestElisaParaVih = c76AsesoriaPosTestElisaParaVih;
    }

    public Integer getC77PacienteConDiagnosticoDeAnsiedadDepresionEsquizofreni() {
        return c77PacienteConDiagnosticoDeAnsiedadDepresionEsquizofreni;
    }

    public void setC77PacienteConDiagnosticoDeAnsiedadDepresionEsquizofreni(Integer c77PacienteConDiagnosticoDeAnsiedadDepresionEsquizofreni) {
        this.c77PacienteConDiagnosticoDeAnsiedadDepresionEsquizofreni = c77PacienteConDiagnosticoDeAnsiedadDepresionEsquizofreni;
    }

    public Date getC78FechaAntigenoDeSuperficieHepatitisBEnGestantes() {
        return c78FechaAntigenoDeSuperficieHepatitisBEnGestantes;
    }

    public void setC78FechaAntigenoDeSuperficieHepatitisBEnGestantes(Date c78FechaAntigenoDeSuperficieHepatitisBEnGestantes) {
        this.c78FechaAntigenoDeSuperficieHepatitisBEnGestantes = c78FechaAntigenoDeSuperficieHepatitisBEnGestantes;
    }

    public Integer getC79ResultadoAntigenoDeSuperficieHepatitisBEnGestantes() {
        return c79ResultadoAntigenoDeSuperficieHepatitisBEnGestantes;
    }

    public void setC79ResultadoAntigenoDeSuperficieHepatitisBEnGestantes(Integer c79ResultadoAntigenoDeSuperficieHepatitisBEnGestantes) {
        this.c79ResultadoAntigenoDeSuperficieHepatitisBEnGestantes = c79ResultadoAntigenoDeSuperficieHepatitisBEnGestantes;
    }

    public Date getC80FechaSerologiaParaSifilis() {
        return c80FechaSerologiaParaSifilis;
    }

    public void setC80FechaSerologiaParaSifilis(Date c80FechaSerologiaParaSifilis) {
        this.c80FechaSerologiaParaSifilis = c80FechaSerologiaParaSifilis;
    }

    public Integer getC81ResultadoSerologiaParaSifilis() {
        return c81ResultadoSerologiaParaSifilis;
    }

    public void setC81ResultadoSerologiaParaSifilis(Integer c81ResultadoSerologiaParaSifilis) {
        this.c81ResultadoSerologiaParaSifilis = c81ResultadoSerologiaParaSifilis;
    }

    public Date getC82FechaDeTomaDeElisaParaVih() {
        return c82FechaDeTomaDeElisaParaVih;
    }

    public void setC82FechaDeTomaDeElisaParaVih(Date c82FechaDeTomaDeElisaParaVih) {
        this.c82FechaDeTomaDeElisaParaVih = c82FechaDeTomaDeElisaParaVih;
    }

    public Integer getC83ResultadoElisaParaVih() {
        return c83ResultadoElisaParaVih;
    }

    public void setC83ResultadoElisaParaVih(Integer c83ResultadoElisaParaVih) {
        this.c83ResultadoElisaParaVih = c83ResultadoElisaParaVih;
    }

    public Date getC84FechaTshNeonatal() {
        return c84FechaTshNeonatal;
    }

    public void setC84FechaTshNeonatal(Date c84FechaTshNeonatal) {
        this.c84FechaTshNeonatal = c84FechaTshNeonatal;
    }

    public Integer getC85ResultadoDeTshNeonatal() {
        return c85ResultadoDeTshNeonatal;
    }

    public void setC85ResultadoDeTshNeonatal(Integer c85ResultadoDeTshNeonatal) {
        this.c85ResultadoDeTshNeonatal = c85ResultadoDeTshNeonatal;
    }

    public Integer getC86TamizajeCancerDeCuelloUterino() {
        return c86TamizajeCancerDeCuelloUterino;
    }

    public void setC86TamizajeCancerDeCuelloUterino(Integer c86TamizajeCancerDeCuelloUterino) {
        this.c86TamizajeCancerDeCuelloUterino = c86TamizajeCancerDeCuelloUterino;
    }

    public Date getC87CitologiaCervicouterina() {
        return c87CitologiaCervicouterina;
    }

    public void setC87CitologiaCervicouterina(Date c87CitologiaCervicouterina) {
        this.c87CitologiaCervicouterina = c87CitologiaCervicouterina;
    }

    public Integer getC88CitologiaCervicouterinaResultadosSegunBethesda() {
        return c88CitologiaCervicouterinaResultadosSegunBethesda;
    }

    public void setC88CitologiaCervicouterinaResultadosSegunBethesda(Integer c88CitologiaCervicouterinaResultadosSegunBethesda) {
        this.c88CitologiaCervicouterinaResultadosSegunBethesda = c88CitologiaCervicouterinaResultadosSegunBethesda;
    }

    public Integer getC89CalidadEnLaMuestraDeCitologiaCervicouterina() {
        return c89CalidadEnLaMuestraDeCitologiaCervicouterina;
    }

    public void setC89CalidadEnLaMuestraDeCitologiaCervicouterina(Integer c89CalidadEnLaMuestraDeCitologiaCervicouterina) {
        this.c89CalidadEnLaMuestraDeCitologiaCervicouterina = c89CalidadEnLaMuestraDeCitologiaCervicouterina;
    }

    public String getC90CodigoDeHabilitacionIpsDondeSeTomaCitologiaCervicou() {
        return c90CodigoDeHabilitacionIpsDondeSeTomaCitologiaCervicou;
    }

    public void setC90CodigoDeHabilitacionIpsDondeSeTomaCitologiaCervicou(String c90CodigoDeHabilitacionIpsDondeSeTomaCitologiaCervicou) {
        this.c90CodigoDeHabilitacionIpsDondeSeTomaCitologiaCervicou = c90CodigoDeHabilitacionIpsDondeSeTomaCitologiaCervicou;
    }

    public Date getC91FechaColposcopia() {
        return c91FechaColposcopia;
    }

    public void setC91FechaColposcopia(Date c91FechaColposcopia) {
        this.c91FechaColposcopia = c91FechaColposcopia;
    }

    public String getC92CodigoDeHabilitacionIpsDondeSeTomaColposcopia() {
        return c92CodigoDeHabilitacionIpsDondeSeTomaColposcopia;
    }

    public void setC92CodigoDeHabilitacionIpsDondeSeTomaColposcopia(String c92CodigoDeHabilitacionIpsDondeSeTomaColposcopia) {
        this.c92CodigoDeHabilitacionIpsDondeSeTomaColposcopia = c92CodigoDeHabilitacionIpsDondeSeTomaColposcopia;
    }

    public Date getC93FechaBiopsiaCervical() {
        return c93FechaBiopsiaCervical;
    }

    public void setC93FechaBiopsiaCervical(Date c93FechaBiopsiaCervical) {
        this.c93FechaBiopsiaCervical = c93FechaBiopsiaCervical;
    }

    public Integer getC94ResultadoDeBiopsiaCervical() {
        return c94ResultadoDeBiopsiaCervical;
    }

    public void setC94ResultadoDeBiopsiaCervical(Integer c94ResultadoDeBiopsiaCervical) {
        this.c94ResultadoDeBiopsiaCervical = c94ResultadoDeBiopsiaCervical;
    }

    public String getC95CodigoDeHabilitacionIpsDondeSeTomaBiopsiaCervical() {
        return c95CodigoDeHabilitacionIpsDondeSeTomaBiopsiaCervical;
    }

    public void setC95CodigoDeHabilitacionIpsDondeSeTomaBiopsiaCervical(String c95CodigoDeHabilitacionIpsDondeSeTomaBiopsiaCervical) {
        this.c95CodigoDeHabilitacionIpsDondeSeTomaBiopsiaCervical = c95CodigoDeHabilitacionIpsDondeSeTomaBiopsiaCervical;
    }

    public Date getC96FechaMamografia() {
        return c96FechaMamografia;
    }

    public void setC96FechaMamografia(Date c96FechaMamografia) {
        this.c96FechaMamografia = c96FechaMamografia;
    }

    public Integer getC97ResultadoMamografia() {
        return c97ResultadoMamografia;
    }

    public void setC97ResultadoMamografia(Integer c97ResultadoMamografia) {
        this.c97ResultadoMamografia = c97ResultadoMamografia;
    }

    public String getC98CodigoDeHabilitacionIpsDondeSeTomaMamografia() {
        return c98CodigoDeHabilitacionIpsDondeSeTomaMamografia;
    }

    public void setC98CodigoDeHabilitacionIpsDondeSeTomaMamografia(String c98CodigoDeHabilitacionIpsDondeSeTomaMamografia) {
        this.c98CodigoDeHabilitacionIpsDondeSeTomaMamografia = c98CodigoDeHabilitacionIpsDondeSeTomaMamografia;
    }

    public Date getC99FechaTomaBiopsiaSenoPorBacaf() {
        return c99FechaTomaBiopsiaSenoPorBacaf;
    }

    public void setC99FechaTomaBiopsiaSenoPorBacaf(Date c99FechaTomaBiopsiaSenoPorBacaf) {
        this.c99FechaTomaBiopsiaSenoPorBacaf = c99FechaTomaBiopsiaSenoPorBacaf;
    }

    public Date getC100FechaResultadoBiopsiaSenoPorBacaf() {
        return c100FechaResultadoBiopsiaSenoPorBacaf;
    }

    public void setC100FechaResultadoBiopsiaSenoPorBacaf(Date c100FechaResultadoBiopsiaSenoPorBacaf) {
        this.c100FechaResultadoBiopsiaSenoPorBacaf = c100FechaResultadoBiopsiaSenoPorBacaf;
    }

    public Integer getC101BiopsiaSenoPorBacaf() {
        return c101BiopsiaSenoPorBacaf;
    }

    public void setC101BiopsiaSenoPorBacaf(Integer c101BiopsiaSenoPorBacaf) {
        this.c101BiopsiaSenoPorBacaf = c101BiopsiaSenoPorBacaf;
    }

    public String getC102CodigoDeHabilitacionIpsDondeSeTomaBiopsiaSenoPor() {
        return c102CodigoDeHabilitacionIpsDondeSeTomaBiopsiaSenoPor;
    }

    public void setC102CodigoDeHabilitacionIpsDondeSeTomaBiopsiaSenoPor(String c102CodigoDeHabilitacionIpsDondeSeTomaBiopsiaSenoPor) {
        this.c102CodigoDeHabilitacionIpsDondeSeTomaBiopsiaSenoPor = c102CodigoDeHabilitacionIpsDondeSeTomaBiopsiaSenoPor;
    }

    public Date getC103FechaTomaDeHemoglobina() {
        return c103FechaTomaDeHemoglobina;
    }

    public void setC103FechaTomaDeHemoglobina(Date c103FechaTomaDeHemoglobina) {
        this.c103FechaTomaDeHemoglobina = c103FechaTomaDeHemoglobina;
    }

    public String getC104Hemoglobina() {
        return c104Hemoglobina;
    }

    public void setC104Hemoglobina(String c104Hemoglobina) {
        this.c104Hemoglobina = c104Hemoglobina;
    }

    public Date getC105FechaDeLaTomaDeGlicemiaBasal() {
        return c105FechaDeLaTomaDeGlicemiaBasal;
    }

    public void setC105FechaDeLaTomaDeGlicemiaBasal(Date c105FechaDeLaTomaDeGlicemiaBasal) {
        this.c105FechaDeLaTomaDeGlicemiaBasal = c105FechaDeLaTomaDeGlicemiaBasal;
    }

    public Date getC106FechaCreatinina() {
        return c106FechaCreatinina;
    }

    public void setC106FechaCreatinina(Date c106FechaCreatinina) {
        this.c106FechaCreatinina = c106FechaCreatinina;
    }

    public String getC107Creatinina() {
        return c107Creatinina;
    }

    public void setC107Creatinina(String c107Creatinina) {
        this.c107Creatinina = c107Creatinina;
    }

    public Date getC108FechaHemoglobinaGlicosilada() {
        return c108FechaHemoglobinaGlicosilada;
    }

    public void setC108FechaHemoglobinaGlicosilada(Date c108FechaHemoglobinaGlicosilada) {
        this.c108FechaHemoglobinaGlicosilada = c108FechaHemoglobinaGlicosilada;
    }

    public Integer getC109HemoglobinaGlicosilada() {
        return c109HemoglobinaGlicosilada;
    }

    public void setC109HemoglobinaGlicosilada(Integer c109HemoglobinaGlicosilada) {
        this.c109HemoglobinaGlicosilada = c109HemoglobinaGlicosilada;
    }

    public Date getC110FechaTomaDeMicroalbuminuria() {
        return c110FechaTomaDeMicroalbuminuria;
    }

    public void setC110FechaTomaDeMicroalbuminuria(Date c110FechaTomaDeMicroalbuminuria) {
        this.c110FechaTomaDeMicroalbuminuria = c110FechaTomaDeMicroalbuminuria;
    }

    public Date getC111FechaTomaDeHdl() {
        return c111FechaTomaDeHdl;
    }

    public void setC111FechaTomaDeHdl(Date c111FechaTomaDeHdl) {
        this.c111FechaTomaDeHdl = c111FechaTomaDeHdl;
    }

    public Date getC112FechaTomaDeBaciloscopiaDeDiagnostico() {
        return c112FechaTomaDeBaciloscopiaDeDiagnostico;
    }

    public void setC112FechaTomaDeBaciloscopiaDeDiagnostico(Date c112FechaTomaDeBaciloscopiaDeDiagnostico) {
        this.c112FechaTomaDeBaciloscopiaDeDiagnostico = c112FechaTomaDeBaciloscopiaDeDiagnostico;
    }

    public Integer getC113BaciloscopiaDeDiagnostico() {
        return c113BaciloscopiaDeDiagnostico;
    }

    public void setC113BaciloscopiaDeDiagnostico(Integer c113BaciloscopiaDeDiagnostico) {
        this.c113BaciloscopiaDeDiagnostico = c113BaciloscopiaDeDiagnostico;
    }

    public Integer getC114TratamientoParaHipotiroidismoCongenito() {
        return c114TratamientoParaHipotiroidismoCongenito;
    }

    public void setC114TratamientoParaHipotiroidismoCongenito(Integer c114TratamientoParaHipotiroidismoCongenito) {
        this.c114TratamientoParaHipotiroidismoCongenito = c114TratamientoParaHipotiroidismoCongenito;
    }

    public Integer getC115TratamientoParaSifilisGestacional() {
        return c115TratamientoParaSifilisGestacional;
    }

    public void setC115TratamientoParaSifilisGestacional(Integer c115TratamientoParaSifilisGestacional) {
        this.c115TratamientoParaSifilisGestacional = c115TratamientoParaSifilisGestacional;
    }

    public Integer getC116TratamientoParaSifilisCongenita() {
        return c116TratamientoParaSifilisCongenita;
    }

    public void setC116TratamientoParaSifilisCongenita(Integer c116TratamientoParaSifilisCongenita) {
        this.c116TratamientoParaSifilisCongenita = c116TratamientoParaSifilisCongenita;
    }

    public Integer getC117TratamientoParaLepra() {
        return c117TratamientoParaLepra;
    }

    public void setC117TratamientoParaLepra(Integer c117TratamientoParaLepra) {
        this.c117TratamientoParaLepra = c117TratamientoParaLepra;
    }

    public Date getC118FechaDeTerminacionTratamientoParaLeishmaniasis() {
        return c118FechaDeTerminacionTratamientoParaLeishmaniasis;
    }

    public void setC118FechaDeTerminacionTratamientoParaLeishmaniasis(Date c118FechaDeTerminacionTratamientoParaLeishmaniasis) {
        this.c118FechaDeTerminacionTratamientoParaLeishmaniasis = c118FechaDeTerminacionTratamientoParaLeishmaniasis;
    }

    public RipsAf getCFact() {
        return cFact;
    }

    public void setCFact(RipsAf cFact) {
        this.cFact = cFact;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (c1ConsecutivoDeRegistro != null ? c1ConsecutivoDeRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Frt4505)) {
            return false;
        }
        Frt4505 other = (Frt4505) object;
        if ((this.c1ConsecutivoDeRegistro == null && other.c1ConsecutivoDeRegistro != null) || (this.c1ConsecutivoDeRegistro != null && !this.c1ConsecutivoDeRegistro.equals(other.c1ConsecutivoDeRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.Frt4505[ c1ConsecutivoDeRegistro=" + c1ConsecutivoDeRegistro + " ]";
    }
    
}
