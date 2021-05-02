import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SocioTeste {
	Socio Socio;
	
	@BeforeEach
	void SetUp() throws Exceção {
		Socio = new Socio("Nome", 79846521321L, LocalDate.of(2001, 12, 24), 200);
	}
	
	@Test
	void testSocioSetCPF() throws Exceção {
		assertThrows(Exceção.class, () -> {Socio.setNroSocio(0);});
	}
	
	@Test
	void testSocioGetNroSocio() throws Exceção {
		assertEquals(Socio.getNroSocio(), 200);
	}
}
