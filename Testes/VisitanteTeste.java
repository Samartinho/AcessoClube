import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VisitanteTeste {
	Visitante Visitante;
	
	@BeforeEach
	void SetUp() throws Exceção {
		Visitante = new Visitante("Nome", 79846521321L, LocalDate.of(2001, 12, 24), 50);
	}
	@Test
	void testVisitanteSetNroConvite() throws Exceção {
		assertThrows(Exceção.class, () -> {Visitante.setNroConvite(0);});
	}
	
	@Test
	void testVisitanteGetNroConvite() throws Exceção {
		assertEquals(Visitante.getNroConvite(), 50);
	}
}
