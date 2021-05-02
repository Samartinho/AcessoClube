import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClubeTeste {
	Clube Clube;
	
	@BeforeEach
	void SetUp() throws Exceção {
		Clube = new Clube();
		Socio S1 = new Socio("Josue", 13246579845L, LocalDate.of(2001, 8, 24), 200);
		Clube.addSocio(LocalDate.of(2020, 04, 3), S1);
		Visitante V1 = new Visitante("Gabrel", 7984651321L, LocalDate.of(2001, 12, 24), 87);
		Clube.addAcesso(LocalDate.of(2020, 07, 9), V1);
		Socio S2 = new Socio("Rafael", 46513279821L, LocalDate.of(2001, 8, 24), 12);
		Clube.addSocio(LocalDate.of(2021, 8, 12), S2);
		Visitante V2 = new Visitante("Junior", 654798312L, LocalDate.of(2005, 7, 19), 112);
		Clube.addAcesso(LocalDate.of(2020, 5, 26), V2);
	}		

	@Test
	void testethrowsAddAcesso() {
		assertThrows(Exceção.class, () -> {Clube.addAcesso(LocalDate.of(2000,1,1), null);});
	}
	
	@Test
	void testeAddSocio() {
		assertThrows(Exceção.class, () -> {Clube.addSocio(null, new Socio("Josue", 13246579845L, LocalDate.of(2001, 8, 24), 200));});
	}
	
	@Test
	void testeListaDeVisitante() {
		assertEquals("Acesso { Data do Acesso: 2020-07-09, Pessoa: Visitante { Numero do Convite: 87, Nome: Gabrel, CPF: 7984651321, Data de Nascimento: 2001-12-24}}", Clube.ListaDeVisitante(LocalDate.of(2020, 07, 9)));
	}
	
	@Test
	void testeAcessoIntervaloDeTempo() {
		assertEquals("Acesso { Data do Acesso: 2020-04-03, Pessoa: Socio { Numero de Socio: 200, Nome: Josue, CPF: 13246579845, Data de Nascimento: 2001-08-24}}Acesso { Data do Acesso: 2020-07-09, Pessoa: Visitante { Numero do Convite: 87, Nome: Gabrel, CPF: 7984651321, Data de Nascimento: 2001-12-24}}Acesso { Data do Acesso: 2021-08-12, Pessoa: Socio { Numero de Socio: 12, Nome: Rafael, CPF: 46513279821, Data de Nascimento: 2001-08-24}}Acesso { Data do Acesso: 2020-05-26, Pessoa: Visitante { Numero do Convite: 112, Nome: Junior, CPF: 654798312, Data de Nascimento: 2005-07-19}}", Clube.AcessosEmIntervaloDeTempo(LocalDate.of(2020, 4, 1), LocalDate.of(2021, 8, 13)));
	}
	
	@Test
	void testeVisitantesEmUmDia() {
		assertEquals("Acesso { Data do Acesso: 2020-05-26, Pessoa: Visitante { Numero do Convite: 112, Nome: Junior, CPF: 654798312, Data de Nascimento: 2005-07-19}}", Clube.VisitantesEmUmDia(LocalDate.of(2020, 5, 26)));
	}
	
	@Test
	void testeValidarSocio() throws Exceção {
		assertTrue(Clube.ValidarListaSocios(new Socio("Rafael", 46513279821L, LocalDate.of(2001, 8, 24), 12)));
	}
	
	@Test
	void testeNroDeSocios() throws Exceção {
		assertEquals(1, Clube.NroDeAcessos(LocalDate.of(2020, 5, 26)));
	}
}
