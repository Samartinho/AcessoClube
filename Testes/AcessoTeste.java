import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AcessoTeste {
	Acesso Acesso;
	
	@BeforeEach
	void SetUp() throws Exceção {
		Acesso = new Acesso(LocalDate.of(2010, 1, 1), new Visitante("Nome", 79846521321L, LocalDate.of(2001, 12, 24), 50));
	}
	
	@Test
	void testAcessoSetData() throws Exceção {
		assertThrows(Exceção.class, () -> {Acesso.setDataAcesso(LocalDate.of(1990, 1, 1));});
	}
	
	@Test
	void testAcessoSetPessoa() throws Exceção {
		assertThrows(Exceção.class, () -> {Acesso.setPessoa(null);});
	}
	
	@Test
	void testAcessoGetDia() throws Exceção {
		assertEquals(Acesso.getDataAcesso().getDayOfMonth(), 1);
	}
	
	@Test
	void testAcessoGetMes() throws Exceção {
		assertEquals(Acesso.getDataAcesso().getMonthValue(), 1);
	}
	
	@Test
	void testAcessoGetAno() throws Exceção {
		assertEquals(Acesso.getDataAcesso().getYear(), 2010);
	}
}
