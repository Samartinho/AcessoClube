import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SocioTeste {
	Socio Socio;
	
	@BeforeEach
	void SetUp() throws Exce��o {
		Socio = new Socio("Nome", 79846521321L, LocalDate.of(2001, 12, 24), 200);
	}
	
	@Test
	void testSocioSetCPF() throws Exce��o {
		assertThrows(Exce��o.class, () -> {Socio.setNroSocio(0);});
	}
	
	@Test
	void testSocioGetNroSocio() throws Exce��o {
		assertEquals(Socio.getNroSocio(), 200);
	}
}
